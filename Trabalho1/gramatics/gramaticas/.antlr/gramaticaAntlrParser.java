// Generated from /data/UFSC/COMPILA/Compiladores/Trabalho1/gramatics/gramaticas/gramaticaAntlr.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramaticaAntlrParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_vardecl = 2, RULE_a = 3, RULE_b = 4, 
		RULE_atribstat = 5, RULE_printstat = 6, RULE_readstat = 7, RULE_returnstat = 8, 
		RULE_ifstat = 9, RULE_forstat = 10, RULE_statelist = 11, RULE_allocexpression = 12, 
		RULE_c = 13, RULE_expression = 14, RULE_numexpression = 15, RULE_n = 16, 
		RULE_term = 17, RULE_e = 18, RULE_unaryexpr = 19, RULE_factor = 20, RULE_lvalue = 21, 
		RULE_g = 22;
	public static final String[] ruleNames = {
		"program", "statement", "vardecl", "a", "b", "atribstat", "printstat", 
		"readstat", "returnstat", "ifstat", "forstat", "statelist", "allocexpression", 
		"c", "expression", "numexpression", "n", "term", "e", "unaryexpr", "factor", 
		"lvalue", "g"
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

	@Override
	public String getGrammarFileName() { return "gramaticaAntlr.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramaticaAntlrParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			setState(48);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STRING:
			case FLOAT:
			case BREAK:
			case ENDLINE:
			case PRINT:
			case CHAVEA:
			case READ:
			case RETURN:
			case IF:
			case FOR:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(46);
				statement();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class StatementContext extends ParserRuleContext {
		public VardeclContext vardecl() {
			return getRuleContext(VardeclContext.class,0);
		}
		public TerminalNode ENDLINE() { return getToken(gramaticaAntlrParser.ENDLINE, 0); }
		public AtribstatContext atribstat() {
			return getRuleContext(AtribstatContext.class,0);
		}
		public PrintstatContext printstat() {
			return getRuleContext(PrintstatContext.class,0);
		}
		public ReadstatContext readstat() {
			return getRuleContext(ReadstatContext.class,0);
		}
		public ReturnstatContext returnstat() {
			return getRuleContext(ReturnstatContext.class,0);
		}
		public IfstatContext ifstat() {
			return getRuleContext(IfstatContext.class,0);
		}
		public ForstatContext forstat() {
			return getRuleContext(ForstatContext.class,0);
		}
		public TerminalNode CHAVEA() { return getToken(gramaticaAntlrParser.CHAVEA, 0); }
		public StatelistContext statelist() {
			return getRuleContext(StatelistContext.class,0);
		}
		public TerminalNode CHAVEF() { return getToken(gramaticaAntlrParser.CHAVEF, 0); }
		public TerminalNode BREAK() { return getToken(gramaticaAntlrParser.BREAK, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(74);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STRING:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				vardecl();
				setState(51);
				match(ENDLINE);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				atribstat();
				setState(54);
				match(ENDLINE);
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				printstat();
				setState(57);
				match(ENDLINE);
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				readstat();
				setState(60);
				match(ENDLINE);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(62);
				returnstat();
				setState(63);
				match(ENDLINE);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 6);
				{
				setState(65);
				ifstat();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 7);
				{
				setState(66);
				forstat();
				}
				break;
			case CHAVEA:
				enterOuterAlt(_localctx, 8);
				{
				setState(67);
				match(CHAVEA);
				setState(68);
				statelist();
				setState(69);
				match(CHAVEF);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 9);
				{
				setState(71);
				match(BREAK);
				setState(72);
				match(ENDLINE);
				}
				break;
			case ENDLINE:
				enterOuterAlt(_localctx, 10);
				{
				setState(73);
				match(ENDLINE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class VardeclContext extends ParserRuleContext {
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(gramaticaAntlrParser.IDENT, 0); }
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public VardeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_vardecl; }
	}

	public final VardeclContext vardecl() throws RecognitionException {
		VardeclContext _localctx = new VardeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_vardecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			a();
			setState(77);
			match(IDENT);
			setState(78);
			b();
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

	public static class AContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(gramaticaAntlrParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(gramaticaAntlrParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(gramaticaAntlrParser.STRING, 0); }
		public AContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a; }
	}

	public final AContext a() throws RecognitionException {
		AContext _localctx = new AContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_a);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << INT) | (1L << STRING) | (1L << FLOAT))) != 0)) ) {
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

	public static class BContext extends ParserRuleContext {
		public TerminalNode COLCHA() { return getToken(gramaticaAntlrParser.COLCHA, 0); }
		public TerminalNode INT_CONSTANT() { return getToken(gramaticaAntlrParser.INT_CONSTANT, 0); }
		public TerminalNode COLCHF() { return getToken(gramaticaAntlrParser.COLCHF, 0); }
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public BContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_b; }
	}

	public final BContext b() throws RecognitionException {
		BContext _localctx = new BContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_b);
		try {
			setState(90);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(82);
				match(COLCHA);
				setState(83);
				match(INT_CONSTANT);
				setState(84);
				match(COLCHF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(85);
				match(COLCHA);
				setState(86);
				match(INT_CONSTANT);
				setState(87);
				match(COLCHF);
				setState(88);
				b();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class AtribstatContext extends ParserRuleContext {
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode EQUAL() { return getToken(gramaticaAntlrParser.EQUAL, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AllocexpressionContext allocexpression() {
			return getRuleContext(AllocexpressionContext.class,0);
		}
		public AtribstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribstat; }
	}

	public final AtribstatContext atribstat() throws RecognitionException {
		AtribstatContext _localctx = new AtribstatContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_atribstat);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				lvalue();
				setState(93);
				match(EQUAL);
				setState(94);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				lvalue();
				setState(97);
				match(EQUAL);
				setState(98);
				allocexpression();
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

	public static class PrintstatContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(gramaticaAntlrParser.PRINT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PrintstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printstat; }
	}

	public final PrintstatContext printstat() throws RecognitionException {
		PrintstatContext _localctx = new PrintstatContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_printstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(PRINT);
			setState(103);
			expression();
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

	public static class ReadstatContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(gramaticaAntlrParser.READ, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public ReadstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readstat; }
	}

	public final ReadstatContext readstat() throws RecognitionException {
		ReadstatContext _localctx = new ReadstatContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_readstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(READ);
			setState(106);
			lvalue();
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

	public static class ReturnstatContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(gramaticaAntlrParser.RETURN, 0); }
		public ReturnstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstat; }
	}

	public final ReturnstatContext returnstat() throws RecognitionException {
		ReturnstatContext _localctx = new ReturnstatContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_returnstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			match(RETURN);
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

	public static class IfstatContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(gramaticaAntlrParser.IF, 0); }
		public TerminalNode PARENTEA() { return getToken(gramaticaAntlrParser.PARENTEA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PARENTEF() { return getToken(gramaticaAntlrParser.PARENTEF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(gramaticaAntlrParser.ELSE, 0); }
		public IfstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstat; }
	}

	public final IfstatContext ifstat() throws RecognitionException {
		IfstatContext _localctx = new IfstatContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_ifstat);
		try {
			setState(124);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(IF);
				setState(111);
				match(PARENTEA);
				setState(112);
				expression();
				setState(113);
				match(PARENTEF);
				setState(114);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(116);
				match(IF);
				setState(117);
				match(PARENTEA);
				setState(118);
				expression();
				setState(119);
				match(PARENTEF);
				setState(120);
				statement();
				setState(121);
				match(ELSE);
				setState(122);
				statement();
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

	public static class ForstatContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(gramaticaAntlrParser.FOR, 0); }
		public TerminalNode PARENTEA() { return getToken(gramaticaAntlrParser.PARENTEA, 0); }
		public List<AtribstatContext> atribstat() {
			return getRuleContexts(AtribstatContext.class);
		}
		public AtribstatContext atribstat(int i) {
			return getRuleContext(AtribstatContext.class,i);
		}
		public List<TerminalNode> ENDLINE() { return getTokens(gramaticaAntlrParser.ENDLINE); }
		public TerminalNode ENDLINE(int i) {
			return getToken(gramaticaAntlrParser.ENDLINE, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PARENTEF() { return getToken(gramaticaAntlrParser.PARENTEF, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_forstat; }
	}

	public final ForstatContext forstat() throws RecognitionException {
		ForstatContext _localctx = new ForstatContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_forstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(FOR);
			setState(127);
			match(PARENTEA);
			setState(128);
			atribstat();
			setState(129);
			match(ENDLINE);
			setState(130);
			expression();
			setState(131);
			match(ENDLINE);
			setState(132);
			atribstat();
			setState(133);
			match(PARENTEF);
			setState(134);
			statement();
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

	public static class StatelistContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatelistContext statelist() {
			return getRuleContext(StatelistContext.class,0);
		}
		public StatelistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statelist; }
	}

	public final StatelistContext statelist() throws RecognitionException {
		StatelistContext _localctx = new StatelistContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_statelist);
		try {
			setState(140);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(136);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				statement();
				setState(138);
				statelist();
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

	public static class AllocexpressionContext extends ParserRuleContext {
		public TerminalNode NEW() { return getToken(gramaticaAntlrParser.NEW, 0); }
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public AllocexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allocexpression; }
	}

	public final AllocexpressionContext allocexpression() throws RecognitionException {
		AllocexpressionContext _localctx = new AllocexpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_allocexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(NEW);
			setState(143);
			a();
			setState(144);
			c();
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

	public static class CContext extends ParserRuleContext {
		public TerminalNode COLCHA() { return getToken(gramaticaAntlrParser.COLCHA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLCHF() { return getToken(gramaticaAntlrParser.COLCHF, 0); }
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public CContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c; }
	}

	public final CContext c() throws RecognitionException {
		CContext _localctx = new CContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_c);
		try {
			setState(155);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(146);
				match(COLCHA);
				setState(147);
				expression();
				setState(148);
				match(COLCHF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
				match(COLCHA);
				setState(151);
				expression();
				setState(152);
				match(COLCHF);
				setState(153);
				c();
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<NumexpressionContext> numexpression() {
			return getRuleContexts(NumexpressionContext.class);
		}
		public NumexpressionContext numexpression(int i) {
			return getRuleContext(NumexpressionContext.class,i);
		}
		public TerminalNode COMPARADORES() { return getToken(gramaticaAntlrParser.COMPARADORES, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expression);
		try {
			setState(162);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(157);
				numexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(158);
				numexpression();
				setState(159);
				match(COMPARADORES);
				setState(160);
				numexpression();
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

	public static class NumexpressionContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public NContext n() {
			return getRuleContext(NContext.class,0);
		}
		public NumexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numexpression; }
	}

	public final NumexpressionContext numexpression() throws RecognitionException {
		NumexpressionContext _localctx = new NumexpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_numexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			term();
			setState(165);
			n();
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

	public static class NContext extends ParserRuleContext {
		public TerminalNode MAISOUMENOS() { return getToken(gramaticaAntlrParser.MAISOUMENOS, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public NContext n() {
			return getRuleContext(NContext.class,0);
		}
		public NContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_n; }
	}

	public final NContext n() throws RecognitionException {
		NContext _localctx = new NContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_n);
		try {
			setState(174);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(167);
				match(MAISOUMENOS);
				setState(168);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(MAISOUMENOS);
				setState(170);
				term();
				setState(171);
				n();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class TermContext extends ParserRuleContext {
		public UnaryexprContext unaryexpr() {
			return getRuleContext(UnaryexprContext.class,0);
		}
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			unaryexpr();
			setState(177);
			e();
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

	public static class EContext extends ParserRuleContext {
		public TerminalNode MDP() { return getToken(gramaticaAntlrParser.MDP, 0); }
		public UnaryexprContext unaryexpr() {
			return getRuleContext(UnaryexprContext.class,0);
		}
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public EContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_e; }
	}

	public final EContext e() throws RecognitionException {
		EContext _localctx = new EContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_e);
		try {
			setState(186);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(MDP);
				setState(180);
				unaryexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(181);
				match(MDP);
				setState(182);
				unaryexpr();
				setState(183);
				e();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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

	public static class UnaryexprContext extends ParserRuleContext {
		public TerminalNode MAISOUMENOS() { return getToken(gramaticaAntlrParser.MAISOUMENOS, 0); }
		public FactorContext factor() {
			return getRuleContext(FactorContext.class,0);
		}
		public UnaryexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unaryexpr; }
	}

	public final UnaryexprContext unaryexpr() throws RecognitionException {
		UnaryexprContext _localctx = new UnaryexprContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_unaryexpr);
		try {
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAISOUMENOS:
				enterOuterAlt(_localctx, 1);
				{
				setState(188);
				match(MAISOUMENOS);
				setState(189);
				factor();
				}
				break;
			case PARENTEA:
			case NULL:
			case IDENT:
			case INT_CONSTANT:
			case FLOAT_CONSTANT:
			case STRING_CONSTANT:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				factor();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class FactorContext extends ParserRuleContext {
		public TerminalNode INT_CONSTANT() { return getToken(gramaticaAntlrParser.INT_CONSTANT, 0); }
		public TerminalNode FLOAT_CONSTANT() { return getToken(gramaticaAntlrParser.FLOAT_CONSTANT, 0); }
		public TerminalNode STRING_CONSTANT() { return getToken(gramaticaAntlrParser.STRING_CONSTANT, 0); }
		public TerminalNode NULL() { return getToken(gramaticaAntlrParser.NULL, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode PARENTEA() { return getToken(gramaticaAntlrParser.PARENTEA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PARENTEF() { return getToken(gramaticaAntlrParser.PARENTEF, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_factor);
		try {
			setState(202);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(INT_CONSTANT);
				}
				break;
			case FLOAT_CONSTANT:
				enterOuterAlt(_localctx, 2);
				{
				setState(194);
				match(FLOAT_CONSTANT);
				}
				break;
			case STRING_CONSTANT:
				enterOuterAlt(_localctx, 3);
				{
				setState(195);
				match(STRING_CONSTANT);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(196);
				match(NULL);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(197);
				lvalue();
				}
				break;
			case PARENTEA:
				enterOuterAlt(_localctx, 6);
				{
				setState(198);
				match(PARENTEA);
				setState(199);
				expression();
				setState(200);
				match(PARENTEF);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class LvalueContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(gramaticaAntlrParser.IDENT, 0); }
		public GContext g() {
			return getRuleContext(GContext.class,0);
		}
		public LvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lvalue; }
	}

	public final LvalueContext lvalue() throws RecognitionException {
		LvalueContext _localctx = new LvalueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_lvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(IDENT);
			setState(205);
			g();
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

	public static class GContext extends ParserRuleContext {
		public TerminalNode COLCHA() { return getToken(gramaticaAntlrParser.COLCHA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode COLCHF() { return getToken(gramaticaAntlrParser.COLCHF, 0); }
		public GContext g() {
			return getRuleContext(GContext.class,0);
		}
		public GContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_g; }
	}

	public final GContext g() throws RecognitionException {
		GContext _localctx = new GContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_g);
		try {
			setState(217);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(COLCHA);
				setState(208);
				expression();
				setState(209);
				match(COLCHF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				match(COLCHA);
				setState(212);
				expression();
				setState(213);
				match(COLCHF);
				setState(214);
				g();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\36\u00de\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\5"+
		"\2\63\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3M\n\3\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6]\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\5\7g\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\177\n\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u008f\n\r\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u009e\n\17"+
		"\3\20\3\20\3\20\3\20\3\20\5\20\u00a5\n\20\3\21\3\21\3\21\3\22\3\22\3\22"+
		"\3\22\3\22\3\22\3\22\5\22\u00b1\n\22\3\23\3\23\3\23\3\24\3\24\3\24\3\24"+
		"\3\24\3\24\3\24\5\24\u00bd\n\24\3\25\3\25\3\25\5\25\u00c2\n\25\3\26\3"+
		"\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00cd\n\26\3\27\3\27\3\27"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u00dc\n\30\3\30"+
		"\2\2\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\2\3\3\2\3\5\2"+
		"\u00e3\2\62\3\2\2\2\4L\3\2\2\2\6N\3\2\2\2\bR\3\2\2\2\n\\\3\2\2\2\ff\3"+
		"\2\2\2\16h\3\2\2\2\20k\3\2\2\2\22n\3\2\2\2\24~\3\2\2\2\26\u0080\3\2\2"+
		"\2\30\u008e\3\2\2\2\32\u0090\3\2\2\2\34\u009d\3\2\2\2\36\u00a4\3\2\2\2"+
		" \u00a6\3\2\2\2\"\u00b0\3\2\2\2$\u00b2\3\2\2\2&\u00bc\3\2\2\2(\u00c1\3"+
		"\2\2\2*\u00cc\3\2\2\2,\u00ce\3\2\2\2.\u00db\3\2\2\2\60\63\5\4\3\2\61\63"+
		"\3\2\2\2\62\60\3\2\2\2\62\61\3\2\2\2\63\3\3\2\2\2\64\65\5\6\4\2\65\66"+
		"\7\7\2\2\66M\3\2\2\2\678\5\f\7\289\7\7\2\29M\3\2\2\2:;\5\16\b\2;<\7\7"+
		"\2\2<M\3\2\2\2=>\5\20\t\2>?\7\7\2\2?M\3\2\2\2@A\5\22\n\2AB\7\7\2\2BM\3"+
		"\2\2\2CM\5\24\13\2DM\5\26\f\2EF\7\n\2\2FG\5\30\r\2GH\7\13\2\2HM\3\2\2"+
		"\2IJ\7\6\2\2JM\7\7\2\2KM\7\7\2\2L\64\3\2\2\2L\67\3\2\2\2L:\3\2\2\2L=\3"+
		"\2\2\2L@\3\2\2\2LC\3\2\2\2LD\3\2\2\2LE\3\2\2\2LI\3\2\2\2LK\3\2\2\2M\5"+
		"\3\2\2\2NO\5\b\5\2OP\7\32\2\2PQ\5\n\6\2Q\7\3\2\2\2RS\t\2\2\2S\t\3\2\2"+
		"\2TU\7\f\2\2UV\7\33\2\2V]\7\r\2\2WX\7\f\2\2XY\7\33\2\2YZ\7\r\2\2Z]\5\n"+
		"\6\2[]\3\2\2\2\\T\3\2\2\2\\W\3\2\2\2\\[\3\2\2\2]\13\3\2\2\2^_\5,\27\2"+
		"_`\7\b\2\2`a\5\36\20\2ag\3\2\2\2bc\5,\27\2cd\7\b\2\2de\5\32\16\2eg\3\2"+
		"\2\2f^\3\2\2\2fb\3\2\2\2g\r\3\2\2\2hi\7\t\2\2ij\5\36\20\2j\17\3\2\2\2"+
		"kl\7\16\2\2lm\5,\27\2m\21\3\2\2\2no\7\17\2\2o\23\3\2\2\2pq\7\22\2\2qr"+
		"\7\20\2\2rs\5\36\20\2st\7\21\2\2tu\5\4\3\2u\177\3\2\2\2vw\7\22\2\2wx\7"+
		"\20\2\2xy\5\36\20\2yz\7\21\2\2z{\5\4\3\2{|\7\23\2\2|}\5\4\3\2}\177\3\2"+
		"\2\2~p\3\2\2\2~v\3\2\2\2\177\25\3\2\2\2\u0080\u0081\7\24\2\2\u0081\u0082"+
		"\7\20\2\2\u0082\u0083\5\f\7\2\u0083\u0084\7\7\2\2\u0084\u0085\5\36\20"+
		"\2\u0085\u0086\7\7\2\2\u0086\u0087\5\f\7\2\u0087\u0088\7\21\2\2\u0088"+
		"\u0089\5\4\3\2\u0089\27\3\2\2\2\u008a\u008f\5\4\3\2\u008b\u008c\5\4\3"+
		"\2\u008c\u008d\5\30\r\2\u008d\u008f\3\2\2\2\u008e\u008a\3\2\2\2\u008e"+
		"\u008b\3\2\2\2\u008f\31\3\2\2\2\u0090\u0091\7\26\2\2\u0091\u0092\5\b\5"+
		"\2\u0092\u0093\5\34\17\2\u0093\33\3\2\2\2\u0094\u0095\7\f\2\2\u0095\u0096"+
		"\5\36\20\2\u0096\u0097\7\r\2\2\u0097\u009e\3\2\2\2\u0098\u0099\7\f\2\2"+
		"\u0099\u009a\5\36\20\2\u009a\u009b\7\r\2\2\u009b\u009c\5\34\17\2\u009c"+
		"\u009e\3\2\2\2\u009d\u0094\3\2\2\2\u009d\u0098\3\2\2\2\u009e\35\3\2\2"+
		"\2\u009f\u00a5\5 \21\2\u00a0\u00a1\5 \21\2\u00a1\u00a2\7\27\2\2\u00a2"+
		"\u00a3\5 \21\2\u00a3\u00a5\3\2\2\2\u00a4\u009f\3\2\2\2\u00a4\u00a0\3\2"+
		"\2\2\u00a5\37\3\2\2\2\u00a6\u00a7\5$\23\2\u00a7\u00a8\5\"\22\2\u00a8!"+
		"\3\2\2\2\u00a9\u00aa\7\30\2\2\u00aa\u00b1\5$\23\2\u00ab\u00ac\7\30\2\2"+
		"\u00ac\u00ad\5$\23\2\u00ad\u00ae\5\"\22\2\u00ae\u00b1\3\2\2\2\u00af\u00b1"+
		"\3\2\2\2\u00b0\u00a9\3\2\2\2\u00b0\u00ab\3\2\2\2\u00b0\u00af\3\2\2\2\u00b1"+
		"#\3\2\2\2\u00b2\u00b3\5(\25\2\u00b3\u00b4\5&\24\2\u00b4%\3\2\2\2\u00b5"+
		"\u00b6\7\31\2\2\u00b6\u00bd\5(\25\2\u00b7\u00b8\7\31\2\2\u00b8\u00b9\5"+
		"(\25\2\u00b9\u00ba\5&\24\2\u00ba\u00bd\3\2\2\2\u00bb\u00bd\3\2\2\2\u00bc"+
		"\u00b5\3\2\2\2\u00bc\u00b7\3\2\2\2\u00bc\u00bb\3\2\2\2\u00bd\'\3\2\2\2"+
		"\u00be\u00bf\7\30\2\2\u00bf\u00c2\5*\26\2\u00c0\u00c2\5*\26\2\u00c1\u00be"+
		"\3\2\2\2\u00c1\u00c0\3\2\2\2\u00c2)\3\2\2\2\u00c3\u00cd\7\33\2\2\u00c4"+
		"\u00cd\7\34\2\2\u00c5\u00cd\7\35\2\2\u00c6\u00cd\7\25\2\2\u00c7\u00cd"+
		"\5,\27\2\u00c8\u00c9\7\20\2\2\u00c9\u00ca\5\36\20\2\u00ca\u00cb\7\21\2"+
		"\2\u00cb\u00cd\3\2\2\2\u00cc\u00c3\3\2\2\2\u00cc\u00c4\3\2\2\2\u00cc\u00c5"+
		"\3\2\2\2\u00cc\u00c6\3\2\2\2\u00cc\u00c7\3\2\2\2\u00cc\u00c8\3\2\2\2\u00cd"+
		"+\3\2\2\2\u00ce\u00cf\7\32\2\2\u00cf\u00d0\5.\30\2\u00d0-\3\2\2\2\u00d1"+
		"\u00d2\7\f\2\2\u00d2\u00d3\5\36\20\2\u00d3\u00d4\7\r\2\2\u00d4\u00dc\3"+
		"\2\2\2\u00d5\u00d6\7\f\2\2\u00d6\u00d7\5\36\20\2\u00d7\u00d8\7\r\2\2\u00d8"+
		"\u00d9\5.\30\2\u00d9\u00dc\3\2\2\2\u00da\u00dc\3\2\2\2\u00db\u00d1\3\2"+
		"\2\2\u00db\u00d5\3\2\2\2\u00db\u00da\3\2\2\2\u00dc/\3\2\2\2\17\62L\\f"+
		"~\u008e\u009d\u00a4\u00b0\u00bc\u00c1\u00cc\u00db";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}