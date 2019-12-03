from tabela import *

expression_table = []

def insert_expression_table(data):
    expression_table.append( (data.pre_order([]) ,data.verificar_tipo()) )

class Node:

    def __init__(self, data, left=None, right=None):
        self.data = data
        self.left = left
        self.right = right

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



    def verificar(self, t=[]):
        
        if type(self.left) != None:
            t = self.left.verificar(t)

        if type(self.right) != None:
            t = self.right.verificar(t)
        return t


class Leaf:

    def __init__(self, token=None, text=None):
        self.text = text
        self.token = token

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

if __name__ == "__main__":

    tree = Node("1", Node("2", Leaf("T", "3"), Leaf("T", "4")), Leaf("T","5"))
    tree2 = Node("J", Node("2", Leaf("T", "3"), Leaf("T", "4")), Leaf("T","5"))
    assert tree.pre_order([]) == ['1', '2', '3', '4', '5']
    assert tree2.pre_order([]) == ['J', '2', '3', '4', '5']
