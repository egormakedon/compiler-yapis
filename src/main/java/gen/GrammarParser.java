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
		NUMBER=13, ASSIGNMENT=14, FOR=15, IS_EMPTY=16, CONTAINS=17, IF=18, ELSE=19, 
		EQUAL=20, CLEAR=21, ADD=22, GET=23, REMOVE=24, SIZE=25, GE=26, GT=27, 
		LE=28, LT=29, PLUS=30;
	public static final int
		RULE_program = 0, RULE_block = 1, RULE_print = 2, RULE_content = 3, RULE_type = 4, 
		RULE_functionDefine = 5, RULE_functionCall = 6, RULE_forCycle = 7, RULE_elementDeclaration = 8, 
		RULE_listDeclaration = 9, RULE_equalNames = 10, RULE_contains = 11, RULE_is_empty = 12, 
		RULE_compare = 13, RULE_ifBlock = 14, RULE_elseBlock = 15, RULE_add = 16, 
		RULE_clear = 17, RULE_get = 18, RULE_remove = 19, RULE_size = 20, RULE_compareGE = 21, 
		RULE_compareGT = 22, RULE_compareLE = 23, RULE_compareLT = 24, RULE_compareEQ = 25, 
		RULE_concate = 26;
	public static final String[] ruleNames = {
		"program", "block", "print", "content", "type", "functionDefine", "functionCall", 
		"forCycle", "elementDeclaration", "listDeclaration", "equalNames", "contains", 
		"is_empty", "compare", "ifBlock", "elseBlock", "add", "clear", "get", 
		"remove", "size", "compareGE", "compareGT", "compareLE", "compareLT", 
		"compareEQ", "concate"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'{'", "'}'", "'('", "')'", "'Print'", "'Void'", "'List'", 
		"'Element'", "','", null, null, "'='", "'For'", "'IsEmpty'", "'Contains'", 
		"'If'", "'Else'", "'=='", "'Clear'", "'Add'", "'Get'", "'Remove'", "'Size'", 
		"'>='", "'>'", "'<='", "'<'", "'+'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SPACE", "STRING", "OPEN_CURLY_BRACKET", "CLOSE_CURLY_BRACKET", 
		"OPEN_BRACKET", "CLOSE_BRACKET", "PRINT", "VOID", "LIST", "ELEMENT", "COMMA", 
		"NAME", "NUMBER", "ASSIGNMENT", "FOR", "IS_EMPTY", "CONTAINS", "IF", "ELSE", 
		"EQUAL", "CLEAR", "ADD", "GET", "REMOVE", "SIZE", "GE", "GT", "LE", "LT", 
		"PLUS"
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
			setState(54);
			block();
			setState(58);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==VOID) {
				{
				{
				setState(55);
				functionDefine();
				}
				}
				setState(60);
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
			setState(61);
			match(OPEN_CURLY_BRACKET);
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << PRINT) | (1L << LIST) | (1L << ELEMENT) | (1L << NAME) | (1L << FOR) | (1L << IF) | (1L << CLEAR) | (1L << ADD) | (1L << REMOVE) | (1L << PLUS))) != 0)) {
				{
				{
				setState(62);
				content();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
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
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(PRINT);
			setState(71);
			match(OPEN_BRACKET);
			setState(75);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(72);
				match(STRING);
				}
				break;
			case NAME:
				{
				setState(73);
				match(NAME);
				}
				break;
			case SIZE:
				{
				setState(74);
				size();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(77);
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
		public AddContext add() {
			return getRuleContext(AddContext.class,0);
		}
		public ClearContext clear() {
			return getRuleContext(ClearContext.class,0);
		}
		public RemoveContext remove() {
			return getRuleContext(RemoveContext.class,0);
		}
		public ConcateContext concate() {
			return getRuleContext(ConcateContext.class,0);
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
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				print();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				functionCall();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				forCycle();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				elementDeclaration();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(83);
				listDeclaration();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(84);
				ifBlock();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(85);
				add();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(86);
				clear();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(87);
				remove();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(88);
				concate();
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
			setState(91);
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
			setState(93);
			match(VOID);
			setState(94);
			match(NAME);
			setState(95);
			match(OPEN_BRACKET);
			setState(96);
			type();
			setState(97);
			match(NAME);
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(98);
				match(COMMA);
				setState(99);
				type();
				setState(100);
				match(NAME);
				}
				}
				setState(106);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(107);
			match(CLOSE_BRACKET);
			setState(108);
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
			setState(110);
			match(NAME);
			setState(111);
			match(OPEN_BRACKET);
			setState(112);
			match(NAME);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(113);
				match(COMMA);
				setState(114);
				match(NAME);
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
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
			setState(122);
			match(FOR);
			setState(123);
			match(OPEN_BRACKET);
			setState(124);
			match(NAME);
			setState(125);
			match(COMMA);
			setState(126);
			match(NAME);
			setState(127);
			match(CLOSE_BRACKET);
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

	public static class ElementDeclarationContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(GrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GrammarParser.NAME, i);
		}
		public TerminalNode ASSIGNMENT() { return getToken(GrammarParser.ASSIGNMENT, 0); }
		public TerminalNode STRING() { return getToken(GrammarParser.STRING, 0); }
		public GetContext get() {
			return getRuleContext(GetContext.class,0);
		}
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
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELEMENT) {
				{
				setState(130);
				match(ELEMENT);
				}
			}

			setState(133);
			match(NAME);
			setState(134);
			match(ASSIGNMENT);
			setState(138);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING:
				{
				setState(135);
				match(STRING);
				}
				break;
			case NAME:
				{
				setState(136);
				match(NAME);
				}
				break;
			case GET:
				{
				setState(137);
				get();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(140);
				match(LIST);
				setState(141);
				match(NAME);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LIST) {
					{
					setState(142);
					match(LIST);
					}
				}

				setState(145);
				match(NAME);
				setState(146);
				match(ASSIGNMENT);
				setState(147);
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
			setState(150);
			match(NAME);
			setState(151);
			match(EQUAL);
			setState(152);
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

	public static class ContainsContext extends ParserRuleContext {
		public TerminalNode CONTAINS() { return getToken(GrammarParser.CONTAINS, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(GrammarParser.OPEN_BRACKET, 0); }
		public List<TerminalNode> NAME() { return getTokens(GrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GrammarParser.NAME, i);
		}
		public TerminalNode COMMA() { return getToken(GrammarParser.COMMA, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(GrammarParser.CLOSE_BRACKET, 0); }
		public ContainsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_contains; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterContains(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitContains(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitContains(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContainsContext contains() throws RecognitionException {
		ContainsContext _localctx = new ContainsContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_contains);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(CONTAINS);
			setState(155);
			match(OPEN_BRACKET);
			setState(156);
			match(NAME);
			setState(157);
			match(COMMA);
			setState(158);
			match(NAME);
			setState(159);
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

	public static class Is_emptyContext extends ParserRuleContext {
		public TerminalNode IS_EMPTY() { return getToken(GrammarParser.IS_EMPTY, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(GrammarParser.OPEN_BRACKET, 0); }
		public TerminalNode NAME() { return getToken(GrammarParser.NAME, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(GrammarParser.CLOSE_BRACKET, 0); }
		public Is_emptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_is_empty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterIs_empty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitIs_empty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitIs_empty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Is_emptyContext is_empty() throws RecognitionException {
		Is_emptyContext _localctx = new Is_emptyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_is_empty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			match(IS_EMPTY);
			setState(162);
			match(OPEN_BRACKET);
			setState(163);
			match(NAME);
			setState(164);
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

	public static class CompareContext extends ParserRuleContext {
		public EqualNamesContext equalNames() {
			return getRuleContext(EqualNamesContext.class,0);
		}
		public ContainsContext contains() {
			return getRuleContext(ContainsContext.class,0);
		}
		public Is_emptyContext is_empty() {
			return getRuleContext(Is_emptyContext.class,0);
		}
		public CompareGEContext compareGE() {
			return getRuleContext(CompareGEContext.class,0);
		}
		public CompareGTContext compareGT() {
			return getRuleContext(CompareGTContext.class,0);
		}
		public CompareLEContext compareLE() {
			return getRuleContext(CompareLEContext.class,0);
		}
		public CompareLTContext compareLT() {
			return getRuleContext(CompareLTContext.class,0);
		}
		public CompareEQContext compareEQ() {
			return getRuleContext(CompareEQContext.class,0);
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
		enterRule(_localctx, 26, RULE_compare);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(166);
				equalNames();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(167);
				contains();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(168);
				is_empty();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(169);
				compareGE();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(170);
				compareGT();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(171);
				compareLE();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(172);
				compareLT();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(173);
				compareEQ();
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
		enterRule(_localctx, 28, RULE_ifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			match(IF);
			setState(177);
			match(OPEN_BRACKET);
			setState(178);
			compare();
			setState(179);
			match(CLOSE_BRACKET);
			setState(180);
			block();
			setState(182);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(181);
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
		enterRule(_localctx, 30, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(184);
			match(ELSE);
			setState(185);
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

	public static class AddContext extends ParserRuleContext {
		public TerminalNode ADD() { return getToken(GrammarParser.ADD, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(GrammarParser.OPEN_BRACKET, 0); }
		public List<TerminalNode> NAME() { return getTokens(GrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GrammarParser.NAME, i);
		}
		public TerminalNode COMMA() { return getToken(GrammarParser.COMMA, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(GrammarParser.CLOSE_BRACKET, 0); }
		public AddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AddContext add() throws RecognitionException {
		AddContext _localctx = new AddContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_add);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(ADD);
			setState(188);
			match(OPEN_BRACKET);
			setState(189);
			match(NAME);
			setState(190);
			match(COMMA);
			setState(191);
			match(NAME);
			setState(192);
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

	public static class ClearContext extends ParserRuleContext {
		public TerminalNode CLEAR() { return getToken(GrammarParser.CLEAR, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(GrammarParser.OPEN_BRACKET, 0); }
		public TerminalNode NAME() { return getToken(GrammarParser.NAME, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(GrammarParser.CLOSE_BRACKET, 0); }
		public ClearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_clear; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterClear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitClear(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitClear(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ClearContext clear() throws RecognitionException {
		ClearContext _localctx = new ClearContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_clear);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(194);
			match(CLEAR);
			setState(195);
			match(OPEN_BRACKET);
			setState(196);
			match(NAME);
			setState(197);
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

	public static class GetContext extends ParserRuleContext {
		public TerminalNode GET() { return getToken(GrammarParser.GET, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(GrammarParser.OPEN_BRACKET, 0); }
		public TerminalNode NAME() { return getToken(GrammarParser.NAME, 0); }
		public TerminalNode COMMA() { return getToken(GrammarParser.COMMA, 0); }
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(GrammarParser.CLOSE_BRACKET, 0); }
		public GetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_get; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterGet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitGet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitGet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GetContext get() throws RecognitionException {
		GetContext _localctx = new GetContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_get);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(GET);
			setState(200);
			match(OPEN_BRACKET);
			setState(201);
			match(NAME);
			setState(202);
			match(COMMA);
			setState(203);
			match(NUMBER);
			setState(204);
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

	public static class RemoveContext extends ParserRuleContext {
		public TerminalNode REMOVE() { return getToken(GrammarParser.REMOVE, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(GrammarParser.OPEN_BRACKET, 0); }
		public List<TerminalNode> NAME() { return getTokens(GrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GrammarParser.NAME, i);
		}
		public TerminalNode COMMA() { return getToken(GrammarParser.COMMA, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(GrammarParser.CLOSE_BRACKET, 0); }
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public RemoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remove; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterRemove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitRemove(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitRemove(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RemoveContext remove() throws RecognitionException {
		RemoveContext _localctx = new RemoveContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_remove);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(206);
			match(REMOVE);
			setState(207);
			match(OPEN_BRACKET);
			setState(208);
			match(NAME);
			setState(209);
			match(COMMA);
			setState(210);
			_la = _input.LA(1);
			if ( !(_la==NAME || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(211);
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

	public static class SizeContext extends ParserRuleContext {
		public TerminalNode SIZE() { return getToken(GrammarParser.SIZE, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(GrammarParser.OPEN_BRACKET, 0); }
		public TerminalNode NAME() { return getToken(GrammarParser.NAME, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(GrammarParser.CLOSE_BRACKET, 0); }
		public SizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizeContext size() throws RecognitionException {
		SizeContext _localctx = new SizeContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			match(SIZE);
			setState(214);
			match(OPEN_BRACKET);
			setState(215);
			match(NAME);
			setState(216);
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

	public static class CompareGEContext extends ParserRuleContext {
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public TerminalNode GE() { return getToken(GrammarParser.GE, 0); }
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public CompareGEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareGE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCompareGE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCompareGE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCompareGE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareGEContext compareGE() throws RecognitionException {
		CompareGEContext _localctx = new CompareGEContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_compareGE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			size();
			setState(219);
			match(GE);
			setState(220);
			match(NUMBER);
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

	public static class CompareGTContext extends ParserRuleContext {
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public TerminalNode GT() { return getToken(GrammarParser.GT, 0); }
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public CompareGTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareGT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCompareGT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCompareGT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCompareGT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareGTContext compareGT() throws RecognitionException {
		CompareGTContext _localctx = new CompareGTContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_compareGT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			size();
			setState(223);
			match(GT);
			setState(224);
			match(NUMBER);
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

	public static class CompareLEContext extends ParserRuleContext {
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public TerminalNode LE() { return getToken(GrammarParser.LE, 0); }
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public CompareLEContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareLE; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCompareLE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCompareLE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCompareLE(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareLEContext compareLE() throws RecognitionException {
		CompareLEContext _localctx = new CompareLEContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_compareLE);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			size();
			setState(227);
			match(LE);
			setState(228);
			match(NUMBER);
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

	public static class CompareLTContext extends ParserRuleContext {
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public TerminalNode LT() { return getToken(GrammarParser.LT, 0); }
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public CompareLTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareLT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCompareLT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCompareLT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCompareLT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareLTContext compareLT() throws RecognitionException {
		CompareLTContext _localctx = new CompareLTContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_compareLT);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			size();
			setState(231);
			match(LT);
			setState(232);
			match(NUMBER);
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

	public static class CompareEQContext extends ParserRuleContext {
		public SizeContext size() {
			return getRuleContext(SizeContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(GrammarParser.EQUAL, 0); }
		public TerminalNode NUMBER() { return getToken(GrammarParser.NUMBER, 0); }
		public CompareEQContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compareEQ; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterCompareEQ(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitCompareEQ(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitCompareEQ(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareEQContext compareEQ() throws RecognitionException {
		CompareEQContext _localctx = new CompareEQContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_compareEQ);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			size();
			setState(235);
			match(EQUAL);
			setState(236);
			match(NUMBER);
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

	public static class ConcateContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(GrammarParser.PLUS, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(GrammarParser.OPEN_BRACKET, 0); }
		public List<TerminalNode> NAME() { return getTokens(GrammarParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(GrammarParser.NAME, i);
		}
		public TerminalNode COMMA() { return getToken(GrammarParser.COMMA, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(GrammarParser.CLOSE_BRACKET, 0); }
		public ConcateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).enterConcate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GrammarListener ) ((GrammarListener)listener).exitConcate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GrammarVisitor ) return ((GrammarVisitor<? extends T>)visitor).visitConcate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConcateContext concate() throws RecognitionException {
		ConcateContext _localctx = new ConcateContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_concate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			match(PLUS);
			setState(239);
			match(OPEN_BRACKET);
			setState(240);
			match(NAME);
			setState(241);
			match(COMMA);
			setState(242);
			match(NAME);
			setState(243);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3 \u00f8\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\7\2;\n\2\f\2\16\2>\13\2\3\3\3\3"+
		"\7\3B\n\3\f\3\16\3E\13\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\5\4N\n\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\5\5\\\n\5\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\7\7i\n\7\f\7\16\7l\13\7\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\7\bv\n\b\f\b\16\by\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t"+
		"\3\t\3\n\5\n\u0086\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u008d\n\n\3\13\3\13\3\13"+
		"\5\13\u0092\n\13\3\13\3\13\3\13\5\13\u0097\n\13\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\5\17\u00b1\n\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20"+
		"\u00b9\n\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33"+
		"\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\2\2\35\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\4\3\2\13\f\3\2\16\17\2\u00f8\2"+
		"8\3\2\2\2\4?\3\2\2\2\6H\3\2\2\2\b[\3\2\2\2\n]\3\2\2\2\f_\3\2\2\2\16p\3"+
		"\2\2\2\20|\3\2\2\2\22\u0085\3\2\2\2\24\u0096\3\2\2\2\26\u0098\3\2\2\2"+
		"\30\u009c\3\2\2\2\32\u00a3\3\2\2\2\34\u00b0\3\2\2\2\36\u00b2\3\2\2\2 "+
		"\u00ba\3\2\2\2\"\u00bd\3\2\2\2$\u00c4\3\2\2\2&\u00c9\3\2\2\2(\u00d0\3"+
		"\2\2\2*\u00d7\3\2\2\2,\u00dc\3\2\2\2.\u00e0\3\2\2\2\60\u00e4\3\2\2\2\62"+
		"\u00e8\3\2\2\2\64\u00ec\3\2\2\2\66\u00f0\3\2\2\28<\5\4\3\29;\5\f\7\2:"+
		"9\3\2\2\2;>\3\2\2\2<:\3\2\2\2<=\3\2\2\2=\3\3\2\2\2><\3\2\2\2?C\7\5\2\2"+
		"@B\5\b\5\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3\2\2\2DF\3\2\2\2EC\3\2\2\2"+
		"FG\7\6\2\2G\5\3\2\2\2HI\7\t\2\2IM\7\7\2\2JN\7\4\2\2KN\7\16\2\2LN\5*\26"+
		"\2MJ\3\2\2\2MK\3\2\2\2ML\3\2\2\2NO\3\2\2\2OP\7\b\2\2P\7\3\2\2\2Q\\\5\6"+
		"\4\2R\\\5\16\b\2S\\\5\20\t\2T\\\5\22\n\2U\\\5\24\13\2V\\\5\36\20\2W\\"+
		"\5\"\22\2X\\\5$\23\2Y\\\5(\25\2Z\\\5\66\34\2[Q\3\2\2\2[R\3\2\2\2[S\3\2"+
		"\2\2[T\3\2\2\2[U\3\2\2\2[V\3\2\2\2[W\3\2\2\2[X\3\2\2\2[Y\3\2\2\2[Z\3\2"+
		"\2\2\\\t\3\2\2\2]^\t\2\2\2^\13\3\2\2\2_`\7\n\2\2`a\7\16\2\2ab\7\7\2\2"+
		"bc\5\n\6\2cj\7\16\2\2de\7\r\2\2ef\5\n\6\2fg\7\16\2\2gi\3\2\2\2hd\3\2\2"+
		"\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2km\3\2\2\2lj\3\2\2\2mn\7\b\2\2no\5\4\3"+
		"\2o\r\3\2\2\2pq\7\16\2\2qr\7\7\2\2rw\7\16\2\2st\7\r\2\2tv\7\16\2\2us\3"+
		"\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2xz\3\2\2\2yw\3\2\2\2z{\7\b\2\2{\17"+
		"\3\2\2\2|}\7\21\2\2}~\7\7\2\2~\177\7\16\2\2\177\u0080\7\r\2\2\u0080\u0081"+
		"\7\16\2\2\u0081\u0082\7\b\2\2\u0082\u0083\5\4\3\2\u0083\21\3\2\2\2\u0084"+
		"\u0086\7\f\2\2\u0085\u0084\3\2\2\2\u0085\u0086\3\2\2\2\u0086\u0087\3\2"+
		"\2\2\u0087\u0088\7\16\2\2\u0088\u008c\7\20\2\2\u0089\u008d\7\4\2\2\u008a"+
		"\u008d\7\16\2\2\u008b\u008d\5&\24\2\u008c\u0089\3\2\2\2\u008c\u008a\3"+
		"\2\2\2\u008c\u008b\3\2\2\2\u008d\23\3\2\2\2\u008e\u008f\7\13\2\2\u008f"+
		"\u0097\7\16\2\2\u0090\u0092\7\13\2\2\u0091\u0090\3\2\2\2\u0091\u0092\3"+
		"\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\7\16\2\2\u0094\u0095\7\20\2\2\u0095"+
		"\u0097\7\16\2\2\u0096\u008e\3\2\2\2\u0096\u0091\3\2\2\2\u0097\25\3\2\2"+
		"\2\u0098\u0099\7\16\2\2\u0099\u009a\7\26\2\2\u009a\u009b\7\16\2\2\u009b"+
		"\27\3\2\2\2\u009c\u009d\7\23\2\2\u009d\u009e\7\7\2\2\u009e\u009f\7\16"+
		"\2\2\u009f\u00a0\7\r\2\2\u00a0\u00a1\7\16\2\2\u00a1\u00a2\7\b\2\2\u00a2"+
		"\31\3\2\2\2\u00a3\u00a4\7\22\2\2\u00a4\u00a5\7\7\2\2\u00a5\u00a6\7\16"+
		"\2\2\u00a6\u00a7\7\b\2\2\u00a7\33\3\2\2\2\u00a8\u00b1\5\26\f\2\u00a9\u00b1"+
		"\5\30\r\2\u00aa\u00b1\5\32\16\2\u00ab\u00b1\5,\27\2\u00ac\u00b1\5.\30"+
		"\2\u00ad\u00b1\5\60\31\2\u00ae\u00b1\5\62\32\2\u00af\u00b1\5\64\33\2\u00b0"+
		"\u00a8\3\2\2\2\u00b0\u00a9\3\2\2\2\u00b0\u00aa\3\2\2\2\u00b0\u00ab\3\2"+
		"\2\2\u00b0\u00ac\3\2\2\2\u00b0\u00ad\3\2\2\2\u00b0\u00ae\3\2\2\2\u00b0"+
		"\u00af\3\2\2\2\u00b1\35\3\2\2\2\u00b2\u00b3\7\24\2\2\u00b3\u00b4\7\7\2"+
		"\2\u00b4\u00b5\5\34\17\2\u00b5\u00b6\7\b\2\2\u00b6\u00b8\5\4\3\2\u00b7"+
		"\u00b9\5 \21\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9\37\3\2\2"+
		"\2\u00ba\u00bb\7\25\2\2\u00bb\u00bc\5\4\3\2\u00bc!\3\2\2\2\u00bd\u00be"+
		"\7\30\2\2\u00be\u00bf\7\7\2\2\u00bf\u00c0\7\16\2\2\u00c0\u00c1\7\r\2\2"+
		"\u00c1\u00c2\7\16\2\2\u00c2\u00c3\7\b\2\2\u00c3#\3\2\2\2\u00c4\u00c5\7"+
		"\27\2\2\u00c5\u00c6\7\7\2\2\u00c6\u00c7\7\16\2\2\u00c7\u00c8\7\b\2\2\u00c8"+
		"%\3\2\2\2\u00c9\u00ca\7\31\2\2\u00ca\u00cb\7\7\2\2\u00cb\u00cc\7\16\2"+
		"\2\u00cc\u00cd\7\r\2\2\u00cd\u00ce\7\17\2\2\u00ce\u00cf\7\b\2\2\u00cf"+
		"\'\3\2\2\2\u00d0\u00d1\7\32\2\2\u00d1\u00d2\7\7\2\2\u00d2\u00d3\7\16\2"+
		"\2\u00d3\u00d4\7\r\2\2\u00d4\u00d5\t\3\2\2\u00d5\u00d6\7\b\2\2\u00d6)"+
		"\3\2\2\2\u00d7\u00d8\7\33\2\2\u00d8\u00d9\7\7\2\2\u00d9\u00da\7\16\2\2"+
		"\u00da\u00db\7\b\2\2\u00db+\3\2\2\2\u00dc\u00dd\5*\26\2\u00dd\u00de\7"+
		"\34\2\2\u00de\u00df\7\17\2\2\u00df-\3\2\2\2\u00e0\u00e1\5*\26\2\u00e1"+
		"\u00e2\7\35\2\2\u00e2\u00e3\7\17\2\2\u00e3/\3\2\2\2\u00e4\u00e5\5*\26"+
		"\2\u00e5\u00e6\7\36\2\2\u00e6\u00e7\7\17\2\2\u00e7\61\3\2\2\2\u00e8\u00e9"+
		"\5*\26\2\u00e9\u00ea\7\37\2\2\u00ea\u00eb\7\17\2\2\u00eb\63\3\2\2\2\u00ec"+
		"\u00ed\5*\26\2\u00ed\u00ee\7\26\2\2\u00ee\u00ef\7\17\2\2\u00ef\65\3\2"+
		"\2\2\u00f0\u00f1\7 \2\2\u00f1\u00f2\7\7\2\2\u00f2\u00f3\7\16\2\2\u00f3"+
		"\u00f4\7\r\2\2\u00f4\u00f5\7\16\2\2\u00f5\u00f6\7\b\2\2\u00f6\67\3\2\2"+
		"\2\16<CM[jw\u0085\u008c\u0091\u0096\u00b0\u00b8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}