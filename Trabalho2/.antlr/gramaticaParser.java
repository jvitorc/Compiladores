// Generated from /data/UFSC/COMPILA/Compiladores/Trabalho2/gramatica.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class gramaticaParser extends Parser {
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
	public static final int
		RULE_program = 0, RULE_funclist = 1, RULE_funcdef = 2, RULE_a = 3, RULE_paramlist = 4, 
		RULE_statement = 5, RULE_b = 6, RULE_vardecl = 7, RULE_c = 8, RULE_atribstat = 9, 
		RULE_funccall = 10, RULE_paramlistcall = 11, RULE_printstat = 12, RULE_readstat = 13, 
		RULE_returnstat = 14, RULE_ifstat = 15, RULE_forstat = 16, RULE_statelist = 17, 
		RULE_d = 18, RULE_allocexpression = 19, RULE_comparadores = 20, RULE_expression = 21, 
		RULE_maisoumenos = 22, RULE_e = 23, RULE_numexpression = 24, RULE_mdm = 25, 
		RULE_f = 26, RULE_term = 27, RULE_unaryexpr = 28, RULE_factor = 29, RULE_g = 30, 
		RULE_lvalue = 31;
	public static final String[] ruleNames = {
		"program", "funclist", "funcdef", "a", "paramlist", "statement", "b", 
		"vardecl", "c", "atribstat", "funccall", "paramlistcall", "printstat", 
		"readstat", "returnstat", "ifstat", "forstat", "statelist", "d", "allocexpression", 
		"comparadores", "expression", "maisoumenos", "e", "numexpression", "mdm", 
		"f", "term", "unaryexpr", "factor", "g", "lvalue"
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

	@Override
	public String getGrammarFileName() { return "gramatica.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public gramaticaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgramContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public FunclistContext funclist() {
			return getRuleContext(FunclistContext.class,0);
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
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STRING:
			case FLOAT:
			case BREAK:
			case PRINT:
			case CHAVEA:
			case READ:
			case RETURN:
			case IF:
			case FOR:
			case PONTOEVIRGULA:
			case IDENT:
				enterOuterAlt(_localctx, 1);
				{
				setState(64);
				statement();
				}
				break;
			case DEF:
				enterOuterAlt(_localctx, 2);
				{
				setState(65);
				funclist();
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 3);
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

	public static class FunclistContext extends ParserRuleContext {
		public FuncdefContext funcdef() {
			return getRuleContext(FuncdefContext.class,0);
		}
		public FunclistContext funclist() {
			return getRuleContext(FunclistContext.class,0);
		}
		public FunclistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funclist; }
	}

	public final FunclistContext funclist() throws RecognitionException {
		FunclistContext _localctx = new FunclistContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_funclist);
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				funcdef();
				setState(70);
				funclist();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(72);
				funcdef();
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

	public static class FuncdefContext extends ParserRuleContext {
		public TerminalNode DEF() { return getToken(gramaticaParser.DEF, 0); }
		public TerminalNode IDENT() { return getToken(gramaticaParser.IDENT, 0); }
		public TerminalNode PARENTEA() { return getToken(gramaticaParser.PARENTEA, 0); }
		public ParamlistContext paramlist() {
			return getRuleContext(ParamlistContext.class,0);
		}
		public TerminalNode PARENTEF() { return getToken(gramaticaParser.PARENTEF, 0); }
		public TerminalNode CHAVEA() { return getToken(gramaticaParser.CHAVEA, 0); }
		public StatelistContext statelist() {
			return getRuleContext(StatelistContext.class,0);
		}
		public TerminalNode CHAVEF() { return getToken(gramaticaParser.CHAVEF, 0); }
		public FuncdefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdef; }
	}

	public final FuncdefContext funcdef() throws RecognitionException {
		FuncdefContext _localctx = new FuncdefContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_funcdef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(DEF);
			setState(76);
			match(IDENT);
			setState(77);
			match(PARENTEA);
			setState(78);
			paramlist();
			setState(79);
			match(PARENTEF);
			setState(80);
			match(CHAVEA);
			setState(81);
			statelist();
			setState(82);
			match(CHAVEF);
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
		public  value;
		public TerminalNode INT() { return getToken(gramaticaParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(gramaticaParser.FLOAT, 0); }
		public TerminalNode STRING() { return getToken(gramaticaParser.STRING, 0); }
		public AContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_a; }
	}

	public final AContext a() throws RecognitionException {
		AContext _localctx = new AContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_a);
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(84);
				match(INT);
				_localctx.value = 'int'
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(86);
				match(FLOAT);
				_localctx.value = 'float'
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(88);
				match(STRING);
				_localctx.value = 'string'
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

	public static class ParamlistContext extends ParserRuleContext {
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(gramaticaParser.IDENT, 0); }
		public TerminalNode VIRGULA() { return getToken(gramaticaParser.VIRGULA, 0); }
		public ParamlistContext paramlist() {
			return getRuleContext(ParamlistContext.class,0);
		}
		public ParamlistContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramlist; }
	}

	public final ParamlistContext paramlist() throws RecognitionException {
		ParamlistContext _localctx = new ParamlistContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_paramlist);
		try {
			setState(100);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				a();
				setState(93);
				match(IDENT);
				setState(94);
				match(VIRGULA);
				setState(95);
				paramlist();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(97);
				a();
				setState(98);
				match(IDENT);
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

	public static class StatementContext extends ParserRuleContext {
		public VardeclContext vardecl() {
			return getRuleContext(VardeclContext.class,0);
		}
		public TerminalNode PONTOEVIRGULA() { return getToken(gramaticaParser.PONTOEVIRGULA, 0); }
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
		public TerminalNode CHAVEA() { return getToken(gramaticaParser.CHAVEA, 0); }
		public StatelistContext statelist() {
			return getRuleContext(StatelistContext.class,0);
		}
		public TerminalNode CHAVEF() { return getToken(gramaticaParser.CHAVEF, 0); }
		public TerminalNode BREAK() { return getToken(gramaticaParser.BREAK, 0); }
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STRING:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(102);
				vardecl();
				setState(103);
				match(PONTOEVIRGULA);
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				atribstat();
				setState(106);
				match(PONTOEVIRGULA);
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				printstat();
				setState(109);
				match(PONTOEVIRGULA);
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 4);
				{
				setState(111);
				readstat();
				setState(112);
				match(PONTOEVIRGULA);
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(114);
				returnstat();
				setState(115);
				match(PONTOEVIRGULA);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 6);
				{
				setState(117);
				ifstat();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 7);
				{
				setState(118);
				forstat();
				}
				break;
			case CHAVEA:
				enterOuterAlt(_localctx, 8);
				{
				setState(119);
				match(CHAVEA);
				setState(120);
				statelist();
				setState(121);
				match(CHAVEF);
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 9);
				{
				setState(123);
				match(BREAK);
				setState(124);
				match(PONTOEVIRGULA);
				}
				break;
			case PONTOEVIRGULA:
				enterOuterAlt(_localctx, 10);
				{
				setState(125);
				match(PONTOEVIRGULA);
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

	public static class BContext extends ParserRuleContext {
		public  inhr;
		public  syn;
		public Token INT_CONSTANT;
		public BContext b;
		public TerminalNode COLCHA() { return getToken(gramaticaParser.COLCHA, 0); }
		public TerminalNode INT_CONSTANT() { return getToken(gramaticaParser.INT_CONSTANT, 0); }
		public TerminalNode COLCHF() { return getToken(gramaticaParser.COLCHF, 0); }
		public BContext b() {
			return getRuleContext(BContext.class,0);
		}
		public BContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public BContext(ParserRuleContext parent, int invokingState,  inhr) {
			super(parent, invokingState);
			this.inhr = inhr;
		}
		@Override public int getRuleIndex() { return RULE_b; }
	}

	public final BContext b( inhr) throws RecognitionException {
		BContext _localctx = new BContext(_ctx, getState(), inhr);
		enterRule(_localctx, 12, RULE_b);
		try {
			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLCHA:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				match(COLCHA);
				setState(129);
				((BContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				setState(130);
				match(COLCHF);
				setState(131);
				((BContext)_localctx).b = b("vector(%s, %s)" %(_localctx.inhr, (((BContext)_localctx).INT_CONSTANT!=null?((BContext)_localctx).INT_CONSTANT.getText():null)));
				_localctx.syn = ((BContext)_localctx).b.syn
				}
				break;
			case PONTOEVIRGULA:
				enterOuterAlt(_localctx, 2);
				{
				_localctx.syn = _localctx.inhr
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
		public AContext a;
		public Token IDENT;
		public BContext b;
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(gramaticaParser.IDENT, 0); }
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
		enterRule(_localctx, 14, RULE_vardecl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			((VardeclContext)_localctx).a = a();
			setState(138);
			((VardeclContext)_localctx).IDENT = match(IDENT);
			setState(139);
			((VardeclContext)_localctx).b = b(((VardeclContext)_localctx).a.value);
			insert_symbol_table((((VardeclContext)_localctx).IDENT!=null?((VardeclContext)_localctx).IDENT.getText():null), ((VardeclContext)_localctx).b.syn)
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
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AllocexpressionContext allocexpression() {
			return getRuleContext(AllocexpressionContext.class,0);
		}
		public FunccallContext funccall() {
			return getRuleContext(FunccallContext.class,0);
		}
		public CContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_c; }
	}

	public final CContext c() throws RecognitionException {
		CContext _localctx = new CContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_c);
		try {
			setState(145);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(142);
				expression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				allocexpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(144);
				funccall();
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
		public TerminalNode ATRIBUICAO() { return getToken(gramaticaParser.ATRIBUICAO, 0); }
		public CContext c() {
			return getRuleContext(CContext.class,0);
		}
		public AtribstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribstat; }
	}

	public final AtribstatContext atribstat() throws RecognitionException {
		AtribstatContext _localctx = new AtribstatContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_atribstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147);
			lvalue();
			setState(148);
			match(ATRIBUICAO);
			setState(149);
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

	public static class FunccallContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(gramaticaParser.IDENT, 0); }
		public TerminalNode PARENTEA() { return getToken(gramaticaParser.PARENTEA, 0); }
		public ParamlistcallContext paramlistcall() {
			return getRuleContext(ParamlistcallContext.class,0);
		}
		public TerminalNode PARENTEF() { return getToken(gramaticaParser.PARENTEF, 0); }
		public FunccallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funccall; }
	}

	public final FunccallContext funccall() throws RecognitionException {
		FunccallContext _localctx = new FunccallContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funccall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(151);
			match(IDENT);
			setState(152);
			match(PARENTEA);
			setState(153);
			paramlistcall();
			setState(154);
			match(PARENTEF);
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

	public static class ParamlistcallContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(gramaticaParser.IDENT, 0); }
		public TerminalNode VIRGULA() { return getToken(gramaticaParser.VIRGULA, 0); }
		public ParamlistcallContext paramlistcall() {
			return getRuleContext(ParamlistcallContext.class,0);
		}
		public ParamlistcallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paramlistcall; }
	}

	public final ParamlistcallContext paramlistcall() throws RecognitionException {
		ParamlistcallContext _localctx = new ParamlistcallContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_paramlistcall);
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(156);
				match(IDENT);
				setState(157);
				match(VIRGULA);
				setState(158);
				paramlistcall();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(IDENT);
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

	public static class PrintstatContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(gramaticaParser.PRINT, 0); }
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
		enterRule(_localctx, 24, RULE_printstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(PRINT);
			setState(164);
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
		public TerminalNode READ() { return getToken(gramaticaParser.READ, 0); }
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
		enterRule(_localctx, 26, RULE_readstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(READ);
			setState(167);
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
		public TerminalNode RETURN() { return getToken(gramaticaParser.RETURN, 0); }
		public ReturnstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnstat; }
	}

	public final ReturnstatContext returnstat() throws RecognitionException {
		ReturnstatContext _localctx = new ReturnstatContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_returnstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
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
		public TerminalNode IF() { return getToken(gramaticaParser.IF, 0); }
		public TerminalNode PARENTEA() { return getToken(gramaticaParser.PARENTEA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PARENTEF() { return getToken(gramaticaParser.PARENTEF, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public IfstatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifstat; }
	}

	public final IfstatContext ifstat() throws RecognitionException {
		IfstatContext _localctx = new IfstatContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_ifstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(IF);
			setState(172);
			match(PARENTEA);
			setState(173);
			expression();
			setState(174);
			match(PARENTEF);
			setState(175);
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

	public static class ForstatContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(gramaticaParser.FOR, 0); }
		public TerminalNode PARENTEA() { return getToken(gramaticaParser.PARENTEA, 0); }
		public List<AtribstatContext> atribstat() {
			return getRuleContexts(AtribstatContext.class);
		}
		public AtribstatContext atribstat(int i) {
			return getRuleContext(AtribstatContext.class,i);
		}
		public List<TerminalNode> PONTOEVIRGULA() { return getTokens(gramaticaParser.PONTOEVIRGULA); }
		public TerminalNode PONTOEVIRGULA(int i) {
			return getToken(gramaticaParser.PONTOEVIRGULA, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PARENTEF() { return getToken(gramaticaParser.PARENTEF, 0); }
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
		enterRule(_localctx, 32, RULE_forstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			match(FOR);
			setState(178);
			match(PARENTEA);
			setState(179);
			atribstat();
			setState(180);
			match(PONTOEVIRGULA);
			setState(181);
			expression();
			setState(182);
			match(PONTOEVIRGULA);
			setState(183);
			atribstat();
			setState(184);
			match(PARENTEF);
			setState(185);
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
		enterRule(_localctx, 34, RULE_statelist);
		try {
			setState(191);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(187);
				statement();
				setState(188);
				statelist();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
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

	public static class DContext extends ParserRuleContext {
		public TerminalNode CHAVEA() { return getToken(gramaticaParser.CHAVEA, 0); }
		public NumexpressionContext numexpression() {
			return getRuleContext(NumexpressionContext.class,0);
		}
		public TerminalNode CHAVEF() { return getToken(gramaticaParser.CHAVEF, 0); }
		public DContext d() {
			return getRuleContext(DContext.class,0);
		}
		public DContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_d; }
	}

	public final DContext d() throws RecognitionException {
		DContext _localctx = new DContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_d);
		try {
			setState(202);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(CHAVEA);
				setState(194);
				numexpression();
				setState(195);
				match(CHAVEF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(197);
				match(CHAVEA);
				setState(198);
				numexpression();
				setState(199);
				match(CHAVEF);
				setState(200);
				d();
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
		public TerminalNode NEW() { return getToken(gramaticaParser.NEW, 0); }
		public AContext a() {
			return getRuleContext(AContext.class,0);
		}
		public DContext d() {
			return getRuleContext(DContext.class,0);
		}
		public AllocexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allocexpression; }
	}

	public final AllocexpressionContext allocexpression() throws RecognitionException {
		AllocexpressionContext _localctx = new AllocexpressionContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_allocexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(204);
			match(NEW);
			setState(205);
			a();
			setState(206);
			d();
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

	public static class ComparadoresContext extends ParserRuleContext {
		public TerminalNode MENORQUE() { return getToken(gramaticaParser.MENORQUE, 0); }
		public TerminalNode MAIORQUE() { return getToken(gramaticaParser.MAIORQUE, 0); }
		public TerminalNode MENOREIGUAL() { return getToken(gramaticaParser.MENOREIGUAL, 0); }
		public TerminalNode MAIOREIGUAL() { return getToken(gramaticaParser.MAIOREIGUAL, 0); }
		public TerminalNode IGUAL() { return getToken(gramaticaParser.IGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(gramaticaParser.DIFERENTE, 0); }
		public ComparadoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparadores; }
	}

	public final ComparadoresContext comparadores() throws RecognitionException {
		ComparadoresContext _localctx = new ComparadoresContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_comparadores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(208);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MENORQUE) | (1L << MAIORQUE) | (1L << MENOREIGUAL) | (1L << MAIOREIGUAL) | (1L << IGUAL) | (1L << DIFERENTE))) != 0)) ) {
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

	public static class ExpressionContext extends ParserRuleContext {
		public List<NumexpressionContext> numexpression() {
			return getRuleContexts(NumexpressionContext.class);
		}
		public NumexpressionContext numexpression(int i) {
			return getRuleContext(NumexpressionContext.class,i);
		}
		public ComparadoresContext comparadores() {
			return getRuleContext(ComparadoresContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expression);
		try {
			setState(215);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				numexpression();
				setState(211);
				comparadores();
				setState(212);
				numexpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(214);
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

	public static class MaisoumenosContext extends ParserRuleContext {
		public  value;
		public Token MAIS;
		public Token MENOS;
		public TerminalNode MAIS() { return getToken(gramaticaParser.MAIS, 0); }
		public TerminalNode MENOS() { return getToken(gramaticaParser.MENOS, 0); }
		public MaisoumenosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_maisoumenos; }
	}

	public final MaisoumenosContext maisoumenos() throws RecognitionException {
		MaisoumenosContext _localctx = new MaisoumenosContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_maisoumenos);
		try {
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				((MaisoumenosContext)_localctx).MAIS = match(MAIS);
				_localctx.value = (((MaisoumenosContext)_localctx).MAIS!=null?((MaisoumenosContext)_localctx).MAIS.getText():null)
				}
				break;
			case MENOS:
				enterOuterAlt(_localctx, 2);
				{
				setState(219);
				((MaisoumenosContext)_localctx).MENOS = match(MENOS);
				_localctx.value = (((MaisoumenosContext)_localctx).MENOS!=null?((MaisoumenosContext)_localctx).MENOS.getText():null)
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

	public static class EContext extends ParserRuleContext {
		public  inhr;
		public  syn;
		public MaisoumenosContext maisoumenos;
		public TermContext term;
		public EContext e;
		public MaisoumenosContext maisoumenos() {
			return getRuleContext(MaisoumenosContext.class,0);
		}
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public EContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public EContext(ParserRuleContext parent, int invokingState,  inhr) {
			super(parent, invokingState);
			this.inhr = inhr;
		}
		@Override public int getRuleIndex() { return RULE_e; }
	}

	public final EContext e( inhr) throws RecognitionException {
		EContext _localctx = new EContext(_ctx, getState(), inhr);
		enterRule(_localctx, 46, RULE_e);
		try {
			setState(229);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAIS:
			case MENOS:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				((EContext)_localctx).maisoumenos = maisoumenos();
				setState(224);
				((EContext)_localctx).term = term();
				setState(225);
				((EContext)_localctx).e = e(Node(((EContext)_localctx).maisoumenos.value, _localctx.inhr, ((EContext)_localctx).term.node));
				_localctx.syn = ((EContext)_localctx).e.syn
				}
				break;
			case CHAVEF:
			case COLCHF:
			case PARENTEF:
			case PONTOEVIRGULA:
			case MENORQUE:
			case MAIORQUE:
			case MENOREIGUAL:
			case MAIOREIGUAL:
			case IGUAL:
			case DIFERENTE:
				enterOuterAlt(_localctx, 2);
				{
				_localctx.syn = _localctx.inhr
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

	public static class NumexpressionContext extends ParserRuleContext {
		public $ node;
		public TermContext term;
		public EContext e;
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public EContext e() {
			return getRuleContext(EContext.class,0);
		}
		public NumexpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numexpression; }
	}

	public final NumexpressionContext numexpression() throws RecognitionException {
		NumexpressionContext _localctx = new NumexpressionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_numexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			((NumexpressionContext)_localctx).term = term();
			setState(232);
			((NumexpressionContext)_localctx).e = e(((NumexpressionContext)_localctx).term.node);
			_localctx.node = ((NumexpressionContext)_localctx).term.node
			insert_expression_table(((NumexpressionContext)_localctx).e.syn.pre_order([]))
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

	public static class MdmContext extends ParserRuleContext {
		public  value;
		public Token MULTIPLICACAO;
		public Token DIVISAO;
		public Token MODULO;
		public TerminalNode MULTIPLICACAO() { return getToken(gramaticaParser.MULTIPLICACAO, 0); }
		public TerminalNode DIVISAO() { return getToken(gramaticaParser.DIVISAO, 0); }
		public TerminalNode MODULO() { return getToken(gramaticaParser.MODULO, 0); }
		public MdmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mdm; }
	}

	public final MdmContext mdm() throws RecognitionException {
		MdmContext _localctx = new MdmContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_mdm);
		try {
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULTIPLICACAO:
				enterOuterAlt(_localctx, 1);
				{
				setState(236);
				((MdmContext)_localctx).MULTIPLICACAO = match(MULTIPLICACAO);
				_localctx.value = (((MdmContext)_localctx).MULTIPLICACAO!=null?((MdmContext)_localctx).MULTIPLICACAO.getText():null)
				}
				break;
			case DIVISAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(238);
				((MdmContext)_localctx).DIVISAO = match(DIVISAO);
				_localctx.value = (((MdmContext)_localctx).DIVISAO!=null?((MdmContext)_localctx).DIVISAO.getText():null)
				}
				break;
			case MODULO:
				enterOuterAlt(_localctx, 3);
				{
				setState(240);
				((MdmContext)_localctx).MODULO = match(MODULO);
				_localctx.value = (((MdmContext)_localctx).MODULO!=null?((MdmContext)_localctx).MODULO.getText():null)
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

	public static class FContext extends ParserRuleContext {
		public  inhr;
		public  syn;
		public MdmContext mdm;
		public UnaryexprContext unaryexpr;
		public FContext f;
		public MdmContext mdm() {
			return getRuleContext(MdmContext.class,0);
		}
		public UnaryexprContext unaryexpr() {
			return getRuleContext(UnaryexprContext.class,0);
		}
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public FContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public FContext(ParserRuleContext parent, int invokingState,  inhr) {
			super(parent, invokingState);
			this.inhr = inhr;
		}
		@Override public int getRuleIndex() { return RULE_f; }
	}

	public final FContext f( inhr) throws RecognitionException {
		FContext _localctx = new FContext(_ctx, getState(), inhr);
		enterRule(_localctx, 52, RULE_f);
		try {
			setState(250);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULTIPLICACAO:
			case DIVISAO:
			case MODULO:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				((FContext)_localctx).mdm = mdm();
				setState(245);
				((FContext)_localctx).unaryexpr = unaryexpr();
				setState(246);
				((FContext)_localctx).f = f(Node(((FContext)_localctx).mdm.value, _localctx.inhr, ((FContext)_localctx).unaryexpr.node));
				_localctx.syn = ((FContext)_localctx).f.syn
				}
				break;
			case CHAVEF:
			case COLCHF:
			case PARENTEF:
			case PONTOEVIRGULA:
			case MENORQUE:
			case MAIORQUE:
			case MENOREIGUAL:
			case MAIOREIGUAL:
			case IGUAL:
			case DIFERENTE:
			case MAIS:
			case MENOS:
				enterOuterAlt(_localctx, 2);
				{
				_localctx.syn = _localctx.inhr
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

	public static class TermContext extends ParserRuleContext {
		public  node;
		public UnaryexprContext unaryexpr;
		public FContext f;
		public UnaryexprContext unaryexpr() {
			return getRuleContext(UnaryexprContext.class,0);
		}
		public FContext f() {
			return getRuleContext(FContext.class,0);
		}
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
	}

	public final TermContext term() throws RecognitionException {
		TermContext _localctx = new TermContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			((TermContext)_localctx).unaryexpr = unaryexpr();
			setState(253);
			((TermContext)_localctx).f = f(((TermContext)_localctx).unaryexpr.node);
			_localctx.node = ((TermContext)_localctx).f.syn
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
		public  node;
		public MaisoumenosContext maisoumenos;
		public FactorContext factor;
		public MaisoumenosContext maisoumenos() {
			return getRuleContext(MaisoumenosContext.class,0);
		}
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
		enterRule(_localctx, 56, RULE_unaryexpr);
		try {
			setState(263);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAIS:
			case MENOS:
				enterOuterAlt(_localctx, 1);
				{
				setState(256);
				((UnaryexprContext)_localctx).maisoumenos = maisoumenos();
				setState(257);
				((UnaryexprContext)_localctx).factor = factor();
				_localctx.node = Node(((UnaryexprContext)_localctx).maisoumenos.value, right=((UnaryexprContext)_localctx).factor.node)
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
				setState(260);
				((UnaryexprContext)_localctx).factor = factor();
				_localctx.node = ((UnaryexprContext)_localctx).factor.node
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
		public  node;
		public Token INT_CONSTANT;
		public Token FLOAT_CONSTANT;
		public Token STRING_CONSTANT;
		public Token NULL;
		public LvalueContext lvalue;
		public NumexpressionContext numexpression;
		public TerminalNode INT_CONSTANT() { return getToken(gramaticaParser.INT_CONSTANT, 0); }
		public TerminalNode FLOAT_CONSTANT() { return getToken(gramaticaParser.FLOAT_CONSTANT, 0); }
		public TerminalNode STRING_CONSTANT() { return getToken(gramaticaParser.STRING_CONSTANT, 0); }
		public TerminalNode NULL() { return getToken(gramaticaParser.NULL, 0); }
		public LvalueContext lvalue() {
			return getRuleContext(LvalueContext.class,0);
		}
		public TerminalNode PARENTEA() { return getToken(gramaticaParser.PARENTEA, 0); }
		public NumexpressionContext numexpression() {
			return getRuleContext(NumexpressionContext.class,0);
		}
		public TerminalNode PARENTEF() { return getToken(gramaticaParser.PARENTEF, 0); }
		public FactorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_factor; }
	}

	public final FactorContext factor() throws RecognitionException {
		FactorContext _localctx = new FactorContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_factor);
		try {
			setState(281);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(265);
				((FactorContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				_localctx.node = Leaf('INT_CONSTANT', (((FactorContext)_localctx).INT_CONSTANT!=null?((FactorContext)_localctx).INT_CONSTANT.getText():null)) 
				}
				break;
			case FLOAT_CONSTANT:
				enterOuterAlt(_localctx, 2);
				{
				setState(267);
				((FactorContext)_localctx).FLOAT_CONSTANT = match(FLOAT_CONSTANT);
				_localctx.node = Leaf('FLOAT_CONSTANT', (((FactorContext)_localctx).FLOAT_CONSTANT!=null?((FactorContext)_localctx).FLOAT_CONSTANT.getText():null))
				}
				break;
			case STRING_CONSTANT:
				enterOuterAlt(_localctx, 3);
				{
				setState(269);
				((FactorContext)_localctx).STRING_CONSTANT = match(STRING_CONSTANT);
				_localctx.node = Leaf('STRING_CONSTANT', (((FactorContext)_localctx).STRING_CONSTANT!=null?((FactorContext)_localctx).STRING_CONSTANT.getText():null))
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(271);
				((FactorContext)_localctx).NULL = match(NULL);
				_localctx.node = Leaf('NULL.type', (((FactorContext)_localctx).NULL!=null?((FactorContext)_localctx).NULL.getText():null))
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(273);
				((FactorContext)_localctx).lvalue = lvalue();
				_localctx.node = ((FactorContext)_localctx).lvalue.node
				}
				break;
			case PARENTEA:
				enterOuterAlt(_localctx, 6);
				{
				setState(276);
				match(PARENTEA);
				setState(277);
				((FactorContext)_localctx).numexpression = numexpression();
				_localctx.node = ((FactorContext)_localctx).numexpression.node
				setState(279);
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

	public static class GContext extends ParserRuleContext {
		public TerminalNode COLCHA() { return getToken(gramaticaParser.COLCHA, 0); }
		public NumexpressionContext numexpression() {
			return getRuleContext(NumexpressionContext.class,0);
		}
		public TerminalNode COLCHF() { return getToken(gramaticaParser.COLCHF, 0); }
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
		enterRule(_localctx, 60, RULE_g);
		try {
			setState(289);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLCHA:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				match(COLCHA);
				setState(284);
				numexpression();
				setState(285);
				match(COLCHF);
				setState(286);
				g();
				}
				break;
			case ATRIBUICAO:
			case CHAVEF:
			case COLCHF:
			case PARENTEF:
			case PONTOEVIRGULA:
			case MENORQUE:
			case MAIORQUE:
			case MENOREIGUAL:
			case MAIOREIGUAL:
			case IGUAL:
			case DIFERENTE:
			case MAIS:
			case MENOS:
			case MULTIPLICACAO:
			case DIVISAO:
			case MODULO:
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

	public static class LvalueContext extends ParserRuleContext {
		public  node;
		public Token IDENT;
		public TerminalNode IDENT() { return getToken(gramaticaParser.IDENT, 0); }
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
		enterRule(_localctx, 62, RULE_lvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(291);
			((LvalueContext)_localctx).IDENT = match(IDENT);
			_localctx.node = Leaf('IDENT', (((LvalueContext)_localctx).IDENT!=null?((LvalueContext)_localctx).IDENT.getText():null))
			setState(293);
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u012a\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\3\2\3\2\3\2\5\2F\n\2\3\3\3\3\3\3\3\3\5\3L\n\3\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5]\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\5\6g\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0081\n\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\b\u008a\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\5\n"+
		"\u0094\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u00a4\n\r\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\5\23\u00c2\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\5\24\u00cd\n\24\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27"+
		"\3\27\5\27\u00da\n\27\3\30\3\30\3\30\3\30\5\30\u00e0\n\30\3\31\3\31\3"+
		"\31\3\31\3\31\3\31\5\31\u00e8\n\31\3\32\3\32\3\32\3\32\3\32\3\33\3\33"+
		"\3\33\3\33\3\33\3\33\5\33\u00f5\n\33\3\34\3\34\3\34\3\34\3\34\3\34\5\34"+
		"\u00fd\n\34\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36"+
		"\u010a\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\5\37\u011c\n\37\3 \3 \3 \3 \3 \3 \5 \u0124\n \3!"+
		"\3!\3!\3!\3!\2\2\"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@\2\3\3\2\31\36\2\u012c\2E\3\2\2\2\4K\3\2\2\2\6M\3\2\2\2"+
		"\b\\\3\2\2\2\nf\3\2\2\2\f\u0080\3\2\2\2\16\u0089\3\2\2\2\20\u008b\3\2"+
		"\2\2\22\u0093\3\2\2\2\24\u0095\3\2\2\2\26\u0099\3\2\2\2\30\u00a3\3\2\2"+
		"\2\32\u00a5\3\2\2\2\34\u00a8\3\2\2\2\36\u00ab\3\2\2\2 \u00ad\3\2\2\2\""+
		"\u00b3\3\2\2\2$\u00c1\3\2\2\2&\u00cc\3\2\2\2(\u00ce\3\2\2\2*\u00d2\3\2"+
		"\2\2,\u00d9\3\2\2\2.\u00df\3\2\2\2\60\u00e7\3\2\2\2\62\u00e9\3\2\2\2\64"+
		"\u00f4\3\2\2\2\66\u00fc\3\2\2\28\u00fe\3\2\2\2:\u0109\3\2\2\2<\u011b\3"+
		"\2\2\2>\u0123\3\2\2\2@\u0125\3\2\2\2BF\5\f\7\2CF\5\4\3\2DF\3\2\2\2EB\3"+
		"\2\2\2EC\3\2\2\2ED\3\2\2\2F\3\3\2\2\2GH\5\6\4\2HI\5\4\3\2IL\3\2\2\2JL"+
		"\5\6\4\2KG\3\2\2\2KJ\3\2\2\2L\5\3\2\2\2MN\7\3\2\2NO\7$\2\2OP\7\20\2\2"+
		"PQ\5\n\6\2QR\7\21\2\2RS\7\n\2\2ST\5$\23\2TU\7\13\2\2U\7\3\2\2\2VW\7\4"+
		"\2\2W]\b\5\1\2XY\7\6\2\2Y]\b\5\1\2Z[\7\5\2\2[]\b\5\1\2\\V\3\2\2\2\\X\3"+
		"\2\2\2\\Z\3\2\2\2]\t\3\2\2\2^_\5\b\5\2_`\7$\2\2`a\7\27\2\2ab\5\n\6\2b"+
		"g\3\2\2\2cd\5\b\5\2de\7$\2\2eg\3\2\2\2f^\3\2\2\2fc\3\2\2\2g\13\3\2\2\2"+
		"hi\5\20\t\2ij\7\30\2\2j\u0081\3\2\2\2kl\5\24\13\2lm\7\30\2\2m\u0081\3"+
		"\2\2\2no\5\32\16\2op\7\30\2\2p\u0081\3\2\2\2qr\5\34\17\2rs\7\30\2\2s\u0081"+
		"\3\2\2\2tu\5\36\20\2uv\7\30\2\2v\u0081\3\2\2\2w\u0081\5 \21\2x\u0081\5"+
		"\"\22\2yz\7\n\2\2z{\5$\23\2{|\7\13\2\2|\u0081\3\2\2\2}~\7\7\2\2~\u0081"+
		"\7\30\2\2\177\u0081\7\30\2\2\u0080h\3\2\2\2\u0080k\3\2\2\2\u0080n\3\2"+
		"\2\2\u0080q\3\2\2\2\u0080t\3\2\2\2\u0080w\3\2\2\2\u0080x\3\2\2\2\u0080"+
		"y\3\2\2\2\u0080}\3\2\2\2\u0080\177\3\2\2\2\u0081\r\3\2\2\2\u0082\u0083"+
		"\7\f\2\2\u0083\u0084\7%\2\2\u0084\u0085\7\r\2\2\u0085\u0086\5\16\b\2\u0086"+
		"\u0087\b\b\1\2\u0087\u008a\3\2\2\2\u0088\u008a\b\b\1\2\u0089\u0082\3\2"+
		"\2\2\u0089\u0088\3\2\2\2\u008a\17\3\2\2\2\u008b\u008c\5\b\5\2\u008c\u008d"+
		"\7$\2\2\u008d\u008e\5\16\b\2\u008e\u008f\b\t\1\2\u008f\21\3\2\2\2\u0090"+
		"\u0094\5,\27\2\u0091\u0094\5(\25\2\u0092\u0094\5\26\f\2\u0093\u0090\3"+
		"\2\2\2\u0093\u0091\3\2\2\2\u0093\u0092\3\2\2\2\u0094\23\3\2\2\2\u0095"+
		"\u0096\5@!\2\u0096\u0097\7\b\2\2\u0097\u0098\5\22\n\2\u0098\25\3\2\2\2"+
		"\u0099\u009a\7$\2\2\u009a\u009b\7\20\2\2\u009b\u009c\5\30\r\2\u009c\u009d"+
		"\7\21\2\2\u009d\27\3\2\2\2\u009e\u009f\7$\2\2\u009f\u00a0\7\27\2\2\u00a0"+
		"\u00a4\5\30\r\2\u00a1\u00a4\7$\2\2\u00a2\u00a4\3\2\2\2\u00a3\u009e\3\2"+
		"\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2\3\2\2\2\u00a4\31\3\2\2\2\u00a5\u00a6"+
		"\7\t\2\2\u00a6\u00a7\5,\27\2\u00a7\33\3\2\2\2\u00a8\u00a9\7\16\2\2\u00a9"+
		"\u00aa\5@!\2\u00aa\35\3\2\2\2\u00ab\u00ac\7\17\2\2\u00ac\37\3\2\2\2\u00ad"+
		"\u00ae\7\22\2\2\u00ae\u00af\7\20\2\2\u00af\u00b0\5,\27\2\u00b0\u00b1\7"+
		"\21\2\2\u00b1\u00b2\5\f\7\2\u00b2!\3\2\2\2\u00b3\u00b4\7\24\2\2\u00b4"+
		"\u00b5\7\20\2\2\u00b5\u00b6\5\24\13\2\u00b6\u00b7\7\30\2\2\u00b7\u00b8"+
		"\5,\27\2\u00b8\u00b9\7\30\2\2\u00b9\u00ba\5\24\13\2\u00ba\u00bb\7\21\2"+
		"\2\u00bb\u00bc\5\f\7\2\u00bc#\3\2\2\2\u00bd\u00be\5\f\7\2\u00be\u00bf"+
		"\5$\23\2\u00bf\u00c2\3\2\2\2\u00c0\u00c2\5\f\7\2\u00c1\u00bd\3\2\2\2\u00c1"+
		"\u00c0\3\2\2\2\u00c2%\3\2\2\2\u00c3\u00c4\7\n\2\2\u00c4\u00c5\5\62\32"+
		"\2\u00c5\u00c6\7\13\2\2\u00c6\u00cd\3\2\2\2\u00c7\u00c8\7\n\2\2\u00c8"+
		"\u00c9\5\62\32\2\u00c9\u00ca\7\13\2\2\u00ca\u00cb\5&\24\2\u00cb\u00cd"+
		"\3\2\2\2\u00cc\u00c3\3\2\2\2\u00cc\u00c7\3\2\2\2\u00cd\'\3\2\2\2\u00ce"+
		"\u00cf\7\26\2\2\u00cf\u00d0\5\b\5\2\u00d0\u00d1\5&\24\2\u00d1)\3\2\2\2"+
		"\u00d2\u00d3\t\2\2\2\u00d3+\3\2\2\2\u00d4\u00d5\5\62\32\2\u00d5\u00d6"+
		"\5*\26\2\u00d6\u00d7\5\62\32\2\u00d7\u00da\3\2\2\2\u00d8\u00da\5\62\32"+
		"\2\u00d9\u00d4\3\2\2\2\u00d9\u00d8\3\2\2\2\u00da-\3\2\2\2\u00db\u00dc"+
		"\7\37\2\2\u00dc\u00e0\b\30\1\2\u00dd\u00de\7 \2\2\u00de\u00e0\b\30\1\2"+
		"\u00df\u00db\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0/\3\2\2\2\u00e1\u00e2\5"+
		".\30\2\u00e2\u00e3\58\35\2\u00e3\u00e4\5\60\31\2\u00e4\u00e5\b\31\1\2"+
		"\u00e5\u00e8\3\2\2\2\u00e6\u00e8\b\31\1\2\u00e7\u00e1\3\2\2\2\u00e7\u00e6"+
		"\3\2\2\2\u00e8\61\3\2\2\2\u00e9\u00ea\58\35\2\u00ea\u00eb\5\60\31\2\u00eb"+
		"\u00ec\b\32\1\2\u00ec\u00ed\b\32\1\2\u00ed\63\3\2\2\2\u00ee\u00ef\7!\2"+
		"\2\u00ef\u00f5\b\33\1\2\u00f0\u00f1\7\"\2\2\u00f1\u00f5\b\33\1\2\u00f2"+
		"\u00f3\7#\2\2\u00f3\u00f5\b\33\1\2\u00f4\u00ee\3\2\2\2\u00f4\u00f0\3\2"+
		"\2\2\u00f4\u00f2\3\2\2\2\u00f5\65\3\2\2\2\u00f6\u00f7\5\64\33\2\u00f7"+
		"\u00f8\5:\36\2\u00f8\u00f9\5\66\34\2\u00f9\u00fa\b\34\1\2\u00fa\u00fd"+
		"\3\2\2\2\u00fb\u00fd\b\34\1\2\u00fc\u00f6\3\2\2\2\u00fc\u00fb\3\2\2\2"+
		"\u00fd\67\3\2\2\2\u00fe\u00ff\5:\36\2\u00ff\u0100\5\66\34\2\u0100\u0101"+
		"\b\35\1\2\u01019\3\2\2\2\u0102\u0103\5.\30\2\u0103\u0104\5<\37\2\u0104"+
		"\u0105\b\36\1\2\u0105\u010a\3\2\2\2\u0106\u0107\5<\37\2\u0107\u0108\b"+
		"\36\1\2\u0108\u010a\3\2\2\2\u0109\u0102\3\2\2\2\u0109\u0106\3\2\2\2\u010a"+
		";\3\2\2\2\u010b\u010c\7%\2\2\u010c\u011c\b\37\1\2\u010d\u010e\7&\2\2\u010e"+
		"\u011c\b\37\1\2\u010f\u0110\7\'\2\2\u0110\u011c\b\37\1\2\u0111\u0112\7"+
		"\25\2\2\u0112\u011c\b\37\1\2\u0113\u0114\5@!\2\u0114\u0115\b\37\1\2\u0115"+
		"\u011c\3\2\2\2\u0116\u0117\7\20\2\2\u0117\u0118\5\62\32\2\u0118\u0119"+
		"\b\37\1\2\u0119\u011a\7\21\2\2\u011a\u011c\3\2\2\2\u011b\u010b\3\2\2\2"+
		"\u011b\u010d\3\2\2\2\u011b\u010f\3\2\2\2\u011b\u0111\3\2\2\2\u011b\u0113"+
		"\3\2\2\2\u011b\u0116\3\2\2\2\u011c=\3\2\2\2\u011d\u011e\7\f\2\2\u011e"+
		"\u011f\5\62\32\2\u011f\u0120\7\r\2\2\u0120\u0121\5> \2\u0121\u0124\3\2"+
		"\2\2\u0122\u0124\3\2\2\2\u0123\u011d\3\2\2\2\u0123\u0122\3\2\2\2\u0124"+
		"?\3\2\2\2\u0125\u0126\7$\2\2\u0126\u0127\b!\1\2\u0127\u0128\5> \2\u0128"+
		"A\3\2\2\2\24EK\\f\u0080\u0089\u0093\u00a3\u00c1\u00cc\u00d9\u00df\u00e7"+
		"\u00f4\u00fc\u0109\u011b\u0123";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}