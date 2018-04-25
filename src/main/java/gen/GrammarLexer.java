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
		EQUAL=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"SPACE", "STRING", "OPEN_CURLY_BRACKET", "CLOSE_CURLY_BRACKET", "OPEN_BRACKET", 
		"CLOSE_BRACKET", "PRINT", "VOID", "LIST", "ELEMENT", "COMMA", "NAME", 
		"NUMBER", "ASSIGNMENT", "FOR", "IS_EMPTY", "CONTAINS", "IF", "ELSE", "EQUAL"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, null, "'{'", "'}'", "'('", "')'", "'print'", "'void'", "'List'", 
		"'Element'", "','", null, null, "'='", "'for'", "'isEmpty'", "'contains'", 
		"'if'", "'else'", "'=='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SPACE", "STRING", "OPEN_CURLY_BRACKET", "CLOSE_CURLY_BRACKET", 
		"OPEN_BRACKET", "CLOSE_BRACKET", "PRINT", "VOID", "LIST", "ELEMENT", "COMMA", 
		"NAME", "NUMBER", "ASSIGNMENT", "FOR", "IS_EMPTY", "CONTAINS", "IF", "ELSE", 
		"EQUAL"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\26\u0088\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\3\2\6\2-\n\2\r\2\16\2.\3\2\3\2\3\3"+
		"\3\3\6\3\65\n\3\r\3\16\3\66\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\6\r^\n\r\r\r\16\r_\3\16"+
		"\6\16c\n\16\r\16\16\16d\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3"+
		"\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\66\2\26\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26\3\2\5\5\2\13\f\17\17\"\"\3\2c|\3\2\62;\2\u008b\2"+
		"\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2"+
		"\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2"+
		"\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2"+
		"\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\3,\3\2\2\2\5\62\3\2\2\2\7:\3\2\2"+
		"\2\t<\3\2\2\2\13>\3\2\2\2\r@\3\2\2\2\17B\3\2\2\2\21H\3\2\2\2\23M\3\2\2"+
		"\2\25R\3\2\2\2\27Z\3\2\2\2\31]\3\2\2\2\33b\3\2\2\2\35f\3\2\2\2\37h\3\2"+
		"\2\2!l\3\2\2\2#t\3\2\2\2%}\3\2\2\2\'\u0080\3\2\2\2)\u0085\3\2\2\2+-\t"+
		"\2\2\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60\61\b\2\2"+
		"\2\61\4\3\2\2\2\62\64\7$\2\2\63\65\13\2\2\2\64\63\3\2\2\2\65\66\3\2\2"+
		"\2\66\67\3\2\2\2\66\64\3\2\2\2\678\3\2\2\289\7$\2\29\6\3\2\2\2:;\7}\2"+
		"\2;\b\3\2\2\2<=\7\177\2\2=\n\3\2\2\2>?\7*\2\2?\f\3\2\2\2@A\7+\2\2A\16"+
		"\3\2\2\2BC\7r\2\2CD\7t\2\2DE\7k\2\2EF\7p\2\2FG\7v\2\2G\20\3\2\2\2HI\7"+
		"x\2\2IJ\7q\2\2JK\7k\2\2KL\7f\2\2L\22\3\2\2\2MN\7N\2\2NO\7k\2\2OP\7u\2"+
		"\2PQ\7v\2\2Q\24\3\2\2\2RS\7G\2\2ST\7n\2\2TU\7g\2\2UV\7o\2\2VW\7g\2\2W"+
		"X\7p\2\2XY\7v\2\2Y\26\3\2\2\2Z[\7.\2\2[\30\3\2\2\2\\^\t\3\2\2]\\\3\2\2"+
		"\2^_\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\32\3\2\2\2ac\t\4\2\2ba\3\2\2\2cd\3\2"+
		"\2\2db\3\2\2\2de\3\2\2\2e\34\3\2\2\2fg\7?\2\2g\36\3\2\2\2hi\7h\2\2ij\7"+
		"q\2\2jk\7t\2\2k \3\2\2\2lm\7k\2\2mn\7u\2\2no\7G\2\2op\7o\2\2pq\7r\2\2"+
		"qr\7v\2\2rs\7{\2\2s\"\3\2\2\2tu\7e\2\2uv\7q\2\2vw\7p\2\2wx\7v\2\2xy\7"+
		"c\2\2yz\7k\2\2z{\7p\2\2{|\7u\2\2|$\3\2\2\2}~\7k\2\2~\177\7h\2\2\177&\3"+
		"\2\2\2\u0080\u0081\7g\2\2\u0081\u0082\7n\2\2\u0082\u0083\7u\2\2\u0083"+
		"\u0084\7g\2\2\u0084(\3\2\2\2\u0085\u0086\7?\2\2\u0086\u0087\7?\2\2\u0087"+
		"*\3\2\2\2\7\2.\66_d\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}