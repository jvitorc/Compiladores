// Generated from /data/UFSC/COMPILA/Compiladores/Trabalho2/Asem/gramatica.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramaticaLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DEF=1, INT=2, STRING=3, FLOAT=4, BREAK=5, ATRIBUICAO=6, PRINT=7, CHAVEA=8, 
		CHAVEF=9, COLCHA=10, COLCHF=11, READ=12, RETURN=13, PARENTEA=14, PARENTEF=15, 
		IF=16, ELSE=17, FOR=18, NULL=19, NEW=20, VIRGULA=21, PONTOEVIRGULA=22, 
		MENORQUE=23, MAIORQUE=24, MENOREIGUAL=25, MAIOREIGUAL=26, IGUAL=27, DIFERENTE=28, 
		MAIS=29, MENOS=30, MULTIPLICACAO=31, DIVISAO=32, MODULO=33, IDENT=34, 
		INT_CONSTANT=35, FLOAT_CONSTANT=36, STRING_CONSTANT=37, WS=38;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"DEF", "INT", "STRING", "FLOAT", "BREAK", "ATRIBUICAO", "PRINT", "CHAVEA", 
		"CHAVEF", "COLCHA", "COLCHF", "READ", "RETURN", "PARENTEA", "PARENTEF", 
		"IF", "ELSE", "FOR", "NULL", "NEW", "VIRGULA", "PONTOEVIRGULA", "MENORQUE", 
		"MAIORQUE", "MENOREIGUAL", "MAIOREIGUAL", "IGUAL", "DIFERENTE", "MAIS", 
		"MENOS", "MULTIPLICACAO", "DIVISAO", "MODULO", "CESPECIAL", "IDENT", "INT_CONSTANT", 
		"FLOAT_CONSTANT", "STRING_CONSTANT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'def'", "'int'", "'string'", "'float'", "'break'", "'='", "'print'", 
		"'{'", "'}'", "'['", "']'", "'read'", "'return'", "'('", "')'", "'if'", 
		"'else'", "'for'", "'null'", "'new'", "','", "';'", "'<'", "'>'", "'<='", 
		"'>='", "'=='", "'!='", "'+'", "'-'", "'*'", "'/'", "'%'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "DEF", "INT", "STRING", "FLOAT", "BREAK", "ATRIBUICAO", "PRINT", 
		"CHAVEA", "CHAVEF", "COLCHA", "COLCHF", "READ", "RETURN", "PARENTEA", 
		"PARENTEF", "IF", "ELSE", "FOR", "NULL", "NEW", "VIRGULA", "PONTOEVIRGULA", 
		"MENORQUE", "MAIORQUE", "MENOREIGUAL", "MAIOREIGUAL", "IGUAL", "DIFERENTE", 
		"MAIS", "MENOS", "MULTIPLICACAO", "DIVISAO", "MODULO", "IDENT", "INT_CONSTANT", 
		"FLOAT_CONSTANT", "STRING_CONSTANT", "WS"
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


	public gramaticaLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "gramatica.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2(\u00f4\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\3\3"+
		"\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\17\3\17\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3"+
		"\27\3\30\3\30\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\34\3"+
		"\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3!\3!\3\"\3\"\3#\5#\u00c1\n#\3"+
		"$\3$\7$\u00c5\n$\f$\16$\u00c8\13$\3%\3%\3%\7%\u00cd\n%\f%\16%\u00d0\13"+
		"%\5%\u00d2\n%\3&\3&\3&\7&\u00d7\n&\f&\16&\u00da\13&\5&\u00dc\n&\3&\3&"+
		"\6&\u00e0\n&\r&\16&\u00e1\3\'\3\'\3\'\7\'\u00e7\n\'\f\'\16\'\u00ea\13"+
		"\'\3\'\3\'\3(\6(\u00ef\n(\r(\16(\u00f0\3(\3(\2\2)\3\3\5\4\7\5\t\6\13\7"+
		"\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25"+
		")\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E\2G$I%K&M\'"+
		"O(\3\2\6\21\2\"#%(*\61<>@B]b}\u0080\u00c2\u00c7\u00c9\u00d1\u00d3\u00d8"+
		"\u00db\u00de\u00e2\u00e6\u00e9\u00f1\u00f4\u00f8\u00fb\u00fe\5\2C\\aa"+
		"c|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u00fb\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2"+
		"\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2"+
		"\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2"+
		"\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2"+
		"\2\2A\3\2\2\2\2C\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2"+
		"O\3\2\2\2\3Q\3\2\2\2\5U\3\2\2\2\7Y\3\2\2\2\t`\3\2\2\2\13f\3\2\2\2\rl\3"+
		"\2\2\2\17n\3\2\2\2\21t\3\2\2\2\23v\3\2\2\2\25x\3\2\2\2\27z\3\2\2\2\31"+
		"|\3\2\2\2\33\u0081\3\2\2\2\35\u0088\3\2\2\2\37\u008a\3\2\2\2!\u008c\3"+
		"\2\2\2#\u008f\3\2\2\2%\u0094\3\2\2\2\'\u0098\3\2\2\2)\u009d\3\2\2\2+\u00a1"+
		"\3\2\2\2-\u00a3\3\2\2\2/\u00a5\3\2\2\2\61\u00a7\3\2\2\2\63\u00a9\3\2\2"+
		"\2\65\u00ac\3\2\2\2\67\u00af\3\2\2\29\u00b2\3\2\2\2;\u00b5\3\2\2\2=\u00b7"+
		"\3\2\2\2?\u00b9\3\2\2\2A\u00bb\3\2\2\2C\u00bd\3\2\2\2E\u00c0\3\2\2\2G"+
		"\u00c2\3\2\2\2I\u00d1\3\2\2\2K\u00db\3\2\2\2M\u00e3\3\2\2\2O\u00ee\3\2"+
		"\2\2QR\7f\2\2RS\7g\2\2ST\7h\2\2T\4\3\2\2\2UV\7k\2\2VW\7p\2\2WX\7v\2\2"+
		"X\6\3\2\2\2YZ\7u\2\2Z[\7v\2\2[\\\7t\2\2\\]\7k\2\2]^\7p\2\2^_\7i\2\2_\b"+
		"\3\2\2\2`a\7h\2\2ab\7n\2\2bc\7q\2\2cd\7c\2\2de\7v\2\2e\n\3\2\2\2fg\7d"+
		"\2\2gh\7t\2\2hi\7g\2\2ij\7c\2\2jk\7m\2\2k\f\3\2\2\2lm\7?\2\2m\16\3\2\2"+
		"\2no\7r\2\2op\7t\2\2pq\7k\2\2qr\7p\2\2rs\7v\2\2s\20\3\2\2\2tu\7}\2\2u"+
		"\22\3\2\2\2vw\7\177\2\2w\24\3\2\2\2xy\7]\2\2y\26\3\2\2\2z{\7_\2\2{\30"+
		"\3\2\2\2|}\7t\2\2}~\7g\2\2~\177\7c\2\2\177\u0080\7f\2\2\u0080\32\3\2\2"+
		"\2\u0081\u0082\7t\2\2\u0082\u0083\7g\2\2\u0083\u0084\7v\2\2\u0084\u0085"+
		"\7w\2\2\u0085\u0086\7t\2\2\u0086\u0087\7p\2\2\u0087\34\3\2\2\2\u0088\u0089"+
		"\7*\2\2\u0089\36\3\2\2\2\u008a\u008b\7+\2\2\u008b \3\2\2\2\u008c\u008d"+
		"\7k\2\2\u008d\u008e\7h\2\2\u008e\"\3\2\2\2\u008f\u0090\7g\2\2\u0090\u0091"+
		"\7n\2\2\u0091\u0092\7u\2\2\u0092\u0093\7g\2\2\u0093$\3\2\2\2\u0094\u0095"+
		"\7h\2\2\u0095\u0096\7q\2\2\u0096\u0097\7t\2\2\u0097&\3\2\2\2\u0098\u0099"+
		"\7p\2\2\u0099\u009a\7w\2\2\u009a\u009b\7n\2\2\u009b\u009c\7n\2\2\u009c"+
		"(\3\2\2\2\u009d\u009e\7p\2\2\u009e\u009f\7g\2\2\u009f\u00a0\7y\2\2\u00a0"+
		"*\3\2\2\2\u00a1\u00a2\7.\2\2\u00a2,\3\2\2\2\u00a3\u00a4\7=\2\2\u00a4."+
		"\3\2\2\2\u00a5\u00a6\7>\2\2\u00a6\60\3\2\2\2\u00a7\u00a8\7@\2\2\u00a8"+
		"\62\3\2\2\2\u00a9\u00aa\7>\2\2\u00aa\u00ab\7?\2\2\u00ab\64\3\2\2\2\u00ac"+
		"\u00ad\7@\2\2\u00ad\u00ae\7?\2\2\u00ae\66\3\2\2\2\u00af\u00b0\7?\2\2\u00b0"+
		"\u00b1\7?\2\2\u00b18\3\2\2\2\u00b2\u00b3\7#\2\2\u00b3\u00b4\7?\2\2\u00b4"+
		":\3\2\2\2\u00b5\u00b6\7-\2\2\u00b6<\3\2\2\2\u00b7\u00b8\7/\2\2\u00b8>"+
		"\3\2\2\2\u00b9\u00ba\7,\2\2\u00ba@\3\2\2\2\u00bb\u00bc\7\61\2\2\u00bc"+
		"B\3\2\2\2\u00bd\u00be\7\'\2\2\u00beD\3\2\2\2\u00bf\u00c1\t\2\2\2\u00c0"+
		"\u00bf\3\2\2\2\u00c1F\3\2\2\2\u00c2\u00c6\t\3\2\2\u00c3\u00c5\t\4\2\2"+
		"\u00c4\u00c3\3\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7"+
		"\3\2\2\2\u00c7H\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00d2\7\62\2\2\u00ca"+
		"\u00ce\4\63;\2\u00cb\u00cd\4\62;\2\u00cc\u00cb\3\2\2\2\u00cd\u00d0\3\2"+
		"\2\2\u00ce\u00cc\3\2\2\2\u00ce\u00cf\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0"+
		"\u00ce\3\2\2\2\u00d1\u00c9\3\2\2\2\u00d1\u00ca\3\2\2\2\u00d2J\3\2\2\2"+
		"\u00d3\u00dc\7\62\2\2\u00d4\u00d8\4\63;\2\u00d5\u00d7\4\62;\2\u00d6\u00d5"+
		"\3\2\2\2\u00d7\u00da\3\2\2\2\u00d8\u00d6\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"\u00dc\3\2\2\2\u00da\u00d8\3\2\2\2\u00db\u00d3\3\2\2\2\u00db\u00d4\3\2"+
		"\2\2\u00dc\u00dd\3\2\2\2\u00dd\u00df\7\60\2\2\u00de\u00e0\4\62;\2\u00df"+
		"\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2"+
		"\2\2\u00e2L\3\2\2\2\u00e3\u00e8\7$\2\2\u00e4\u00e7\t\4\2\2\u00e5\u00e7"+
		"\5E#\2\u00e6\u00e4\3\2\2\2\u00e6\u00e5\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8"+
		"\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9\u00eb\3\2\2\2\u00ea\u00e8\3\2"+
		"\2\2\u00eb\u00ec\7$\2\2\u00ecN\3\2\2\2\u00ed\u00ef\t\5\2\2\u00ee\u00ed"+
		"\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00f1\3\2\2\2\u00f1"+
		"\u00f2\3\2\2\2\u00f2\u00f3\b(\2\2\u00f3P\3\2\2\2\r\2\u00c0\u00c6\u00ce"+
		"\u00d1\u00d8\u00db\u00e1\u00e6\u00e8\u00f0\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}