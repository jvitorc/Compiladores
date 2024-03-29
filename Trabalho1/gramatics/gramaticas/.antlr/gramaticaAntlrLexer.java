// Generated from /data/UFSC/COMPILA/Compiladores/Trabalho1/gramatics/gramaticas/gramaticaAntlr.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramaticaAntlrLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		INT=1, STRING=2, FLOAT=3, BREAK=4, ENDLINE=5, EQUAL=6, PRINT=7, CHAVEA=8, 
		CHAVEF=9, COLCHA=10, COLCHF=11, READ=12, RETURN=13, PARENTEA=14, PARENTEF=15, 
		IF=16, ELSE=17, FOR=18, NULL=19, NEW=20, COMPARADORES=21, MAISOUMENOS=22, 
		MDP=23, IDENT=24, INT_CONSTANT=25, FLOAT_CONSTANT=26, STRING_CONSTANT=27, 
		WS=28;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INT", "STRING", "FLOAT", "BREAK", "ENDLINE", "EQUAL", "PRINT", "CHAVEA", 
		"CHAVEF", "COLCHA", "COLCHF", "READ", "RETURN", "PARENTEA", "PARENTEF", 
		"IF", "ELSE", "FOR", "NULL", "NEW", "COMPARADORES", "MAISOUMENOS", "MDP", 
		"CESPECIAL", "IDENT", "INT_CONSTANT", "FLOAT_CONSTANT", "STRING_CONSTANT", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'int'", "'string'", "'float'", "'break'", "';'", "'='", "'print'", 
		"'{'", "'}'", "'['", "']'", "'read'", "'return'", "'('", "')'", "'if'", 
		"'else'", "'for'", "'null'", "'new'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INT", "STRING", "FLOAT", "BREAK", "ENDLINE", "EQUAL", "PRINT", 
		"CHAVEA", "CHAVEF", "COLCHA", "COLCHF", "READ", "RETURN", "PARENTEA", 
		"PARENTEF", "IF", "ELSE", "FOR", "NULL", "NEW", "COMPARADORES", "MAISOUMENOS", 
		"MDP", "IDENT", "INT_CONSTANT", "FLOAT_CONSTANT", "STRING_CONSTANT", "WS"
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


	public gramaticaAntlrLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gramaticaAntlr.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\36\u00cf\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\3\2\3\2\3"+
		"\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\5\26\u0095\n\26\3\27\3\27\3\30\3\30\3\31"+
		"\5\31\u009c\n\31\3\32\3\32\7\32\u00a0\n\32\f\32\16\32\u00a3\13\32\3\33"+
		"\3\33\3\33\7\33\u00a8\n\33\f\33\16\33\u00ab\13\33\5\33\u00ad\n\33\3\34"+
		"\3\34\3\34\7\34\u00b2\n\34\f\34\16\34\u00b5\13\34\5\34\u00b7\n\34\3\34"+
		"\3\34\6\34\u00bb\n\34\r\34\16\34\u00bc\3\35\3\35\3\35\7\35\u00c2\n\35"+
		"\f\35\16\35\u00c5\13\35\3\35\3\35\3\36\6\36\u00ca\n\36\r\36\16\36\u00cb"+
		"\3\36\3\36\2\2\37\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31"+
		"\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\2\63\32\65\33"+
		"\67\349\35;\36\3\2\t\4\2>>@@\4\2--//\5\2\'\',,\61\61\21\2\"#%(*\61<>@"+
		"B]b}\u0080\u00c2\u00c7\u00c9\u00d1\u00d3\u00d8\u00db\u00de\u00e2\u00e6"+
		"\u00e9\u00f1\u00f4\u00f8\u00fb\u00fe\5\2C\\aac|\6\2\62;C\\aac|\5\2\13"+
		"\f\17\17\"\"\2\u00da\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2"+
		"\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3"+
		"\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2"+
		"\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2"+
		"\2-\3\2\2\2\2/\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2"+
		"\2\2;\3\2\2\2\3=\3\2\2\2\5A\3\2\2\2\7H\3\2\2\2\tN\3\2\2\2\13T\3\2\2\2"+
		"\rV\3\2\2\2\17X\3\2\2\2\21^\3\2\2\2\23`\3\2\2\2\25b\3\2\2\2\27d\3\2\2"+
		"\2\31f\3\2\2\2\33k\3\2\2\2\35r\3\2\2\2\37t\3\2\2\2!v\3\2\2\2#y\3\2\2\2"+
		"%~\3\2\2\2\'\u0082\3\2\2\2)\u0087\3\2\2\2+\u0094\3\2\2\2-\u0096\3\2\2"+
		"\2/\u0098\3\2\2\2\61\u009b\3\2\2\2\63\u009d\3\2\2\2\65\u00ac\3\2\2\2\67"+
		"\u00b6\3\2\2\29\u00be\3\2\2\2;\u00c9\3\2\2\2=>\7k\2\2>?\7p\2\2?@\7v\2"+
		"\2@\4\3\2\2\2AB\7u\2\2BC\7v\2\2CD\7t\2\2DE\7k\2\2EF\7p\2\2FG\7i\2\2G\6"+
		"\3\2\2\2HI\7h\2\2IJ\7n\2\2JK\7q\2\2KL\7c\2\2LM\7v\2\2M\b\3\2\2\2NO\7d"+
		"\2\2OP\7t\2\2PQ\7g\2\2QR\7c\2\2RS\7m\2\2S\n\3\2\2\2TU\7=\2\2U\f\3\2\2"+
		"\2VW\7?\2\2W\16\3\2\2\2XY\7r\2\2YZ\7t\2\2Z[\7k\2\2[\\\7p\2\2\\]\7v\2\2"+
		"]\20\3\2\2\2^_\7}\2\2_\22\3\2\2\2`a\7\177\2\2a\24\3\2\2\2bc\7]\2\2c\26"+
		"\3\2\2\2de\7_\2\2e\30\3\2\2\2fg\7t\2\2gh\7g\2\2hi\7c\2\2ij\7f\2\2j\32"+
		"\3\2\2\2kl\7t\2\2lm\7g\2\2mn\7v\2\2no\7w\2\2op\7t\2\2pq\7p\2\2q\34\3\2"+
		"\2\2rs\7*\2\2s\36\3\2\2\2tu\7+\2\2u \3\2\2\2vw\7k\2\2wx\7h\2\2x\"\3\2"+
		"\2\2yz\7g\2\2z{\7n\2\2{|\7u\2\2|}\7g\2\2}$\3\2\2\2~\177\7h\2\2\177\u0080"+
		"\7q\2\2\u0080\u0081\7t\2\2\u0081&\3\2\2\2\u0082\u0083\7p\2\2\u0083\u0084"+
		"\7w\2\2\u0084\u0085\7n\2\2\u0085\u0086\7n\2\2\u0086(\3\2\2\2\u0087\u0088"+
		"\7p\2\2\u0088\u0089\7g\2\2\u0089\u008a\7y\2\2\u008a*\3\2\2\2\u008b\u0095"+
		"\t\2\2\2\u008c\u008d\7>\2\2\u008d\u0095\7?\2\2\u008e\u008f\7@\2\2\u008f"+
		"\u0095\7?\2\2\u0090\u0091\7?\2\2\u0091\u0095\7?\2\2\u0092\u0093\7#\2\2"+
		"\u0093\u0095\7?\2\2\u0094\u008b\3\2\2\2\u0094\u008c\3\2\2\2\u0094\u008e"+
		"\3\2\2\2\u0094\u0090\3\2\2\2\u0094\u0092\3\2\2\2\u0095,\3\2\2\2\u0096"+
		"\u0097\t\3\2\2\u0097.\3\2\2\2\u0098\u0099\t\4\2\2\u0099\60\3\2\2\2\u009a"+
		"\u009c\t\5\2\2\u009b\u009a\3\2\2\2\u009c\62\3\2\2\2\u009d\u00a1\t\6\2"+
		"\2\u009e\u00a0\t\7\2\2\u009f\u009e\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f"+
		"\3\2\2\2\u00a1\u00a2\3\2\2\2\u00a2\64\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4"+
		"\u00ad\7\62\2\2\u00a5\u00a9\4\63;\2\u00a6\u00a8\4\62;\2\u00a7\u00a6\3"+
		"\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa"+
		"\u00ad\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00a4\3\2\2\2\u00ac\u00a5\3\2"+
		"\2\2\u00ad\66\3\2\2\2\u00ae\u00b7\7\62\2\2\u00af\u00b3\4\63;\2\u00b0\u00b2"+
		"\4\62;\2\u00b1\u00b0\3\2\2\2\u00b2\u00b5\3\2\2\2\u00b3\u00b1\3\2\2\2\u00b3"+
		"\u00b4\3\2\2\2\u00b4\u00b7\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b6\u00ae\3\2"+
		"\2\2\u00b6\u00af\3\2\2\2\u00b7\u00b8\3\2\2\2\u00b8\u00ba\7\60\2\2\u00b9"+
		"\u00bb\4\62;\2\u00ba\u00b9\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00ba\3\2"+
		"\2\2\u00bc\u00bd\3\2\2\2\u00bd8\3\2\2\2\u00be\u00c3\7$\2\2\u00bf\u00c2"+
		"\t\7\2\2\u00c0\u00c2\5\61\31\2\u00c1\u00bf\3\2\2\2\u00c1\u00c0\3\2\2\2"+
		"\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c6"+
		"\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6\u00c7\7$\2\2\u00c7:\3\2\2\2\u00c8\u00ca"+
		"\t\b\2\2\u00c9\u00c8\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb"+
		"\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00ce\b\36\2\2\u00ce<\3\2\2\2"+
		"\16\2\u0094\u009b\u00a1\u00a9\u00ac\u00b3\u00b6\u00bc\u00c1\u00c3\u00cb"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}