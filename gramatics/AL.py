import importlib
import sys
from antlr4 import *
from gramaticaAntlrLexer import gramaticaAntlrLexer
from gramaticaAntlrParser import gramaticaAntlrParser


def main(argv):
    input_stream = FileStream(argv[1])
    lexer = gramaticaAntlrLexer(input_stream)
    dump_tokens(lexer);
    # stream = CommonTokenStream(lexer)
    # stream.getNumberOfOnChannelTokens()
    # for x in stream.getTokens(0, 1000):
    #     print(x.text)
    # parser = gramaticaAntlrParser(stream)
    # tree = parser.program()
    # print(tree.getText())

def print_table(header, table, sizes):
    row_format = ''

    for s in sizes:
        row_format += "| {:<" + str(s) + "} "

    row_format += '|'

    header_row = row_format.format(*header)

    print('-' * len(header_row))
    print(header_row)
    print('-' * len(header_row))

    for row in table:
        print(row_format.format(*row))
    print('-' * len(header_row))

def dump_tokens(lexer):
    tokens = lexer.getAllTokens()

    table = []

    for i, token in enumerate(tokens):
        type_ = (
            XppLexer.literalNames[token.type]
            if token.type < len(XppLexer.literalNames)
            else literal_types.get(token.type)
        )

        table.append([
            str(i),
            token.text,
            str((token.line, token.column)),
            str(type_)
        ])

    print_table(
        ['Index', 'Token', 'Line/Column', 'Type'],
        table,
        [5, max(len(t.text) for t in tokens), 12, 13],
    )


if __name__ == '__main__':
    main(sys.argv)
