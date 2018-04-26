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
		EQUAL=20, CLEAR=21, ADD=22, GET=23, REMOVE=24, SIZE=25, GE=26, GT=27, 
		LE=28, LT=29, PLUS=30;
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
		"CLEAR", "ADD", "GET", "REMOVE", "SIZE", "GE", "GT", "LE", "LT", "PLUS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2 \u00c4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\6\2A"+
		"\n\2\r\2\16\2B\3\2\3\2\3\3\3\3\6\3I\n\3\r\3\16\3J\3\3\3\3\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\7\rs\n\r\f\r\16\rv\13\r\3\16\6\16y\n\16\r\16\16\16z\3\17\3\17\3\20\3"+
		"\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3"+
		"\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3J\2 "+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= \3\2\6\5\2\13\f\17\17\"\"\3\2c|\5\2\62;C\\c|\3\2\62;\2\u00c7\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2"+
		"\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3"+
		"\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3"+
		"\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2"+
		"=\3\2\2\2\3@\3\2\2\2\5F\3\2\2\2\7N\3\2\2\2\tP\3\2\2\2\13R\3\2\2\2\rT\3"+
		"\2\2\2\17V\3\2\2\2\21\\\3\2\2\2\23a\3\2\2\2\25f\3\2\2\2\27n\3\2\2\2\31"+
		"p\3\2\2\2\33x\3\2\2\2\35|\3\2\2\2\37~\3\2\2\2!\u0082\3\2\2\2#\u008a\3"+
		"\2\2\2%\u0093\3\2\2\2\'\u0096\3\2\2\2)\u009b\3\2\2\2+\u009e\3\2\2\2-\u00a4"+
		"\3\2\2\2/\u00a8\3\2\2\2\61\u00ac\3\2\2\2\63\u00b3\3\2\2\2\65\u00b8\3\2"+
		"\2\2\67\u00bb\3\2\2\29\u00bd\3\2\2\2;\u00c0\3\2\2\2=\u00c2\3\2\2\2?A\t"+
		"\2\2\2@?\3\2\2\2AB\3\2\2\2B@\3\2\2\2BC\3\2\2\2CD\3\2\2\2DE\b\2\2\2E\4"+
		"\3\2\2\2FH\7$\2\2GI\13\2\2\2HG\3\2\2\2IJ\3\2\2\2JK\3\2\2\2JH\3\2\2\2K"+
		"L\3\2\2\2LM\7$\2\2M\6\3\2\2\2NO\7}\2\2O\b\3\2\2\2PQ\7\177\2\2Q\n\3\2\2"+
		"\2RS\7*\2\2S\f\3\2\2\2TU\7+\2\2U\16\3\2\2\2VW\7R\2\2WX\7t\2\2XY\7k\2\2"+
		"YZ\7p\2\2Z[\7v\2\2[\20\3\2\2\2\\]\7X\2\2]^\7q\2\2^_\7k\2\2_`\7f\2\2`\22"+
		"\3\2\2\2ab\7N\2\2bc\7k\2\2cd\7u\2\2de\7v\2\2e\24\3\2\2\2fg\7G\2\2gh\7"+
		"n\2\2hi\7g\2\2ij\7o\2\2jk\7g\2\2kl\7p\2\2lm\7v\2\2m\26\3\2\2\2no\7.\2"+
		"\2o\30\3\2\2\2pt\t\3\2\2qs\t\4\2\2rq\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3\2"+
		"\2\2u\32\3\2\2\2vt\3\2\2\2wy\t\5\2\2xw\3\2\2\2yz\3\2\2\2zx\3\2\2\2z{\3"+
		"\2\2\2{\34\3\2\2\2|}\7?\2\2}\36\3\2\2\2~\177\7H\2\2\177\u0080\7q\2\2\u0080"+
		"\u0081\7t\2\2\u0081 \3\2\2\2\u0082\u0083\7K\2\2\u0083\u0084\7u\2\2\u0084"+
		"\u0085\7G\2\2\u0085\u0086\7o\2\2\u0086\u0087\7r\2\2\u0087\u0088\7v\2\2"+
		"\u0088\u0089\7{\2\2\u0089\"\3\2\2\2\u008a\u008b\7E\2\2\u008b\u008c\7q"+
		"\2\2\u008c\u008d\7p\2\2\u008d\u008e\7v\2\2\u008e\u008f\7c\2\2\u008f\u0090"+
		"\7k\2\2\u0090\u0091\7p\2\2\u0091\u0092\7u\2\2\u0092$\3\2\2\2\u0093\u0094"+
		"\7K\2\2\u0094\u0095\7h\2\2\u0095&\3\2\2\2\u0096\u0097\7G\2\2\u0097\u0098"+
		"\7n\2\2\u0098\u0099\7u\2\2\u0099\u009a\7g\2\2\u009a(\3\2\2\2\u009b\u009c"+
		"\7?\2\2\u009c\u009d\7?\2\2\u009d*\3\2\2\2\u009e\u009f\7E\2\2\u009f\u00a0"+
		"\7n\2\2\u00a0\u00a1\7g\2\2\u00a1\u00a2\7c\2\2\u00a2\u00a3\7t\2\2\u00a3"+
		",\3\2\2\2\u00a4\u00a5\7C\2\2\u00a5\u00a6\7f\2\2\u00a6\u00a7\7f\2\2\u00a7"+
		".\3\2\2\2\u00a8\u00a9\7I\2\2\u00a9\u00aa\7g\2\2\u00aa\u00ab\7v\2\2\u00ab"+
		"\60\3\2\2\2\u00ac\u00ad\7T\2\2\u00ad\u00ae\7g\2\2\u00ae\u00af\7o\2\2\u00af"+
		"\u00b0\7q\2\2\u00b0\u00b1\7x\2\2\u00b1\u00b2\7g\2\2\u00b2\62\3\2\2\2\u00b3"+
		"\u00b4\7U\2\2\u00b4\u00b5\7k\2\2\u00b5\u00b6\7|\2\2\u00b6\u00b7\7g\2\2"+
		"\u00b7\64\3\2\2\2\u00b8\u00b9\7@\2\2\u00b9\u00ba\7?\2\2\u00ba\66\3\2\2"+
		"\2\u00bb\u00bc\7@\2\2\u00bc8\3\2\2\2\u00bd\u00be\7>\2\2\u00be\u00bf\7"+
		"?\2\2\u00bf:\3\2\2\2\u00c0\u00c1\7>\2\2\u00c1<\3\2\2\2\u00c2\u00c3\7-"+
		"\2\2\u00c3>\3\2\2\2\7\2BJtz\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}