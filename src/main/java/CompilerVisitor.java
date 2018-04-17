import gen.GrammarBaseVisitor;
import gen.GrammarParser;

public class CompilerVisitor extends GrammarBaseVisitor<String> {
    @Override
    public String visitProgram(GrammarParser.ProgramContext ctx) {
        String buffer = Constant.PROGRAM;

        buffer += visitBlock(ctx.block());
        buffer += "}";

        return buffer;
    }

    @Override
    public String visitBlock(GrammarParser.BlockContext ctx) {
        String buffer = "{";
        for (GrammarParser.ContentContext context : ctx.content()) {
            buffer += visitContent(context);
        }
        buffer += "}";
        return buffer;
    }

    @Override
    public String visitPrint(GrammarParser.PrintContext ctx) {
        return "System.out.println(" + ctx.STRING() + ");";
    }

    @Override
    public String visitContent(GrammarParser.ContentContext ctx) {
        return visitPrint(ctx.print());
    }
}