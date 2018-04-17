package com.epam.makedon.compiler;

import com.epam.makedon.compiler.gen.grammar.grammarFileBaseVisitor;
import com.epam.makedon.compiler.gen.grammar.grammarFileParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.util.ArrayList;

public class GrammarVisitor extends grammarFileBaseVisitor<String> {
    private static final Logger LOGGER = LoggerFactory.getLogger(GrammarVisitor.class);

    private Variables variables = new Variables();
    private java.util.List<String> errors = new ArrayList<>();

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
        return super.visitFunctionSignature(ctx);
    }

    @Override
    public String visitVoidFunction(grammarFileParser.VoidFunctionContext ctx) {
        return super.visitVoidFunction(ctx);
    }

    @Override
    public String visitReturnFunction(grammarFileParser.ReturnFunctionContext ctx) {
        return super.visitReturnFunction(ctx);
    }

    @Override
    public String visitFunctionCall(grammarFileParser.FunctionCallContext ctx) {
        return super.visitFunctionCall(ctx);
    }

    @Override
    public String visitCallClear(grammarFileParser.CallClearContext ctx) {
        return super.visitCallClear(ctx);
    }

    @Override
    public String visitCallAdd(grammarFileParser.CallAddContext ctx) {
        return super.visitCallAdd(ctx);
    }

    @Override
    public String visitCallGet(grammarFileParser.CallGetContext ctx) {
        return super.visitCallGet(ctx);
    }

    @Override
    public String visitCallRemove(grammarFileParser.CallRemoveContext ctx) {
        return super.visitCallRemove(ctx);
    }

    @Override
    public String visitCallIsEmpty(grammarFileParser.CallIsEmptyContext ctx) {
        return super.visitCallIsEmpty(ctx);
    }

    @Override
    public String visitCallSize(grammarFileParser.CallSizeContext ctx) {
        return super.visitCallSize(ctx);
    }

    @Override
    public String visitCallContains(grammarFileParser.CallContainsContext ctx) {
        return super.visitCallContains(ctx);
    }

    @Override
    public String visitElementDeclaration(grammarFileParser.ElementDeclarationContext ctx) {
        return super.visitElementDeclaration(ctx);
    }

    @Override
    public String visitListDeclaration(grammarFileParser.ListDeclarationContext ctx) {
        return super.visitListDeclaration(ctx);
    }

    @Override
    public String visitCallPrint(grammarFileParser.CallPrintContext ctx) {
        return super.visitCallPrint(ctx);
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
        return super.visitContent(ctx);
    }
}
