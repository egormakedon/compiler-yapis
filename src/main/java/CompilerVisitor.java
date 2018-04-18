import gen.GrammarBaseVisitor;
import gen.GrammarParser;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class CompilerVisitor extends GrammarBaseVisitor<String> {
    private List<String> errors = new ArrayList<>();

    @Override
    public String visitProgram(GrammarParser.ProgramContext ctx) {
        String buffer = Constant.PROGRAM;

        String buffer1 = "";
        for (GrammarParser.VoidFunctionContext context : ctx.voidFunction()) {
            buffer1 += visitVoidFunction(context);
        }

        buffer += visitBlock(ctx.block());

        buffer += buffer1;
        buffer += "}";

        String error = "";
        if (!errors.isEmpty()) {
            for (String string : errors) {
                error += string + "\n";
            }
            JOptionPane.showMessageDialog(null, error);
            throw new RuntimeException(error);
        }

        return buffer;
    }

    @Override
    public String visitBlock(GrammarParser.BlockContext ctx) {
        if (Memory.getInstance().getTypeBlock() == Memory.TypeBlock.NON_FUNCTION) {
            Memory.getInstance().incrementStack();
        }

        String buffer = "{";
        for (GrammarParser.ContentContext context : ctx.content()) {
            buffer += visitContent(context);
        }
        buffer += "}";
        Memory.getInstance().decrementStack();
        Memory.getInstance().setTypeBlock(Memory.TypeBlock.NON_FUNCTION);
        return buffer;
    }

    @Override
    public String visitPrint(GrammarParser.PrintContext ctx) {
        if (ctx.STRING() != null) {
            return "System.out.println(" + ctx.STRING().getText() + ");";
        }
        return "";
    }

    @Override
    public String visitContent(GrammarParser.ContentContext ctx) {
        if (ctx.print() != null) {
            return visitPrint(ctx.print());
        }

        if (ctx.functionCall() != null) {
            return visitFunctionCall(ctx.functionCall());
        }

        return "";
    }

    @Override
    public String visitType(GrammarParser.TypeContext ctx) {
        if (ctx.ELEMENT() != null) {
            return "Element";
        }

        if (ctx.LIST() != null) {
            return "List";
        }

        return "";
    }

    @Override
    public String visitFunctionSignature(GrammarParser.FunctionSignatureContext ctx) {
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
    public String visitVoidFunction(GrammarParser.VoidFunctionContext ctx) {
        if (Memory.getInstance().containsFunc(ctx.NAME().getText())) {
            errors.add("Function " + ctx.NAME().getText() + " already exists");
        }

        Memory.getInstance().addFunc(ctx.NAME().getText());

        String buffer = "private void " + ctx.NAME().getText();
        if (ctx.functionSignature() != null) {
            buffer += visitFunctionSignature(ctx.functionSignature()) + " throws Exception";
        } else {
            buffer += "() throws Exception";
        }

        Memory.getInstance().setTypeBlock(Memory.TypeBlock.FUNCTION);
        Memory.getInstance().incrementStack();

        if (ctx.functionSignature() != null) {
            for (int index = 0; index < ctx.functionSignature().NAME().size(); index++) {
                String s = ctx.functionSignature().NAME().get(index).getText();
                if (Memory.getInstance().containsVar(s)) {
                    errors.add("Variable " + s + " already exists");
                }
                Memory.getInstance().addVar(s);
            }
        }

        buffer += visitBlock(ctx.block());
        return buffer;
    }

    @Override
    public String visitFunctionParameters(GrammarParser.FunctionParametersContext ctx) {
        for (int index = 0; index < ctx.NAME().size(); index++) {
            String s = ctx.NAME().get(index).getText();
            if (!Memory.getInstance().canUse(s)) {
                errors.add("Variable " + s + " can't used here");
            }
        }

        return ctx.getText();
    }

    @Override
    public String visitFunctionCall(GrammarParser.FunctionCallContext ctx) {
        String buffer = "";

        if (!Memory.getInstance().containsFunc(ctx.NAME().getText())) {
            errors.add("Initialize error: cant find function " + ctx.NAME().getText());
        }

        if (ctx.functionParameters() != null) {
            buffer += ctx.NAME().getText() + visitFunctionParameters(ctx.functionParameters()) + ";";
        } else {
            buffer += ctx.NAME().getText() + "();";
        }

        return buffer;
    }
}