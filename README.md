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
$ make RUN_AL_1
Esse make é o utilizado para os Analisadores Léxicos já realizando o teste
no programa codigo_1.ccc, para realizar o teste no 2 ou 3 basta trocar o 
número para código desejado.

bash
$ make RUN_AS_1
Esse make segue a mesma lógica do AL porém é para o Analisador Sintático.

O caminho para os arquivos de teste (códigos) partindo da raiz é gramatics/codigos/
...

ou

1. Instalar Python 3
bash
$ apt-get update
$ apt-get install python3 python3-pip


2. Instalar `antlr4-python3-runtime`:
bash
$ pip3 install antlr4-python3-runtime


3. Executar o compilador (deve ser executado na pasta gramaticas):
bash
$ antlr4 -Dlanguage=Python3 gramaticaAntlr.g4
Volta a pasta gramatics e executa o AL:
bash
$ python3 AL.py ./gramatics/codigos/codigo_1.ccc

Modo manual para realizar os testes com os arquivos de teste (códigos)
Novamente para testar outro código basta mudar o numero "1" para 2 ou 3.
Para executar o AS basta mudar o "AL.py" para AS.py.
...