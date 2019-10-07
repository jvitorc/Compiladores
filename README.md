#### Disciplina:
**INE5426** - Construção de Compiladores

#### Grupo:
João Pedro Santana

Stefano Bergamini Poletto

João Vitor Cardoso

Gustavo Ferreira Guimarães

Observações:
------------

Foi utilizada a ferramenta ANTLR4.

Arquivo `gramaticaAntlr.g4` é onde esta a gramatica construida.

Instalação e execução
---------------------

bash
$ make
Input file: tests/simple.xpp tem q mudar eu nao sei como q é o certo
...

ou

1. Instalar Python 3
bash
$ apt-get update
$ apt-get install python3 python3-pip


2. Instalar `antlr4-python3-runtime`:
bash
$ pip3 install antlr4-python3-runtime


3. Executar o compilador (deve ser executado na raiz do projeto):
bash
$ make SRC=tests/simple.xpp aqui tbm tem q mudar pelo nosso negocio
...