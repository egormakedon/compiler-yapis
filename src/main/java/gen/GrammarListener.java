package gen;// Generated from /home/egor/Документы/compiler-yapis/src/main/java/Grammar.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link GrammarParser}.
 */
public interface GrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(GrammarParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(GrammarParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(GrammarParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(GrammarParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(GrammarParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(GrammarParser.ContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(GrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(GrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#functionSignature}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSignature(GrammarParser.FunctionSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionSignature}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSignature(GrammarParser.FunctionSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#voidFunction}.
	 * @param ctx the parse tree
	 */
	void enterVoidFunction(GrammarParser.VoidFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#voidFunction}.
	 * @param ctx the parse tree
	 */
	void exitVoidFunction(GrammarParser.VoidFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#functionParameters}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameters(GrammarParser.FunctionParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionParameters}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameters(GrammarParser.FunctionParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(GrammarParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(GrammarParser.FunctionCallContext ctx);
}