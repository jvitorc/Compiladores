// Generated from /home/joao/Desktop/projetos/Compiladores/gramatics/gramaticaAntlr.g4 by ANTLR 4.7.1
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
		IF=16, ELSE=17, FOR=18, NEW=19, COMPARADORES=20, MAISOUMENOS=21, MDP=22, 
		NULL=23, IDENT=24, INT_CONSTANT=25, FLOAT_CONSTANT=26, STRING_CONSTANT=27;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"INT", "STRING", "FLOAT", "BREAK", "ENDLINE", "EQUAL", "PRINT", "CHAVEA", 
		"CHAVEF", "COLCHA", "COLCHF", "READ", "RETURN", "PARENTEA", "PARENTEF", 
		"IF", "ELSE", "FOR", "NEW", "COMPARADORES", "MAISOUMENOS", "MDP", "NULL", 
		"IDENT", "INT_CONSTANT", "FLOAT_CONSTANT", "STRING_CONSTANT"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'int'", "'string'", "'float'", "'break'", "';'", "'='", "'print'", 
		"'{'", "'}'", "'['", "']'", "'read'", "'return'", "'('", "')'", "'if'", 
		"'else'", "'for'", "'new'", null, null, null, "'null'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "INT", "STRING", "FLOAT", "BREAK", "ENDLINE", "EQUAL", "PRINT", 
		"CHAVEA", "CHAVEF", "COLCHA", "COLCHF", "READ", "RETURN", "PARENTEA", 
		"PARENTEF", "IF", "ELSE", "FOR", "NEW", "COMPARADORES", "MAISOUMENOS", 
		"MDP", "NULL", "IDENT", "INT_CONSTANT", "FLOAT_CONSTANT", "STRING_CONSTANT"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\35\u00c0\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7"+
		"\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\24\3\24\3"+
		"\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u008c\n\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\7\31\u0099\n\31"+
		"\f\31\16\31\u009c\13\31\3\32\3\32\3\32\7\32\u00a1\n\32\f\32\16\32\u00a4"+
		"\13\32\5\32\u00a6\n\32\3\33\3\33\3\33\7\33\u00ab\n\33\f\33\16\33\u00ae"+
		"\13\33\5\33\u00b0\n\33\3\33\3\33\6\33\u00b4\n\33\r\33\16\33\u00b5\3\34"+
		"\3\34\7\34\u00ba\n\34\f\34\16\34\u00bd\13\34\3\34\3\34\2\2\35\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\35\3\2\7\4\2>>@@\4"+
		"\2--//\5\2\'\',,\61\61\5\2C\\aac|\6\2\62;C\\aac|\2\u00ca\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\39\3\2\2\2\5=\3\2\2\2\7D\3\2\2"+
		"\2\tJ\3\2\2\2\13P\3\2\2\2\rR\3\2\2\2\17T\3\2\2\2\21Z\3\2\2\2\23\\\3\2"+
		"\2\2\25^\3\2\2\2\27`\3\2\2\2\31b\3\2\2\2\33g\3\2\2\2\35n\3\2\2\2\37p\3"+
		"\2\2\2!r\3\2\2\2#u\3\2\2\2%z\3\2\2\2\'~\3\2\2\2)\u008b\3\2\2\2+\u008d"+
		"\3\2\2\2-\u008f\3\2\2\2/\u0091\3\2\2\2\61\u0096\3\2\2\2\63\u00a5\3\2\2"+
		"\2\65\u00af\3\2\2\2\67\u00b7\3\2\2\29:\7k\2\2:;\7p\2\2;<\7v\2\2<\4\3\2"+
		"\2\2=>\7u\2\2>?\7v\2\2?@\7t\2\2@A\7k\2\2AB\7p\2\2BC\7i\2\2C\6\3\2\2\2"+
		"DE\7h\2\2EF\7n\2\2FG\7q\2\2GH\7c\2\2HI\7v\2\2I\b\3\2\2\2JK\7d\2\2KL\7"+
		"t\2\2LM\7g\2\2MN\7c\2\2NO\7m\2\2O\n\3\2\2\2PQ\7=\2\2Q\f\3\2\2\2RS\7?\2"+
		"\2S\16\3\2\2\2TU\7r\2\2UV\7t\2\2VW\7k\2\2WX\7p\2\2XY\7v\2\2Y\20\3\2\2"+
		"\2Z[\7}\2\2[\22\3\2\2\2\\]\7\177\2\2]\24\3\2\2\2^_\7]\2\2_\26\3\2\2\2"+
		"`a\7_\2\2a\30\3\2\2\2bc\7t\2\2cd\7g\2\2de\7c\2\2ef\7f\2\2f\32\3\2\2\2"+
		"gh\7t\2\2hi\7g\2\2ij\7v\2\2jk\7w\2\2kl\7t\2\2lm\7p\2\2m\34\3\2\2\2no\7"+
		"*\2\2o\36\3\2\2\2pq\7+\2\2q \3\2\2\2rs\7k\2\2st\7h\2\2t\"\3\2\2\2uv\7"+
		"g\2\2vw\7n\2\2wx\7u\2\2xy\7g\2\2y$\3\2\2\2z{\7h\2\2{|\7q\2\2|}\7t\2\2"+
		"}&\3\2\2\2~\177\7p\2\2\177\u0080\7g\2\2\u0080\u0081\7y\2\2\u0081(\3\2"+
		"\2\2\u0082\u008c\t\2\2\2\u0083\u0084\7>\2\2\u0084\u008c\7?\2\2\u0085\u0086"+
		"\7@\2\2\u0086\u008c\7?\2\2\u0087\u0088\7?\2\2\u0088\u008c\7?\2\2\u0089"+
		"\u008a\7#\2\2\u008a\u008c\7?\2\2\u008b\u0082\3\2\2\2\u008b\u0083\3\2\2"+
		"\2\u008b\u0085\3\2\2\2\u008b\u0087\3\2\2\2\u008b\u0089\3\2\2\2\u008c*"+
		"\3\2\2\2\u008d\u008e\t\3\2\2\u008e,\3\2\2\2\u008f\u0090\t\4\2\2\u0090"+
		".\3\2\2\2\u0091\u0092\7p\2\2\u0092\u0093\7w\2\2\u0093\u0094\7n\2\2\u0094"+
		"\u0095\7n\2\2\u0095\60\3\2\2\2\u0096\u009a\t\5\2\2\u0097\u0099\t\6\2\2"+
		"\u0098\u0097\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u0098\3\2\2\2\u009a\u009b"+
		"\3\2\2\2\u009b\62\3\2\2\2\u009c\u009a\3\2\2\2\u009d\u00a6\7\62\2\2\u009e"+
		"\u00a2\4\63;\2\u009f\u00a1\4\62;\2\u00a0\u009f\3\2\2\2\u00a1\u00a4\3\2"+
		"\2\2\u00a2\u00a0\3\2\2\2\u00a2\u00a3\3\2\2\2\u00a3\u00a6\3\2\2\2\u00a4"+
		"\u00a2\3\2\2\2\u00a5\u009d\3\2\2\2\u00a5\u009e\3\2\2\2\u00a6\64\3\2\2"+
		"\2\u00a7\u00b0\7\62\2\2\u00a8\u00ac\4\63;\2\u00a9\u00ab\4\62;\2\u00aa"+
		"\u00a9\3\2\2\2\u00ab\u00ae\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ac\u00ad\3\2"+
		"\2\2\u00ad\u00b0\3\2\2\2\u00ae\u00ac\3\2\2\2\u00af\u00a7\3\2\2\2\u00af"+
		"\u00a8\3\2\2\2\u00b0\u00b1\3\2\2\2\u00b1\u00b3\7\60\2\2\u00b2\u00b4\4"+
		"\62;\2\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5"+
		"\u00b6\3\2\2\2\u00b6\66\3\2\2\2\u00b7\u00bb\7$\2\2\u00b8\u00ba\t\6\2\2"+
		"\u00b9\u00b8\3\2\2\2\u00ba\u00bd\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bb\u00bc"+
		"\3\2\2\2\u00bc\u00be\3\2\2\2\u00bd\u00bb\3\2\2\2\u00be\u00bf\7$\2\2\u00bf"+
		"8\3\2\2\2\13\2\u008b\u009a\u00a2\u00a5\u00ac\u00af\u00b5\u00bb\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}