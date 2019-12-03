symbol_table = {}

def insert_symbol_table(name, t):
    if name.text not in symbol_table.keys():
        symbol_table[name.text] = (name, t)


lacos = 0
erros_breaks = []

def entrar_laco():
    global lacos
    lacos = lacos + 1

def sair_laco():
    global lacos
    lacos = lacos - 1

def testar_break(token):
    global lacos
    if lacos < 1:
        erros_breaks.append("Break fora do laco (linha/coluna): (%s/%s)" %(token.line, token.column))
