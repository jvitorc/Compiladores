// Generated from /data/UFSC/COMPILA/Compiladores/Trabalho2/gci/gramatica.g4 by ANTLR 4.7.1
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
		RULE_returnstat = 14, RULE_ifstat = 15, RULE_statement2 = 16, RULE_forstat = 17, 
		RULE_atribstat2 = 18, RULE_statelist = 19, RULE_d = 20, RULE_allocexpression = 21, 
		RULE_comparadores = 22, RULE_expression = 23, RULE_numexpression2 = 24, 
		RULE_maisoumenos = 25, RULE_e = 26, RULE_numexpression = 27, RULE_mdm = 28, 
		RULE_f = 29, RULE_term = 30, RULE_unaryexpr = 31, RULE_factor = 32, RULE_g = 33, 
		RULE_lvalue = 34;
	public static final String[] ruleNames = {
		"program", "funclist", "funcdef", "a", "paramlist", "statement", "b", 
		"vardecl", "c", "atribstat", "funccall", "paramlistcall", "printstat", 
		"readstat", "returnstat", "ifstat", "statement2", "forstat", "atribstat2", 
		"statelist", "d", "allocexpression", "comparadores", "expression", "numexpression2", 
		"maisoumenos", "e", "numexpression", "mdm", "f", "term", "unaryexpr", 
		"factor", "g", "lvalue"
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
		public  code;
		public  next;
		public StatementContext statement;
		public FunclistContext funclist;
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
			setState(82);
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
				_localctx.next = Label()
				setState(71);
				((ProgramContext)_localctx).statement = statement(_localctx.next);
				_localctx.code = ((ProgramContext)_localctx).statement.code + getLabel(_localctx.next)
				print(getCode(_localctx.code))
				}
				break;
			case DEF:
				enterOuterAlt(_localctx, 2);
				{
				_localctx.next = Label()
				setState(76);
				((ProgramContext)_localctx).funclist = funclist(_localctx.next);
				_localctx.code = ((ProgramContext)_localctx).funclist.code
				print(getCode(_localctx.code))
				}
				break;
			case EOF:
				enterOuterAlt(_localctx, 3);
				{
				_localctx.code = " "
				print(getCode(_localctx.code))
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
		public  next;
		public  code;
		public  begin;
		public FuncdefContext funcdef;
		public FunclistContext funclist;
		public FuncdefContext funcdef() {
			return getRuleContext(FuncdefContext.class,0);
		}
		public FunclistContext funclist() {
			return getRuleContext(FunclistContext.class,0);
		}
		public FunclistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public FunclistContext(ParserRuleContext parent, int invokingState,  next) {
			super(parent, invokingState);
			this.next = next;
		}
		@Override public int getRuleIndex() { return RULE_funclist; }
	}

	public final FunclistContext funclist( next) throws RecognitionException {
		FunclistContext _localctx = new FunclistContext(_ctx, getState(), next);
		enterRule(_localctx, 2, RULE_funclist);
		try {
			setState(93);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_localctx.begin = Label()
				setState(85);
				((FunclistContext)_localctx).funcdef = funcdef(_localctx.begin);
				setState(86);
				((FunclistContext)_localctx).funclist = funclist(_localctx.next);
				_localctx.code = ((FunclistContext)_localctx).funcdef.code + getLabel(_localctx.begin) + ((FunclistContext)_localctx).funclist.code
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_localctx.begin = Label()
				setState(90);
				((FunclistContext)_localctx).funcdef = funcdef(_localctx.next);
				_localctx.code = ((FunclistContext)_localctx).funcdef.code
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
		public  next;
		public  code;
		public Token IDENT;
		public StatelistContext statelist;
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
		public FuncdefContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public FuncdefContext(ParserRuleContext parent, int invokingState,  next) {
			super(parent, invokingState);
			this.next = next;
		}
		@Override public int getRuleIndex() { return RULE_funcdef; }
	}

	public final FuncdefContext funcdef( next) throws RecognitionException {
		FuncdefContext _localctx = new FuncdefContext(_ctx, getState(), next);
		enterRule(_localctx, 4, RULE_funcdef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(DEF);
			setState(96);
			((FuncdefContext)_localctx).IDENT = match(IDENT);
			setState(97);
			match(PARENTEA);
			setState(98);
			paramlist();
			setState(99);
			match(PARENTEF);
			setState(100);
			match(CHAVEA);
			setState(101);
			((FuncdefContext)_localctx).statelist = statelist(_localctx.next);
			setState(102);
			match(CHAVEF);
			_localctx.code = LabelFunc((((FuncdefContext)_localctx).IDENT!=null?((FuncdefContext)_localctx).IDENT.getText():null)) + ((FuncdefContext)_localctx).statelist.code
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
		public Token INT;
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
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				((AContext)_localctx).INT = match(INT);
				_localctx.value = (((AContext)_localctx).INT!=null?((AContext)_localctx).INT.getText():null)
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(FLOAT);
				_localctx.value = FLOAT.text
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(109);
				match(STRING);
				_localctx.value = STRING.text
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
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(113);
				a();
				setState(114);
				match(IDENT);
				setState(115);
				match(VIRGULA);
				setState(116);
				paramlist();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(118);
				a();
				setState(119);
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
		public  next;
		public  code;
		public AtribstatContext atribstat;
		public PrintstatContext printstat;
		public ReadstatContext readstat;
		public ReturnstatContext returnstat;
		public IfstatContext ifstat;
		public ForstatContext forstat;
		public StatelistContext statelist;
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
		public StatementContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StatementContext(ParserRuleContext parent, int invokingState,  next) {
			super(parent, invokingState);
			this.next = next;
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement( next) throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState(), next);
		enterRule(_localctx, 10, RULE_statement);
		try {
			setState(159);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case STRING:
			case FLOAT:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				vardecl();
				setState(124);
				match(PONTOEVIRGULA);
				_localctx.code = getNewLine()
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(127);
				((StatementContext)_localctx).atribstat = atribstat();
				setState(128);
				match(PONTOEVIRGULA);
				_localctx.code = ((StatementContext)_localctx).atribstat.code
				}
				break;
			case PRINT:
				enterOuterAlt(_localctx, 3);
				{
				setState(131);
				((StatementContext)_localctx).printstat = printstat();
				setState(132);
				match(PONTOEVIRGULA);
				_localctx.code = ((StatementContext)_localctx).printstat.code
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 4);
				{
				setState(135);
				((StatementContext)_localctx).readstat = readstat();
				setState(136);
				match(PONTOEVIRGULA);
				_localctx.code = ((StatementContext)_localctx).readstat.code
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 5);
				{
				setState(139);
				((StatementContext)_localctx).returnstat = returnstat();
				setState(140);
				match(PONTOEVIRGULA);
				_localctx.code = ((StatementContext)_localctx).returnstat.code
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 6);
				{
				setState(143);
				((StatementContext)_localctx).ifstat = ifstat(_localctx.next);
				_localctx.code = ((StatementContext)_localctx).ifstat.code
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 7);
				{
				setState(146);
				((StatementContext)_localctx).forstat = forstat(_localctx.next);
				_localctx.code = ((StatementContext)_localctx).forstat.code
				}
				break;
			case CHAVEA:
				enterOuterAlt(_localctx, 8);
				{
				setState(149);
				match(CHAVEA);
				setState(150);
				((StatementContext)_localctx).statelist = statelist(_localctx.next);
				setState(151);
				match(CHAVEF);
				_localctx.code = ((StatementContext)_localctx).statelist.code
				}
				break;
			case BREAK:
				enterOuterAlt(_localctx, 9);
				{
				setState(154);
				match(BREAK);
				setState(155);
				match(PONTOEVIRGULA);
				_localctx.code = "break" + getNewLine()
				}
				break;
			case PONTOEVIRGULA:
				enterOuterAlt(_localctx, 10);
				{
				setState(157);
				match(PONTOEVIRGULA);
				_localctx.code = getNewLine()
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
		public TerminalNode COLCHA() { return getToken(gramaticaParser.COLCHA, 0); }
		public TerminalNode INT_CONSTANT() { return getToken(gramaticaParser.INT_CONSTANT, 0); }
		public TerminalNode COLCHF() { return getToken(gramaticaParser.COLCHF, 0); }
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
		enterRule(_localctx, 12, RULE_b);
		try {
			setState(166);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLCHA:
				enterOuterAlt(_localctx, 1);
				{
				setState(161);
				match(COLCHA);
				setState(162);
				match(INT_CONSTANT);
				setState(163);
				match(COLCHF);
				setState(164);
				b();
				}
				break;
			case PONTOEVIRGULA:
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

	public static class VardeclContext extends ParserRuleContext {
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
			setState(168);
			a();
			setState(169);
			match(IDENT);
			setState(170);
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

	public static class CContext extends ParserRuleContext {
		public  code;
		public  result;
		public ExpressionContext expression;
		public AllocexpressionContext allocexpression;
		public FunccallContext funccall;
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
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(172);
				((CContext)_localctx).expression = expression();
				_localctx.code = ((CContext)_localctx).expression.code
				_localctx.result = ((CContext)_localctx).expression.result
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(176);
				((CContext)_localctx).allocexpression = allocexpression();
				_localctx.code = ((CContext)_localctx).allocexpression.code
				_localctx.result = ((CContext)_localctx).allocexpression.result
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				((CContext)_localctx).funccall = funccall();
				_localctx.code = ((CContext)_localctx).funccall.code
				_localctx.result = ((CContext)_localctx).funccall.result
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
		public  code;
		public LvalueContext lvalue;
		public CContext c;
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
			setState(186);
			((AtribstatContext)_localctx).lvalue = lvalue();
			setState(187);
			match(ATRIBUICAO);
			setState(188);
			((AtribstatContext)_localctx).c = c();
			_localctx.code = ((AtribstatContext)_localctx).c.code + ((AtribstatContext)_localctx).lvalue.code + " = " + ((AtribstatContext)_localctx).c.result + getNewLine() 
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
		public  code;
		public  result;
		public Token IDENT;
		public ParamlistcallContext paramlistcall;
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
			setState(191);
			((FunccallContext)_localctx).IDENT = match(IDENT);
			setState(192);
			match(PARENTEA);
			setState(193);
			((FunccallContext)_localctx).paramlistcall = paramlistcall();
			setState(194);
			match(PARENTEF);
			_localctx.result = getTemp()
			_localctx.code = ((FunccallContext)_localctx).paramlistcall.code + _localctx.result + " = call " + getFunc((((FunccallContext)_localctx).IDENT!=null?((FunccallContext)_localctx).IDENT.getText():null)) + "," + str(((FunccallContext)_localctx).paramlistcall.numero) + getNewLine()
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
		public  code;
		public  numero;
		public Token IDENT;
		public ParamlistcallContext paramlistcall;
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
			setState(209);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(198);
				((ParamlistcallContext)_localctx).IDENT = match(IDENT);
				setState(199);
				match(VIRGULA);
				setState(200);
				((ParamlistcallContext)_localctx).paramlistcall = paramlistcall();
				_localctx.code = "param " + (((ParamlistcallContext)_localctx).IDENT!=null?((ParamlistcallContext)_localctx).IDENT.getText():null) + getNewLine() + ((ParamlistcallContext)_localctx).paramlistcall.code
				_localctx.numero = ((ParamlistcallContext)_localctx).paramlistcall.numero + 1
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(204);
				((ParamlistcallContext)_localctx).IDENT = match(IDENT);
				_localctx.code = "param " + (((ParamlistcallContext)_localctx).IDENT!=null?((ParamlistcallContext)_localctx).IDENT.getText():null) + getNewLine()
				_localctx.numero = 1
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				_localctx.code = ""
				_localctx.numero = 0
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
		public  code;
		public ExpressionContext expression;
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
			setState(211);
			match(PRINT);
			setState(212);
			((PrintstatContext)_localctx).expression = expression();
			_localctx.code = ((PrintstatContext)_localctx).expression.code + "print " + ((PrintstatContext)_localctx).expression.result + getNewLine() 
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
		public  code;
		public LvalueContext lvalue;
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
			setState(215);
			match(READ);
			setState(216);
			((ReadstatContext)_localctx).lvalue = lvalue();
			_localctx.code = "read " + ((ReadstatContext)_localctx).lvalue.code + getNewLine()
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
		public  code;
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
			setState(219);
			match(RETURN);
			_localctx.code = "return" + getNewLine()
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
		public  next;
		public  code;
		public  labelFalse;
		public ExpressionContext expression;
		public StatementContext statement;
		public Statement2Context statement2;
		public TerminalNode IF() { return getToken(gramaticaParser.IF, 0); }
		public TerminalNode PARENTEA() { return getToken(gramaticaParser.PARENTEA, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PARENTEF() { return getToken(gramaticaParser.PARENTEF, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(gramaticaParser.ELSE, 0); }
		public Statement2Context statement2() {
			return getRuleContext(Statement2Context.class,0);
		}
		public IfstatContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public IfstatContext(ParserRuleContext parent, int invokingState,  next) {
			super(parent, invokingState);
			this.next = next;
		}
		@Override public int getRuleIndex() { return RULE_ifstat; }
	}

	public final IfstatContext ifstat( next) throws RecognitionException {
		IfstatContext _localctx = new IfstatContext(_ctx, getState(), next);
		enterRule(_localctx, 30, RULE_ifstat);
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(IF);
				setState(223);
				match(PARENTEA);
				setState(224);
				((IfstatContext)_localctx).expression = expression();
				setState(225);
				match(PARENTEF);
				setState(226);
				((IfstatContext)_localctx).statement = statement(_localctx.next);
				_localctx.code = ((IfstatContext)_localctx).expression.code + "if " + ((IfstatContext)_localctx).expression.result + " == 0 goto " + _localctx.next + getNewLine() + ((IfstatContext)_localctx).statement.code
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				_localctx.labelFalse = Label()
				setState(230);
				match(IF);
				setState(231);
				match(PARENTEA);
				setState(232);
				((IfstatContext)_localctx).expression = expression();
				setState(233);
				match(PARENTEF);
				setState(234);
				((IfstatContext)_localctx).statement = statement(_localctx.next);
				setState(235);
				match(ELSE);
				setState(236);
				((IfstatContext)_localctx).statement2 = statement2(_localctx.next);
				_localctx.code = ((IfstatContext)_localctx).expression.code + "if " + ((IfstatContext)_localctx).expression.result + " == 0 goto " + _localctx.labelFalse + getNewLine() + ((IfstatContext)_localctx).statement.code + getLabel(_localctx.labelFalse) + ((IfstatContext)_localctx).statement2.code
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

	public static class Statement2Context extends ParserRuleContext {
		public  next;
		public  code;
		public StatementContext statement;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public Statement2Context(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public Statement2Context(ParserRuleContext parent, int invokingState,  next) {
			super(parent, invokingState);
			this.next = next;
		}
		@Override public int getRuleIndex() { return RULE_statement2; }
	}

	public final Statement2Context statement2( next) throws RecognitionException {
		Statement2Context _localctx = new Statement2Context(_ctx, getState(), next);
		enterRule(_localctx, 32, RULE_statement2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			((Statement2Context)_localctx).statement = statement(_localctx.next);
			_localctx.code = ((Statement2Context)_localctx).statement.code
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
		public  next;
		public  code;
		public  begin;
		public AtribstatContext atribstat;
		public ExpressionContext expression;
		public Atribstat2Context atribstat2;
		public StatementContext statement;
		public TerminalNode FOR() { return getToken(gramaticaParser.FOR, 0); }
		public TerminalNode PARENTEA() { return getToken(gramaticaParser.PARENTEA, 0); }
		public AtribstatContext atribstat() {
			return getRuleContext(AtribstatContext.class,0);
		}
		public List<TerminalNode> PONTOEVIRGULA() { return getTokens(gramaticaParser.PONTOEVIRGULA); }
		public TerminalNode PONTOEVIRGULA(int i) {
			return getToken(gramaticaParser.PONTOEVIRGULA, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Atribstat2Context atribstat2() {
			return getRuleContext(Atribstat2Context.class,0);
		}
		public TerminalNode PARENTEF() { return getToken(gramaticaParser.PARENTEF, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public ForstatContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ForstatContext(ParserRuleContext parent, int invokingState,  next) {
			super(parent, invokingState);
			this.next = next;
		}
		@Override public int getRuleIndex() { return RULE_forstat; }
	}

	public final ForstatContext forstat( next) throws RecognitionException {
		ForstatContext _localctx = new ForstatContext(_ctx, getState(), next);
		enterRule(_localctx, 34, RULE_forstat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			_localctx.begin = Label()
			setState(245);
			match(FOR);
			setState(246);
			match(PARENTEA);
			setState(247);
			((ForstatContext)_localctx).atribstat = atribstat();
			setState(248);
			match(PONTOEVIRGULA);
			setState(249);
			((ForstatContext)_localctx).expression = expression();
			setState(250);
			match(PONTOEVIRGULA);
			setState(251);
			((ForstatContext)_localctx).atribstat2 = atribstat2();
			setState(252);
			match(PARENTEF);
			setState(253);
			((ForstatContext)_localctx).statement = statement(_localctx.next);
			_localctx.code = ((ForstatContext)_localctx).atribstat.code + getLabel(_localctx.begin) + ((ForstatContext)_localctx).expression.code + "if " + ((ForstatContext)_localctx).expression.result + " == 0 goto " + _localctx.next + getNewLine() + ((ForstatContext)_localctx).statement.code + ((ForstatContext)_localctx).atribstat2.code + "goto " + _localctx.begin + getNewLine()
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

	public static class Atribstat2Context extends ParserRuleContext {
		public  code;
		public AtribstatContext atribstat;
		public AtribstatContext atribstat() {
			return getRuleContext(AtribstatContext.class,0);
		}
		public Atribstat2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribstat2; }
	}

	public final Atribstat2Context atribstat2() throws RecognitionException {
		Atribstat2Context _localctx = new Atribstat2Context(_ctx, getState());
		enterRule(_localctx, 36, RULE_atribstat2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(256);
			((Atribstat2Context)_localctx).atribstat = atribstat();
			_localctx.code = ((Atribstat2Context)_localctx).atribstat.code
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
		public  next;
		public  code;
		public  begin;
		public StatementContext statement;
		public StatelistContext statelist;
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public StatelistContext statelist() {
			return getRuleContext(StatelistContext.class,0);
		}
		public StatelistContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public StatelistContext(ParserRuleContext parent, int invokingState,  next) {
			super(parent, invokingState);
			this.next = next;
		}
		@Override public int getRuleIndex() { return RULE_statelist; }
	}

	public final StatelistContext statelist( next) throws RecognitionException {
		StatelistContext _localctx = new StatelistContext(_ctx, getState(), next);
		enterRule(_localctx, 38, RULE_statelist);
		try {
			setState(267);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				_localctx.begin = Label()
				setState(260);
				((StatelistContext)_localctx).statement = statement(_localctx.begin);
				setState(261);
				((StatelistContext)_localctx).statelist = statelist(_localctx.next);
				_localctx.code = ((StatelistContext)_localctx).statement.code + getLabel(_localctx.begin) + ((StatelistContext)_localctx).statelist.code
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(264);
				((StatelistContext)_localctx).statement = statement(_localctx.next);
				_localctx.code = ((StatelistContext)_localctx).statement.code
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
		public  tipo;
		public  code;
		public  result;
		public NumexpressionContext numexpression;
		public DContext d;
		public TerminalNode COLCHA() { return getToken(gramaticaParser.COLCHA, 0); }
		public NumexpressionContext numexpression() {
			return getRuleContext(NumexpressionContext.class,0);
		}
		public TerminalNode COLCHF() { return getToken(gramaticaParser.COLCHF, 0); }
		public DContext d() {
			return getRuleContext(DContext.class,0);
		}
		public DContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public DContext(ParserRuleContext parent, int invokingState,  tipo) {
			super(parent, invokingState);
			this.tipo = tipo;
		}
		@Override public int getRuleIndex() { return RULE_d; }
	}

	public final DContext d( tipo) throws RecognitionException {
		DContext _localctx = new DContext(_ctx, getState(), tipo);
		enterRule(_localctx, 40, RULE_d);
		try {
			setState(282);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(269);
				match(COLCHA);
				setState(270);
				((DContext)_localctx).numexpression = numexpression();
				setState(271);
				match(COLCHF);
				_localctx.result = getVector(_localctx.tipo, ((DContext)_localctx).numexpression.result)
				_localctx.code = ((DContext)_localctx).numexpression.code
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(275);
				match(COLCHA);
				setState(276);
				((DContext)_localctx).numexpression = numexpression();
				setState(277);
				match(COLCHF);
				setState(278);
				((DContext)_localctx).d = d(getVector(_localctx.tipo, ((DContext)_localctx).numexpression.result));
				_localctx.result = ((DContext)_localctx).d.result
				_localctx.code = ((DContext)_localctx).numexpression.code + ((DContext)_localctx).d.code
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
		public  code;
		public  result;
		public AContext a;
		public DContext d;
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
		enterRule(_localctx, 42, RULE_allocexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(NEW);
			setState(285);
			((AllocexpressionContext)_localctx).a = a();
			setState(286);
			((AllocexpressionContext)_localctx).d = d(((AllocexpressionContext)_localctx).a.value);
			_localctx.result = "new " + ((AllocexpressionContext)_localctx).d.result
			_localctx.code = ((AllocexpressionContext)_localctx).d.code
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
		public  value;
		public Token MENORQUE;
		public Token MAIORQUE;
		public Token MENOREIGUAL;
		public Token MAIOREIGUAL;
		public Token IGUAL;
		public Token DIFERENTE;
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
		enterRule(_localctx, 44, RULE_comparadores);
		try {
			setState(302);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MENORQUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				((ComparadoresContext)_localctx).MENORQUE = match(MENORQUE);
				_localctx.value = (((ComparadoresContext)_localctx).MENORQUE!=null?((ComparadoresContext)_localctx).MENORQUE.getText():null)
				}
				break;
			case MAIORQUE:
				enterOuterAlt(_localctx, 2);
				{
				setState(292);
				((ComparadoresContext)_localctx).MAIORQUE = match(MAIORQUE);
				_localctx.value = (((ComparadoresContext)_localctx).MAIORQUE!=null?((ComparadoresContext)_localctx).MAIORQUE.getText():null)
				}
				break;
			case MENOREIGUAL:
				enterOuterAlt(_localctx, 3);
				{
				setState(294);
				((ComparadoresContext)_localctx).MENOREIGUAL = match(MENOREIGUAL);
				_localctx.value = (((ComparadoresContext)_localctx).MENOREIGUAL!=null?((ComparadoresContext)_localctx).MENOREIGUAL.getText():null)
				}
				break;
			case MAIOREIGUAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(296);
				((ComparadoresContext)_localctx).MAIOREIGUAL = match(MAIOREIGUAL);
				_localctx.value = (((ComparadoresContext)_localctx).MAIOREIGUAL!=null?((ComparadoresContext)_localctx).MAIOREIGUAL.getText():null)
				}
				break;
			case IGUAL:
				enterOuterAlt(_localctx, 5);
				{
				setState(298);
				((ComparadoresContext)_localctx).IGUAL = match(IGUAL);
				_localctx.value = (((ComparadoresContext)_localctx).IGUAL!=null?((ComparadoresContext)_localctx).IGUAL.getText():null)
				}
				break;
			case DIFERENTE:
				enterOuterAlt(_localctx, 6);
				{
				setState(300);
				((ComparadoresContext)_localctx).DIFERENTE = match(DIFERENTE);
				_localctx.value = (((ComparadoresContext)_localctx).DIFERENTE!=null?((ComparadoresContext)_localctx).DIFERENTE.getText():null)
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

	public static class ExpressionContext extends ParserRuleContext {
		public  code;
		public  result;
		public NumexpressionContext numexpression;
		public ComparadoresContext comparadores;
		public Numexpression2Context numexpression2;
		public NumexpressionContext numexpression() {
			return getRuleContext(NumexpressionContext.class,0);
		}
		public ComparadoresContext comparadores() {
			return getRuleContext(ComparadoresContext.class,0);
		}
		public Numexpression2Context numexpression2() {
			return getRuleContext(Numexpression2Context.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_expression);
		try {
			setState(314);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				((ExpressionContext)_localctx).numexpression = numexpression();
				setState(305);
				((ExpressionContext)_localctx).comparadores = comparadores();
				setState(306);
				((ExpressionContext)_localctx).numexpression2 = numexpression2();
				_localctx.result = getTemp()
				_localctx.code = ((ExpressionContext)_localctx).numexpression.code + ((ExpressionContext)_localctx).numexpression2.code + _localctx.result + " = " + ((ExpressionContext)_localctx).numexpression.result + ((ExpressionContext)_localctx).comparadores.value + ((ExpressionContext)_localctx).numexpression2.result + getNewLine()
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(310);
				((ExpressionContext)_localctx).numexpression = numexpression();
				_localctx.result = ((ExpressionContext)_localctx).numexpression.result
				_localctx.code = ((ExpressionContext)_localctx).numexpression.code
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

	public static class Numexpression2Context extends ParserRuleContext {
		public  code;
		public  result;
		public NumexpressionContext numexpression;
		public NumexpressionContext numexpression() {
			return getRuleContext(NumexpressionContext.class,0);
		}
		public Numexpression2Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numexpression2; }
	}

	public final Numexpression2Context numexpression2() throws RecognitionException {
		Numexpression2Context _localctx = new Numexpression2Context(_ctx, getState());
		enterRule(_localctx, 48, RULE_numexpression2);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(316);
			((Numexpression2Context)_localctx).numexpression = numexpression();
			_localctx.result = ((Numexpression2Context)_localctx).numexpression.result
			_localctx.code = ((Numexpression2Context)_localctx).numexpression.code
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
		enterRule(_localctx, 50, RULE_maisoumenos);
		try {
			setState(324);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAIS:
				enterOuterAlt(_localctx, 1);
				{
				setState(320);
				((MaisoumenosContext)_localctx).MAIS = match(MAIS);
				_localctx.value = (((MaisoumenosContext)_localctx).MAIS!=null?((MaisoumenosContext)_localctx).MAIS.getText():null)
				}
				break;
			case MENOS:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
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
		enterRule(_localctx, 52, RULE_e);
		try {
			setState(332);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAIS:
			case MENOS:
				enterOuterAlt(_localctx, 1);
				{
				setState(326);
				((EContext)_localctx).maisoumenos = maisoumenos();
				setState(327);
				((EContext)_localctx).term = term();
				setState(328);
				((EContext)_localctx).e = e(Node(((EContext)_localctx).maisoumenos.value, _localctx.inhr, ((EContext)_localctx).term.node));
				_localctx.syn = ((EContext)_localctx).e.syn
				}
				break;
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
		public  node;
		public  result;
		public  code;
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
		enterRule(_localctx, 54, RULE_numexpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			((NumexpressionContext)_localctx).term = term();
			setState(335);
			((NumexpressionContext)_localctx).e = e(((NumexpressionContext)_localctx).term.node);
			_localctx.node = ((NumexpressionContext)_localctx).e.syn
			insert_expression_table(((NumexpressionContext)_localctx).e.syn)
			_localctx.code = ((NumexpressionContext)_localctx).e.syn.gerar_codigo()
			_localctx.result = ((NumexpressionContext)_localctx).e.syn.result
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
		enterRule(_localctx, 56, RULE_mdm);
		try {
			setState(347);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULTIPLICACAO:
				enterOuterAlt(_localctx, 1);
				{
				setState(341);
				((MdmContext)_localctx).MULTIPLICACAO = match(MULTIPLICACAO);
				_localctx.value = (((MdmContext)_localctx).MULTIPLICACAO!=null?((MdmContext)_localctx).MULTIPLICACAO.getText():null)
				}
				break;
			case DIVISAO:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				((MdmContext)_localctx).DIVISAO = match(DIVISAO);
				_localctx.value = (((MdmContext)_localctx).DIVISAO!=null?((MdmContext)_localctx).DIVISAO.getText():null)
				}
				break;
			case MODULO:
				enterOuterAlt(_localctx, 3);
				{
				setState(345);
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
		enterRule(_localctx, 58, RULE_f);
		try {
			setState(355);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MULTIPLICACAO:
			case DIVISAO:
			case MODULO:
				enterOuterAlt(_localctx, 1);
				{
				setState(349);
				((FContext)_localctx).mdm = mdm();
				setState(350);
				((FContext)_localctx).unaryexpr = unaryexpr();
				setState(351);
				((FContext)_localctx).f = f(Node(((FContext)_localctx).mdm.value, _localctx.inhr, ((FContext)_localctx).unaryexpr.node));
				_localctx.syn = ((FContext)_localctx).f.syn
				}
				break;
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
		enterRule(_localctx, 60, RULE_term);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(357);
			((TermContext)_localctx).unaryexpr = unaryexpr();
			setState(358);
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
		enterRule(_localctx, 62, RULE_unaryexpr);
		try {
			setState(368);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAIS:
			case MENOS:
				enterOuterAlt(_localctx, 1);
				{
				setState(361);
				((UnaryexprContext)_localctx).maisoumenos = maisoumenos();
				setState(362);
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
				setState(365);
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
		enterRule(_localctx, 64, RULE_factor);
		try {
			setState(386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_CONSTANT:
				enterOuterAlt(_localctx, 1);
				{
				setState(370);
				((FactorContext)_localctx).INT_CONSTANT = match(INT_CONSTANT);
				_localctx.node = Leaf(((FactorContext)_localctx).INT_CONSTANT, 'int',[]) 
				}
				break;
			case FLOAT_CONSTANT:
				enterOuterAlt(_localctx, 2);
				{
				setState(372);
				((FactorContext)_localctx).FLOAT_CONSTANT = match(FLOAT_CONSTANT);
				_localctx.node = Leaf(((FactorContext)_localctx).FLOAT_CONSTANT, 'float',[])
				}
				break;
			case STRING_CONSTANT:
				enterOuterAlt(_localctx, 3);
				{
				setState(374);
				((FactorContext)_localctx).STRING_CONSTANT = match(STRING_CONSTANT);
				_localctx.node = Leaf(((FactorContext)_localctx).STRING_CONSTANT, 'str',[])
				}
				break;
			case NULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(376);
				((FactorContext)_localctx).NULL = match(NULL);
				_localctx.node = Leaf(((FactorContext)_localctx).NULL, 'null', [])
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 5);
				{
				setState(378);
				((FactorContext)_localctx).lvalue = lvalue();
				_localctx.node = ((FactorContext)_localctx).lvalue.node
				}
				break;
			case PARENTEA:
				enterOuterAlt(_localctx, 6);
				{
				setState(381);
				match(PARENTEA);
				setState(382);
				((FactorContext)_localctx).numexpression = numexpression();
				_localctx.node = ((FactorContext)_localctx).numexpression.node
				setState(384);
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
		enterRule(_localctx, 66, RULE_g);
		try {
			setState(394);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case COLCHA:
				enterOuterAlt(_localctx, 1);
				{
				setState(388);
				match(COLCHA);
				setState(389);
				numexpression();
				setState(390);
				match(COLCHF);
				setState(391);
				g();
				}
				break;
			case ATRIBUICAO:
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
		public  code;
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
		enterRule(_localctx, 68, RULE_lvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(396);
			((LvalueContext)_localctx).IDENT = match(IDENT);
			_localctx.node = Leaf(((LvalueContext)_localctx).IDENT, 'ident', [])
			setState(398);
			g();
			_localctx.code = (((LvalueContext)_localctx).IDENT!=null?((LvalueContext)_localctx).IDENT.getText():null)
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(\u0194\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\5\2U\n\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3`\n\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5r\n\5\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\3\6\3\6\5\6|\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u00a2\n\7\3\b\3\b\3\b\3\b\3\b"+
		"\5\b\u00a9\n\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n"+
		"\3\n\3\n\5\n\u00bb\n\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u00d4\n\r\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\5\21"+
		"\u00f2\n\21\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\5\25\u010e\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\5\26\u011d\n\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u0131\n\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u013d\n\31\3\32\3\32\3\32"+
		"\3\32\3\33\3\33\3\33\3\33\5\33\u0147\n\33\3\34\3\34\3\34\3\34\3\34\3\34"+
		"\5\34\u014f\n\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\5\36\u015e\n\36\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0166\n"+
		"\37\3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\5!\u0173\n!\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0185\n\"\3#\3#\3#\3#\3"+
		"#\3#\5#\u018d\n#\3$\3$\3$\3$\3$\3$\2\2%\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\62\64\668:<>@BDF\2\2\2\u0199\2T\3\2\2\2\4_\3\2\2"+
		"\2\6a\3\2\2\2\bq\3\2\2\2\n{\3\2\2\2\f\u00a1\3\2\2\2\16\u00a8\3\2\2\2\20"+
		"\u00aa\3\2\2\2\22\u00ba\3\2\2\2\24\u00bc\3\2\2\2\26\u00c1\3\2\2\2\30\u00d3"+
		"\3\2\2\2\32\u00d5\3\2\2\2\34\u00d9\3\2\2\2\36\u00dd\3\2\2\2 \u00f1\3\2"+
		"\2\2\"\u00f3\3\2\2\2$\u00f6\3\2\2\2&\u0102\3\2\2\2(\u010d\3\2\2\2*\u011c"+
		"\3\2\2\2,\u011e\3\2\2\2.\u0130\3\2\2\2\60\u013c\3\2\2\2\62\u013e\3\2\2"+
		"\2\64\u0146\3\2\2\2\66\u014e\3\2\2\28\u0150\3\2\2\2:\u015d\3\2\2\2<\u0165"+
		"\3\2\2\2>\u0167\3\2\2\2@\u0172\3\2\2\2B\u0184\3\2\2\2D\u018c\3\2\2\2F"+
		"\u018e\3\2\2\2HI\b\2\1\2IJ\5\f\7\2JK\b\2\1\2KL\b\2\1\2LU\3\2\2\2MN\b\2"+
		"\1\2NO\5\4\3\2OP\b\2\1\2PQ\b\2\1\2QU\3\2\2\2RS\b\2\1\2SU\b\2\1\2TH\3\2"+
		"\2\2TM\3\2\2\2TR\3\2\2\2U\3\3\2\2\2VW\b\3\1\2WX\5\6\4\2XY\5\4\3\2YZ\b"+
		"\3\1\2Z`\3\2\2\2[\\\b\3\1\2\\]\5\6\4\2]^\b\3\1\2^`\3\2\2\2_V\3\2\2\2_"+
		"[\3\2\2\2`\5\3\2\2\2ab\7\3\2\2bc\7$\2\2cd\7\20\2\2de\5\n\6\2ef\7\21\2"+
		"\2fg\7\n\2\2gh\5(\25\2hi\7\13\2\2ij\b\4\1\2j\7\3\2\2\2kl\7\4\2\2lr\b\5"+
		"\1\2mn\7\6\2\2nr\b\5\1\2op\7\5\2\2pr\b\5\1\2qk\3\2\2\2qm\3\2\2\2qo\3\2"+
		"\2\2r\t\3\2\2\2st\5\b\5\2tu\7$\2\2uv\7\27\2\2vw\5\n\6\2w|\3\2\2\2xy\5"+
		"\b\5\2yz\7$\2\2z|\3\2\2\2{s\3\2\2\2{x\3\2\2\2|\13\3\2\2\2}~\5\20\t\2~"+
		"\177\7\30\2\2\177\u0080\b\7\1\2\u0080\u00a2\3\2\2\2\u0081\u0082\5\24\13"+
		"\2\u0082\u0083\7\30\2\2\u0083\u0084\b\7\1\2\u0084\u00a2\3\2\2\2\u0085"+
		"\u0086\5\32\16\2\u0086\u0087\7\30\2\2\u0087\u0088\b\7\1\2\u0088\u00a2"+
		"\3\2\2\2\u0089\u008a\5\34\17\2\u008a\u008b\7\30\2\2\u008b\u008c\b\7\1"+
		"\2\u008c\u00a2\3\2\2\2\u008d\u008e\5\36\20\2\u008e\u008f\7\30\2\2\u008f"+
		"\u0090\b\7\1\2\u0090\u00a2\3\2\2\2\u0091\u0092\5 \21\2\u0092\u0093\b\7"+
		"\1\2\u0093\u00a2\3\2\2\2\u0094\u0095\5$\23\2\u0095\u0096\b\7\1\2\u0096"+
		"\u00a2\3\2\2\2\u0097\u0098\7\n\2\2\u0098\u0099\5(\25\2\u0099\u009a\7\13"+
		"\2\2\u009a\u009b\b\7\1\2\u009b\u00a2\3\2\2\2\u009c\u009d\7\7\2\2\u009d"+
		"\u009e\7\30\2\2\u009e\u00a2\b\7\1\2\u009f\u00a0\7\30\2\2\u00a0\u00a2\b"+
		"\7\1\2\u00a1}\3\2\2\2\u00a1\u0081\3\2\2\2\u00a1\u0085\3\2\2\2\u00a1\u0089"+
		"\3\2\2\2\u00a1\u008d\3\2\2\2\u00a1\u0091\3\2\2\2\u00a1\u0094\3\2\2\2\u00a1"+
		"\u0097\3\2\2\2\u00a1\u009c\3\2\2\2\u00a1\u009f\3\2\2\2\u00a2\r\3\2\2\2"+
		"\u00a3\u00a4\7\f\2\2\u00a4\u00a5\7%\2\2\u00a5\u00a6\7\r\2\2\u00a6\u00a9"+
		"\5\16\b\2\u00a7\u00a9\3\2\2\2\u00a8\u00a3\3\2\2\2\u00a8\u00a7\3\2\2\2"+
		"\u00a9\17\3\2\2\2\u00aa\u00ab\5\b\5\2\u00ab\u00ac\7$\2\2\u00ac\u00ad\5"+
		"\16\b\2\u00ad\21\3\2\2\2\u00ae\u00af\5\60\31\2\u00af\u00b0\b\n\1\2\u00b0"+
		"\u00b1\b\n\1\2\u00b1\u00bb\3\2\2\2\u00b2\u00b3\5,\27\2\u00b3\u00b4\b\n"+
		"\1\2\u00b4\u00b5\b\n\1\2\u00b5\u00bb\3\2\2\2\u00b6\u00b7\5\26\f\2\u00b7"+
		"\u00b8\b\n\1\2\u00b8\u00b9\b\n\1\2\u00b9\u00bb\3\2\2\2\u00ba\u00ae\3\2"+
		"\2\2\u00ba\u00b2\3\2\2\2\u00ba\u00b6\3\2\2\2\u00bb\23\3\2\2\2\u00bc\u00bd"+
		"\5F$\2\u00bd\u00be\7\b\2\2\u00be\u00bf\5\22\n\2\u00bf\u00c0\b\13\1\2\u00c0"+
		"\25\3\2\2\2\u00c1\u00c2\7$\2\2\u00c2\u00c3\7\20\2\2\u00c3\u00c4\5\30\r"+
		"\2\u00c4\u00c5\7\21\2\2\u00c5\u00c6\b\f\1\2\u00c6\u00c7\b\f\1\2\u00c7"+
		"\27\3\2\2\2\u00c8\u00c9\7$\2\2\u00c9\u00ca\7\27\2\2\u00ca\u00cb\5\30\r"+
		"\2\u00cb\u00cc\b\r\1\2\u00cc\u00cd\b\r\1\2\u00cd\u00d4\3\2\2\2\u00ce\u00cf"+
		"\7$\2\2\u00cf\u00d0\b\r\1\2\u00d0\u00d4\b\r\1\2\u00d1\u00d2\b\r\1\2\u00d2"+
		"\u00d4\b\r\1\2\u00d3\u00c8\3\2\2\2\u00d3\u00ce\3\2\2\2\u00d3\u00d1\3\2"+
		"\2\2\u00d4\31\3\2\2\2\u00d5\u00d6\7\t\2\2\u00d6\u00d7\5\60\31\2\u00d7"+
		"\u00d8\b\16\1\2\u00d8\33\3\2\2\2\u00d9\u00da\7\16\2\2\u00da\u00db\5F$"+
		"\2\u00db\u00dc\b\17\1\2\u00dc\35\3\2\2\2\u00dd\u00de\7\17\2\2\u00de\u00df"+
		"\b\20\1\2\u00df\37\3\2\2\2\u00e0\u00e1\7\22\2\2\u00e1\u00e2\7\20\2\2\u00e2"+
		"\u00e3\5\60\31\2\u00e3\u00e4\7\21\2\2\u00e4\u00e5\5\f\7\2\u00e5\u00e6"+
		"\b\21\1\2\u00e6\u00f2\3\2\2\2\u00e7\u00e8\b\21\1\2\u00e8\u00e9\7\22\2"+
		"\2\u00e9\u00ea\7\20\2\2\u00ea\u00eb\5\60\31\2\u00eb\u00ec\7\21\2\2\u00ec"+
		"\u00ed\5\f\7\2\u00ed\u00ee\7\23\2\2\u00ee\u00ef\5\"\22\2\u00ef\u00f0\b"+
		"\21\1\2\u00f0\u00f2\3\2\2\2\u00f1\u00e0\3\2\2\2\u00f1\u00e7\3\2\2\2\u00f2"+
		"!\3\2\2\2\u00f3\u00f4\5\f\7\2\u00f4\u00f5\b\22\1\2\u00f5#\3\2\2\2\u00f6"+
		"\u00f7\b\23\1\2\u00f7\u00f8\7\24\2\2\u00f8\u00f9\7\20\2\2\u00f9\u00fa"+
		"\5\24\13\2\u00fa\u00fb\7\30\2\2\u00fb\u00fc\5\60\31\2\u00fc\u00fd\7\30"+
		"\2\2\u00fd\u00fe\5&\24\2\u00fe\u00ff\7\21\2\2\u00ff\u0100\5\f\7\2\u0100"+
		"\u0101\b\23\1\2\u0101%\3\2\2\2\u0102\u0103\5\24\13\2\u0103\u0104\b\24"+
		"\1\2\u0104\'\3\2\2\2\u0105\u0106\b\25\1\2\u0106\u0107\5\f\7\2\u0107\u0108"+
		"\5(\25\2\u0108\u0109\b\25\1\2\u0109\u010e\3\2\2\2\u010a\u010b\5\f\7\2"+
		"\u010b\u010c\b\25\1\2\u010c\u010e\3\2\2\2\u010d\u0105\3\2\2\2\u010d\u010a"+
		"\3\2\2\2\u010e)\3\2\2\2\u010f\u0110\7\f\2\2\u0110\u0111\58\35\2\u0111"+
		"\u0112\7\r\2\2\u0112\u0113\b\26\1\2\u0113\u0114\b\26\1\2\u0114\u011d\3"+
		"\2\2\2\u0115\u0116\7\f\2\2\u0116\u0117\58\35\2\u0117\u0118\7\r\2\2\u0118"+
		"\u0119\5*\26\2\u0119\u011a\b\26\1\2\u011a\u011b\b\26\1\2\u011b\u011d\3"+
		"\2\2\2\u011c\u010f\3\2\2\2\u011c\u0115\3\2\2\2\u011d+\3\2\2\2\u011e\u011f"+
		"\7\26\2\2\u011f\u0120\5\b\5\2\u0120\u0121\5*\26\2\u0121\u0122\b\27\1\2"+
		"\u0122\u0123\b\27\1\2\u0123-\3\2\2\2\u0124\u0125\7\31\2\2\u0125\u0131"+
		"\b\30\1\2\u0126\u0127\7\32\2\2\u0127\u0131\b\30\1\2\u0128\u0129\7\33\2"+
		"\2\u0129\u0131\b\30\1\2\u012a\u012b\7\34\2\2\u012b\u0131\b\30\1\2\u012c"+
		"\u012d\7\35\2\2\u012d\u0131\b\30\1\2\u012e\u012f\7\36\2\2\u012f\u0131"+
		"\b\30\1\2\u0130\u0124\3\2\2\2\u0130\u0126\3\2\2\2\u0130\u0128\3\2\2\2"+
		"\u0130\u012a\3\2\2\2\u0130\u012c\3\2\2\2\u0130\u012e\3\2\2\2\u0131/\3"+
		"\2\2\2\u0132\u0133\58\35\2\u0133\u0134\5.\30\2\u0134\u0135\5\62\32\2\u0135"+
		"\u0136\b\31\1\2\u0136\u0137\b\31\1\2\u0137\u013d\3\2\2\2\u0138\u0139\5"+
		"8\35\2\u0139\u013a\b\31\1\2\u013a\u013b\b\31\1\2\u013b\u013d\3\2\2\2\u013c"+
		"\u0132\3\2\2\2\u013c\u0138\3\2\2\2\u013d\61\3\2\2\2\u013e\u013f\58\35"+
		"\2\u013f\u0140\b\32\1\2\u0140\u0141\b\32\1\2\u0141\63\3\2\2\2\u0142\u0143"+
		"\7\37\2\2\u0143\u0147\b\33\1\2\u0144\u0145\7 \2\2\u0145\u0147\b\33\1\2"+
		"\u0146\u0142\3\2\2\2\u0146\u0144\3\2\2\2\u0147\65\3\2\2\2\u0148\u0149"+
		"\5\64\33\2\u0149\u014a\5> \2\u014a\u014b\5\66\34\2\u014b\u014c\b\34\1"+
		"\2\u014c\u014f\3\2\2\2\u014d\u014f\b\34\1\2\u014e\u0148\3\2\2\2\u014e"+
		"\u014d\3\2\2\2\u014f\67\3\2\2\2\u0150\u0151\5> \2\u0151\u0152\5\66\34"+
		"\2\u0152\u0153\b\35\1\2\u0153\u0154\b\35\1\2\u0154\u0155\b\35\1\2\u0155"+
		"\u0156\b\35\1\2\u01569\3\2\2\2\u0157\u0158\7!\2\2\u0158\u015e\b\36\1\2"+
		"\u0159\u015a\7\"\2\2\u015a\u015e\b\36\1\2\u015b\u015c\7#\2\2\u015c\u015e"+
		"\b\36\1\2\u015d\u0157\3\2\2\2\u015d\u0159\3\2\2\2\u015d\u015b\3\2\2\2"+
		"\u015e;\3\2\2\2\u015f\u0160\5:\36\2\u0160\u0161\5@!\2\u0161\u0162\5<\37"+
		"\2\u0162\u0163\b\37\1\2\u0163\u0166\3\2\2\2\u0164\u0166\b\37\1\2\u0165"+
		"\u015f\3\2\2\2\u0165\u0164\3\2\2\2\u0166=\3\2\2\2\u0167\u0168\5@!\2\u0168"+
		"\u0169\5<\37\2\u0169\u016a\b \1\2\u016a?\3\2\2\2\u016b\u016c\5\64\33\2"+
		"\u016c\u016d\5B\"\2\u016d\u016e\b!\1\2\u016e\u0173\3\2\2\2\u016f\u0170"+
		"\5B\"\2\u0170\u0171\b!\1\2\u0171\u0173\3\2\2\2\u0172\u016b\3\2\2\2\u0172"+
		"\u016f\3\2\2\2\u0173A\3\2\2\2\u0174\u0175\7%\2\2\u0175\u0185\b\"\1\2\u0176"+
		"\u0177\7&\2\2\u0177\u0185\b\"\1\2\u0178\u0179\7\'\2\2\u0179\u0185\b\""+
		"\1\2\u017a\u017b\7\25\2\2\u017b\u0185\b\"\1\2\u017c\u017d\5F$\2\u017d"+
		"\u017e\b\"\1\2\u017e\u0185\3\2\2\2\u017f\u0180\7\20\2\2\u0180\u0181\5"+
		"8\35\2\u0181\u0182\b\"\1\2\u0182\u0183\7\21\2\2\u0183\u0185\3\2\2\2\u0184"+
		"\u0174\3\2\2\2\u0184\u0176\3\2\2\2\u0184\u0178\3\2\2\2\u0184\u017a\3\2"+
		"\2\2\u0184\u017c\3\2\2\2\u0184\u017f\3\2\2\2\u0185C\3\2\2\2\u0186\u0187"+
		"\7\f\2\2\u0187\u0188\58\35\2\u0188\u0189\7\r\2\2\u0189\u018a\5D#\2\u018a"+
		"\u018d\3\2\2\2\u018b\u018d\3\2\2\2\u018c\u0186\3\2\2\2\u018c\u018b\3\2"+
		"\2\2\u018dE\3\2\2\2\u018e\u018f\7$\2\2\u018f\u0190\b$\1\2\u0190\u0191"+
		"\5D#\2\u0191\u0192\b$\1\2\u0192G\3\2\2\2\26T_q{\u00a1\u00a8\u00ba\u00d3"+
		"\u00f1\u010d\u011c\u0130\u013c\u0146\u014e\u015d\u0165\u0172\u0184\u018c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}