# Generated from ./gramaticas/gramaticaAntlr.g4 by ANTLR 4.7.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .gramaticaAntlrParser import gramaticaAntlrParser
else:
    from gramaticaAntlrParser import gramaticaAntlrParser

# This class defines a complete listener for a parse tree produced by gramaticaAntlrParser.
class gramaticaAntlrListener(ParseTreeListener):

    # Enter a parse tree produced by gramaticaAntlrParser#program.
    def enterProgram(self, ctx:gramaticaAntlrParser.ProgramContext):
        pass

    # Exit a parse tree produced by gramaticaAntlrParser#program.
    def exitProgram(self, ctx:gramaticaAntlrParser.ProgramContext):
        pass


    # Enter a parse tree produced by gramaticaAntlrParser#statement.
    def enterStatement(self, ctx:gramaticaAntlrParser.StatementContext):
        pass

    # Exit a parse tree produced by gramaticaAntlrParser#statement.
    def exitStatement(self, ctx:gramaticaAntlrParser.StatementContext):
        pass


    # Enter a parse tree produced by gramaticaAntlrParser#vardecl.
    def enterVardecl(self, ctx:gramaticaAntlrParser.VardeclContext):
        pass

    # Exit a parse tree produced by gramaticaAntlrParser#vardecl.
    def exitVardecl(self, ctx:gramaticaAntlrParser.VardeclContext):
        pass


    # Enter a parse tree produced by gramaticaAntlrParser#a.
    def enterA(self, ctx:gramaticaAntlrParser.AContext):
        pass

    # Exit a parse tree produced by gramaticaAntlrParser#a.
    def exitA(self, ctx:gramaticaAntlrParser.AContext):
        pass


    # Enter a parse tree produced by gramaticaAntlrParser#b.
    def enterB(self, ctx:gramaticaAntlrParser.BContext):
        pass

    # Exit a parse tree produced by gramaticaAntlrParser#b.
    def exitB(self, ctx:gramaticaAntlrParser.BContext):
        pass


    # Enter a parse tree produced by gramaticaAntlrParser#atribstat.
    def enterAtribstat(self, ctx:gramaticaAntlrParser.AtribstatContext):
        pass

    # Exit a parse tree produced by gramaticaAntlrParser#atribstat.
    def exitAtribstat(self, ctx:gramaticaAntlrParser.AtribstatContext):
        pass


    # Enter a parse tree produced by gramaticaAntlrParser#printstat.
    def enterPrintstat(self, ctx:gramaticaAntlrParser.PrintstatContext):
        pass

    # Exit a parse tree produced by gramaticaAntlrParser#printstat.
    def exitPrintstat(self, ctx:gramaticaAntlrParser.PrintstatContext):
        pass


    # Enter a parse tree produced by gramaticaAntlrParser#readstat.
    def enterReadstat(self, ctx:gramaticaAntlrParser.ReadstatContext):
        pass

    # Exit a parse tree produced by gramaticaAntlrParser#readstat.
    def exitReadstat(self, ctx:gramaticaAntlrParser.ReadstatContext):
        pass


    # Enter a parse tree produced by gramaticaAntlrParser#returnstat.
    def enterReturnstat(self, ctx:gramaticaAntlrParser.ReturnstatContext):
        pass

    # Exit a parse tree produced by gramaticaAntlrParser#returnstat.
    def exitReturnstat(self, ctx:gramaticaAntlrParser.ReturnstatContext):
        pass


    # Enter a parse tree produced by gramaticaAntlrParser#ifstat.
    def enterIfstat(self, ctx:gramaticaAntlrParser.IfstatContext):
        pass

    # Exit a parse tree produced by gramaticaAntlrParser#ifstat.
    def exitIfstat(self, ctx:gramaticaAntlrParser.IfstatContext):
        pass


    # Enter a parse tree produced by gramaticaAntlrParser#forstat.
    def enterForstat(self, ctx:gramaticaAntlrParser.ForstatContext):
        pass

    # Exit a parse tree produced by gramaticaAntlrParser#forstat.
    def exitForstat(self, ctx:gramaticaAntlrParser.ForstatContext):
        pass


    # Enter a parse tree produced by gramaticaAntlrParser#statelist.
    def enterStatelist(self, ctx:gramaticaAntlrParser.StatelistContext):
        pass

    # Exit a parse tree produced by gramaticaAntlrParser#statelist.
    def exitStatelist(self, ctx:gramaticaAntlrParser.StatelistContext):
        pass


    # Enter a parse tree produced by gramaticaAntlrParser#allocexpression.
    def enterAllocexpression(self, ctx:gramaticaAntlrParser.AllocexpressionContext):
        pass

    # Exit a parse tree produced by gramaticaAntlrParser#allocexpression.
    def exitAllocexpression(self, ctx:gramaticaAntlrParser.AllocexpressionContext):
        pass


    # Enter a parse tree produced by gramaticaAntlrParser#c.
    def enterC(self, ctx:gramaticaAntlrParser.CContext):
        pass

    # Exit a parse tree produced by gramaticaAntlrParser#c.
    def exitC(self, ctx:gramaticaAntlrParser.CContext):
        pass


    # Enter a parse tree produced by gramaticaAntlrParser#expression.
    def enterExpression(self, ctx:gramaticaAntlrParser.ExpressionContext):
        pass

    # Exit a parse tree produced by gramaticaAntlrParser#expression.
    def exitExpression(self, ctx:gramaticaAntlrParser.ExpressionContext):
        pass


    # Enter a parse tree produced by gramaticaAntlrParser#numexpression.
    def enterNumexpression(self, ctx:gramaticaAntlrParser.NumexpressionContext):
        pass

    # Exit a parse tree produced by gramaticaAntlrParser#numexpression.
    def exitNumexpression(self, ctx:gramaticaAntlrParser.NumexpressionContext):
        pass


    # Enter a parse tree produced by gramaticaAntlrParser#n.
    def enterN(self, ctx:gramaticaAntlrParser.NContext):
        pass

    # Exit a parse tree produced by gramaticaAntlrParser#n.
    def exitN(self, ctx:gramaticaAntlrParser.NContext):
        pass


    # Enter a parse tree produced by gramaticaAntlrParser#term.
    def enterTerm(self, ctx:gramaticaAntlrParser.TermContext):
        pass

    # Exit a parse tree produced by gramaticaAntlrParser#term.
    def exitTerm(self, ctx:gramaticaAntlrParser.TermContext):
        pass


    # Enter a parse tree produced by gramaticaAntlrParser#e.
    def enterE(self, ctx:gramaticaAntlrParser.EContext):
        pass

    # Exit a parse tree produced by gramaticaAntlrParser#e.
    def exitE(self, ctx:gramaticaAntlrParser.EContext):
        pass


    # Enter a parse tree produced by gramaticaAntlrParser#unaryexpr.
    def enterUnaryexpr(self, ctx:gramaticaAntlrParser.UnaryexprContext):
        pass

    # Exit a parse tree produced by gramaticaAntlrParser#unaryexpr.
    def exitUnaryexpr(self, ctx:gramaticaAntlrParser.UnaryexprContext):
        pass


    # Enter a parse tree produced by gramaticaAntlrParser#factor.
    def enterFactor(self, ctx:gramaticaAntlrParser.FactorContext):
        pass

    # Exit a parse tree produced by gramaticaAntlrParser#factor.
    def exitFactor(self, ctx:gramaticaAntlrParser.FactorContext):
        pass


    # Enter a parse tree produced by gramaticaAntlrParser#lvalue.
    def enterLvalue(self, ctx:gramaticaAntlrParser.LvalueContext):
        pass

    # Exit a parse tree produced by gramaticaAntlrParser#lvalue.
    def exitLvalue(self, ctx:gramaticaAntlrParser.LvalueContext):
        pass


    # Enter a parse tree produced by gramaticaAntlrParser#g.
    def enterG(self, ctx:gramaticaAntlrParser.GContext):
        pass

    # Exit a parse tree produced by gramaticaAntlrParser#g.
    def exitG(self, ctx:gramaticaAntlrParser.GContext):
        pass


