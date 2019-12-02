expression_table = []

def insert_expression_table(data):
    expression_table.append(data)


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


class Leaf:

    def __init__(self, token=None, data=None):
        self.data = data
        self.type = token

    def pre_order(self, l=[]):
        l.append(self.data)        
        return l

if __name__ == "__main__":

    tree = Node("1", Node("2", Leaf("T", "3"), Leaf("T", "4")), Leaf("T","5"))
    tree2 = Node("J", Node("2", Leaf("T", "3"), Leaf("T", "4")), Leaf("T","5"))
    assert tree.pre_order([]) == ['1', '2', '3', '4', '5']
    assert tree2.pre_order([]) == ['J', '2', '3', '4', '5']
