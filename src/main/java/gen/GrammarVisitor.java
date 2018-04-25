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
	 * Visit a parse tree produced by {@link GrammarParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(GrammarParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(GrammarParser.ContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(GrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#functionDefine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDefine(GrammarParser.FunctionDefineContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(GrammarParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#forCycle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCycle(GrammarParser.ForCycleContext ctx);
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
	 * Visit a parse tree produced by {@link GrammarParser#equalNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualNames(GrammarParser.EqualNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link GrammarParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(GrammarParser.CompareContext ctx);
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
}