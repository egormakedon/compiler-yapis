// Generated from /home/egor/Документы/compiler-yapis/src/main/resources/grammar/grammarFile.g4 by ANTLR 4.7
package com.epam.makedon.compiler.gen.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class grammarFileParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, NAME=2, NUMBER=3, STRING=4, OPEN_BRACKET=5, CLOSE_BRACKET=6, 
		OPEN_CURLY_BRACKET=7, CLOSE_CURLY_BRACKET=8, DOT=9, COMMA=10, ASSIGNMENT=11, 
		SEMICOLON=12, COLON=13, MAIN=14, VOID=15, RETURN=16, CLEAR=17, ADD=18, 
		GET=19, REMOVE=20, SIZE=21, IS_EMPTY=22, CONTAINS=23, ELEMENT=24, LIST=25, 
		PRINT=26, FOR=27, IF=28, ELSE=29, AND=30, OR=31, EQUAL=32, NEGATION=33;
	public static final int
		RULE_type = 0, RULE_blockOfCode = 1, RULE_returnBlockOfCode = 2, RULE_program = 3, 
		RULE_functionSignature = 4, RULE_voidFunction = 5, RULE_returnFunction = 6, 
		RULE_functionCall = 7, RULE_callClear = 8, RULE_callAdd = 9, RULE_callGet = 10, 
		RULE_callRemove = 11, RULE_callIsEmpty = 12, RULE_callSize = 13, RULE_callContains = 14, 
		RULE_elementDeclaration = 15, RULE_listDeclaration = 16, RULE_callPrint = 17, 
		RULE_forCycle = 18, RULE_compare = 19, RULE_ifBlock = 20, RULE_elseBlock = 21, 
		RULE_content = 22;
	public static final String[] ruleNames = {
		"type", "blockOfCode", "returnBlockOfCode", "program", "functionSignature", 
		"voidFunction", "returnFunction", "functionCall", "callClear", "callAdd", 
		"callGet", "callRemove", "callIsEmpty", "callSize", "callContains", "elementDeclaration", 
		"listDeclaration", "callPrint", "forCycle", "compare", "ifBlock", "elseBlock", 
		"content"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, null, null, "'('", "')'", "'{'", "'}'", "'.'", "','", 
		"'='", "';'", "':'", "'main'", "'void'", "'return'", "'clear'", "'add'", 
		"'get'", "'remove'", "'size'", "'isEmpty'", "'contains'", "'Element'", 
		"'List'", "'print'", "'for'", "'if'", "'else'", "'&&'", "'||'", "'=='", 
		"'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SPACE", "NAME", "NUMBER", "STRING", "OPEN_BRACKET", "CLOSE_BRACKET", 
		"OPEN_CURLY_BRACKET", "CLOSE_CURLY_BRACKET", "DOT", "COMMA", "ASSIGNMENT", 
		"SEMICOLON", "COLON", "MAIN", "VOID", "RETURN", "CLEAR", "ADD", "GET", 
		"REMOVE", "SIZE", "IS_EMPTY", "CONTAINS", "ELEMENT", "LIST", "PRINT", 
		"FOR", "IF", "ELSE", "AND", "OR", "EQUAL", "NEGATION"
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
	public String getGrammarFileName() { return "grammarFile.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public grammarFileParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class TypeContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(grammarFileParser.LIST, 0); }
		public TerminalNode ELEMENT() { return getToken(grammarFileParser.ELEMENT, 0); }
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFileListener ) ((grammarFileListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFileListener ) ((grammarFileListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarFileVisitor ) return ((grammarFileVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			_la = _input.LA(1);
			if ( !(_la==ELEMENT || _la==LIST) ) {
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

	public static class BlockOfCodeContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY_BRACKET() { return getToken(grammarFileParser.OPEN_CURLY_BRACKET, 0); }
		public TerminalNode CLOSE_CURLY_BRACKET() { return getToken(grammarFileParser.CLOSE_CURLY_BRACKET, 0); }
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public BlockOfCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_blockOfCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFileListener ) ((grammarFileListener)listener).enterBlockOfCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFileListener ) ((grammarFileListener)listener).exitBlockOfCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarFileVisitor ) return ((grammarFileVisitor<? extends T>)visitor).visitBlockOfCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BlockOfCodeContext blockOfCode() throws RecognitionException {
		BlockOfCodeContext _localctx = new BlockOfCodeContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_blockOfCode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(OPEN_CURLY_BRACKET);
			setState(52);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAME) | (1L << OPEN_BRACKET) | (1L << ELEMENT) | (1L << LIST) | (1L << FOR) | (1L << IF))) != 0)) {
				{
				{
				setState(49);
				content();
				}
				}
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(55);
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

	public static class ReturnBlockOfCodeContext extends ParserRuleContext {
		public TerminalNode OPEN_CURLY_BRACKET() { return getToken(grammarFileParser.OPEN_CURLY_BRACKET, 0); }
		public TerminalNode RETURN() { return getToken(grammarFileParser.RETURN, 0); }
		public TerminalNode NAME() { return getToken(grammarFileParser.NAME, 0); }
		public TerminalNode SEMICOLON() { return getToken(grammarFileParser.SEMICOLON, 0); }
		public TerminalNode CLOSE_CURLY_BRACKET() { return getToken(grammarFileParser.CLOSE_CURLY_BRACKET, 0); }
		public List<ContentContext> content() {
			return getRuleContexts(ContentContext.class);
		}
		public ContentContext content(int i) {
			return getRuleContext(ContentContext.class,i);
		}
		public ReturnBlockOfCodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnBlockOfCode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFileListener ) ((grammarFileListener)listener).enterReturnBlockOfCode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFileListener ) ((grammarFileListener)listener).exitReturnBlockOfCode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarFileVisitor ) return ((grammarFileVisitor<? extends T>)visitor).visitReturnBlockOfCode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnBlockOfCodeContext returnBlockOfCode() throws RecognitionException {
		ReturnBlockOfCodeContext _localctx = new ReturnBlockOfCodeContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_returnBlockOfCode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(OPEN_CURLY_BRACKET);
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NAME) | (1L << OPEN_BRACKET) | (1L << ELEMENT) | (1L << LIST) | (1L << FOR) | (1L << IF))) != 0)) {
				{
				{
				setState(58);
				content();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(64);
			match(RETURN);
			setState(65);
			match(NAME);
			setState(66);
			match(SEMICOLON);
			setState(67);
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

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode MAIN() { return getToken(grammarFileParser.MAIN, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(grammarFileParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(grammarFileParser.CLOSE_BRACKET, 0); }
		public BlockOfCodeContext blockOfCode() {
			return getRuleContext(BlockOfCodeContext.class,0);
		}
		public List<VoidFunctionContext> voidFunction() {
			return getRuleContexts(VoidFunctionContext.class);
		}
		public VoidFunctionContext voidFunction(int i) {
			return getRuleContext(VoidFunctionContext.class,i);
		}
		public List<ReturnFunctionContext> returnFunction() {
			return getRuleContexts(ReturnFunctionContext.class);
		}
		public ReturnFunctionContext returnFunction(int i) {
			return getRuleContext(ReturnFunctionContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFileListener ) ((grammarFileListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFileListener ) ((grammarFileListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarFileVisitor ) return ((grammarFileVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			match(MAIN);
			setState(70);
			match(OPEN_BRACKET);
			setState(71);
			match(CLOSE_BRACKET);
			setState(72);
			blockOfCode();
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << VOID) | (1L << ELEMENT) | (1L << LIST))) != 0)) {
				{
				setState(75);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case VOID:
					{
					setState(73);
					voidFunction();
					}
					break;
				case ELEMENT:
				case LIST:
					{
					setState(74);
					returnFunction();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(79);
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

	public static class FunctionSignatureContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(grammarFileParser.OPEN_BRACKET, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public List<TerminalNode> NAME() { return getTokens(grammarFileParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(grammarFileParser.NAME, i);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(grammarFileParser.CLOSE_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(grammarFileParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(grammarFileParser.COMMA, i);
		}
		public FunctionSignatureContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionSignature; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFileListener ) ((grammarFileListener)listener).enterFunctionSignature(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFileListener ) ((grammarFileListener)listener).exitFunctionSignature(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarFileVisitor ) return ((grammarFileVisitor<? extends T>)visitor).visitFunctionSignature(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionSignatureContext functionSignature() throws RecognitionException {
		FunctionSignatureContext _localctx = new FunctionSignatureContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_functionSignature);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			match(OPEN_BRACKET);
			setState(81);
			type();
			setState(82);
			match(NAME);
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(83);
				match(COMMA);
				setState(84);
				type();
				setState(85);
				match(NAME);
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(92);
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

	public static class VoidFunctionContext extends ParserRuleContext {
		public TerminalNode VOID() { return getToken(grammarFileParser.VOID, 0); }
		public TerminalNode NAME() { return getToken(grammarFileParser.NAME, 0); }
		public BlockOfCodeContext blockOfCode() {
			return getRuleContext(BlockOfCodeContext.class,0);
		}
		public FunctionSignatureContext functionSignature() {
			return getRuleContext(FunctionSignatureContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(grammarFileParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(grammarFileParser.CLOSE_BRACKET, 0); }
		public VoidFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_voidFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFileListener ) ((grammarFileListener)listener).enterVoidFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFileListener ) ((grammarFileListener)listener).exitVoidFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarFileVisitor ) return ((grammarFileVisitor<? extends T>)visitor).visitVoidFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VoidFunctionContext voidFunction() throws RecognitionException {
		VoidFunctionContext _localctx = new VoidFunctionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_voidFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(VOID);
			setState(95);
			match(NAME);
			setState(99);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				{
				setState(96);
				functionSignature();
				}
				break;
			case 2:
				{
				{
				setState(97);
				match(OPEN_BRACKET);
				setState(98);
				match(CLOSE_BRACKET);
				}
				}
				break;
			}
			setState(101);
			blockOfCode();
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

	public static class ReturnFunctionContext extends ParserRuleContext {
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode NAME() { return getToken(grammarFileParser.NAME, 0); }
		public ReturnBlockOfCodeContext returnBlockOfCode() {
			return getRuleContext(ReturnBlockOfCodeContext.class,0);
		}
		public FunctionSignatureContext functionSignature() {
			return getRuleContext(FunctionSignatureContext.class,0);
		}
		public TerminalNode OPEN_BRACKET() { return getToken(grammarFileParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(grammarFileParser.CLOSE_BRACKET, 0); }
		public ReturnFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFileListener ) ((grammarFileListener)listener).enterReturnFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFileListener ) ((grammarFileListener)listener).exitReturnFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarFileVisitor ) return ((grammarFileVisitor<? extends T>)visitor).visitReturnFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnFunctionContext returnFunction() throws RecognitionException {
		ReturnFunctionContext _localctx = new ReturnFunctionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_returnFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			type();
			setState(104);
			match(NAME);
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(105);
				functionSignature();
				}
				break;
			case 2:
				{
				{
				setState(106);
				match(OPEN_BRACKET);
				setState(107);
				match(CLOSE_BRACKET);
				}
				}
				break;
			}
			setState(110);
			returnBlockOfCode();
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
		public List<TerminalNode> NAME() { return getTokens(grammarFileParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(grammarFileParser.NAME, i);
		}
		public TerminalNode SEMICOLON() { return getToken(grammarFileParser.SEMICOLON, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(grammarFileParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(grammarFileParser.CLOSE_BRACKET, 0); }
		public List<TerminalNode> STRING() { return getTokens(grammarFileParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(grammarFileParser.STRING, i);
		}
		public List<FunctionCallContext> functionCall() {
			return getRuleContexts(FunctionCallContext.class);
		}
		public FunctionCallContext functionCall(int i) {
			return getRuleContext(FunctionCallContext.class,i);
		}
		public List<CallGetContext> callGet() {
			return getRuleContexts(CallGetContext.class);
		}
		public CallGetContext callGet(int i) {
			return getRuleContext(CallGetContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(grammarFileParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(grammarFileParser.COMMA, i);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFileListener ) ((grammarFileListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFileListener ) ((grammarFileListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarFileVisitor ) return ((grammarFileVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_functionCall);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(NAME);
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				{
				setState(113);
				match(OPEN_BRACKET);
				setState(114);
				match(CLOSE_BRACKET);
				}
				}
				break;
			case 2:
				{
				{
				setState(115);
				match(OPEN_BRACKET);
				setState(120);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(116);
					match(STRING);
					}
					break;
				case 2:
					{
					setState(117);
					functionCall();
					}
					break;
				case 3:
					{
					setState(118);
					callGet();
					}
					break;
				case 4:
					{
					setState(119);
					match(NAME);
					}
					break;
				}
				setState(131);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(122);
					match(COMMA);
					setState(127);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
					case 1:
						{
						setState(123);
						match(STRING);
						}
						break;
					case 2:
						{
						setState(124);
						functionCall();
						}
						break;
					case 3:
						{
						setState(125);
						callGet();
						}
						break;
					case 4:
						{
						setState(126);
						match(NAME);
						}
						break;
					}
					}
					}
					setState(133);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(134);
				match(CLOSE_BRACKET);
				}
				}
				break;
			}
			setState(137);
			match(SEMICOLON);
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

	public static class CallClearContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(grammarFileParser.NAME, 0); }
		public TerminalNode DOT() { return getToken(grammarFileParser.DOT, 0); }
		public TerminalNode CLEAR() { return getToken(grammarFileParser.CLEAR, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(grammarFileParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(grammarFileParser.CLOSE_BRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(grammarFileParser.SEMICOLON, 0); }
		public CallClearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callClear; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFileListener ) ((grammarFileListener)listener).enterCallClear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFileListener ) ((grammarFileListener)listener).exitCallClear(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarFileVisitor ) return ((grammarFileVisitor<? extends T>)visitor).visitCallClear(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallClearContext callClear() throws RecognitionException {
		CallClearContext _localctx = new CallClearContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_callClear);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(139);
			match(NAME);
			setState(140);
			match(DOT);
			setState(141);
			match(CLEAR);
			setState(142);
			match(OPEN_BRACKET);
			setState(143);
			match(CLOSE_BRACKET);
			setState(144);
			match(SEMICOLON);
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

	public static class CallAddContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(grammarFileParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(grammarFileParser.NAME, i);
		}
		public TerminalNode DOT() { return getToken(grammarFileParser.DOT, 0); }
		public TerminalNode ADD() { return getToken(grammarFileParser.ADD, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(grammarFileParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(grammarFileParser.CLOSE_BRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(grammarFileParser.SEMICOLON, 0); }
		public TerminalNode NUMBER() { return getToken(grammarFileParser.NUMBER, 0); }
		public TerminalNode COMMA() { return getToken(grammarFileParser.COMMA, 0); }
		public CallAddContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callAdd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFileListener ) ((grammarFileListener)listener).enterCallAdd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFileListener ) ((grammarFileListener)listener).exitCallAdd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarFileVisitor ) return ((grammarFileVisitor<? extends T>)visitor).visitCallAdd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallAddContext callAdd() throws RecognitionException {
		CallAddContext _localctx = new CallAddContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_callAdd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(NAME);
			setState(147);
			match(DOT);
			setState(148);
			match(ADD);
			setState(149);
			match(OPEN_BRACKET);
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NAME:
				{
				setState(150);
				match(NAME);
				}
				break;
			case NUMBER:
				{
				{
				setState(151);
				match(NUMBER);
				setState(152);
				match(COMMA);
				setState(153);
				match(NAME);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(156);
			match(CLOSE_BRACKET);
			setState(157);
			match(SEMICOLON);
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

	public static class CallGetContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(grammarFileParser.NAME, 0); }
		public TerminalNode DOT() { return getToken(grammarFileParser.DOT, 0); }
		public TerminalNode GET() { return getToken(grammarFileParser.GET, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(grammarFileParser.OPEN_BRACKET, 0); }
		public TerminalNode NUMBER() { return getToken(grammarFileParser.NUMBER, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(grammarFileParser.CLOSE_BRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(grammarFileParser.SEMICOLON, 0); }
		public CallGetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callGet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFileListener ) ((grammarFileListener)listener).enterCallGet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFileListener ) ((grammarFileListener)listener).exitCallGet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarFileVisitor ) return ((grammarFileVisitor<? extends T>)visitor).visitCallGet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallGetContext callGet() throws RecognitionException {
		CallGetContext _localctx = new CallGetContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_callGet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(159);
			match(NAME);
			setState(160);
			match(DOT);
			setState(161);
			match(GET);
			setState(162);
			match(OPEN_BRACKET);
			setState(163);
			match(NUMBER);
			setState(164);
			match(CLOSE_BRACKET);
			setState(165);
			match(SEMICOLON);
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

	public static class CallRemoveContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(grammarFileParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(grammarFileParser.NAME, i);
		}
		public TerminalNode DOT() { return getToken(grammarFileParser.DOT, 0); }
		public TerminalNode REMOVE() { return getToken(grammarFileParser.REMOVE, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(grammarFileParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(grammarFileParser.CLOSE_BRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(grammarFileParser.SEMICOLON, 0); }
		public TerminalNode NUMBER() { return getToken(grammarFileParser.NUMBER, 0); }
		public CallRemoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callRemove; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFileListener ) ((grammarFileListener)listener).enterCallRemove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFileListener ) ((grammarFileListener)listener).exitCallRemove(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarFileVisitor ) return ((grammarFileVisitor<? extends T>)visitor).visitCallRemove(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallRemoveContext callRemove() throws RecognitionException {
		CallRemoveContext _localctx = new CallRemoveContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_callRemove);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(NAME);
			setState(168);
			match(DOT);
			setState(169);
			match(REMOVE);
			setState(170);
			match(OPEN_BRACKET);
			setState(171);
			_la = _input.LA(1);
			if ( !(_la==NAME || _la==NUMBER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(172);
			match(CLOSE_BRACKET);
			setState(173);
			match(SEMICOLON);
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

	public static class CallIsEmptyContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(grammarFileParser.NAME, 0); }
		public TerminalNode DOT() { return getToken(grammarFileParser.DOT, 0); }
		public TerminalNode IS_EMPTY() { return getToken(grammarFileParser.IS_EMPTY, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(grammarFileParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(grammarFileParser.CLOSE_BRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(grammarFileParser.SEMICOLON, 0); }
		public CallIsEmptyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callIsEmpty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFileListener ) ((grammarFileListener)listener).enterCallIsEmpty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFileListener ) ((grammarFileListener)listener).exitCallIsEmpty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarFileVisitor ) return ((grammarFileVisitor<? extends T>)visitor).visitCallIsEmpty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallIsEmptyContext callIsEmpty() throws RecognitionException {
		CallIsEmptyContext _localctx = new CallIsEmptyContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_callIsEmpty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(NAME);
			setState(176);
			match(DOT);
			setState(177);
			match(IS_EMPTY);
			setState(178);
			match(OPEN_BRACKET);
			setState(179);
			match(CLOSE_BRACKET);
			setState(180);
			match(SEMICOLON);
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

	public static class CallSizeContext extends ParserRuleContext {
		public TerminalNode NAME() { return getToken(grammarFileParser.NAME, 0); }
		public TerminalNode DOT() { return getToken(grammarFileParser.DOT, 0); }
		public TerminalNode SIZE() { return getToken(grammarFileParser.SIZE, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(grammarFileParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(grammarFileParser.CLOSE_BRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(grammarFileParser.SEMICOLON, 0); }
		public CallSizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callSize; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFileListener ) ((grammarFileListener)listener).enterCallSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFileListener ) ((grammarFileListener)listener).exitCallSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarFileVisitor ) return ((grammarFileVisitor<? extends T>)visitor).visitCallSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallSizeContext callSize() throws RecognitionException {
		CallSizeContext _localctx = new CallSizeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_callSize);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			match(NAME);
			setState(183);
			match(DOT);
			setState(184);
			match(SIZE);
			setState(185);
			match(OPEN_BRACKET);
			setState(186);
			match(CLOSE_BRACKET);
			setState(187);
			match(SEMICOLON);
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

	public static class CallContainsContext extends ParserRuleContext {
		public List<TerminalNode> NAME() { return getTokens(grammarFileParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(grammarFileParser.NAME, i);
		}
		public TerminalNode DOT() { return getToken(grammarFileParser.DOT, 0); }
		public TerminalNode CONTAINS() { return getToken(grammarFileParser.CONTAINS, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(grammarFileParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(grammarFileParser.CLOSE_BRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(grammarFileParser.SEMICOLON, 0); }
		public CallContainsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callContains; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFileListener ) ((grammarFileListener)listener).enterCallContains(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFileListener ) ((grammarFileListener)listener).exitCallContains(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarFileVisitor ) return ((grammarFileVisitor<? extends T>)visitor).visitCallContains(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallContainsContext callContains() throws RecognitionException {
		CallContainsContext _localctx = new CallContainsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_callContains);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			match(NAME);
			setState(190);
			match(DOT);
			setState(191);
			match(CONTAINS);
			setState(192);
			match(OPEN_BRACKET);
			setState(193);
			match(NAME);
			setState(194);
			match(CLOSE_BRACKET);
			setState(195);
			match(SEMICOLON);
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
		public List<TerminalNode> NAME() { return getTokens(grammarFileParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(grammarFileParser.NAME, i);
		}
		public TerminalNode ASSIGNMENT() { return getToken(grammarFileParser.ASSIGNMENT, 0); }
		public TerminalNode SEMICOLON() { return getToken(grammarFileParser.SEMICOLON, 0); }
		public TerminalNode STRING() { return getToken(grammarFileParser.STRING, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public CallGetContext callGet() {
			return getRuleContext(CallGetContext.class,0);
		}
		public TerminalNode ELEMENT() { return getToken(grammarFileParser.ELEMENT, 0); }
		public ElementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFileListener ) ((grammarFileListener)listener).enterElementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFileListener ) ((grammarFileListener)listener).exitElementDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarFileVisitor ) return ((grammarFileVisitor<? extends T>)visitor).visitElementDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementDeclarationContext elementDeclaration() throws RecognitionException {
		ElementDeclarationContext _localctx = new ElementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_elementDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELEMENT) {
				{
				setState(197);
				match(ELEMENT);
				}
			}

			setState(200);
			match(NAME);
			setState(201);
			match(ASSIGNMENT);
			setState(206);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(202);
				match(STRING);
				}
				break;
			case 2:
				{
				setState(203);
				functionCall();
				}
				break;
			case 3:
				{
				setState(204);
				callGet();
				}
				break;
			case 4:
				{
				setState(205);
				match(NAME);
				}
				break;
			}
			setState(208);
			match(SEMICOLON);
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
		public List<TerminalNode> NAME() { return getTokens(grammarFileParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(grammarFileParser.NAME, i);
		}
		public TerminalNode ASSIGNMENT() { return getToken(grammarFileParser.ASSIGNMENT, 0); }
		public TerminalNode SEMICOLON() { return getToken(grammarFileParser.SEMICOLON, 0); }
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode LIST() { return getToken(grammarFileParser.LIST, 0); }
		public TerminalNode OPEN_CURLY_BRACKET() { return getToken(grammarFileParser.OPEN_CURLY_BRACKET, 0); }
		public TerminalNode CLOSE_CURLY_BRACKET() { return getToken(grammarFileParser.CLOSE_CURLY_BRACKET, 0); }
		public List<TerminalNode> STRING() { return getTokens(grammarFileParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(grammarFileParser.STRING, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(grammarFileParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(grammarFileParser.COMMA, i);
		}
		public ListDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFileListener ) ((grammarFileListener)listener).enterListDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFileListener ) ((grammarFileListener)listener).exitListDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarFileVisitor ) return ((grammarFileVisitor<? extends T>)visitor).visitListDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListDeclarationContext listDeclaration() throws RecognitionException {
		ListDeclarationContext _localctx = new ListDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_listDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIST) {
				{
				setState(210);
				match(LIST);
				}
			}

			setState(213);
			match(NAME);
			setState(214);
			match(ASSIGNMENT);
			setState(229);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(215);
				functionCall();
				}
				break;
			case 2:
				{
				setState(216);
				match(NAME);
				}
				break;
			case 3:
				{
				{
				setState(217);
				match(OPEN_CURLY_BRACKET);
				setState(218);
				match(CLOSE_CURLY_BRACKET);
				}
				}
				break;
			case 4:
				{
				{
				setState(219);
				match(OPEN_CURLY_BRACKET);
				setState(220);
				_la = _input.LA(1);
				if ( !(_la==NAME || _la==STRING) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(221);
					match(COMMA);
					setState(222);
					_la = _input.LA(1);
					if ( !(_la==NAME || _la==STRING) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(228);
				match(CLOSE_CURLY_BRACKET);
				}
				}
				break;
			}
			setState(231);
			match(SEMICOLON);
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

	public static class CallPrintContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(grammarFileParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(grammarFileParser.CLOSE_BRACKET, 0); }
		public TerminalNode SEMICOLON() { return getToken(grammarFileParser.SEMICOLON, 0); }
		public TerminalNode STRING() { return getToken(grammarFileParser.STRING, 0); }
		public TerminalNode NAME() { return getToken(grammarFileParser.NAME, 0); }
		public CallSizeContext callSize() {
			return getRuleContext(CallSizeContext.class,0);
		}
		public CallPrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callPrint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFileListener ) ((grammarFileListener)listener).enterCallPrint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFileListener ) ((grammarFileListener)listener).exitCallPrint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarFileVisitor ) return ((grammarFileVisitor<? extends T>)visitor).visitCallPrint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallPrintContext callPrint() throws RecognitionException {
		CallPrintContext _localctx = new CallPrintContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_callPrint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(233);
			match(OPEN_BRACKET);
			setState(237);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(234);
				match(STRING);
				}
				break;
			case 2:
				{
				setState(235);
				match(NAME);
				}
				break;
			case 3:
				{
				setState(236);
				callSize();
				}
				break;
			}
			setState(239);
			match(CLOSE_BRACKET);
			setState(240);
			match(SEMICOLON);
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
		public TerminalNode FOR() { return getToken(grammarFileParser.FOR, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(grammarFileParser.OPEN_BRACKET, 0); }
		public TerminalNode ELEMENT() { return getToken(grammarFileParser.ELEMENT, 0); }
		public List<TerminalNode> NAME() { return getTokens(grammarFileParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(grammarFileParser.NAME, i);
		}
		public TerminalNode COLON() { return getToken(grammarFileParser.COLON, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(grammarFileParser.CLOSE_BRACKET, 0); }
		public BlockOfCodeContext blockOfCode() {
			return getRuleContext(BlockOfCodeContext.class,0);
		}
		public ForCycleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forCycle; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFileListener ) ((grammarFileListener)listener).enterForCycle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFileListener ) ((grammarFileListener)listener).exitForCycle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarFileVisitor ) return ((grammarFileVisitor<? extends T>)visitor).visitForCycle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForCycleContext forCycle() throws RecognitionException {
		ForCycleContext _localctx = new ForCycleContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_forCycle);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			match(FOR);
			setState(243);
			match(OPEN_BRACKET);
			setState(244);
			match(ELEMENT);
			setState(245);
			match(NAME);
			setState(246);
			match(COLON);
			setState(247);
			match(NAME);
			setState(248);
			match(CLOSE_BRACKET);
			setState(249);
			blockOfCode();
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
		public List<TerminalNode> NAME() { return getTokens(grammarFileParser.NAME); }
		public TerminalNode NAME(int i) {
			return getToken(grammarFileParser.NAME, i);
		}
		public TerminalNode EQUAL() { return getToken(grammarFileParser.EQUAL, 0); }
		public TerminalNode STRING() { return getToken(grammarFileParser.STRING, 0); }
		public CallIsEmptyContext callIsEmpty() {
			return getRuleContext(CallIsEmptyContext.class,0);
		}
		public CallContainsContext callContains() {
			return getRuleContext(CallContainsContext.class,0);
		}
		public TerminalNode NEGATION() { return getToken(grammarFileParser.NEGATION, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(grammarFileParser.OPEN_BRACKET, 0); }
		public TerminalNode CLOSE_BRACKET() { return getToken(grammarFileParser.CLOSE_BRACKET, 0); }
		public CompareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compare; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFileListener ) ((grammarFileListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFileListener ) ((grammarFileListener)listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarFileVisitor ) return ((grammarFileVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompareContext compare() throws RecognitionException {
		CompareContext _localctx = new CompareContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_compare);
		try {
			setState(275);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(251);
				match(NAME);
				setState(252);
				match(EQUAL);
				setState(253);
				match(NAME);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(254);
				match(NAME);
				setState(255);
				match(EQUAL);
				setState(256);
				match(STRING);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				{
				setState(257);
				callIsEmpty();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				{
				setState(258);
				callContains();
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				{
				setState(259);
				match(NEGATION);
				setState(260);
				match(OPEN_BRACKET);
				setState(261);
				match(NAME);
				setState(262);
				match(EQUAL);
				setState(263);
				match(NAME);
				setState(264);
				match(CLOSE_BRACKET);
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				{
				setState(265);
				match(NEGATION);
				setState(266);
				match(OPEN_BRACKET);
				setState(267);
				match(NAME);
				setState(268);
				match(EQUAL);
				setState(269);
				match(STRING);
				setState(270);
				match(CLOSE_BRACKET);
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				{
				setState(271);
				match(NEGATION);
				setState(272);
				callIsEmpty();
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				{
				setState(273);
				match(NEGATION);
				setState(274);
				callContains();
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

	public static class IfBlockContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(grammarFileParser.IF, 0); }
		public TerminalNode OPEN_BRACKET() { return getToken(grammarFileParser.OPEN_BRACKET, 0); }
		public List<CompareContext> compare() {
			return getRuleContexts(CompareContext.class);
		}
		public CompareContext compare(int i) {
			return getRuleContext(CompareContext.class,i);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(grammarFileParser.CLOSE_BRACKET, 0); }
		public BlockOfCodeContext blockOfCode() {
			return getRuleContext(BlockOfCodeContext.class,0);
		}
		public ElseBlockContext elseBlock() {
			return getRuleContext(ElseBlockContext.class,0);
		}
		public List<TerminalNode> AND() { return getTokens(grammarFileParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(grammarFileParser.AND, i);
		}
		public List<TerminalNode> OR() { return getTokens(grammarFileParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(grammarFileParser.OR, i);
		}
		public IfBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFileListener ) ((grammarFileListener)listener).enterIfBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFileListener ) ((grammarFileListener)listener).exitIfBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarFileVisitor ) return ((grammarFileVisitor<? extends T>)visitor).visitIfBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfBlockContext ifBlock() throws RecognitionException {
		IfBlockContext _localctx = new IfBlockContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ifBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(277);
			match(IF);
			setState(278);
			match(OPEN_BRACKET);
			setState(279);
			compare();
			setState(286);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				setState(284);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case AND:
					{
					{
					setState(280);
					match(AND);
					setState(281);
					compare();
					}
					}
					break;
				case OR:
					{
					{
					setState(282);
					match(OR);
					setState(283);
					compare();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(288);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(289);
			match(CLOSE_BRACKET);
			setState(290);
			blockOfCode();
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(291);
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
		public TerminalNode ELSE() { return getToken(grammarFileParser.ELSE, 0); }
		public BlockOfCodeContext blockOfCode() {
			return getRuleContext(BlockOfCodeContext.class,0);
		}
		public ElseBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFileListener ) ((grammarFileListener)listener).enterElseBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFileListener ) ((grammarFileListener)listener).exitElseBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarFileVisitor ) return ((grammarFileVisitor<? extends T>)visitor).visitElseBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseBlockContext elseBlock() throws RecognitionException {
		ElseBlockContext _localctx = new ElseBlockContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_elseBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			match(ELSE);
			setState(295);
			blockOfCode();
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
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public CallClearContext callClear() {
			return getRuleContext(CallClearContext.class,0);
		}
		public CallAddContext callAdd() {
			return getRuleContext(CallAddContext.class,0);
		}
		public CallGetContext callGet() {
			return getRuleContext(CallGetContext.class,0);
		}
		public CallRemoveContext callRemove() {
			return getRuleContext(CallRemoveContext.class,0);
		}
		public ElementDeclarationContext elementDeclaration() {
			return getRuleContext(ElementDeclarationContext.class,0);
		}
		public ListDeclarationContext listDeclaration() {
			return getRuleContext(ListDeclarationContext.class,0);
		}
		public CallPrintContext callPrint() {
			return getRuleContext(CallPrintContext.class,0);
		}
		public ForCycleContext forCycle() {
			return getRuleContext(ForCycleContext.class,0);
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
			if ( listener instanceof grammarFileListener ) ((grammarFileListener)listener).enterContent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof grammarFileListener ) ((grammarFileListener)listener).exitContent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof grammarFileVisitor ) return ((grammarFileVisitor<? extends T>)visitor).visitContent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ContentContext content() throws RecognitionException {
		ContentContext _localctx = new ContentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_content);
		try {
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				functionCall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(298);
				callClear();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(299);
				callAdd();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(300);
				callGet();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(301);
				callRemove();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(302);
				elementDeclaration();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(303);
				listDeclaration();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(304);
				callPrint();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(305);
				forCycle();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(306);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3#\u0138\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\3"+
		"\3\3\3\7\3\65\n\3\f\3\16\38\13\3\3\3\3\3\3\4\3\4\7\4>\n\4\f\4\16\4A\13"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\7\5N\n\5\f\5\16\5Q\13\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6Z\n\6\f\6\16\6]\13\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\5\7f\n\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\5\bo\n\b\3\b\3\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t{\n\t\3\t\3\t\3\t\3\t\3\t\5\t\u0082\n\t"+
		"\7\t\u0084\n\t\f\t\16\t\u0087\13\t\3\t\5\t\u008a\n\t\3\t\3\t\3\n\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u009d"+
		"\n\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\5\21\u00c9"+
		"\n\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21\u00d1\n\21\3\21\3\21\3\22\5\22"+
		"\u00d6\n\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\7\22\u00e2"+
		"\n\22\f\22\16\22\u00e5\13\22\3\22\5\22\u00e8\n\22\3\22\3\22\3\23\3\23"+
		"\3\23\3\23\5\23\u00f0\n\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u0116\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\7\26\u011f\n\26\f\26\16"+
		"\26\u0122\13\26\3\26\3\26\3\26\5\26\u0127\n\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0136\n\30\3\30\2\2\31\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\5\3\2\32\33\3\2\4\5\4"+
		"\2\4\4\6\6\2\u014e\2\60\3\2\2\2\4\62\3\2\2\2\6;\3\2\2\2\bG\3\2\2\2\nR"+
		"\3\2\2\2\f`\3\2\2\2\16i\3\2\2\2\20r\3\2\2\2\22\u008d\3\2\2\2\24\u0094"+
		"\3\2\2\2\26\u00a1\3\2\2\2\30\u00a9\3\2\2\2\32\u00b1\3\2\2\2\34\u00b8\3"+
		"\2\2\2\36\u00bf\3\2\2\2 \u00c8\3\2\2\2\"\u00d5\3\2\2\2$\u00eb\3\2\2\2"+
		"&\u00f4\3\2\2\2(\u0115\3\2\2\2*\u0117\3\2\2\2,\u0128\3\2\2\2.\u0135\3"+
		"\2\2\2\60\61\t\2\2\2\61\3\3\2\2\2\62\66\7\t\2\2\63\65\5.\30\2\64\63\3"+
		"\2\2\2\658\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\679\3\2\2\28\66\3\2\2\2"+
		"9:\7\n\2\2:\5\3\2\2\2;?\7\t\2\2<>\5.\30\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2"+
		"\2?@\3\2\2\2@B\3\2\2\2A?\3\2\2\2BC\7\22\2\2CD\7\4\2\2DE\7\16\2\2EF\7\n"+
		"\2\2F\7\3\2\2\2GH\7\20\2\2HI\7\7\2\2IJ\7\b\2\2JO\5\4\3\2KN\5\f\7\2LN\5"+
		"\16\b\2MK\3\2\2\2ML\3\2\2\2NQ\3\2\2\2OM\3\2\2\2OP\3\2\2\2P\t\3\2\2\2Q"+
		"O\3\2\2\2RS\7\7\2\2ST\5\2\2\2T[\7\4\2\2UV\7\f\2\2VW\5\2\2\2WX\7\4\2\2"+
		"XZ\3\2\2\2YU\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2"+
		"\2^_\7\b\2\2_\13\3\2\2\2`a\7\21\2\2ae\7\4\2\2bf\5\n\6\2cd\7\7\2\2df\7"+
		"\b\2\2eb\3\2\2\2ec\3\2\2\2fg\3\2\2\2gh\5\4\3\2h\r\3\2\2\2ij\5\2\2\2jn"+
		"\7\4\2\2ko\5\n\6\2lm\7\7\2\2mo\7\b\2\2nk\3\2\2\2nl\3\2\2\2op\3\2\2\2p"+
		"q\5\6\4\2q\17\3\2\2\2r\u0089\7\4\2\2st\7\7\2\2t\u008a\7\b\2\2uz\7\7\2"+
		"\2v{\7\6\2\2w{\5\20\t\2x{\5\26\f\2y{\7\4\2\2zv\3\2\2\2zw\3\2\2\2zx\3\2"+
		"\2\2zy\3\2\2\2{\u0085\3\2\2\2|\u0081\7\f\2\2}\u0082\7\6\2\2~\u0082\5\20"+
		"\t\2\177\u0082\5\26\f\2\u0080\u0082\7\4\2\2\u0081}\3\2\2\2\u0081~\3\2"+
		"\2\2\u0081\177\3\2\2\2\u0081\u0080\3\2\2\2\u0082\u0084\3\2\2\2\u0083|"+
		"\3\2\2\2\u0084\u0087\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0086\3\2\2\2\u0086"+
		"\u0088\3\2\2\2\u0087\u0085\3\2\2\2\u0088\u008a\7\b\2\2\u0089s\3\2\2\2"+
		"\u0089u\3\2\2\2\u008a\u008b\3\2\2\2\u008b\u008c\7\16\2\2\u008c\21\3\2"+
		"\2\2\u008d\u008e\7\4\2\2\u008e\u008f\7\13\2\2\u008f\u0090\7\23\2\2\u0090"+
		"\u0091\7\7\2\2\u0091\u0092\7\b\2\2\u0092\u0093\7\16\2\2\u0093\23\3\2\2"+
		"\2\u0094\u0095\7\4\2\2\u0095\u0096\7\13\2\2\u0096\u0097\7\24\2\2\u0097"+
		"\u009c\7\7\2\2\u0098\u009d\7\4\2\2\u0099\u009a\7\5\2\2\u009a\u009b\7\f"+
		"\2\2\u009b\u009d\7\4\2\2\u009c\u0098\3\2\2\2\u009c\u0099\3\2\2\2\u009d"+
		"\u009e\3\2\2\2\u009e\u009f\7\b\2\2\u009f\u00a0\7\16\2\2\u00a0\25\3\2\2"+
		"\2\u00a1\u00a2\7\4\2\2\u00a2\u00a3\7\13\2\2\u00a3\u00a4\7\25\2\2\u00a4"+
		"\u00a5\7\7\2\2\u00a5\u00a6\7\5\2\2\u00a6\u00a7\7\b\2\2\u00a7\u00a8\7\16"+
		"\2\2\u00a8\27\3\2\2\2\u00a9\u00aa\7\4\2\2\u00aa\u00ab\7\13\2\2\u00ab\u00ac"+
		"\7\26\2\2\u00ac\u00ad\7\7\2\2\u00ad\u00ae\t\3\2\2\u00ae\u00af\7\b\2\2"+
		"\u00af\u00b0\7\16\2\2\u00b0\31\3\2\2\2\u00b1\u00b2\7\4\2\2\u00b2\u00b3"+
		"\7\13\2\2\u00b3\u00b4\7\30\2\2\u00b4\u00b5\7\7\2\2\u00b5\u00b6\7\b\2\2"+
		"\u00b6\u00b7\7\16\2\2\u00b7\33\3\2\2\2\u00b8\u00b9\7\4\2\2\u00b9\u00ba"+
		"\7\13\2\2\u00ba\u00bb\7\27\2\2\u00bb\u00bc\7\7\2\2\u00bc\u00bd\7\b\2\2"+
		"\u00bd\u00be\7\16\2\2\u00be\35\3\2\2\2\u00bf\u00c0\7\4\2\2\u00c0\u00c1"+
		"\7\13\2\2\u00c1\u00c2\7\31\2\2\u00c2\u00c3\7\7\2\2\u00c3\u00c4\7\4\2\2"+
		"\u00c4\u00c5\7\b\2\2\u00c5\u00c6\7\16\2\2\u00c6\37\3\2\2\2\u00c7\u00c9"+
		"\7\32\2\2\u00c8\u00c7\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00ca\3\2\2\2"+
		"\u00ca\u00cb\7\4\2\2\u00cb\u00d0\7\r\2\2\u00cc\u00d1\7\6\2\2\u00cd\u00d1"+
		"\5\20\t\2\u00ce\u00d1\5\26\f\2\u00cf\u00d1\7\4\2\2\u00d0\u00cc\3\2\2\2"+
		"\u00d0\u00cd\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00cf\3\2\2\2\u00d1\u00d2"+
		"\3\2\2\2\u00d2\u00d3\7\16\2\2\u00d3!\3\2\2\2\u00d4\u00d6\7\33\2\2\u00d5"+
		"\u00d4\3\2\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7\u00d8\7\4"+
		"\2\2\u00d8\u00e7\7\r\2\2\u00d9\u00e8\5\20\t\2\u00da\u00e8\7\4\2\2\u00db"+
		"\u00dc\7\t\2\2\u00dc\u00e8\7\n\2\2\u00dd\u00de\7\t\2\2\u00de\u00e3\t\4"+
		"\2\2\u00df\u00e0\7\f\2\2\u00e0\u00e2\t\4\2\2\u00e1\u00df\3\2\2\2\u00e2"+
		"\u00e5\3\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e6\3\2"+
		"\2\2\u00e5\u00e3\3\2\2\2\u00e6\u00e8\7\n\2\2\u00e7\u00d9\3\2\2\2\u00e7"+
		"\u00da\3\2\2\2\u00e7\u00db\3\2\2\2\u00e7\u00dd\3\2\2\2\u00e8\u00e9\3\2"+
		"\2\2\u00e9\u00ea\7\16\2\2\u00ea#\3\2\2\2\u00eb\u00ef\7\7\2\2\u00ec\u00f0"+
		"\7\6\2\2\u00ed\u00f0\7\4\2\2\u00ee\u00f0\5\34\17\2\u00ef\u00ec\3\2\2\2"+
		"\u00ef\u00ed\3\2\2\2\u00ef\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1\u00f2"+
		"\7\b\2\2\u00f2\u00f3\7\16\2\2\u00f3%\3\2\2\2\u00f4\u00f5\7\35\2\2\u00f5"+
		"\u00f6\7\7\2\2\u00f6\u00f7\7\32\2\2\u00f7\u00f8\7\4\2\2\u00f8\u00f9\7"+
		"\17\2\2\u00f9\u00fa\7\4\2\2\u00fa\u00fb\7\b\2\2\u00fb\u00fc\5\4\3\2\u00fc"+
		"\'\3\2\2\2\u00fd\u00fe\7\4\2\2\u00fe\u00ff\7\"\2\2\u00ff\u0116\7\4\2\2"+
		"\u0100\u0101\7\4\2\2\u0101\u0102\7\"\2\2\u0102\u0116\7\6\2\2\u0103\u0116"+
		"\5\32\16\2\u0104\u0116\5\36\20\2\u0105\u0106\7#\2\2\u0106\u0107\7\7\2"+
		"\2\u0107\u0108\7\4\2\2\u0108\u0109\7\"\2\2\u0109\u010a\7\4\2\2\u010a\u0116"+
		"\7\b\2\2\u010b\u010c\7#\2\2\u010c\u010d\7\7\2\2\u010d\u010e\7\4\2\2\u010e"+
		"\u010f\7\"\2\2\u010f\u0110\7\6\2\2\u0110\u0116\7\b\2\2\u0111\u0112\7#"+
		"\2\2\u0112\u0116\5\32\16\2\u0113\u0114\7#\2\2\u0114\u0116\5\36\20\2\u0115"+
		"\u00fd\3\2\2\2\u0115\u0100\3\2\2\2\u0115\u0103\3\2\2\2\u0115\u0104\3\2"+
		"\2\2\u0115\u0105\3\2\2\2\u0115\u010b\3\2\2\2\u0115\u0111\3\2\2\2\u0115"+
		"\u0113\3\2\2\2\u0116)\3\2\2\2\u0117\u0118\7\36\2\2\u0118\u0119\7\7\2\2"+
		"\u0119\u0120\5(\25\2\u011a\u011b\7 \2\2\u011b\u011f\5(\25\2\u011c\u011d"+
		"\7!\2\2\u011d\u011f\5(\25\2\u011e\u011a\3\2\2\2\u011e\u011c\3\2\2\2\u011f"+
		"\u0122\3\2\2\2\u0120\u011e\3\2\2\2\u0120\u0121\3\2\2\2\u0121\u0123\3\2"+
		"\2\2\u0122\u0120\3\2\2\2\u0123\u0124\7\b\2\2\u0124\u0126\5\4\3\2\u0125"+
		"\u0127\5,\27\2\u0126\u0125\3\2\2\2\u0126\u0127\3\2\2\2\u0127+\3\2\2\2"+
		"\u0128\u0129\7\37\2\2\u0129\u012a\5\4\3\2\u012a-\3\2\2\2\u012b\u0136\5"+
		"\20\t\2\u012c\u0136\5\22\n\2\u012d\u0136\5\24\13\2\u012e\u0136\5\26\f"+
		"\2\u012f\u0136\5\30\r\2\u0130\u0136\5 \21\2\u0131\u0136\5\"\22\2\u0132"+
		"\u0136\5$\23\2\u0133\u0136\5&\24\2\u0134\u0136\5*\26\2\u0135\u012b\3\2"+
		"\2\2\u0135\u012c\3\2\2\2\u0135\u012d\3\2\2\2\u0135\u012e\3\2\2\2\u0135"+
		"\u012f\3\2\2\2\u0135\u0130\3\2\2\2\u0135\u0131\3\2\2\2\u0135\u0132\3\2"+
		"\2\2\u0135\u0133\3\2\2\2\u0135\u0134\3\2\2\2\u0136/\3\2\2\2\31\66?MO["+
		"enz\u0081\u0085\u0089\u009c\u00c8\u00d0\u00d5\u00e3\u00e7\u00ef\u0115"+
		"\u011e\u0120\u0126\u0135";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}