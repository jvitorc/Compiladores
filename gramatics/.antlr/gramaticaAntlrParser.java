// Generated from /home/joao/Desktop/projetos/Compiladores/gramatics/gramaticaAntlr.g4 by ANTLR 4.7.1
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
		IF=16, ELSE=17, FOR=18, NEW=19, COMPARADORES=20, MAISOUMENOS=21, MDP=22, 
		NULL=23, IDENT=24, INT_CONSTANT=25, FLOAT_CONSTANT=26, STRING_CONSTANT=27;
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
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EndLineContext extends StatementContext {
		public TerminalNode ENDLINE() { return getToken(gramaticaAntlrParser.ENDLINE, 0); }
		public EndLineContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class BreakContext extends StatementContext {
		public TerminalNode BREAK() { return getToken(gramaticaAntlrParser.BREAK, 0); }
		public TerminalNode ENDLINE() { return getToken(gramaticaAntlrParser.ENDLINE, 0); }
		public BreakContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class BinaryListOpContext extends StatementContext {
		public TerminalNode CHAVEA() { return getToken(gramaticaAntlrParser.CHAVEA, 0); }
		public StatelistContext statelist() {
			return getRuleContext(StatelistContext.class,0);
		}
		public TerminalNode CHAVEF() { return getToken(gramaticaAntlrParser.CHAVEF, 0); }
		public BinaryListOpContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class BinaryOpContext extends StatementContext {
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
		public BinaryOpContext(StatementContext ctx) { copyFrom(ctx); }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STRING:
			case FLOAT:
				_localctx = new BinaryOpContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				vardecl();
				setState(51);
				match(ENDLINE);
				}
				break;
			case IDENT:
				_localctx = new BinaryOpContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(53);
				atribstat();
				setState(54);
				match(ENDLINE);
				}
				break;
			case PRINT:
				_localctx = new BinaryOpContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(56);
				printstat();
				setState(57);
				match(ENDLINE);
				}
				break;
			case READ:
				_localctx = new BinaryOpContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(59);
				readstat();
				setState(60);
				match(ENDLINE);
				}
				break;
			case RETURN:
				_localctx = new BinaryOpContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(62);
				returnstat();
				setState(63);
				match(ENDLINE);
				}
				break;
			case IF:
				_localctx = new BinaryOpContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(65);
				ifstat();
				setState(66);
				match(ENDLINE);
				}
				break;
			case FOR:
				_localctx = new BinaryOpContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(68);
				forstat();
				setState(69);
				match(ENDLINE);
				}
				break;
			case CHAVEA:
				_localctx = new BinaryListOpContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(71);
				match(CHAVEA);
				setState(72);
				statelist();
				setState(73);
				match(CHAVEF);
				}
				break;
			case BREAK:
				_localctx = new BreakContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(75);
				match(BREAK);
				setState(76);
				match(ENDLINE);
				}
				break;
			case ENDLINE:
				_localctx = new EndLineContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(77);
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
			setState(80);
			a();
			setState(81);
			match(IDENT);
			setState(82);
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
			setState(84);
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
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(86);
				match(COLCHA);
				setState(87);
				match(INT_CONSTANT);
				setState(88);
				match(COLCHF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89);
				match(COLCHA);
				setState(90);
				match(INT_CONSTANT);
				setState(91);
				match(COLCHF);
				setState(92);
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
			setState(104);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				lvalue();
				setState(97);
				match(EQUAL);
				setState(98);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(100);
				lvalue();
				setState(101);
				match(EQUAL);
				setState(102);
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
			setState(106);
			match(PRINT);
			setState(107);
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
			setState(109);
			match(READ);
			setState(110);
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
			setState(112);
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
			setState(128);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(114);
				match(IF);
				setState(115);
				match(PARENTEA);
				setState(116);
				expression();
				setState(117);
				match(PARENTEF);
				setState(118);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(IF);
				setState(121);
				match(PARENTEA);
				setState(122);
				expression();
				setState(123);
				match(PARENTEF);
				setState(124);
				statement();
				setState(125);
				match(ELSE);
				setState(126);
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
		public NumexpressionContext numexpression() {
			return getRuleContext(NumexpressionContext.class,0);
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
			setState(130);
			match(FOR);
			setState(131);
			match(PARENTEA);
			setState(132);
			atribstat();
			setState(133);
			match(ENDLINE);
			setState(134);
			numexpression();
			setState(135);
			match(ENDLINE);
			setState(136);
			atribstat();
			setState(137);
			match(PARENTEF);
			setState(138);
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
			setState(144);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				statement();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(141);
				statement();
				setState(142);
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
			setState(146);
			match(NEW);
			setState(147);
			a();
			setState(148);
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
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(150);
				match(COLCHA);
				setState(151);
				expression();
				setState(152);
				match(COLCHF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(154);
				match(COLCHA);
				setState(155);
				expression();
				setState(156);
				match(COLCHF);
				setState(157);
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
			setState(166);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				numexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(162);
				numexpression();
				setState(163);
				match(COMPARADORES);
				setState(164);
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
			setState(168);
			term();
			setState(169);
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
			setState(178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(171);
				match(MAISOUMENOS);
				setState(172);
				term();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(173);
				match(MAISOUMENOS);
				setState(174);
				term();
				setState(175);
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
			setState(180);
			unaryexpr();
			setState(181);
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
			setState(190);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(MDP);
				setState(184);
				unaryexpr();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(185);
				match(MDP);
				setState(186);
				unaryexpr();
				setState(187);
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
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAISOUMENOS:
				enterOuterAlt(_localctx, 1);
				{
				setState(192);
				match(MAISOUMENOS);
				setState(193);
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
				setState(194);
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
			setState(206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(INT_CONSTANT);
				}
				break;
			case FLOAT_CONSTANT:
				enterOuterAlt(_localctx, 2);
				{
				setState(198);
				match(FLOAT_CONSTANT);
				}
				break;
			case STRING_CONSTANT:
				enterOuterAlt(_localctx, 3);
				{
				setState(199);
				match(STRING_CONSTANT);
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(200);
				match(NULL);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(201);
				lvalue();
				}
				break;
			case PARENTEA:
				enterOuterAlt(_localctx, 6);
				{
				setState(202);
				match(PARENTEA);
				setState(203);
				expression();
				setState(204);
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
			setState(208);
			match(IDENT);
			setState(209);
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
			setState(221);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(211);
				match(COLCHA);
				setState(212);
				expression();
				setState(213);
				match(COLCHF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(COLCHA);
				setState(216);
				expression();
				setState(217);
				match(COLCHF);
				setState(218);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\35\u00e2\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\3\2\5"+
		"\2\63\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3Q\n\3\3\4\3\4"+
		"\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\5\6a\n\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\5\7k\n\7\3\b\3\b\3\b\3\t\3\t\3\t\3\n\3\n\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u0083"+
		"\n\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\u0093"+
		"\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\5\17\u00a2\n\17\3\20\3\20\3\20\3\20\3\20\5\20\u00a9\n\20\3\21\3\21\3"+
		"\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00b5\n\22\3\23\3\23\3\23"+
		"\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00c1\n\24\3\25\3\25\3\25\5\25"+
		"\u00c6\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\5\26\u00d1\n"+
		"\26\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5"+
		"\30\u00e0\n\30\3\30\2\2\31\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$"+
		"&(*,.\2\3\3\2\3\5\2\u00e7\2\62\3\2\2\2\4P\3\2\2\2\6R\3\2\2\2\bV\3\2\2"+
		"\2\n`\3\2\2\2\fj\3\2\2\2\16l\3\2\2\2\20o\3\2\2\2\22r\3\2\2\2\24\u0082"+
		"\3\2\2\2\26\u0084\3\2\2\2\30\u0092\3\2\2\2\32\u0094\3\2\2\2\34\u00a1\3"+
		"\2\2\2\36\u00a8\3\2\2\2 \u00aa\3\2\2\2\"\u00b4\3\2\2\2$\u00b6\3\2\2\2"+
		"&\u00c0\3\2\2\2(\u00c5\3\2\2\2*\u00d0\3\2\2\2,\u00d2\3\2\2\2.\u00df\3"+
		"\2\2\2\60\63\5\4\3\2\61\63\3\2\2\2\62\60\3\2\2\2\62\61\3\2\2\2\63\3\3"+
		"\2\2\2\64\65\5\6\4\2\65\66\7\7\2\2\66Q\3\2\2\2\678\5\f\7\289\7\7\2\29"+
		"Q\3\2\2\2:;\5\16\b\2;<\7\7\2\2<Q\3\2\2\2=>\5\20\t\2>?\7\7\2\2?Q\3\2\2"+
		"\2@A\5\22\n\2AB\7\7\2\2BQ\3\2\2\2CD\5\24\13\2DE\7\7\2\2EQ\3\2\2\2FG\5"+
		"\26\f\2GH\7\7\2\2HQ\3\2\2\2IJ\7\n\2\2JK\5\30\r\2KL\7\13\2\2LQ\3\2\2\2"+
		"MN\7\6\2\2NQ\7\7\2\2OQ\7\7\2\2P\64\3\2\2\2P\67\3\2\2\2P:\3\2\2\2P=\3\2"+
		"\2\2P@\3\2\2\2PC\3\2\2\2PF\3\2\2\2PI\3\2\2\2PM\3\2\2\2PO\3\2\2\2Q\5\3"+
		"\2\2\2RS\5\b\5\2ST\7\32\2\2TU\5\n\6\2U\7\3\2\2\2VW\t\2\2\2W\t\3\2\2\2"+
		"XY\7\f\2\2YZ\7\33\2\2Za\7\r\2\2[\\\7\f\2\2\\]\7\33\2\2]^\7\r\2\2^a\5\n"+
		"\6\2_a\3\2\2\2`X\3\2\2\2`[\3\2\2\2`_\3\2\2\2a\13\3\2\2\2bc\5,\27\2cd\7"+
		"\b\2\2de\5\36\20\2ek\3\2\2\2fg\5,\27\2gh\7\b\2\2hi\5\32\16\2ik\3\2\2\2"+
		"jb\3\2\2\2jf\3\2\2\2k\r\3\2\2\2lm\7\t\2\2mn\5\36\20\2n\17\3\2\2\2op\7"+
		"\16\2\2pq\5,\27\2q\21\3\2\2\2rs\7\17\2\2s\23\3\2\2\2tu\7\22\2\2uv\7\20"+
		"\2\2vw\5\36\20\2wx\7\21\2\2xy\5\4\3\2y\u0083\3\2\2\2z{\7\22\2\2{|\7\20"+
		"\2\2|}\5\36\20\2}~\7\21\2\2~\177\5\4\3\2\177\u0080\7\23\2\2\u0080\u0081"+
		"\5\4\3\2\u0081\u0083\3\2\2\2\u0082t\3\2\2\2\u0082z\3\2\2\2\u0083\25\3"+
		"\2\2\2\u0084\u0085\7\24\2\2\u0085\u0086\7\20\2\2\u0086\u0087\5\f\7\2\u0087"+
		"\u0088\7\7\2\2\u0088\u0089\5 \21\2\u0089\u008a\7\7\2\2\u008a\u008b\5\f"+
		"\7\2\u008b\u008c\7\21\2\2\u008c\u008d\5\4\3\2\u008d\27\3\2\2\2\u008e\u0093"+
		"\5\4\3\2\u008f\u0090\5\4\3\2\u0090\u0091\5\30\r\2\u0091\u0093\3\2\2\2"+
		"\u0092\u008e\3\2\2\2\u0092\u008f\3\2\2\2\u0093\31\3\2\2\2\u0094\u0095"+
		"\7\25\2\2\u0095\u0096\5\b\5\2\u0096\u0097\5\34\17\2\u0097\33\3\2\2\2\u0098"+
		"\u0099\7\f\2\2\u0099\u009a\5\36\20\2\u009a\u009b\7\r\2\2\u009b\u00a2\3"+
		"\2\2\2\u009c\u009d\7\f\2\2\u009d\u009e\5\36\20\2\u009e\u009f\7\r\2\2\u009f"+
		"\u00a0\5\34\17\2\u00a0\u00a2\3\2\2\2\u00a1\u0098\3\2\2\2\u00a1\u009c\3"+
		"\2\2\2\u00a2\35\3\2\2\2\u00a3\u00a9\5 \21\2\u00a4\u00a5\5 \21\2\u00a5"+
		"\u00a6\7\26\2\2\u00a6\u00a7\5 \21\2\u00a7\u00a9\3\2\2\2\u00a8\u00a3\3"+
		"\2\2\2\u00a8\u00a4\3\2\2\2\u00a9\37\3\2\2\2\u00aa\u00ab\5$\23\2\u00ab"+
		"\u00ac\5\"\22\2\u00ac!\3\2\2\2\u00ad\u00ae\7\27\2\2\u00ae\u00b5\5$\23"+
		"\2\u00af\u00b0\7\27\2\2\u00b0\u00b1\5$\23\2\u00b1\u00b2\5\"\22\2\u00b2"+
		"\u00b5\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4\u00ad\3\2\2\2\u00b4\u00af\3\2"+
		"\2\2\u00b4\u00b3\3\2\2\2\u00b5#\3\2\2\2\u00b6\u00b7\5(\25\2\u00b7\u00b8"+
		"\5&\24\2\u00b8%\3\2\2\2\u00b9\u00ba\7\30\2\2\u00ba\u00c1\5(\25\2\u00bb"+
		"\u00bc\7\30\2\2\u00bc\u00bd\5(\25\2\u00bd\u00be\5&\24\2\u00be\u00c1\3"+
		"\2\2\2\u00bf\u00c1\3\2\2\2\u00c0\u00b9\3\2\2\2\u00c0\u00bb\3\2\2\2\u00c0"+
		"\u00bf\3\2\2\2\u00c1\'\3\2\2\2\u00c2\u00c3\7\27\2\2\u00c3\u00c6\5*\26"+
		"\2\u00c4\u00c6\5*\26\2\u00c5\u00c2\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6)"+
		"\3\2\2\2\u00c7\u00d1\7\33\2\2\u00c8\u00d1\7\34\2\2\u00c9\u00d1\7\35\2"+
		"\2\u00ca\u00d1\7\31\2\2\u00cb\u00d1\5,\27\2\u00cc\u00cd\7\20\2\2\u00cd"+
		"\u00ce\5\36\20\2\u00ce\u00cf\7\21\2\2\u00cf\u00d1\3\2\2\2\u00d0\u00c7"+
		"\3\2\2\2\u00d0\u00c8\3\2\2\2\u00d0\u00c9\3\2\2\2\u00d0\u00ca\3\2\2\2\u00d0"+
		"\u00cb\3\2\2\2\u00d0\u00cc\3\2\2\2\u00d1+\3\2\2\2\u00d2\u00d3\7\32\2\2"+
		"\u00d3\u00d4\5.\30\2\u00d4-\3\2\2\2\u00d5\u00d6\7\f\2\2\u00d6\u00d7\5"+
		"\36\20\2\u00d7\u00d8\7\r\2\2\u00d8\u00e0\3\2\2\2\u00d9\u00da\7\f\2\2\u00da"+
		"\u00db\5\36\20\2\u00db\u00dc\7\r\2\2\u00dc\u00dd\5.\30\2\u00dd\u00e0\3"+
		"\2\2\2\u00de\u00e0\3\2\2\2\u00df\u00d5\3\2\2\2\u00df\u00d9\3\2\2\2\u00df"+
		"\u00de\3\2\2\2\u00e0/\3\2\2\2\17\62P`j\u0082\u0092\u00a1\u00a8\u00b4\u00c0"+
		"\u00c5\u00d0\u00df";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}