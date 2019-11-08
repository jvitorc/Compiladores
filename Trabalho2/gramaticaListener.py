# Generated from gramatica.g4 by ANTLR 4.7.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .gramaticaParser import gramaticaParser
else:
    from gramaticaParser import gramaticaParser

# This class defines a complete listener for a parse tree produced by gramaticaParser.
class gramaticaListener(ParseTreeListener):

    # Enter a parse tree produced by gramaticaParser#program.
    def enterProgram(self, ctx:gramaticaParser.ProgramContext):
        pass

    # Exit a parse tree produced by gramaticaParser#program.
    def exitProgram(self, ctx:gramaticaParser.ProgramContext):
        pass


    # Enter a parse tree produced by gramaticaParser#funclist.
    def enterFunclist(self, ctx:gramaticaParser.FunclistContext):
        pass

    # Exit a parse tree produced by gramaticaParser#funclist.
    def exitFunclist(self, ctx:gramaticaParser.FunclistContext):
        pass


    # Enter a parse tree produced by gramaticaParser#funcdef.
    def enterFuncdef(self, ctx:gramaticaParser.FuncdefContext):
        pass

    # Exit a parse tree produced by gramaticaParser#funcdef.
    def exitFuncdef(self, ctx:gramaticaParser.FuncdefContext):
        pass


    # Enter a parse tree produced by gramaticaParser#paramlist.
    def enterParamlist(self, ctx:gramaticaParser.ParamlistContext):
        pass

    # Exit a parse tree produced by gramaticaParser#paramlist.
    def exitParamlist(self, ctx:gramaticaParser.ParamlistContext):
        pass


    # Enter a parse tree produced by gramaticaParser#statement.
    def enterStatement(self, ctx:gramaticaParser.StatementContext):
        pass

    # Exit a parse tree produced by gramaticaParser#statement.
    def exitStatement(self, ctx:gramaticaParser.StatementContext):
        pass


    # Enter a parse tree produced by gramaticaParser#vardecl.
    def enterVardecl(self, ctx:gramaticaParser.VardeclContext):
        pass

    # Exit a parse tree produced by gramaticaParser#vardecl.
    def exitVardecl(self, ctx:gramaticaParser.VardeclContext):
        pass


    # Enter a parse tree produced by gramaticaParser#atribstat.
    def enterAtribstat(self, ctx:gramaticaParser.AtribstatContext):
        pass

    # Exit a parse tree produced by gramaticaParser#atribstat.
    def exitAtribstat(self, ctx:gramaticaParser.AtribstatContext):
        pass


    # Enter a parse tree produced by gramaticaParser#funccall.
    def enterFunccall(self, ctx:gramaticaParser.FunccallContext):
        pass

    # Exit a parse tree produced by gramaticaParser#funccall.
    def exitFunccall(self, ctx:gramaticaParser.FunccallContext):
        pass


    # Enter a parse tree produced by gramaticaParser#paramlistcall.
    def enterParamlistcall(self, ctx:gramaticaParser.ParamlistcallContext):
        pass

    # Exit a parse tree produced by gramaticaParser#paramlistcall.
    def exitParamlistcall(self, ctx:gramaticaParser.ParamlistcallContext):
        pass


    # Enter a parse tree produced by gramaticaParser#printstat.
    def enterPrintstat(self, ctx:gramaticaParser.PrintstatContext):
        pass

    # Exit a parse tree produced by gramaticaParser#printstat.
    def exitPrintstat(self, ctx:gramaticaParser.PrintstatContext):
        pass


    # Enter a parse tree produced by gramaticaParser#readstat.
    def enterReadstat(self, ctx:gramaticaParser.ReadstatContext):
        pass

    # Exit a parse tree produced by gramaticaParser#readstat.
    def exitReadstat(self, ctx:gramaticaParser.ReadstatContext):
        pass


    # Enter a parse tree produced by gramaticaParser#returnstat.
    def enterReturnstat(self, ctx:gramaticaParser.ReturnstatContext):
        pass

    # Exit a parse tree produced by gramaticaParser#returnstat.
    def exitReturnstat(self, ctx:gramaticaParser.ReturnstatContext):
        pass


    # Enter a parse tree produced by gramaticaParser#ifstat.
    def enterIfstat(self, ctx:gramaticaParser.IfstatContext):
        pass

    # Exit a parse tree produced by gramaticaParser#ifstat.
    def exitIfstat(self, ctx:gramaticaParser.IfstatContext):
        pass


    # Enter a parse tree produced by gramaticaParser#forstat.
    def enterForstat(self, ctx:gramaticaParser.ForstatContext):
        pass

    # Exit a parse tree produced by gramaticaParser#forstat.
    def exitForstat(self, ctx:gramaticaParser.ForstatContext):
        pass


    # Enter a parse tree produced by gramaticaParser#statelist.
    def enterStatelist(self, ctx:gramaticaParser.StatelistContext):
        pass

    # Exit a parse tree produced by gramaticaParser#statelist.
    def exitStatelist(self, ctx:gramaticaParser.StatelistContext):
        pass


    # Enter a parse tree produced by gramaticaParser#allocexpression.
    def enterAllocexpression(self, ctx:gramaticaParser.AllocexpressionContext):
        pass

    # Exit a parse tree produced by gramaticaParser#allocexpression.
    def exitAllocexpression(self, ctx:gramaticaParser.AllocexpressionContext):
        pass


    # Enter a parse tree produced by gramaticaParser#expression.
    def enterExpression(self, ctx:gramaticaParser.ExpressionContext):
        pass

    # Exit a parse tree produced by gramaticaParser#expression.
    def exitExpression(self, ctx:gramaticaParser.ExpressionContext):
        pass


    # Enter a parse tree produced by gramaticaParser#numexpression.
    def enterNumexpression(self, ctx:gramaticaParser.NumexpressionContext):
        pass

    # Exit a parse tree produced by gramaticaParser#numexpression.
    def exitNumexpression(self, ctx:gramaticaParser.NumexpressionContext):
        pass


    # Enter a parse tree produced by gramaticaParser#term.
    def enterTerm(self, ctx:gramaticaParser.TermContext):
        pass

    # Exit a parse tree produced by gramaticaParser#term.
    def exitTerm(self, ctx:gramaticaParser.TermContext):
        pass


    # Enter a parse tree produced by gramaticaParser#unaryexpr.
    def enterUnaryexpr(self, ctx:gramaticaParser.UnaryexprContext):
        pass

    # Exit a parse tree produced by gramaticaParser#unaryexpr.
    def exitUnaryexpr(self, ctx:gramaticaParser.UnaryexprContext):
        pass


    # Enter a parse tree produced by gramaticaParser#factor.
    def enterFactor(self, ctx:gramaticaParser.FactorContext):
        pass

    # Exit a parse tree produced by gramaticaParser#factor.
    def exitFactor(self, ctx:gramaticaParser.FactorContext):
        pass


    # Enter a parse tree produced by gramaticaParser#lvalue.
    def enterLvalue(self, ctx:gramaticaParser.LvalueContext):
        pass

    # Exit a parse tree produced by gramaticaParser#lvalue.
    def exitLvalue(self, ctx:gramaticaParser.LvalueContext):
        pass


