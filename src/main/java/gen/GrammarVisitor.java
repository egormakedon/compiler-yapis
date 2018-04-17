package gen;// Generated from /home/egor/Документы/compiler-yapis/src/main/java/Grammar.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link GrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface GrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link GrammarParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(GrammarParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(GrammarParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#returnBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnBlock(GrammarParser.ReturnBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(GrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#functionSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSignature(GrammarParser.FunctionSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#voidFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidFunction(GrammarParser.VoidFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#returnFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnFunction(GrammarParser.ReturnFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#functionParameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameters(GrammarParser.FunctionParametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(GrammarParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#clear}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClear(GrammarParser.ClearContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#add}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(GrammarParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#get}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet(GrammarParser.GetContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#remove}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRemove(GrammarParser.RemoveContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#isEmptys}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsEmptys(GrammarParser.IsEmptysContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#contains}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContains(GrammarParser.ContainsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(GrammarParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#elementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementDeclaration(GrammarParser.ElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#listDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListDeclaration(GrammarParser.ListDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#forCycle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCycle(GrammarParser.ForCycleContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#equalName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualName(GrammarParser.EqualNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#negationEqualName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegationEqualName(GrammarParser.NegationEqualNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#negationIsEmpty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegationIsEmpty(GrammarParser.NegationIsEmptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#negationContains}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegationContains(GrammarParser.NegationContainsContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(GrammarParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#andCompare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndCompare(GrammarParser.AndCompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#orCompare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrCompare(GrammarParser.OrCompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(GrammarParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#elseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBlock(GrammarParser.ElseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(GrammarParser.ContentContext ctx);
}