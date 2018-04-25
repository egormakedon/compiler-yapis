package gen;// Generated from /home/egor/Документы/compiler-yapis/src/main/java/Grammar.g4 by ANTLR 4.7
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SPACE=1, STRING=2, OPEN_CURLY_BRACKET=3, CLOSE_CURLY_BRACKET=4, OPEN_BRACKET=5, 
		CLOSE_BRACKET=6, PRINT=7, VOID=8, LIST=9, ELEMENT=10, COMMA=11, NAME=12, 
		NUMBER=13, ASSIGNMENT=14, FOR=15, IS_EMPTY=16, CONTAINS=17, IF=18, ELSE=19, 
		EQUAL=20, CLEAR=21, ADD=22, GET=23, REMOVE=24;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SPACE", "STRING", "OPEN_CURLY_BRACKET", "CLOSE_CURLY_BRACKET", "OPEN_BRACKET", 
		"CLOSE_BRACKET", "PRINT", "VOID", "LIST", "ELEMENT", "COMMA", "NAME", 
		"NUMBER", "ASSIGNMENT", "FOR", "IS_EMPTY", "CONTAINS", "IF", "ELSE", "EQUAL", 
		"CLEAR", "ADD", "GET", "REMOVE"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'{'", "'}'", "'('", "')'", "'Print'", "'Void'", "'List'", 
		"'Element'", "','", null, null, "'='", "'For'", "'IsEmpty'", "'Contains'", 
		"'If'", "'Else'", "'=='", "'Clear'", "'Add'", "'Get'", "'Remove'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SPACE", "STRING", "OPEN_CURLY_BRACKET", "CLOSE_CURLY_BRACKET", 
		"OPEN_BRACKET", "CLOSE_BRACKET", "PRINT", "VOID", "LIST", "ELEMENT", "COMMA", 
		"NAME", "NUMBER", "ASSIGNMENT", "FOR", "IS_EMPTY", "CONTAINS", "IF", "ELSE", 
		"EQUAL", "CLEAR", "ADD", "GET", "REMOVE"
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


	public GrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Grammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\32\u00a5\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\6\2\65\n\2\r\2\16\2\66\3\2\3\2\3\3\3\3\6\3=\n\3\r\3\16\3>\3"+
		"\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\f\3\f\3\r\6\rf\n\r\r\r\16\rg\3\16\6\16k\n\16\r\16\16\16l\3\17\3"+
		"\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3>\2\32\3\3"+
		"\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\3\2\5\5\2\13\f\17\17\"\"\3\2c"+
		"|\3\2\62;\2\u00a8\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13"+
		"\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2"+
		"\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2"+
		"!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3"+
		"\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\3\64\3\2\2\2\5:\3\2\2\2\7B\3\2\2\2\tD\3"+
		"\2\2\2\13F\3\2\2\2\rH\3\2\2\2\17J\3\2\2\2\21P\3\2\2\2\23U\3\2\2\2\25Z"+
		"\3\2\2\2\27b\3\2\2\2\31e\3\2\2\2\33j\3\2\2\2\35n\3\2\2\2\37p\3\2\2\2!"+
		"t\3\2\2\2#|\3\2\2\2%\u0085\3\2\2\2\'\u0088\3\2\2\2)\u008d\3\2\2\2+\u0090"+
		"\3\2\2\2-\u0096\3\2\2\2/\u009a\3\2\2\2\61\u009e\3\2\2\2\63\65\t\2\2\2"+
		"\64\63\3\2\2\2\65\66\3\2\2\2\66\64\3\2\2\2\66\67\3\2\2\2\678\3\2\2\28"+
		"9\b\2\2\29\4\3\2\2\2:<\7$\2\2;=\13\2\2\2<;\3\2\2\2=>\3\2\2\2>?\3\2\2\2"+
		"><\3\2\2\2?@\3\2\2\2@A\7$\2\2A\6\3\2\2\2BC\7}\2\2C\b\3\2\2\2DE\7\177\2"+
		"\2E\n\3\2\2\2FG\7*\2\2G\f\3\2\2\2HI\7+\2\2I\16\3\2\2\2JK\7R\2\2KL\7t\2"+
		"\2LM\7k\2\2MN\7p\2\2NO\7v\2\2O\20\3\2\2\2PQ\7X\2\2QR\7q\2\2RS\7k\2\2S"+
		"T\7f\2\2T\22\3\2\2\2UV\7N\2\2VW\7k\2\2WX\7u\2\2XY\7v\2\2Y\24\3\2\2\2Z"+
		"[\7G\2\2[\\\7n\2\2\\]\7g\2\2]^\7o\2\2^_\7g\2\2_`\7p\2\2`a\7v\2\2a\26\3"+
		"\2\2\2bc\7.\2\2c\30\3\2\2\2df\t\3\2\2ed\3\2\2\2fg\3\2\2\2ge\3\2\2\2gh"+
		"\3\2\2\2h\32\3\2\2\2ik\t\4\2\2ji\3\2\2\2kl\3\2\2\2lj\3\2\2\2lm\3\2\2\2"+
		"m\34\3\2\2\2no\7?\2\2o\36\3\2\2\2pq\7H\2\2qr\7q\2\2rs\7t\2\2s \3\2\2\2"+
		"tu\7K\2\2uv\7u\2\2vw\7G\2\2wx\7o\2\2xy\7r\2\2yz\7v\2\2z{\7{\2\2{\"\3\2"+
		"\2\2|}\7E\2\2}~\7q\2\2~\177\7p\2\2\177\u0080\7v\2\2\u0080\u0081\7c\2\2"+
		"\u0081\u0082\7k\2\2\u0082\u0083\7p\2\2\u0083\u0084\7u\2\2\u0084$\3\2\2"+
		"\2\u0085\u0086\7K\2\2\u0086\u0087\7h\2\2\u0087&\3\2\2\2\u0088\u0089\7"+
		"G\2\2\u0089\u008a\7n\2\2\u008a\u008b\7u\2\2\u008b\u008c\7g\2\2\u008c("+
		"\3\2\2\2\u008d\u008e\7?\2\2\u008e\u008f\7?\2\2\u008f*\3\2\2\2\u0090\u0091"+
		"\7E\2\2\u0091\u0092\7n\2\2\u0092\u0093\7g\2\2\u0093\u0094\7c\2\2\u0094"+
		"\u0095\7t\2\2\u0095,\3\2\2\2\u0096\u0097\7C\2\2\u0097\u0098\7f\2\2\u0098"+
		"\u0099\7f\2\2\u0099.\3\2\2\2\u009a\u009b\7I\2\2\u009b\u009c\7g\2\2\u009c"+
		"\u009d\7v\2\2\u009d\60\3\2\2\2\u009e\u009f\7T\2\2\u009f\u00a0\7g\2\2\u00a0"+
		"\u00a1\7o\2\2\u00a1\u00a2\7q\2\2\u00a2\u00a3\7x\2\2\u00a3\u00a4\7g\2\2"+
		"\u00a4\62\3\2\2\2\7\2\66>gl\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}