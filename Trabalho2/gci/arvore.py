from tabela import *
from labels import *

expression_table = []

def insert_expression_table(data):
    pass

class Node:

    def __init__(self, data, left=None, right=None):
        self.data = data
        self.left = left
        self.right = right
        self.result = ""

    def pre_order(self, l=[]):
        l.append(self.data)
        
        if type(self.left) != None:
            l = self.left.pre_order(l)

        if type(self.right) != None:
            l = self.right.pre_order(l)
        return l


    def verificar_tipo(self):
        lista_tipos = self.verificar([])
        primeiro_tipo, y = lista_tipos[0]
        for tipo, token in lista_tipos:
            if (tipo in primeiro_tipo) or (primeiro_tipo in tipo):
                pass
            else:
                return "Expressao invalida token: %s, linha: %s coluna: %s" %(token.text,token.line, token.column)
        return "Expressao valida"

    def gerar_codigo(self):

        code = ""
        if type(self.left) != None and type(self.right) != None :
            c1 = self.left.gerar_codigo()
            c2 = self.right.gerar_codigo()
            t1 = getTemp()
            code += c1 + c2
            code += "%s = %s %s %s\n" %(t1, self.left.result, self.data, self.right.result)
        else:
            c2, r2 = self.right.gerar_codigo()
            t1 = getTemp()
            code += c2
            code += "%s = %s %s\n" %(t1, self.data, self.right.result)
        self.result = t1
        return code

    def verificar(self, t=[]):
        
        if type(self.left) != None:
            t = self.left.verificar(t)

        if type(self.right) != None:
            t = self.right.verificar(t)
        return t


class Leaf:

    def __init__(self, token=None, text=None, array=[]):
        self.text = text
        self.token = token
        self.result = ""
        self.array = array

    def pre_order(self, l=[]):
        l.append(self.token.text)
        return l

    def verificar(self, t=[]):
        if self.text == 'ident':
            t.append((symbol_table[self.token.text][1], symbol_table[self.token.text][0]))
        else:
            t.append((self.text, self.token))
        return t

    def verificar_tipo(self):
        return "Expressao valida"

    def gerar_codigo(self):
        self.result =  self.token.text
        return ""

if __name__ == "__main__":

    tree = Node("1", Node("2", Leaf("T", "3"), Leaf("T", "4")), Leaf("T","5"))
    tree2 = Node("J", Node("2", Leaf("T", "3"), Leaf("T", "4")), Leaf("T","5"))
    print(tree.gerar_codigo())
    assert tree.pre_order([]) == ['1', '2', '3', '4', '5']
    assert tree2.pre_order([]) == ['J', '2', '3', '4', '5']
