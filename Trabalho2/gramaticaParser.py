# Generated from gramatica.g4 by ANTLR 4.7.2
# encoding: utf-8
from antlr4 import *
from io import StringIO
from typing.io import TextIO
import sys
from arvore import *
from tabela import *

def serializedATN():
    with StringIO() as buf:
        buf.write("\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3(")
        buf.write("\u0137\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7")
        buf.write("\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16")
        buf.write("\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22\4\23\t\23")
        buf.write("\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31")
        buf.write("\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36")
        buf.write("\4\37\t\37\4 \t \4!\t!\3\2\3\2\3\2\5\2F\n\2\3\3\3\3\3")
        buf.write("\3\3\3\5\3L\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3")
        buf.write("\5\3\5\3\5\3\5\3\5\3\5\5\5]\n\5\3\6\3\6\3\6\3\6\3\6\3")
        buf.write("\6\3\6\3\6\5\6g\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3")
        buf.write("\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7")
        buf.write("\3\7\3\7\3\7\5\7\u0082\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b")
        buf.write("\5\b\u008b\n\b\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\5\n\u0095")
        buf.write("\n\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3")
        buf.write("\r\3\r\3\r\5\r\u00a5\n\r\3\16\3\16\3\16\3\17\3\17\3\17")
        buf.write("\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21")
        buf.write("\3\21\3\21\3\21\3\21\3\21\5\21\u00bd\n\21\3\22\3\22\3")
        buf.write("\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23")
        buf.write("\3\23\3\23\3\23\5\23\u00cf\n\23\3\24\3\24\3\24\3\24\3")
        buf.write("\24\3\24\3\24\3\24\3\24\5\24\u00da\n\24\3\25\3\25\3\25")
        buf.write("\3\25\3\26\3\26\3\27\3\27\3\27\3\27\3\27\5\27\u00e7\n")
        buf.write("\27\3\30\3\30\3\30\3\30\5\30\u00ed\n\30\3\31\3\31\3\31")
        buf.write("\3\31\3\31\3\31\5\31\u00f5\n\31\3\32\3\32\3\32\3\32\3")
        buf.write("\32\3\33\3\33\3\33\3\33\3\33\3\33\5\33\u0102\n\33\3\34")
        buf.write("\3\34\3\34\3\34\3\34\3\34\5\34\u010a\n\34\3\35\3\35\3")
        buf.write("\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0117")
        buf.write("\n\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37")
        buf.write("\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0129\n\37\3 \3 \3")
        buf.write(" \3 \3 \3 \5 \u0131\n \3!\3!\3!\3!\3!\2\2\"\2\4\6\b\n")
        buf.write("\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<")
        buf.write(">@\2\3\3\2\31\36\2\u013a\2E\3\2\2\2\4K\3\2\2\2\6M\3\2")
        buf.write("\2\2\b\\\3\2\2\2\nf\3\2\2\2\f\u0081\3\2\2\2\16\u008a\3")
        buf.write("\2\2\2\20\u008c\3\2\2\2\22\u0094\3\2\2\2\24\u0096\3\2")
        buf.write("\2\2\26\u009a\3\2\2\2\30\u00a4\3\2\2\2\32\u00a6\3\2\2")
        buf.write("\2\34\u00a9\3\2\2\2\36\u00ac\3\2\2\2 \u00bc\3\2\2\2\"")
        buf.write("\u00be\3\2\2\2$\u00ce\3\2\2\2&\u00d9\3\2\2\2(\u00db\3")
        buf.write("\2\2\2*\u00df\3\2\2\2,\u00e6\3\2\2\2.\u00ec\3\2\2\2\60")
        buf.write("\u00f4\3\2\2\2\62\u00f6\3\2\2\2\64\u0101\3\2\2\2\66\u0109")
        buf.write("\3\2\2\28\u010b\3\2\2\2:\u0116\3\2\2\2<\u0128\3\2\2\2")
        buf.write(">\u0130\3\2\2\2@\u0132\3\2\2\2BF\5\f\7\2CF\5\4\3\2DF\3")
        buf.write("\2\2\2EB\3\2\2\2EC\3\2\2\2ED\3\2\2\2F\3\3\2\2\2GH\5\6")
        buf.write("\4\2HI\5\4\3\2IL\3\2\2\2JL\5\6\4\2KG\3\2\2\2KJ\3\2\2\2")
        buf.write("L\5\3\2\2\2MN\7\3\2\2NO\7$\2\2OP\7\20\2\2PQ\5\n\6\2QR")
        buf.write("\7\21\2\2RS\7\n\2\2ST\5$\23\2TU\7\13\2\2U\7\3\2\2\2VW")
        buf.write("\7\4\2\2W]\b\5\1\2XY\7\6\2\2Y]\b\5\1\2Z[\7\5\2\2[]\b\5")
        buf.write("\1\2\\V\3\2\2\2\\X\3\2\2\2\\Z\3\2\2\2]\t\3\2\2\2^_\5\b")
        buf.write("\5\2_`\7$\2\2`a\7\27\2\2ab\5\n\6\2bg\3\2\2\2cd\5\b\5\2")
        buf.write("de\7$\2\2eg\3\2\2\2f^\3\2\2\2fc\3\2\2\2g\13\3\2\2\2hi")
        buf.write("\5\20\t\2ij\7\30\2\2j\u0082\3\2\2\2kl\5\24\13\2lm\7\30")
        buf.write("\2\2m\u0082\3\2\2\2no\5\32\16\2op\7\30\2\2p\u0082\3\2")
        buf.write("\2\2qr\5\34\17\2rs\7\30\2\2s\u0082\3\2\2\2tu\5\36\20\2")
        buf.write("uv\7\30\2\2v\u0082\3\2\2\2w\u0082\5 \21\2x\u0082\5\"\22")
        buf.write("\2yz\7\n\2\2z{\5$\23\2{|\7\13\2\2|\u0082\3\2\2\2}~\7\7")
        buf.write("\2\2~\177\b\7\1\2\177\u0082\7\30\2\2\u0080\u0082\7\30")
        buf.write("\2\2\u0081h\3\2\2\2\u0081k\3\2\2\2\u0081n\3\2\2\2\u0081")
        buf.write("q\3\2\2\2\u0081t\3\2\2\2\u0081w\3\2\2\2\u0081x\3\2\2\2")
        buf.write("\u0081y\3\2\2\2\u0081}\3\2\2\2\u0081\u0080\3\2\2\2\u0082")
        buf.write("\r\3\2\2\2\u0083\u0084\7\f\2\2\u0084\u0085\7%\2\2\u0085")
        buf.write("\u0086\7\r\2\2\u0086\u0087\5\16\b\2\u0087\u0088\b\b\1")
        buf.write("\2\u0088\u008b\3\2\2\2\u0089\u008b\b\b\1\2\u008a\u0083")
        buf.write("\3\2\2\2\u008a\u0089\3\2\2\2\u008b\17\3\2\2\2\u008c\u008d")
        buf.write("\5\b\5\2\u008d\u008e\7$\2\2\u008e\u008f\5\16\b\2\u008f")
        buf.write("\u0090\b\t\1\2\u0090\21\3\2\2\2\u0091\u0095\5,\27\2\u0092")
        buf.write("\u0095\5(\25\2\u0093\u0095\5\26\f\2\u0094\u0091\3\2\2")
        buf.write("\2\u0094\u0092\3\2\2\2\u0094\u0093\3\2\2\2\u0095\23\3")
        buf.write("\2\2\2\u0096\u0097\5@!\2\u0097\u0098\7\b\2\2\u0098\u0099")
        buf.write("\5\22\n\2\u0099\25\3\2\2\2\u009a\u009b\7$\2\2\u009b\u009c")
        buf.write("\7\20\2\2\u009c\u009d\5\30\r\2\u009d\u009e\7\21\2\2\u009e")
        buf.write("\27\3\2\2\2\u009f\u00a0\7$\2\2\u00a0\u00a1\7\27\2\2\u00a1")
        buf.write("\u00a5\5\30\r\2\u00a2\u00a5\7$\2\2\u00a3\u00a5\3\2\2\2")
        buf.write("\u00a4\u009f\3\2\2\2\u00a4\u00a2\3\2\2\2\u00a4\u00a3\3")
        buf.write("\2\2\2\u00a5\31\3\2\2\2\u00a6\u00a7\7\t\2\2\u00a7\u00a8")
        buf.write("\5,\27\2\u00a8\33\3\2\2\2\u00a9\u00aa\7\16\2\2\u00aa\u00ab")
        buf.write("\5@!\2\u00ab\35\3\2\2\2\u00ac\u00ad\7\17\2\2\u00ad\37")
        buf.write("\3\2\2\2\u00ae\u00af\7\22\2\2\u00af\u00b0\7\20\2\2\u00b0")
        buf.write("\u00b1\5,\27\2\u00b1\u00b2\7\21\2\2\u00b2\u00b3\5\f\7")
        buf.write("\2\u00b3\u00bd\3\2\2\2\u00b4\u00b5\7\22\2\2\u00b5\u00b6")
        buf.write("\7\20\2\2\u00b6\u00b7\5,\27\2\u00b7\u00b8\7\21\2\2\u00b8")
        buf.write("\u00b9\5\f\7\2\u00b9\u00ba\7\23\2\2\u00ba\u00bb\5\f\7")
        buf.write("\2\u00bb\u00bd\3\2\2\2\u00bc\u00ae\3\2\2\2\u00bc\u00b4")
        buf.write("\3\2\2\2\u00bd!\3\2\2\2\u00be\u00bf\7\24\2\2\u00bf\u00c0")
        buf.write("\7\20\2\2\u00c0\u00c1\5\24\13\2\u00c1\u00c2\7\30\2\2\u00c2")
        buf.write("\u00c3\5,\27\2\u00c3\u00c4\7\30\2\2\u00c4\u00c5\5\24\13")
        buf.write("\2\u00c5\u00c6\7\21\2\2\u00c6\u00c7\b\22\1\2\u00c7\u00c8")
        buf.write("\5\f\7\2\u00c8\u00c9\b\22\1\2\u00c9#\3\2\2\2\u00ca\u00cb")
        buf.write("\5\f\7\2\u00cb\u00cc\5$\23\2\u00cc\u00cf\3\2\2\2\u00cd")
        buf.write("\u00cf\5\f\7\2\u00ce\u00ca\3\2\2\2\u00ce\u00cd\3\2\2\2")
        buf.write("\u00cf%\3\2\2\2\u00d0\u00d1\7\f\2\2\u00d1\u00d2\5\62\32")
        buf.write("\2\u00d2\u00d3\7\r\2\2\u00d3\u00da\3\2\2\2\u00d4\u00d5")
        buf.write("\7\13\2\2\u00d5\u00d6\5\62\32\2\u00d6\u00d7\7\r\2\2\u00d7")
        buf.write("\u00d8\5&\24\2\u00d8\u00da\3\2\2\2\u00d9\u00d0\3\2\2\2")
        buf.write("\u00d9\u00d4\3\2\2\2\u00da\'\3\2\2\2\u00db\u00dc\7\26")
        buf.write("\2\2\u00dc\u00dd\5\b\5\2\u00dd\u00de\5&\24\2\u00de)\3")
        buf.write("\2\2\2\u00df\u00e0\t\2\2\2\u00e0+\3\2\2\2\u00e1\u00e2")
        buf.write("\5\62\32\2\u00e2\u00e3\5*\26\2\u00e3\u00e4\5\62\32\2\u00e4")
        buf.write("\u00e7\3\2\2\2\u00e5\u00e7\5\62\32\2\u00e6\u00e1\3\2\2")
        buf.write("\2\u00e6\u00e5\3\2\2\2\u00e7-\3\2\2\2\u00e8\u00e9\7\37")
        buf.write("\2\2\u00e9\u00ed\b\30\1\2\u00ea\u00eb\7 \2\2\u00eb\u00ed")
        buf.write("\b\30\1\2\u00ec\u00e8\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ed")
        buf.write("/\3\2\2\2\u00ee\u00ef\5.\30\2\u00ef\u00f0\58\35\2\u00f0")
        buf.write("\u00f1\5\60\31\2\u00f1\u00f2\b\31\1\2\u00f2\u00f5\3\2")
        buf.write("\2\2\u00f3\u00f5\b\31\1\2\u00f4\u00ee\3\2\2\2\u00f4\u00f3")
        buf.write("\3\2\2\2\u00f5\61\3\2\2\2\u00f6\u00f7\58\35\2\u00f7\u00f8")
        buf.write("\5\60\31\2\u00f8\u00f9\b\32\1\2\u00f9\u00fa\b\32\1\2\u00fa")
        buf.write("\63\3\2\2\2\u00fb\u00fc\7!\2\2\u00fc\u0102\b\33\1\2\u00fd")
        buf.write("\u00fe\7\"\2\2\u00fe\u0102\b\33\1\2\u00ff\u0100\7#\2\2")
        buf.write("\u0100\u0102\b\33\1\2\u0101\u00fb\3\2\2\2\u0101\u00fd")
        buf.write("\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\65\3\2\2\2\u0103\u0104")
        buf.write("\5\64\33\2\u0104\u0105\5:\36\2\u0105\u0106\5\66\34\2\u0106")
        buf.write("\u0107\b\34\1\2\u0107\u010a\3\2\2\2\u0108\u010a\b\34\1")
        buf.write("\2\u0109\u0103\3\2\2\2\u0109\u0108\3\2\2\2\u010a\67\3")
        buf.write("\2\2\2\u010b\u010c\5:\36\2\u010c\u010d\5\66\34\2\u010d")
        buf.write("\u010e\b\35\1\2\u010e9\3\2\2\2\u010f\u0110\5.\30\2\u0110")
        buf.write("\u0111\5<\37\2\u0111\u0112\b\36\1\2\u0112\u0117\3\2\2")
        buf.write("\2\u0113\u0114\5<\37\2\u0114\u0115\b\36\1\2\u0115\u0117")
        buf.write("\3\2\2\2\u0116\u010f\3\2\2\2\u0116\u0113\3\2\2\2\u0117")
        buf.write(";\3\2\2\2\u0118\u0119\7%\2\2\u0119\u0129\b\37\1\2\u011a")
        buf.write("\u011b\7&\2\2\u011b\u0129\b\37\1\2\u011c\u011d\7\'\2\2")
        buf.write("\u011d\u0129\b\37\1\2\u011e\u011f\7\25\2\2\u011f\u0129")
        buf.write("\b\37\1\2\u0120\u0121\5@!\2\u0121\u0122\b\37\1\2\u0122")
        buf.write("\u0129\3\2\2\2\u0123\u0124\7\20\2\2\u0124\u0125\5\62\32")
        buf.write("\2\u0125\u0126\b\37\1\2\u0126\u0127\7\21\2\2\u0127\u0129")
        buf.write("\3\2\2\2\u0128\u0118\3\2\2\2\u0128\u011a\3\2\2\2\u0128")
        buf.write("\u011c\3\2\2\2\u0128\u011e\3\2\2\2\u0128\u0120\3\2\2\2")
        buf.write("\u0128\u0123\3\2\2\2\u0129=\3\2\2\2\u012a\u012b\7\f\2")
        buf.write("\2\u012b\u012c\5\62\32\2\u012c\u012d\7\r\2\2\u012d\u012e")
        buf.write("\5> \2\u012e\u0131\3\2\2\2\u012f\u0131\3\2\2\2\u0130\u012a")
        buf.write("\3\2\2\2\u0130\u012f\3\2\2\2\u0131?\3\2\2\2\u0132\u0133")
        buf.write("\7$\2\2\u0133\u0134\b!\1\2\u0134\u0135\5> \2\u0135A\3")
        buf.write("\2\2\2\25EK\\f\u0081\u008a\u0094\u00a4\u00bc\u00ce\u00d9")
        buf.write("\u00e6\u00ec\u00f4\u0101\u0109\u0116\u0128\u0130")
        return buf.getvalue()


