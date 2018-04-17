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
	 * Enter a parse tree produced by {@link GrammarParser#returnBlock}.
	 * @param ctx the parse tree
	 */
	void enterReturnBlock(GrammarParser.ReturnBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#returnBlock}.
	 * @param ctx the parse tree
	 */
	void exitReturnBlock(GrammarParser.ReturnBlockContext ctx);
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
	 * Enter a parse tree produced by {@link GrammarParser#returnFunction}.
	 * @param ctx the parse tree
	 */
	void enterReturnFunction(GrammarParser.ReturnFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#returnFunction}.
	 * @param ctx the parse tree
	 */
	void exitReturnFunction(GrammarParser.ReturnFunctionContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link GrammarParser#clear}.
	 * @param ctx the parse tree
	 */
	void enterClear(GrammarParser.ClearContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#clear}.
	 * @param ctx the parse tree
	 */
	void exitClear(GrammarParser.ClearContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(GrammarParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(GrammarParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#get}.
	 * @param ctx the parse tree
	 */
	void enterGet(GrammarParser.GetContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#get}.
	 * @param ctx the parse tree
	 */
	void exitGet(GrammarParser.GetContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#remove}.
	 * @param ctx the parse tree
	 */
	void enterRemove(GrammarParser.RemoveContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#remove}.
	 * @param ctx the parse tree
	 */
	void exitRemove(GrammarParser.RemoveContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#isEmptys}.
	 * @param ctx the parse tree
	 */
	void enterIsEmptys(GrammarParser.IsEmptysContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#isEmptys}.
	 * @param ctx the parse tree
	 */
	void exitIsEmptys(GrammarParser.IsEmptysContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#contains}.
	 * @param ctx the parse tree
	 */
	void enterContains(GrammarParser.ContainsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#contains}.
	 * @param ctx the parse tree
	 */
	void exitContains(GrammarParser.ContainsContext ctx);
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
	 * Enter a parse tree produced by {@link GrammarParser#elementDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterElementDeclaration(GrammarParser.ElementDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#elementDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitElementDeclaration(GrammarParser.ElementDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#listDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterListDeclaration(GrammarParser.ListDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#listDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitListDeclaration(GrammarParser.ListDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#forCycle}.
	 * @param ctx the parse tree
	 */
	void enterForCycle(GrammarParser.ForCycleContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#forCycle}.
	 * @param ctx the parse tree
	 */
	void exitForCycle(GrammarParser.ForCycleContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#equalName}.
	 * @param ctx the parse tree
	 */
	void enterEqualName(GrammarParser.EqualNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#equalName}.
	 * @param ctx the parse tree
	 */
	void exitEqualName(GrammarParser.EqualNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#negationEqualName}.
	 * @param ctx the parse tree
	 */
	void enterNegationEqualName(GrammarParser.NegationEqualNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#negationEqualName}.
	 * @param ctx the parse tree
	 */
	void exitNegationEqualName(GrammarParser.NegationEqualNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#negationIsEmpty}.
	 * @param ctx the parse tree
	 */
	void enterNegationIsEmpty(GrammarParser.NegationIsEmptyContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#negationIsEmpty}.
	 * @param ctx the parse tree
	 */
	void exitNegationIsEmpty(GrammarParser.NegationIsEmptyContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#negationContains}.
	 * @param ctx the parse tree
	 */
	void enterNegationContains(GrammarParser.NegationContainsContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#negationContains}.
	 * @param ctx the parse tree
	 */
	void exitNegationContains(GrammarParser.NegationContainsContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#compare}.
	 * @param ctx the parse tree
	 */
	void enterCompare(GrammarParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#compare}.
	 * @param ctx the parse tree
	 */
	void exitCompare(GrammarParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#andCompare}.
	 * @param ctx the parse tree
	 */
	void enterAndCompare(GrammarParser.AndCompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#andCompare}.
	 * @param ctx the parse tree
	 */
	void exitAndCompare(GrammarParser.AndCompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#orCompare}.
	 * @param ctx the parse tree
	 */
	void enterOrCompare(GrammarParser.OrCompareContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#orCompare}.
	 * @param ctx the parse tree
	 */
	void exitOrCompare(GrammarParser.OrCompareContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void enterIfBlock(GrammarParser.IfBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#ifBlock}.
	 * @param ctx the parse tree
	 */
	void exitIfBlock(GrammarParser.IfBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link GrammarParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void enterElseBlock(GrammarParser.ElseBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link GrammarParser#elseBlock}.
	 * @param ctx the parse tree
	 */
	void exitElseBlock(GrammarParser.ElseBlockContext ctx);
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
}