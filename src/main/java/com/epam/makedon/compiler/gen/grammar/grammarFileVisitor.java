// Generated from /home/egor/Документы/compiler-yapis/src/main/resources/grammar/grammarFile.g4 by ANTLR 4.7
package com.epam.makedon.compiler.gen.grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link grammarFileParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface grammarFileVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link grammarFileParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(grammarFileParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarFileParser#blockOfCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockOfCode(grammarFileParser.BlockOfCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarFileParser#returnBlockOfCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnBlockOfCode(grammarFileParser.ReturnBlockOfCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarFileParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(grammarFileParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarFileParser#functionSignature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionSignature(grammarFileParser.FunctionSignatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarFileParser#voidFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidFunction(grammarFileParser.VoidFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarFileParser#returnFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnFunction(grammarFileParser.ReturnFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarFileParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(grammarFileParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarFileParser#callClear}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallClear(grammarFileParser.CallClearContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarFileParser#callAdd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallAdd(grammarFileParser.CallAddContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarFileParser#callGet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallGet(grammarFileParser.CallGetContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarFileParser#callRemove}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallRemove(grammarFileParser.CallRemoveContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarFileParser#callIsEmpty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallIsEmpty(grammarFileParser.CallIsEmptyContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarFileParser#callSize}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallSize(grammarFileParser.CallSizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarFileParser#callContains}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallContains(grammarFileParser.CallContainsContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarFileParser#elementDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementDeclaration(grammarFileParser.ElementDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarFileParser#listDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListDeclaration(grammarFileParser.ListDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarFileParser#callPrint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallPrint(grammarFileParser.CallPrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarFileParser#forCycle}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForCycle(grammarFileParser.ForCycleContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarFileParser#compare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompare(grammarFileParser.CompareContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarFileParser#ifBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfBlock(grammarFileParser.IfBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarFileParser#elseBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseBlock(grammarFileParser.ElseBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link grammarFileParser#content}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContent(grammarFileParser.ContentContext ctx);
}