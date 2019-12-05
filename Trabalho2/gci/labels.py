temporario = 0
function_labels = {}
label_index = 0

def LabelFunc(f):
    return f + "Label:\n"

def Label():
    global label_index
    label_index = label_index + 1
    return "L%d" %label_index

def getLabel(label):
    return label + ":\n"


def getNewLine():
    return "\n"

def getTemp():
    global temporario
    temporario = temporario + 1
    return "t%d" %temporario

def getNumExpression(node=None):
    t = getTemp()
    return (t, "%s = NumExpression()\n" %t)

def getVector(t, size):
    return "vector(%s, %s)" %(t,size)

def getFunc(f):
    return f + "Label"

def getCode(code:str):
    lines = code.split('\n')
    new_code = ""
    for line in lines:
        if ":" in line:
            new_code += line
        else:
            new_code += '\t' + line + '\n'

    return new_code

