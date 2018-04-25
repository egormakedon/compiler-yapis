package gen;// Generated from /home/egor/Документы/compiler-yapis/src/main/java/Grammar.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, STRING=2, OPEN_CURLY_BRACKET=3, CLOSE_CURLY_BRACKET=4, OPEN_BRACKET=5, 
		CLOSE_BRACKET=6, PRINT=7, VOID=8, LIST=9, ELEMENT=10, COMMA=11, NAME=12, 
		NUMBER=13, CLEAR=14, ADD=15, GET=16, REMOVE=17, ASSIGNMENT=18, FOR=19, 
		IS_EMPTY=20, CONTAINS=21, IF=22, ELSE=23, EQUAL=24;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_print = 2, RULE_content = 3, RULE_type = 4, 
		RULE_functionDefine = 5, RULE_functionCall = 6, RULE_forCycle = 7, RULE_elementDeclaration = 8, 
		RULE_listDeclaration = 9, RULE_equalNames = 10, RULE_compare = 11, RULE_ifBlock = 12, 
		RULE_elseBlock = 13;
	public static final String[] ruleNames = {
		"program", "block", "print", "content", "type", "functionDefine", "functionCall", 
		"forCycle", "elementDeclaration", "listDeclaration", "equalNames", "compare", 
		"ifBlock", "elseBlock"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'{'", "'}'", "'('", "')'", "'print'", "'void'", "'List'", 
		"'Element'", "','", null, null, "'clear'", "'add'", "'get'", "'remove'", 
		"'='", "'for'", "'is_empty'", "'contains'", "'if'", "'else'", "'=='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SPACE", "STRING", "OPEN_CURLY_BRACKET", "CLOSE_CURLY_BRACKET", 
		"OPEN_BRACKET", "CLOSE_BRACKET", "PRINT", "VOID", "LIST", "ELEMENT", "COMMA", 
		"NAME", "NUMBER", "CLEAR", "ADD", "GET", "REMOVE", "ASSIGNMENT", "FOR", 
		"IS_EMPTY", "CONTAINS", "IF", "ELSE", "EQUAL"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<FunctionDefineContext> functionDefine() {
			return getRuleContexts(FunctionDefineContext.class);
		}
		public FunctionDefineContext functionDefine(int i) {
			return getRuleContext(FunctionDefineContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			block();
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VOID) {
				{
				{
				setState(29);
				functionDefine();
				}
				}
				setState(34);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY_BRACKET() { return getToken(GrammarParser.OPEN_CURLY_BRACKET, 0); }
		public TerminalNode CLOSE_CURLY_BRACKET() { return getToken(GrammarParser.CLOSE_CURLY_BRACKET, 0); }
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(OPEN_CURLY_BRACKET);
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LIST) | (1L << ELEMENT) | (1L << NAME) | (1L << FOR) | (1L << IF))) != 0)) {
				{
				{
				setState(36);
				content();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			match(CLOSE_CURLY_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(GrammarParser.PRINT, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(GrammarParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(GrammarParser.CLOSE_BRACKET, 0); }
		public TerminalNode STRING() { return getToken(GrammarParser.STRING, 0); }
		public TerminalNode NAME() { return getToken(GrammarParser.NAME, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(PRINT);
			setState(45);
			match(OPEN_BRACKET);
			setState(46);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(47);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ContentContext extends ParserRuleContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ForCycleContext forCycle() {
			return getRuleContext(ForCycleContext.class,0);
		}
		public ElementDeclarationContext elementDeclaration() {
			return getRuleContext(ElementDeclarationContext.class,0);
		}
		public ListDeclarationContext listDeclaration() {
			return getRuleContext(ListDeclarationContext.class,0);
		}
		public IfBlockContext ifBlock() {
			return getRuleContext(IfBlockContext.class,0);
		}
		public ContentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_content; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_content);
		try {
			setState(55);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(49);
				print();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(50);
				functionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(51);
				forCycle();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				elementDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(53);
				listDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(54);
				ifBlock();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(GrammarParser.LIST, 0); }
		public TerminalNode ELEMENT() { return getToken(GrammarParser.ELEMENT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			_la = _input.LA(1);
			if ( !(_la==LIST || _la==ELEMENT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionDefineContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(GrammarParser.VOID, 0); }
		public List<TerminalNode> NAME() { return getTokens(GrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GrammarParser.NAME, i);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(GrammarParser.OPEN_BRACKET, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(GrammarParser.CLOSE_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public FunctionDefineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionDefine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFunctionDefine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFunctionDefine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFunctionDefine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionDefineContext functionDefine() throws RecognitionException {
		FunctionDefineContext _localctx = new FunctionDefineContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_functionDefine);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(VOID);
			setState(60);
			match(NAME);
			setState(61);
			match(OPEN_BRACKET);
			setState(62);
			type();
			setState(63);
			match(NAME);
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(64);
				match(COMMA);
				setState(65);
				type();
				setState(66);
				match(NAME);
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			match(CLOSE_BRACKET);
			setState(74);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FunctionCallContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(GrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GrammarParser.NAME, i);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(GrammarParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(GrammarParser.CLOSE_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(GrammarParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(GrammarParser.COMMA, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			match(NAME);
			setState(77);
			match(OPEN_BRACKET);
			setState(78);
			match(NAME);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(79);
				match(COMMA);
				setState(80);
				match(NAME);
				}
				}
				setState(85);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(86);
			match(CLOSE_BRACKET);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ForCycleContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(GrammarParser.FOR, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(GrammarParser.OPEN_BRACKET, 0); }
		public List<TerminalNode> NAME() { return getTokens(GrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GrammarParser.NAME, i);
		}
		public TerminalNode COMMA() { return getToken(GrammarParser.COMMA, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(GrammarParser.CLOSE_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ForCycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCycle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterForCycle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitForCycle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitForCycle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForCycleContext forCycle() throws RecognitionException {
		ForCycleContext _localctx = new ForCycleContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_forCycle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(FOR);
			setState(89);
			match(OPEN_BRACKET);
			setState(90);
			match(NAME);
			setState(91);
			match(COMMA);
			setState(92);
			match(NAME);
			setState(93);
			match(CLOSE_BRACKET);
			setState(94);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElementDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(GrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GrammarParser.NAME, i);
		}
		public TerminalNode ASSIGNMENT() { return getToken(GrammarParser.ASSIGNMENT, 0); }
		public TerminalNode STRING() { return getToken(GrammarParser.STRING, 0); }
		public TerminalNode ELEMENT() { return getToken(GrammarParser.ELEMENT, 0); }
		public ElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitElementDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitElementDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementDeclarationContext elementDeclaration() throws RecognitionException {
		ElementDeclarationContext _localctx = new ElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elementDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELEMENT) {
				{
				setState(96);
				match(ELEMENT);
				}
			}

			setState(99);
			match(NAME);
			setState(100);
			match(ASSIGNMENT);
			setState(101);
			_la = _input.LA(1);
			if ( !(_la==STRING || _la==NAME) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListDeclarationContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(GrammarParser.LIST, 0); }
		public List<TerminalNode> NAME() { return getTokens(GrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GrammarParser.NAME, i);
		}
		public TerminalNode ASSIGNMENT() { return getToken(GrammarParser.ASSIGNMENT, 0); }
		public ListDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterListDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitListDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitListDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListDeclarationContext listDeclaration() throws RecognitionException {
		ListDeclarationContext _localctx = new ListDeclarationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_listDeclaration);
		int _la;
		try {
			setState(111);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(103);
				match(LIST);
				setState(104);
				match(NAME);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIST) {
					{
					setState(105);
					match(LIST);
					}
				}

				setState(108);
				match(NAME);
				setState(109);
				match(ASSIGNMENT);
				setState(110);
				match(NAME);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EqualNamesContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(GrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GrammarParser.NAME, i);
		}
		public TerminalNode EQUAL() { return getToken(GrammarParser.EQUAL, 0); }
		public EqualNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equalNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterEqualNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitEqualNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitEqualNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EqualNamesContext equalNames() throws RecognitionException {
		EqualNamesContext _localctx = new EqualNamesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_equalNames);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(113);
			match(NAME);
			setState(114);
			match(EQUAL);
			setState(115);
			match(NAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CompareContext extends ParserRuleContext {
		public EqualNamesContext equalNames() {
			return getRuleContext(EqualNamesContext.class,0);
		}
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_compare);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			equalNames();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IfBlockContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(GrammarParser.IF, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(GrammarParser.OPEN_BRACKET, 0); }
		public CompareContext compare() {
			return getRuleContext(CompareContext.class,0);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(GrammarParser.CLOSE_BRACKET, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(IF);
			setState(120);
			match(OPEN_BRACKET);
			setState(121);
			compare();
			setState(122);
			match(CLOSE_BRACKET);
			setState(123);
			block();
			setState(125);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(124);
				elseBlock();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ElseBlockContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(GrammarParser.ELSE, 0); }
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterElseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitElseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitElseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(ELSE);
			setState(128);
			block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\32\u0085\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\7\2!\n\2\f\2\16\2$\13"+
		"\2\3\3\3\3\7\3(\n\3\f\3\16\3+\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\5\5:\n\5\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\7\7G\n\7\f\7\16\7J\13\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\7\bT\n\b\f\b"+
		"\16\bW\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\5\nd\n\n\3\n\3"+
		"\n\3\n\3\n\3\13\3\13\3\13\5\13m\n\13\3\13\3\13\3\13\5\13r\n\13\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\5\16\u0080\n\16\3\17\3"+
		"\17\3\17\3\17\2\2\20\2\4\6\b\n\f\16\20\22\24\26\30\32\34\2\4\4\2\4\4\16"+
		"\16\3\2\13\f\2\u0083\2\36\3\2\2\2\4%\3\2\2\2\6.\3\2\2\2\b9\3\2\2\2\n;"+
		"\3\2\2\2\f=\3\2\2\2\16N\3\2\2\2\20Z\3\2\2\2\22c\3\2\2\2\24q\3\2\2\2\26"+
		"s\3\2\2\2\30w\3\2\2\2\32y\3\2\2\2\34\u0081\3\2\2\2\36\"\5\4\3\2\37!\5"+
		"\f\7\2 \37\3\2\2\2!$\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#\3\3\2\2\2$\"\3\2\2"+
		"\2%)\7\5\2\2&(\5\b\5\2\'&\3\2\2\2(+\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*,\3\2"+
		"\2\2+)\3\2\2\2,-\7\6\2\2-\5\3\2\2\2./\7\t\2\2/\60\7\7\2\2\60\61\t\2\2"+
		"\2\61\62\7\b\2\2\62\7\3\2\2\2\63:\5\6\4\2\64:\5\16\b\2\65:\5\20\t\2\66"+
		":\5\22\n\2\67:\5\24\13\28:\5\32\16\29\63\3\2\2\29\64\3\2\2\29\65\3\2\2"+
		"\29\66\3\2\2\29\67\3\2\2\298\3\2\2\2:\t\3\2\2\2;<\t\3\2\2<\13\3\2\2\2"+
		"=>\7\n\2\2>?\7\16\2\2?@\7\7\2\2@A\5\n\6\2AH\7\16\2\2BC\7\r\2\2CD\5\n\6"+
		"\2DE\7\16\2\2EG\3\2\2\2FB\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IK\3\2"+
		"\2\2JH\3\2\2\2KL\7\b\2\2LM\5\4\3\2M\r\3\2\2\2NO\7\16\2\2OP\7\7\2\2PU\7"+
		"\16\2\2QR\7\r\2\2RT\7\16\2\2SQ\3\2\2\2TW\3\2\2\2US\3\2\2\2UV\3\2\2\2V"+
		"X\3\2\2\2WU\3\2\2\2XY\7\b\2\2Y\17\3\2\2\2Z[\7\25\2\2[\\\7\7\2\2\\]\7\16"+
		"\2\2]^\7\r\2\2^_\7\16\2\2_`\7\b\2\2`a\5\4\3\2a\21\3\2\2\2bd\7\f\2\2cb"+
		"\3\2\2\2cd\3\2\2\2de\3\2\2\2ef\7\16\2\2fg\7\24\2\2gh\t\2\2\2h\23\3\2\2"+
		"\2ij\7\13\2\2jr\7\16\2\2km\7\13\2\2lk\3\2\2\2lm\3\2\2\2mn\3\2\2\2no\7"+
		"\16\2\2op\7\24\2\2pr\7\16\2\2qi\3\2\2\2ql\3\2\2\2r\25\3\2\2\2st\7\16\2"+
		"\2tu\7\32\2\2uv\7\16\2\2v\27\3\2\2\2wx\5\26\f\2x\31\3\2\2\2yz\7\30\2\2"+
		"z{\7\7\2\2{|\5\30\r\2|}\7\b\2\2}\177\5\4\3\2~\u0080\5\34\17\2\177~\3\2"+
		"\2\2\177\u0080\3\2\2\2\u0080\33\3\2\2\2\u0081\u0082\7\31\2\2\u0082\u0083"+
		"\5\4\3\2\u0083\35\3\2\2\2\13\")9HUclq\177";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}