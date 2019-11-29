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

    tree = Node("1", Node("2", Left("3", "T"), Left("4", "T")), Left("A","T"))
    assert tree.pre_order() == ['1', '2', '3', '4', 'A']
