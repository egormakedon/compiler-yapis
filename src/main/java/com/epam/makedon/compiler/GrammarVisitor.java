package com.epam.makedon.compiler;

import com.epam.makedon.compiler.gen.grammar.grammarFileBaseVisitor;
import com.epam.makedon.compiler.gen.grammar.grammarFileParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class GrammarVisitor extends grammarFileBaseVisitor<String> {
    private static final Logger LOGGER = LoggerFactory.getLogger(GrammarVisitor.class);

    private Variables variables = new Variables();
    private java.util.List<String> errors = new ArrayList<>();

    private Map<String, String> functions = new HashMap<>();
    private Map<String, grammarFileParser.FunctionSignatureContext> functionSignatures = new HashMap<>();

    @Override
    public String visitType(grammarFileParser.TypeContext ctx) {
        if (ctx.LIST() != null)
            return "List";
        if (ctx.ELEMENT() != null)
            return "Element";
        return "";
    }

    @Override
    public String visitBlockOfCode(grammarFileParser.BlockOfCodeContext ctx) {
        System.out.println(ctx);
        variables.increase();
        String buffer = "{\n";
        for (grammarFileParser.ContentContext context : ctx.content()) {
            buffer += visitContent(context) + "\n";
        }
        buffer += "}\n";
        variables.decrease();
        return buffer;
    }

    @Override
    public String visitReturnBlockOfCode(grammarFileParser.ReturnBlockOfCodeContext ctx) {
        String buffer = "{\n";
        for (grammarFileParser.ContentContext context : ctx.content()) {
            buffer += visitContent(context) + "\n";
        }
        buffer += "return " + ctx.NAME().getText() + ";" + "\n}\n";
        if (variables.get(ctx.NAME().getText()) == null)
            errors.add("Error: can't find variable " + ctx.NAME().getText() + " at return block of code");
        variables.decrease();
        return buffer;
    }

    @Override
    public String visitProgram(grammarFileParser.ProgramContext ctx) {
        String buffer = Constant.PROGRAM;
        String buffer1 = "";
        for (grammarFileParser.ReturnFunctionContext context : ctx.returnFunction()) {
            buffer1 += visitReturnFunction(context);
        }
        for (grammarFileParser.VoidFunctionContext context : ctx.voidFunction()) {
            buffer1 += visitVoidFunction(context);
        }
        buffer += visitBlockOfCode(ctx.blockOfCode());
        buffer += buffer1 + Constant.LIST + Constant.ELEMENT + "\n}";

        String error = "";
        if (errors.size() > 0) {
            for (String string : errors) {
                error += string + "\n";
            }
            LOGGER.error(error);
            JOptionPane.showMessageDialog(null, error);
        }
        return buffer;
    }

    @Override
    public String visitFunctionSignature(grammarFileParser.FunctionSignatureContext ctx) {
        String buffer = "(";
        for (int index = 0; index < ctx.NAME().size(); index++) {
            buffer += visitType(ctx.type(index)) + " " + ctx.NAME(index).getText();

            if(index != ctx.NAME().size() - 1) {
                buffer += ", ";
            }
        }

        buffer += ")";
        return buffer;
    }

    @Override
    public String visitVoidFunction(grammarFileParser.VoidFunctionContext ctx) {
        String buffer = "";
        if (functions.get(ctx.NAME().getText()) == null) {
            functions.put(ctx.NAME().getText(), "void");
        } else {
            errors.add("Function " + ctx.NAME().getText() + " already exist");
        }

        buffer += "private void " + ctx.NAME().getText();
        if (ctx.functionSignature() != null) {
            buffer += visitFunctionSignature(ctx.functionSignature()) + "throws Exception";
            functionSignatures.put(ctx.NAME().getText(), ctx.functionSignature());
        } else {
            buffer += "() throws Exception";
        }

        variables.increase();
        for (int index = 0; index < ctx.functionSignature().type().size(); index++) {
            variables.put(ctx.functionSignature().NAME(index).getText(), ctx.functionSignature().type(index).getText());
        }

        buffer += visitBlockOfCode(ctx.blockOfCode());
        return buffer;
    }

    @Override
    public String visitReturnFunction(grammarFileParser.ReturnFunctionContext ctx) {
        String buffer = "";
        if (functions.get(ctx.NAME().getText()) == null) {
            functions.put(ctx.NAME().getText(), visitType(ctx.type()));
        } else {
            errors.add("Function " + ctx.NAME().getText() + " already exist");
        }

        buffer += "private " + visitType(ctx.type()) + " " + ctx.NAME().getText();
        if (ctx.functionSignature() != null) {
            buffer += visitFunctionSignature(ctx.functionSignature()) + "throws Exception";
            functionSignatures.put(ctx.NAME().getText(), ctx.functionSignature());
        } else {
            buffer += "() throws Exception";
        }

        variables.increase();
        if (ctx.functionSignature() != null) {
            for (int index = 0; index < ctx.functionSignature().type().size(); index++) {
                variables.put(ctx.functionSignature().NAME(index).getText(), ctx.functionSignature().type(index).getText());
            }
        }

        buffer += visitReturnBlockOfCode(ctx.returnBlockOfCode());
        return buffer;
    }

    @Override
    public String visitInputFunctionParameters(grammarFileParser.InputFunctionParametersContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitFunctionCall(grammarFileParser.FunctionCallContext ctx) {
        String buffer = "";
        if (functions.get(ctx.NAME().getText()) == null) {
            errors.add("Initialize error: cant find function " + ctx.NAME().getText());
        } else if (!checkSignatures(ctx.inputFunctionParameters(), functionSignatures.get(ctx.NAME().getText()))) {
            errors.add("Error: cant find such arguments in function " + ctx.NAME().getText());
        }

        if (ctx.inputFunctionParameters() != null) {
            buffer += ctx.NAME().getText() + visitInputFunctionParameters(ctx.inputFunctionParameters());
        } else {
            buffer += ctx.NAME().getText() + "()";
        }

        return buffer;
    }

    @Override
    public String visitCallClear(grammarFileParser.CallClearContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitCallAdd(grammarFileParser.CallAddContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitCallGet(grammarFileParser.CallGetContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitCallRemove(grammarFileParser.CallRemoveContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitCallIsEmpty(grammarFileParser.CallIsEmptyContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitCallContains(grammarFileParser.CallContainsContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitElementDeclaration(grammarFileParser.ElementDeclarationContext ctx) {
        String buffer = "";
        if (variables.get(ctx.NAME().getText()) != null) {
            if (ctx.ELEMENT() != null) {
                errors.add("Initialize error: variable " + ctx.NAME().getText() + " already exist");
            } else if (!variables.get(ctx.NAME().getText()).equalsIgnoreCase("element")) {
                errors.add("Cast error: variable " + ctx.NAME().getText() + " is not element");
            }
        } else {
            variables.put(ctx.NAME().getText(), "element");
            buffer += "Element ";
        }

        if (ctx.STRING() != null) {
            buffer += "" + ctx.NAME() + " = new Element(" + ctx.STRING().getText() + ");";
        }

        if (ctx.functionCall() != null) {
            if (functions.get(ctx.functionCall().NAME().getText()) != null) {
                if (!functions.get(ctx.functionCall().NAME().getText()).equalsIgnoreCase("element")) {
                    errors.add("Cast error: function " + ctx.functionCall().NAME().getText() + " return not element");
                }
            }
            buffer += "" + ctx.NAME().getText() + " = " + visitFunctionCall(ctx.functionCall()) + ";";
        }

        if (ctx.callGet() != null) {
            buffer += "" + ctx.NAME().getText() + " = " + visitCallGet(ctx.callGet());
        }

        return buffer;
    }

    @Override
    public String visitListDeclaration(grammarFileParser.ListDeclarationContext ctx) {
        return super.visitListDeclaration(ctx);
    }

    @Override
    public String visitCallPrint(grammarFileParser.CallPrintContext ctx) {
        String buffer = "";

        if (ctx.STRING() != null) {
            buffer += "\tSystem.out.println(" + ctx.STRING().getText() + ");";
        }

        if (ctx.NAME() != null) {
            if (variables.get(ctx.NAME().getText()) == null) {
                errors.add("Can't find symbol " + ctx.NAME().getText());
            }
            buffer += "\tSystem.out.println(" + ctx.NAME().getText() + ");";
        }

        return buffer;
    }

    @Override
    public String visitForCycle(grammarFileParser.ForCycleContext ctx) {
        return super.visitForCycle(ctx);
    }

    @Override
    public String visitCompare(grammarFileParser.CompareContext ctx) {
        return super.visitCompare(ctx);
    }

    @Override
    public String visitIfBlock(grammarFileParser.IfBlockContext ctx) {
        return super.visitIfBlock(ctx);
    }

    @Override
    public String visitElseBlock(grammarFileParser.ElseBlockContext ctx) {
        return super.visitElseBlock(ctx);
    }

    @Override
    public String visitContent(grammarFileParser.ContentContext ctx) {
        if (ctx.functionCall() != null) {
            return visitFunctionCall(ctx.functionCall());
        }

        if (ctx.callClear() != null) {
            return visitCallClear(ctx.callClear());
        }

        if (ctx.callAdd() != null) {
            return visitCallAdd(ctx.callAdd());
        }

        if (ctx.callGet() != null) {
            return visitCallGet(ctx.callGet());
        }

        if (ctx.callRemove() != null) {
            return visitCallRemove(ctx.callRemove());
        }

        if (ctx.elementDeclaration() != null) {
            return visitElementDeclaration(ctx.elementDeclaration());
        }

        if (ctx.listDeclaration() != null) {
            return visitListDeclaration(ctx.listDeclaration());
        }

        if (ctx.callPrint() != null) {
            return visitCallPrint(ctx.callPrint());
        }

        if (ctx.forCycle() != null) {
            return visitForCycle(ctx.forCycle());
        }

        if (ctx.ifBlock() != null) {
            return visitIfBlock(ctx.ifBlock());
        }

        return "";
    }

    private boolean checkSignatures(grammarFileParser.InputFunctionParametersContext in, grammarFileParser.FunctionSignatureContext sig) {
        boolean check = true;
        if (sig == null && in == null)
            return true;
        if (sig == null || in == null)
            return false;
        if (in.NAME().size() == sig.NAME().size()) {
            for (int i = 0; i < sig.type().size(); i++) {
                if (variables.get(in.NAME(i).getText()) == null
                        || !variables.get(in.NAME(i).getText()).equalsIgnoreCase(visitType(sig.type(i))))
                    check = false;
            }
        } else check = false;
        return check;
    }
}
