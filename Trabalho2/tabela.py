symbol_table = {}

def insert_symbol_table(name, t):
    if name not in symbol_table.keys():
        symbol_table[name] = t