class gramaticaParser ( Parser ):

    grammarFileName = "gramatica.g4"

    atn = ATNDeserializer().deserialize(serializedATN())

    decisionsToDFA = [ DFA(ds, i) for i, ds in enumerate(atn.decisionToState) ]

    sharedContextCache = PredictionContextCache()

    literalNames = [ "<INVALID>", "'def'", "'int'", "'string'", "'float'", 
                     "'break'", "'='", "'print'", "'{'", "'}'", "'['", "']'", 
                     "'read'", "'return'", "'('", "')'", "'if'", "'else'", 
                     "'for'", "'null'", "'new'", "','", "';'", "'<'", "'>'", 
                     "'<='", "'>='", "'=='", "'!='", "'+'", "'-'", "'*'", 
                     "'/'", "'%'" ]

    symbolicNames = [ "<INVALID>", "DEF", "INT", "STRING", "FLOAT", "BREAK", 
                      "ATRIBUICAO", "PRINT", "CHAVEA", "CHAVEF", "COLCHA", 
                      "COLCHF", "READ", "RETURN", "PARENTEA", "PARENTEF", 
                      "IF", "ELSE", "FOR", "NULL", "NEW", "VIRGULA", "PONTOEVIRGULA", 
                      "MENORQUE", "MAIORQUE", "MENOREIGUAL", "MAIOREIGUAL", 
                      "IGUAL", "DIFERENTE", "MAIS", "MENOS", "MULTIPLICACAO", 
                      "DIVISAO", "MODULO", "IDENT", "INT_CONSTANT", "FLOAT_CONSTANT", 
                      "STRING_CONSTANT", "WS" ]

    RULE_program = 0
    RULE_funclist = 1
    RULE_funcdef = 2
    RULE_a = 3
    RULE_paramlist = 4
    RULE_statement = 5
    RULE_b = 6
    RULE_vardecl = 7
    RULE_c = 8
    RULE_atribstat = 9
    RULE_funccall = 10
    RULE_paramlistcall = 11
    RULE_printstat = 12
    RULE_readstat = 13
    RULE_returnstat = 14
    RULE_ifstat = 15
    RULE_forstat = 16
    RULE_statelist = 17
    RULE_d = 18
    RULE_allocexpression = 19
    RULE_comparadores = 20
    RULE_expression = 21
    RULE_maisoumenos = 22
    RULE_e = 23
    RULE_numexpression = 24
    RULE_mdm = 25
    RULE_f = 26
    RULE_term = 27
    RULE_unaryexpr = 28
    RULE_factor = 29
    RULE_g = 30
    RULE_lvalue = 31

    ruleNames =  [ "program", "funclist", "funcdef", "a", "paramlist", "statement", 
                   "b", "vardecl", "c", "atribstat", "funccall", "paramlistcall", 
                   "printstat", "readstat", "returnstat", "ifstat", "forstat", 
                   "statelist", "d", "allocexpression", "comparadores", 
                   "expression", "maisoumenos", "e", "numexpression", "mdm", 
                   "f", "term", "unaryexpr", "factor", "g", "lvalue" ]

    EOF = Token.EOF
    DEF=1
    INT=2
    STRING=3
    FLOAT=4
    BREAK=5
    ATRIBUICAO=6
    PRINT=7
    CHAVEA=8
    CHAVEF=9
    COLCHA=10
    COLCHF=11
    READ=12
    RETURN=13
    PARENTEA=14
    PARENTEF=15
    IF=16
    ELSE=17
    FOR=18
    NULL=19
    NEW=20
    VIRGULA=21
    PONTOEVIRGULA=22
    MENORQUE=23
    MAIORQUE=24
    MENOREIGUAL=25
    MAIOREIGUAL=26
    IGUAL=27
    DIFERENTE=28
    MAIS=29
    MENOS=30
    MULTIPLICACAO=31
    DIVISAO=32
    MODULO=33
    IDENT=34
    INT_CONSTANT=35
    FLOAT_CONSTANT=36
    STRING_CONSTANT=37
    WS=38

    def __init__(self, input:TokenStream, output:TextIO = sys.stdout):
        super().__init__(input, output)
        self.checkVersion("4.7.2")
        self._interp = ParserATNSimulator(self, self.atn, self.decisionsToDFA, self.sharedContextCache)
        self._predicates = None



    class ProgramContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def statement(self):
            return self.getTypedRuleContext(gramaticaParser.StatementContext,0)


        def funclist(self):
            return self.getTypedRuleContext(gramaticaParser.FunclistContext,0)


        def getRuleIndex(self):
            return gramaticaParser.RULE_program

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterProgram" ):
                listener.enterProgram(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitProgram" ):
                listener.exitProgram(self)




    def program(self):

        localctx = gramaticaParser.ProgramContext(self, self._ctx, self.state)
        self.enterRule(localctx, 0, self.RULE_program)
        try:
            self.state = 67
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [gramaticaParser.INT, gramaticaParser.STRING, gramaticaParser.FLOAT, gramaticaParser.BREAK, gramaticaParser.PRINT, gramaticaParser.CHAVEA, gramaticaParser.READ, gramaticaParser.RETURN, gramaticaParser.IF, gramaticaParser.FOR, gramaticaParser.PONTOEVIRGULA, gramaticaParser.IDENT]:
                self.enterOuterAlt(localctx, 1)
                self.state = 64
                self.statement()
                pass
            elif token in [gramaticaParser.DEF]:
                self.enterOuterAlt(localctx, 2)
                self.state = 65
                self.funclist()
                pass
            elif token in [gramaticaParser.EOF]:
                self.enterOuterAlt(localctx, 3)

                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class FunclistContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def funcdef(self):
            return self.getTypedRuleContext(gramaticaParser.FuncdefContext,0)


        def funclist(self):
            return self.getTypedRuleContext(gramaticaParser.FunclistContext,0)


        def getRuleIndex(self):
            return gramaticaParser.RULE_funclist

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFunclist" ):
                listener.enterFunclist(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFunclist" ):
                listener.exitFunclist(self)




    def funclist(self):

        localctx = gramaticaParser.FunclistContext(self, self._ctx, self.state)
        self.enterRule(localctx, 2, self.RULE_funclist)
        try:
            self.state = 73
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,1,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 69
                self.funcdef()
                self.state = 70
                self.funclist()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 72
                self.funcdef()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class FuncdefContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def DEF(self):
            return self.getToken(gramaticaParser.DEF, 0)

        def IDENT(self):
            return self.getToken(gramaticaParser.IDENT, 0)

        def PARENTEA(self):
            return self.getToken(gramaticaParser.PARENTEA, 0)

        def paramlist(self):
            return self.getTypedRuleContext(gramaticaParser.ParamlistContext,0)


        def PARENTEF(self):
            return self.getToken(gramaticaParser.PARENTEF, 0)

        def CHAVEA(self):
            return self.getToken(gramaticaParser.CHAVEA, 0)

        def statelist(self):
            return self.getTypedRuleContext(gramaticaParser.StatelistContext,0)


        def CHAVEF(self):
            return self.getToken(gramaticaParser.CHAVEF, 0)

        def getRuleIndex(self):
            return gramaticaParser.RULE_funcdef

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFuncdef" ):
                listener.enterFuncdef(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFuncdef" ):
                listener.exitFuncdef(self)




    def funcdef(self):

        localctx = gramaticaParser.FuncdefContext(self, self._ctx, self.state)
        self.enterRule(localctx, 4, self.RULE_funcdef)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 75
            self.match(gramaticaParser.DEF)
            self.state = 76
            self.match(gramaticaParser.IDENT)
            self.state = 77
            self.match(gramaticaParser.PARENTEA)
            self.state = 78
            self.paramlist()
            self.state = 79
            self.match(gramaticaParser.PARENTEF)
            self.state = 80
            self.match(gramaticaParser.CHAVEA)
            self.state = 81
            self.statelist()
            self.state = 82
            self.match(gramaticaParser.CHAVEF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class AContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.value = None

        def INT(self):
            return self.getToken(gramaticaParser.INT, 0)

        def FLOAT(self):
            return self.getToken(gramaticaParser.FLOAT, 0)

        def STRING(self):
            return self.getToken(gramaticaParser.STRING, 0)

        def getRuleIndex(self):
            return gramaticaParser.RULE_a

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterA" ):
                listener.enterA(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitA" ):
                listener.exitA(self)




    def a(self):

        localctx = gramaticaParser.AContext(self, self._ctx, self.state)
        self.enterRule(localctx, 6, self.RULE_a)
        try:
            self.state = 90
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [gramaticaParser.INT]:
                self.enterOuterAlt(localctx, 1)
                self.state = 84
                self.match(gramaticaParser.INT)
                localctx.value = 'int'
                pass
            elif token in [gramaticaParser.FLOAT]:
                self.enterOuterAlt(localctx, 2)
                self.state = 86
                self.match(gramaticaParser.FLOAT)
                localctx.value = 'float'
                pass
            elif token in [gramaticaParser.STRING]:
                self.enterOuterAlt(localctx, 3)
                self.state = 88
                self.match(gramaticaParser.STRING)
                localctx.value = 'string'
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class ParamlistContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def a(self):
            return self.getTypedRuleContext(gramaticaParser.AContext,0)


        def IDENT(self):
            return self.getToken(gramaticaParser.IDENT, 0)

        def VIRGULA(self):
            return self.getToken(gramaticaParser.VIRGULA, 0)

        def paramlist(self):
            return self.getTypedRuleContext(gramaticaParser.ParamlistContext,0)


        def getRuleIndex(self):
            return gramaticaParser.RULE_paramlist

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterParamlist" ):
                listener.enterParamlist(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitParamlist" ):
                listener.exitParamlist(self)




    def paramlist(self):

        localctx = gramaticaParser.ParamlistContext(self, self._ctx, self.state)
        self.enterRule(localctx, 8, self.RULE_paramlist)
        try:
            self.state = 100
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,3,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 92
                self.a()
                self.state = 93
                self.match(gramaticaParser.IDENT)
                self.state = 94
                self.match(gramaticaParser.VIRGULA)
                self.state = 95
                self.paramlist()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 97
                self.a()
                self.state = 98
                self.match(gramaticaParser.IDENT)
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class StatementContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._BREAK = None # Token

        def vardecl(self):
            return self.getTypedRuleContext(gramaticaParser.VardeclContext,0)


        def PONTOEVIRGULA(self):
            return self.getToken(gramaticaParser.PONTOEVIRGULA, 0)

        def atribstat(self):
            return self.getTypedRuleContext(gramaticaParser.AtribstatContext,0)


        def printstat(self):
            return self.getTypedRuleContext(gramaticaParser.PrintstatContext,0)


        def readstat(self):
            return self.getTypedRuleContext(gramaticaParser.ReadstatContext,0)


        def returnstat(self):
            return self.getTypedRuleContext(gramaticaParser.ReturnstatContext,0)


        def ifstat(self):
            return self.getTypedRuleContext(gramaticaParser.IfstatContext,0)


        def forstat(self):
            return self.getTypedRuleContext(gramaticaParser.ForstatContext,0)


        def CHAVEA(self):
            return self.getToken(gramaticaParser.CHAVEA, 0)

        def statelist(self):
            return self.getTypedRuleContext(gramaticaParser.StatelistContext,0)


        def CHAVEF(self):
            return self.getToken(gramaticaParser.CHAVEF, 0)

        def BREAK(self):
            return self.getToken(gramaticaParser.BREAK, 0)

        def getRuleIndex(self):
            return gramaticaParser.RULE_statement

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStatement" ):
                listener.enterStatement(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStatement" ):
                listener.exitStatement(self)




    def statement(self):

        localctx = gramaticaParser.StatementContext(self, self._ctx, self.state)
        self.enterRule(localctx, 10, self.RULE_statement)
        try:
            self.state = 127
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [gramaticaParser.INT, gramaticaParser.STRING, gramaticaParser.FLOAT]:
                self.enterOuterAlt(localctx, 1)
                self.state = 102
                self.vardecl()
                self.state = 103
                self.match(gramaticaParser.PONTOEVIRGULA)
                pass
            elif token in [gramaticaParser.IDENT]:
                self.enterOuterAlt(localctx, 2)
                self.state = 105
                self.atribstat()
                self.state = 106
                self.match(gramaticaParser.PONTOEVIRGULA)
                pass
            elif token in [gramaticaParser.PRINT]:
                self.enterOuterAlt(localctx, 3)
                self.state = 108
                self.printstat()
                self.state = 109
                self.match(gramaticaParser.PONTOEVIRGULA)
                pass
            elif token in [gramaticaParser.READ]:
                self.enterOuterAlt(localctx, 4)
                self.state = 111
                self.readstat()
                self.state = 112
                self.match(gramaticaParser.PONTOEVIRGULA)
                pass
            elif token in [gramaticaParser.RETURN]:
                self.enterOuterAlt(localctx, 5)
                self.state = 114
                self.returnstat()
                self.state = 115
                self.match(gramaticaParser.PONTOEVIRGULA)
                pass
            elif token in [gramaticaParser.IF]:
                self.enterOuterAlt(localctx, 6)
                self.state = 117
                self.ifstat()
                pass
            elif token in [gramaticaParser.FOR]:
                self.enterOuterAlt(localctx, 7)
                self.state = 118
                self.forstat()
                pass
            elif token in [gramaticaParser.CHAVEA]:
                self.enterOuterAlt(localctx, 8)
                self.state = 119
                self.match(gramaticaParser.CHAVEA)
                self.state = 120
                self.statelist()
                self.state = 121
                self.match(gramaticaParser.CHAVEF)
                pass
            elif token in [gramaticaParser.BREAK]:
                self.enterOuterAlt(localctx, 9)
                self.state = 123
                localctx._BREAK = self.match(gramaticaParser.BREAK)
                testar_break(localctx._BREAK)
                self.state = 125
                self.match(gramaticaParser.PONTOEVIRGULA)
                pass
            elif token in [gramaticaParser.PONTOEVIRGULA]:
                self.enterOuterAlt(localctx, 10)
                self.state = 126
                self.match(gramaticaParser.PONTOEVIRGULA)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class BContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1, inhr=None):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.inhr = None
            self.syn = None
            self._INT_CONSTANT = None # Token
            self._b = None # BContext
            self.inhr = inhr

        def COLCHA(self):
            return self.getToken(gramaticaParser.COLCHA, 0)

        def INT_CONSTANT(self):
            return self.getToken(gramaticaParser.INT_CONSTANT, 0)

        def COLCHF(self):
            return self.getToken(gramaticaParser.COLCHF, 0)

        def b(self):
            return self.getTypedRuleContext(gramaticaParser.BContext,0)


        def getRuleIndex(self):
            return gramaticaParser.RULE_b

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterB" ):
                listener.enterB(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitB" ):
                listener.exitB(self)




    def b(self, inhr):

        localctx = gramaticaParser.BContext(self, self._ctx, self.state, inhr)
        self.enterRule(localctx, 12, self.RULE_b)
        try:
            self.state = 136
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [gramaticaParser.COLCHA]:
                self.enterOuterAlt(localctx, 1)
                self.state = 129
                self.match(gramaticaParser.COLCHA)
                self.state = 130
                localctx._INT_CONSTANT = self.match(gramaticaParser.INT_CONSTANT)
                self.state = 131
                self.match(gramaticaParser.COLCHF)
                self.state = 132
                localctx._b = self.b("vector(%s, %s)" %(localctx.inhr, (None if localctx._INT_CONSTANT is None else localctx._INT_CONSTANT.text)))
                localctx.syn = localctx._b.syn
                pass
            elif token in [gramaticaParser.PONTOEVIRGULA]:
                self.enterOuterAlt(localctx, 2)
                localctx.syn = localctx.inhr
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class VardeclContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self._a = None # AContext
            self._IDENT = None # Token
            self._b = None # BContext

        def a(self):
            return self.getTypedRuleContext(gramaticaParser.AContext,0)


        def IDENT(self):
            return self.getToken(gramaticaParser.IDENT, 0)

        def b(self):
            return self.getTypedRuleContext(gramaticaParser.BContext,0)


        def getRuleIndex(self):
            return gramaticaParser.RULE_vardecl

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterVardecl" ):
                listener.enterVardecl(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitVardecl" ):
                listener.exitVardecl(self)




    def vardecl(self):

        localctx = gramaticaParser.VardeclContext(self, self._ctx, self.state)
        self.enterRule(localctx, 14, self.RULE_vardecl)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 138
            localctx._a = self.a()
            self.state = 139
            localctx._IDENT = self.match(gramaticaParser.IDENT)
            self.state = 140
            localctx._b = self.b(localctx._a.value)
            insert_symbol_table(localctx._IDENT, localctx._b.syn)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class CContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def expression(self):
            return self.getTypedRuleContext(gramaticaParser.ExpressionContext,0)


        def allocexpression(self):
            return self.getTypedRuleContext(gramaticaParser.AllocexpressionContext,0)


        def funccall(self):
            return self.getTypedRuleContext(gramaticaParser.FunccallContext,0)


        def getRuleIndex(self):
            return gramaticaParser.RULE_c

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterC" ):
                listener.enterC(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitC" ):
                listener.exitC(self)




    def c(self):

        localctx = gramaticaParser.CContext(self, self._ctx, self.state)
        self.enterRule(localctx, 16, self.RULE_c)
        try:
            self.state = 146
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,6,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 143
                self.expression()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 144
                self.allocexpression()
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)
                self.state = 145
                self.funccall()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class AtribstatContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def lvalue(self):
            return self.getTypedRuleContext(gramaticaParser.LvalueContext,0)


        def ATRIBUICAO(self):
            return self.getToken(gramaticaParser.ATRIBUICAO, 0)

        def c(self):
            return self.getTypedRuleContext(gramaticaParser.CContext,0)


        def getRuleIndex(self):
            return gramaticaParser.RULE_atribstat

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAtribstat" ):
                listener.enterAtribstat(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAtribstat" ):
                listener.exitAtribstat(self)




    def atribstat(self):

        localctx = gramaticaParser.AtribstatContext(self, self._ctx, self.state)
        self.enterRule(localctx, 18, self.RULE_atribstat)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 148
            self.lvalue()
            self.state = 149
            self.match(gramaticaParser.ATRIBUICAO)
            self.state = 150
            self.c()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class FunccallContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IDENT(self):
            return self.getToken(gramaticaParser.IDENT, 0)

        def PARENTEA(self):
            return self.getToken(gramaticaParser.PARENTEA, 0)

        def paramlistcall(self):
            return self.getTypedRuleContext(gramaticaParser.ParamlistcallContext,0)


        def PARENTEF(self):
            return self.getToken(gramaticaParser.PARENTEF, 0)

        def getRuleIndex(self):
            return gramaticaParser.RULE_funccall

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFunccall" ):
                listener.enterFunccall(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFunccall" ):
                listener.exitFunccall(self)




    def funccall(self):

        localctx = gramaticaParser.FunccallContext(self, self._ctx, self.state)
        self.enterRule(localctx, 20, self.RULE_funccall)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 152
            self.match(gramaticaParser.IDENT)
            self.state = 153
            self.match(gramaticaParser.PARENTEA)
            self.state = 154
            self.paramlistcall()
            self.state = 155
            self.match(gramaticaParser.PARENTEF)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class ParamlistcallContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IDENT(self):
            return self.getToken(gramaticaParser.IDENT, 0)

        def VIRGULA(self):
            return self.getToken(gramaticaParser.VIRGULA, 0)

        def paramlistcall(self):
            return self.getTypedRuleContext(gramaticaParser.ParamlistcallContext,0)


        def getRuleIndex(self):
            return gramaticaParser.RULE_paramlistcall

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterParamlistcall" ):
                listener.enterParamlistcall(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitParamlistcall" ):
                listener.exitParamlistcall(self)




    def paramlistcall(self):

        localctx = gramaticaParser.ParamlistcallContext(self, self._ctx, self.state)
        self.enterRule(localctx, 22, self.RULE_paramlistcall)
        try:
            self.state = 162
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,7,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 157
                self.match(gramaticaParser.IDENT)
                self.state = 158
                self.match(gramaticaParser.VIRGULA)
                self.state = 159
                self.paramlistcall()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 160
                self.match(gramaticaParser.IDENT)
                pass

            elif la_ == 3:
                self.enterOuterAlt(localctx, 3)

                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class PrintstatContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def PRINT(self):
            return self.getToken(gramaticaParser.PRINT, 0)

        def expression(self):
            return self.getTypedRuleContext(gramaticaParser.ExpressionContext,0)


        def getRuleIndex(self):
            return gramaticaParser.RULE_printstat

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterPrintstat" ):
                listener.enterPrintstat(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitPrintstat" ):
                listener.exitPrintstat(self)




    def printstat(self):

        localctx = gramaticaParser.PrintstatContext(self, self._ctx, self.state)
        self.enterRule(localctx, 24, self.RULE_printstat)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 164
            self.match(gramaticaParser.PRINT)
            self.state = 165
            self.expression()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class ReadstatContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def READ(self):
            return self.getToken(gramaticaParser.READ, 0)

        def lvalue(self):
            return self.getTypedRuleContext(gramaticaParser.LvalueContext,0)


        def getRuleIndex(self):
            return gramaticaParser.RULE_readstat

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterReadstat" ):
                listener.enterReadstat(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitReadstat" ):
                listener.exitReadstat(self)




    def readstat(self):

        localctx = gramaticaParser.ReadstatContext(self, self._ctx, self.state)
        self.enterRule(localctx, 26, self.RULE_readstat)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 167
            self.match(gramaticaParser.READ)
            self.state = 168
            self.lvalue()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class ReturnstatContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def RETURN(self):
            return self.getToken(gramaticaParser.RETURN, 0)

        def getRuleIndex(self):
            return gramaticaParser.RULE_returnstat

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterReturnstat" ):
                listener.enterReturnstat(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitReturnstat" ):
                listener.exitReturnstat(self)




    def returnstat(self):

        localctx = gramaticaParser.ReturnstatContext(self, self._ctx, self.state)
        self.enterRule(localctx, 28, self.RULE_returnstat)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 170
            self.match(gramaticaParser.RETURN)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class IfstatContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def IF(self):
            return self.getToken(gramaticaParser.IF, 0)

        def PARENTEA(self):
            return self.getToken(gramaticaParser.PARENTEA, 0)

        def expression(self):
            return self.getTypedRuleContext(gramaticaParser.ExpressionContext,0)


        def PARENTEF(self):
            return self.getToken(gramaticaParser.PARENTEF, 0)

        def statement(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(gramaticaParser.StatementContext)
            else:
                return self.getTypedRuleContext(gramaticaParser.StatementContext,i)


        def ELSE(self):
            return self.getToken(gramaticaParser.ELSE, 0)

        def getRuleIndex(self):
            return gramaticaParser.RULE_ifstat

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterIfstat" ):
                listener.enterIfstat(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitIfstat" ):
                listener.exitIfstat(self)




    def ifstat(self):

        localctx = gramaticaParser.IfstatContext(self, self._ctx, self.state)
        self.enterRule(localctx, 30, self.RULE_ifstat)
        try:
            self.state = 186
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,8,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 172
                self.match(gramaticaParser.IF)
                self.state = 173
                self.match(gramaticaParser.PARENTEA)
                self.state = 174
                self.expression()
                self.state = 175
                self.match(gramaticaParser.PARENTEF)
                self.state = 176
                self.statement()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 178
                self.match(gramaticaParser.IF)
                self.state = 179
                self.match(gramaticaParser.PARENTEA)
                self.state = 180
                self.expression()
                self.state = 181
                self.match(gramaticaParser.PARENTEF)
                self.state = 182
                self.statement()
                self.state = 183
                self.match(gramaticaParser.ELSE)
                self.state = 184
                self.statement()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class ForstatContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def FOR(self):
            return self.getToken(gramaticaParser.FOR, 0)

        def PARENTEA(self):
            return self.getToken(gramaticaParser.PARENTEA, 0)

        def atribstat(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(gramaticaParser.AtribstatContext)
            else:
                return self.getTypedRuleContext(gramaticaParser.AtribstatContext,i)


        def PONTOEVIRGULA(self, i:int=None):
            if i is None:
                return self.getTokens(gramaticaParser.PONTOEVIRGULA)
            else:
                return self.getToken(gramaticaParser.PONTOEVIRGULA, i)

        def expression(self):
            return self.getTypedRuleContext(gramaticaParser.ExpressionContext,0)


        def PARENTEF(self):
            return self.getToken(gramaticaParser.PARENTEF, 0)

        def statement(self):
            return self.getTypedRuleContext(gramaticaParser.StatementContext,0)


        def getRuleIndex(self):
            return gramaticaParser.RULE_forstat

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterForstat" ):
                listener.enterForstat(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitForstat" ):
                listener.exitForstat(self)




    def forstat(self):

        localctx = gramaticaParser.ForstatContext(self, self._ctx, self.state)
        self.enterRule(localctx, 32, self.RULE_forstat)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 188
            self.match(gramaticaParser.FOR)
            self.state = 189
            self.match(gramaticaParser.PARENTEA)
            self.state = 190
            self.atribstat()
            self.state = 191
            self.match(gramaticaParser.PONTOEVIRGULA)
            self.state = 192
            self.expression()
            self.state = 193
            self.match(gramaticaParser.PONTOEVIRGULA)
            self.state = 194
            self.atribstat()
            self.state = 195
            self.match(gramaticaParser.PARENTEF)
            entrar_laco()
            self.state = 197
            self.statement()
            sair_laco()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class StatelistContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def statement(self):
            return self.getTypedRuleContext(gramaticaParser.StatementContext,0)


        def statelist(self):
            return self.getTypedRuleContext(gramaticaParser.StatelistContext,0)


        def getRuleIndex(self):
            return gramaticaParser.RULE_statelist

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterStatelist" ):
                listener.enterStatelist(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitStatelist" ):
                listener.exitStatelist(self)




    def statelist(self):

        localctx = gramaticaParser.StatelistContext(self, self._ctx, self.state)
        self.enterRule(localctx, 34, self.RULE_statelist)
        try:
            self.state = 204
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,9,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 200
                self.statement()
                self.state = 201
                self.statelist()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 203
                self.statement()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class DContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def COLCHA(self):
            return self.getToken(gramaticaParser.COLCHA, 0)

        def numexpression(self):
            return self.getTypedRuleContext(gramaticaParser.NumexpressionContext,0)


        def COLCHF(self):
            return self.getToken(gramaticaParser.COLCHF, 0)

        def CHAVEF(self):
            return self.getToken(gramaticaParser.CHAVEF, 0)

        def d(self):
            return self.getTypedRuleContext(gramaticaParser.DContext,0)


        def getRuleIndex(self):
            return gramaticaParser.RULE_d

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterD" ):
                listener.enterD(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitD" ):
                listener.exitD(self)




    def d(self):

        localctx = gramaticaParser.DContext(self, self._ctx, self.state)
        self.enterRule(localctx, 36, self.RULE_d)
        try:
            self.state = 215
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [gramaticaParser.COLCHA]:
                self.enterOuterAlt(localctx, 1)
                self.state = 206
                self.match(gramaticaParser.COLCHA)
                self.state = 207
                self.numexpression()
                self.state = 208
                self.match(gramaticaParser.COLCHF)
                pass
            elif token in [gramaticaParser.CHAVEF]:
                self.enterOuterAlt(localctx, 2)
                self.state = 210
                self.match(gramaticaParser.CHAVEF)
                self.state = 211
                self.numexpression()
                self.state = 212
                self.match(gramaticaParser.COLCHF)
                self.state = 213
                self.d()
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class AllocexpressionContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def NEW(self):
            return self.getToken(gramaticaParser.NEW, 0)

        def a(self):
            return self.getTypedRuleContext(gramaticaParser.AContext,0)


        def d(self):
            return self.getTypedRuleContext(gramaticaParser.DContext,0)


        def getRuleIndex(self):
            return gramaticaParser.RULE_allocexpression

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterAllocexpression" ):
                listener.enterAllocexpression(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitAllocexpression" ):
                listener.exitAllocexpression(self)




    def allocexpression(self):

        localctx = gramaticaParser.AllocexpressionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 38, self.RULE_allocexpression)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 217
            self.match(gramaticaParser.NEW)
            self.state = 218
            self.a()
            self.state = 219
            self.d()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class ComparadoresContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def MENORQUE(self):
            return self.getToken(gramaticaParser.MENORQUE, 0)

        def MAIORQUE(self):
            return self.getToken(gramaticaParser.MAIORQUE, 0)

        def MENOREIGUAL(self):
            return self.getToken(gramaticaParser.MENOREIGUAL, 0)

        def MAIOREIGUAL(self):
            return self.getToken(gramaticaParser.MAIOREIGUAL, 0)

        def IGUAL(self):
            return self.getToken(gramaticaParser.IGUAL, 0)

        def DIFERENTE(self):
            return self.getToken(gramaticaParser.DIFERENTE, 0)

        def getRuleIndex(self):
            return gramaticaParser.RULE_comparadores

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterComparadores" ):
                listener.enterComparadores(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitComparadores" ):
                listener.exitComparadores(self)




    def comparadores(self):

        localctx = gramaticaParser.ComparadoresContext(self, self._ctx, self.state)
        self.enterRule(localctx, 40, self.RULE_comparadores)
        self._la = 0 # Token type
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 221
            _la = self._input.LA(1)
            if not((((_la) & ~0x3f) == 0 and ((1 << _la) & ((1 << gramaticaParser.MENORQUE) | (1 << gramaticaParser.MAIORQUE) | (1 << gramaticaParser.MENOREIGUAL) | (1 << gramaticaParser.MAIOREIGUAL) | (1 << gramaticaParser.IGUAL) | (1 << gramaticaParser.DIFERENTE))) != 0)):
                self._errHandler.recoverInline(self)
            else:
                self._errHandler.reportMatch(self)
                self.consume()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class ExpressionContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def numexpression(self, i:int=None):
            if i is None:
                return self.getTypedRuleContexts(gramaticaParser.NumexpressionContext)
            else:
                return self.getTypedRuleContext(gramaticaParser.NumexpressionContext,i)


        def comparadores(self):
            return self.getTypedRuleContext(gramaticaParser.ComparadoresContext,0)


        def getRuleIndex(self):
            return gramaticaParser.RULE_expression

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterExpression" ):
                listener.enterExpression(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitExpression" ):
                listener.exitExpression(self)




    def expression(self):

        localctx = gramaticaParser.ExpressionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 42, self.RULE_expression)
        try:
            self.state = 228
            self._errHandler.sync(self)
            la_ = self._interp.adaptivePredict(self._input,11,self._ctx)
            if la_ == 1:
                self.enterOuterAlt(localctx, 1)
                self.state = 223
                self.numexpression()
                self.state = 224
                self.comparadores()
                self.state = 225
                self.numexpression()
                pass

            elif la_ == 2:
                self.enterOuterAlt(localctx, 2)
                self.state = 227
                self.numexpression()
                pass


        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class MaisoumenosContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.value = None
            self._MAIS = None # Token
            self._MENOS = None # Token

        def MAIS(self):
            return self.getToken(gramaticaParser.MAIS, 0)

        def MENOS(self):
            return self.getToken(gramaticaParser.MENOS, 0)

        def getRuleIndex(self):
            return gramaticaParser.RULE_maisoumenos

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMaisoumenos" ):
                listener.enterMaisoumenos(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMaisoumenos" ):
                listener.exitMaisoumenos(self)




    def maisoumenos(self):

        localctx = gramaticaParser.MaisoumenosContext(self, self._ctx, self.state)
        self.enterRule(localctx, 44, self.RULE_maisoumenos)
        try:
            self.state = 234
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [gramaticaParser.MAIS]:
                self.enterOuterAlt(localctx, 1)
                self.state = 230
                localctx._MAIS = self.match(gramaticaParser.MAIS)
                localctx.value = (None if localctx._MAIS is None else localctx._MAIS.text)
                pass
            elif token in [gramaticaParser.MENOS]:
                self.enterOuterAlt(localctx, 2)
                self.state = 232
                localctx._MENOS = self.match(gramaticaParser.MENOS)
                localctx.value = (None if localctx._MENOS is None else localctx._MENOS.text)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class EContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1, inhr=None):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.inhr = None
            self.syn = None
            self._maisoumenos = None # MaisoumenosContext
            self._term = None # TermContext
            self._e = None # EContext
            self.inhr = inhr

        def maisoumenos(self):
            return self.getTypedRuleContext(gramaticaParser.MaisoumenosContext,0)


        def term(self):
            return self.getTypedRuleContext(gramaticaParser.TermContext,0)


        def e(self):
            return self.getTypedRuleContext(gramaticaParser.EContext,0)


        def getRuleIndex(self):
            return gramaticaParser.RULE_e

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterE" ):
                listener.enterE(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitE" ):
                listener.exitE(self)




    def e(self, inhr):

        localctx = gramaticaParser.EContext(self, self._ctx, self.state, inhr)
        self.enterRule(localctx, 46, self.RULE_e)
        try:
            self.state = 242
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [gramaticaParser.MAIS, gramaticaParser.MENOS]:
                self.enterOuterAlt(localctx, 1)
                self.state = 236
                localctx._maisoumenos = self.maisoumenos()
                self.state = 237
                localctx._term = self.term()
                self.state = 238
                localctx._e = self.e(Node(localctx._maisoumenos.value, localctx.inhr, localctx._term.node))
                localctx.syn = localctx._e.syn
                pass
            elif token in [gramaticaParser.COLCHF, gramaticaParser.PARENTEF, gramaticaParser.PONTOEVIRGULA, gramaticaParser.MENORQUE, gramaticaParser.MAIORQUE, gramaticaParser.MENOREIGUAL, gramaticaParser.MAIOREIGUAL, gramaticaParser.IGUAL, gramaticaParser.DIFERENTE]:
                self.enterOuterAlt(localctx, 2)
                localctx.syn = localctx.inhr
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class NumexpressionContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.node = None
            self._term = None # TermContext
            self._e = None # EContext

        def term(self):
            return self.getTypedRuleContext(gramaticaParser.TermContext,0)


        def e(self):
            return self.getTypedRuleContext(gramaticaParser.EContext,0)


        def getRuleIndex(self):
            return gramaticaParser.RULE_numexpression

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterNumexpression" ):
                listener.enterNumexpression(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitNumexpression" ):
                listener.exitNumexpression(self)




    def numexpression(self):

        localctx = gramaticaParser.NumexpressionContext(self, self._ctx, self.state)
        self.enterRule(localctx, 48, self.RULE_numexpression)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 244
            localctx._term = self.term()
            self.state = 245
            localctx._e = self.e(localctx._term.node)
            localctx.node = localctx._term.node
            insert_expression_table(localctx._e.syn)
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class MdmContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.value = None
            self._MULTIPLICACAO = None # Token
            self._DIVISAO = None # Token
            self._MODULO = None # Token

        def MULTIPLICACAO(self):
            return self.getToken(gramaticaParser.MULTIPLICACAO, 0)

        def DIVISAO(self):
            return self.getToken(gramaticaParser.DIVISAO, 0)

        def MODULO(self):
            return self.getToken(gramaticaParser.MODULO, 0)

        def getRuleIndex(self):
            return gramaticaParser.RULE_mdm

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterMdm" ):
                listener.enterMdm(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitMdm" ):
                listener.exitMdm(self)




    def mdm(self):

        localctx = gramaticaParser.MdmContext(self, self._ctx, self.state)
        self.enterRule(localctx, 50, self.RULE_mdm)
        try:
            self.state = 255
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [gramaticaParser.MULTIPLICACAO]:
                self.enterOuterAlt(localctx, 1)
                self.state = 249
                localctx._MULTIPLICACAO = self.match(gramaticaParser.MULTIPLICACAO)
                localctx.value = (None if localctx._MULTIPLICACAO is None else localctx._MULTIPLICACAO.text)
                pass
            elif token in [gramaticaParser.DIVISAO]:
                self.enterOuterAlt(localctx, 2)
                self.state = 251
                localctx._DIVISAO = self.match(gramaticaParser.DIVISAO)
                localctx.value = (None if localctx._DIVISAO is None else localctx._DIVISAO.text)
                pass
            elif token in [gramaticaParser.MODULO]:
                self.enterOuterAlt(localctx, 3)
                self.state = 253
                localctx._MODULO = self.match(gramaticaParser.MODULO)
                localctx.value = (None if localctx._MODULO is None else localctx._MODULO.text)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class FContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1, inhr=None):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.inhr = None
            self.syn = None
            self._mdm = None # MdmContext
            self._unaryexpr = None # UnaryexprContext
            self._f = None # FContext
            self.inhr = inhr

        def mdm(self):
            return self.getTypedRuleContext(gramaticaParser.MdmContext,0)


        def unaryexpr(self):
            return self.getTypedRuleContext(gramaticaParser.UnaryexprContext,0)


        def f(self):
            return self.getTypedRuleContext(gramaticaParser.FContext,0)


        def getRuleIndex(self):
            return gramaticaParser.RULE_f

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterF" ):
                listener.enterF(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitF" ):
                listener.exitF(self)




    def f(self, inhr):

        localctx = gramaticaParser.FContext(self, self._ctx, self.state, inhr)
        self.enterRule(localctx, 52, self.RULE_f)
        try:
            self.state = 263
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [gramaticaParser.MULTIPLICACAO, gramaticaParser.DIVISAO, gramaticaParser.MODULO]:
                self.enterOuterAlt(localctx, 1)
                self.state = 257
                localctx._mdm = self.mdm()
                self.state = 258
                localctx._unaryexpr = self.unaryexpr()
                self.state = 259
                localctx._f = self.f(Node(localctx._mdm.value, localctx.inhr, localctx._unaryexpr.node))
                localctx.syn = localctx._f.syn
                pass
            elif token in [gramaticaParser.COLCHF, gramaticaParser.PARENTEF, gramaticaParser.PONTOEVIRGULA, gramaticaParser.MENORQUE, gramaticaParser.MAIORQUE, gramaticaParser.MENOREIGUAL, gramaticaParser.MAIOREIGUAL, gramaticaParser.IGUAL, gramaticaParser.DIFERENTE, gramaticaParser.MAIS, gramaticaParser.MENOS]:
                self.enterOuterAlt(localctx, 2)
                localctx.syn = localctx.inhr
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class TermContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.node = None
            self._unaryexpr = None # UnaryexprContext
            self._f = None # FContext

        def unaryexpr(self):
            return self.getTypedRuleContext(gramaticaParser.UnaryexprContext,0)


        def f(self):
            return self.getTypedRuleContext(gramaticaParser.FContext,0)


        def getRuleIndex(self):
            return gramaticaParser.RULE_term

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterTerm" ):
                listener.enterTerm(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitTerm" ):
                listener.exitTerm(self)




    def term(self):

        localctx = gramaticaParser.TermContext(self, self._ctx, self.state)
        self.enterRule(localctx, 54, self.RULE_term)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 265
            localctx._unaryexpr = self.unaryexpr()
            self.state = 266
            localctx._f = self.f(localctx._unaryexpr.node)
            localctx.node = localctx._f.syn
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class UnaryexprContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.node = None
            self._maisoumenos = None # MaisoumenosContext
            self._factor = None # FactorContext

        def maisoumenos(self):
            return self.getTypedRuleContext(gramaticaParser.MaisoumenosContext,0)


        def factor(self):
            return self.getTypedRuleContext(gramaticaParser.FactorContext,0)


        def getRuleIndex(self):
            return gramaticaParser.RULE_unaryexpr

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterUnaryexpr" ):
                listener.enterUnaryexpr(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitUnaryexpr" ):
                listener.exitUnaryexpr(self)




    def unaryexpr(self):

        localctx = gramaticaParser.UnaryexprContext(self, self._ctx, self.state)
        self.enterRule(localctx, 56, self.RULE_unaryexpr)
        try:
            self.state = 276
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [gramaticaParser.MAIS, gramaticaParser.MENOS]:
                self.enterOuterAlt(localctx, 1)
                self.state = 269
                localctx._maisoumenos = self.maisoumenos()
                self.state = 270
                localctx._factor = self.factor()
                localctx.node = Node(localctx._maisoumenos.value, right=localctx._factor.node)
                pass
            elif token in [gramaticaParser.PARENTEA, gramaticaParser.NULL, gramaticaParser.IDENT, gramaticaParser.INT_CONSTANT, gramaticaParser.FLOAT_CONSTANT, gramaticaParser.STRING_CONSTANT]:
                self.enterOuterAlt(localctx, 2)
                self.state = 273
                localctx._factor = self.factor()
                localctx.node = localctx._factor.node
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class FactorContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.node = None
            self._INT_CONSTANT = None # Token
            self._FLOAT_CONSTANT = None # Token
            self._STRING_CONSTANT = None # Token
            self._NULL = None # Token
            self._lvalue = None # LvalueContext
            self._numexpression = None # NumexpressionContext

        def INT_CONSTANT(self):
            return self.getToken(gramaticaParser.INT_CONSTANT, 0)

        def FLOAT_CONSTANT(self):
            return self.getToken(gramaticaParser.FLOAT_CONSTANT, 0)

        def STRING_CONSTANT(self):
            return self.getToken(gramaticaParser.STRING_CONSTANT, 0)

        def NULL(self):
            return self.getToken(gramaticaParser.NULL, 0)

        def lvalue(self):
            return self.getTypedRuleContext(gramaticaParser.LvalueContext,0)


        def PARENTEA(self):
            return self.getToken(gramaticaParser.PARENTEA, 0)

        def numexpression(self):
            return self.getTypedRuleContext(gramaticaParser.NumexpressionContext,0)


        def PARENTEF(self):
            return self.getToken(gramaticaParser.PARENTEF, 0)

        def getRuleIndex(self):
            return gramaticaParser.RULE_factor

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterFactor" ):
                listener.enterFactor(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitFactor" ):
                listener.exitFactor(self)




    def factor(self):

        localctx = gramaticaParser.FactorContext(self, self._ctx, self.state)
        self.enterRule(localctx, 58, self.RULE_factor)
        try:
            self.state = 294
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [gramaticaParser.INT_CONSTANT]:
                self.enterOuterAlt(localctx, 1)
                self.state = 278
                localctx._INT_CONSTANT = self.match(gramaticaParser.INT_CONSTANT)
                localctx.node = Leaf(localctx._INT_CONSTANT, 'int') 
                pass
            elif token in [gramaticaParser.FLOAT_CONSTANT]:
                self.enterOuterAlt(localctx, 2)
                self.state = 280
                localctx._FLOAT_CONSTANT = self.match(gramaticaParser.FLOAT_CONSTANT)
                localctx.node = Leaf(localctx._FLOAT_CONSTANT, 'float')
                pass
            elif token in [gramaticaParser.STRING_CONSTANT]:
                self.enterOuterAlt(localctx, 3)
                self.state = 282
                localctx._STRING_CONSTANT = self.match(gramaticaParser.STRING_CONSTANT)
                localctx.node = Leaf(localctx._STRING_CONSTANT, 'str')
                pass
            elif token in [gramaticaParser.NULL]:
                self.enterOuterAlt(localctx, 4)
                self.state = 284
                localctx._NULL = self.match(gramaticaParser.NULL)
                localctx.node = Leaf(localctx._NULL, 'null')
                pass
            elif token in [gramaticaParser.IDENT]:
                self.enterOuterAlt(localctx, 5)
                self.state = 286
                localctx._lvalue = self.lvalue()
                localctx.node = localctx._lvalue.node
                pass
            elif token in [gramaticaParser.PARENTEA]:
                self.enterOuterAlt(localctx, 6)
                self.state = 289
                self.match(gramaticaParser.PARENTEA)
                self.state = 290
                localctx._numexpression = self.numexpression()
                localctx.node = localctx._numexpression.node
                self.state = 292
                self.match(gramaticaParser.PARENTEF)
                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class GContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser

        def COLCHA(self):
            return self.getToken(gramaticaParser.COLCHA, 0)

        def numexpression(self):
            return self.getTypedRuleContext(gramaticaParser.NumexpressionContext,0)


        def COLCHF(self):
            return self.getToken(gramaticaParser.COLCHF, 0)

        def g(self):
            return self.getTypedRuleContext(gramaticaParser.GContext,0)


        def getRuleIndex(self):
            return gramaticaParser.RULE_g

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterG" ):
                listener.enterG(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitG" ):
                listener.exitG(self)




    def g(self):

        localctx = gramaticaParser.GContext(self, self._ctx, self.state)
        self.enterRule(localctx, 60, self.RULE_g)
        try:
            self.state = 302
            self._errHandler.sync(self)
            token = self._input.LA(1)
            if token in [gramaticaParser.COLCHA]:
                self.enterOuterAlt(localctx, 1)
                self.state = 296
                self.match(gramaticaParser.COLCHA)
                self.state = 297
                self.numexpression()
                self.state = 298
                self.match(gramaticaParser.COLCHF)
                self.state = 299
                self.g()
                pass
            elif token in [gramaticaParser.ATRIBUICAO, gramaticaParser.COLCHF, gramaticaParser.PARENTEF, gramaticaParser.PONTOEVIRGULA, gramaticaParser.MENORQUE, gramaticaParser.MAIORQUE, gramaticaParser.MENOREIGUAL, gramaticaParser.MAIOREIGUAL, gramaticaParser.IGUAL, gramaticaParser.DIFERENTE, gramaticaParser.MAIS, gramaticaParser.MENOS, gramaticaParser.MULTIPLICACAO, gramaticaParser.DIVISAO, gramaticaParser.MODULO]:
                self.enterOuterAlt(localctx, 2)

                pass
            else:
                raise NoViableAltException(self)

        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx

    class LvalueContext(ParserRuleContext):

        def __init__(self, parser, parent:ParserRuleContext=None, invokingState:int=-1):
            super().__init__(parent, invokingState)
            self.parser = parser
            self.node = None
            self._IDENT = None # Token

        def IDENT(self):
            return self.getToken(gramaticaParser.IDENT, 0)

        def g(self):
            return self.getTypedRuleContext(gramaticaParser.GContext,0)


        def getRuleIndex(self):
            return gramaticaParser.RULE_lvalue

        def enterRule(self, listener:ParseTreeListener):
            if hasattr( listener, "enterLvalue" ):
                listener.enterLvalue(self)

        def exitRule(self, listener:ParseTreeListener):
            if hasattr( listener, "exitLvalue" ):
                listener.exitLvalue(self)




    def lvalue(self):

        localctx = gramaticaParser.LvalueContext(self, self._ctx, self.state)
        self.enterRule(localctx, 62, self.RULE_lvalue)
        try:
            self.enterOuterAlt(localctx, 1)
            self.state = 304
            localctx._IDENT = self.match(gramaticaParser.IDENT)
            localctx.node = Leaf(localctx._IDENT, 'ident')
            self.state = 306
            self.g()
        except RecognitionException as re:
            localctx.exception = re
            self._errHandler.reportError(self, re)
            self._errHandler.recover(self, re)
        finally:
            self.exitRule()
        return localctx





