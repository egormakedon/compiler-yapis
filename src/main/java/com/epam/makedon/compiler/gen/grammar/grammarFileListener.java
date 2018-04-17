// Generated from /home/egor/Документы/compiler-yapis/src/main/resources/grammar/grammarFile.g4 by ANTLR 4.7
package com.epam.makedon.compiler.gen.grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link grammarFileParser}.
 */
public interface grammarFileListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link grammarFileParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(grammarFileParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarFileParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(grammarFileParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarFileParser#blockOfCode}.
	 * @param ctx the parse tree
	 */
	void enterBlockOfCode(grammarFileParser.BlockOfCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarFileParser#blockOfCode}.
	 * @param ctx the parse tree
	 */
	void exitBlockOfCode(grammarFileParser.BlockOfCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarFileParser#returnBlockOfCode}.
	 * @param ctx the parse tree
	 */
	void enterReturnBlockOfCode(grammarFileParser.ReturnBlockOfCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarFileParser#returnBlockOfCode}.
	 * @param ctx the parse tree
	 */
	void exitReturnBlockOfCode(grammarFileParser.ReturnBlockOfCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarFileParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(grammarFileParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarFileParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(grammarFileParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarFileParser#functionSignature}.
	 * @param ctx the parse tree
	 */
	void enterFunctionSignature(grammarFileParser.FunctionSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarFileParser#functionSignature}.
	 * @param ctx the parse tree
	 */
	void exitFunctionSignature(grammarFileParser.FunctionSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarFileParser#voidFunction}.
	 * @param ctx the parse tree
	 */
	void enterVoidFunction(grammarFileParser.VoidFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarFileParser#voidFunction}.
	 * @param ctx the parse tree
	 */
	void exitVoidFunction(grammarFileParser.VoidFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarFileParser#returnFunction}.
	 * @param ctx the parse tree
	 */
	void enterReturnFunction(grammarFileParser.ReturnFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarFileParser#returnFunction}.
	 * @param ctx the parse tree
	 */
	void exitReturnFunction(grammarFileParser.ReturnFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarFileParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(grammarFileParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarFileParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(grammarFileParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarFileParser#callClear}.
	 * @param ctx the parse tree
	 */
	void enterCallClear(grammarFileParser.CallClearContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarFileParser#callClear}.
	 * @param ctx the parse tree
	 */
	void exitCallClear(grammarFileParser.CallClearContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarFileParser#callAdd}.
	 * @param ctx the parse tree
	 */
	void enterCallAdd(grammarFileParser.CallAddContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarFileParser#callAdd}.
	 * @param ctx the parse tree
	 */
	void exitCallAdd(grammarFileParser.CallAddContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarFileParser#callGet}.
	 * @param ctx the parse tree
	 */
	void enterCallGet(grammarFileParser.CallGetContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarFileParser#callGet}.
	 * @param ctx the parse tree
	 */
	void exitCallGet(grammarFileParser.CallGetContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarFileParser#callRemove}.
	 * @param ctx the parse tree
	 */
	void enterCallRemove(grammarFileParser.CallRemoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarFileParser#callRemove}.
	 * @param ctx the parse tree
	 */
	void exitCallRemove(grammarFileParser.CallRemoveContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarFileParser#callIsEmpty}.
	 * @param ctx the parse tree
	 */
	void enterCallIsEmpty(grammarFileParser.CallIsEmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarFileParser#callIsEmpty}.
	 * @param ctx the parse tree
	 */
	void exitCallIsEmpty(grammarFileParser.CallIsEmptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarFileParser#callSize}.
	 * @param ctx the parse tree
	 */
	void enterCallSize(grammarFileParser.CallSizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarFileParser#callSize}.
	 * @param ctx the parse tree
	 */
	void exitCallSize(grammarFileParser.CallSizeContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarFileParser#callContains}.
	 * @param ctx the parse tree
	 */
	void enterCallContains(grammarFileParser.CallContainsContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarFileParser#callContains}.
	 * @param ctx the parse tree
	 */
	void exitCallContains(grammarFileParser.CallContainsContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarFileParser#elementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterElementDeclaration(grammarFileParser.ElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarFileParser#elementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitElementDeclaration(grammarFileParser.ElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarFileParser#listDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterListDeclaration(grammarFileParser.ListDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarFileParser#listDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitListDeclaration(grammarFileParser.ListDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarFileParser#callPrint}.
	 * @param ctx the parse tree
	 */
	void enterCallPrint(grammarFileParser.CallPrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarFileParser#callPrint}.
	 * @param ctx the parse tree
	 */
	void exitCallPrint(grammarFileParser.CallPrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarFileParser#forCycle}.
	 * @param ctx the parse tree
	 */
	void enterForCycle(grammarFileParser.ForCycleContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarFileParser#forCycle}.
	 * @param ctx the parse tree
	 */
	void exitForCycle(grammarFileParser.ForCycleContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarFileParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(grammarFileParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarFileParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(grammarFileParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarFileParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(grammarFileParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarFileParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(grammarFileParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarFileParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(grammarFileParser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarFileParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(grammarFileParser.ElseBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link grammarFileParser#content}.
	 * @param ctx the parse tree
	 */
	void enterContent(grammarFileParser.ContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link grammarFileParser#content}.
	 * @param ctx the parse tree
	 */
	void exitContent(grammarFileParser.ContentContext ctx);
}