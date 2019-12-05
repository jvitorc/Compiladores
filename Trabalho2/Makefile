compilar:
	@sudo apt-get update
	@sudo apt install antlr4
	@sudo apt install python3 python3-pip
	@pip3 install setuptools
	@pip3 install wheel
	@pip3 install antlr4-python3-runtime

gerar_asem:
	antlr4 -Dlanguage=Python3 Asem/gramatica.g4
	@echo "from arvore import *" >> Asem/gramaticaParser.py 
	@echo "from tabela import *" >> Asem/gramaticaParser.py

gerar_gci:
	antlr4 -Dlanguage=Python3 gci/gramatica.g4
	@echo "from arvore import *" >> gci/gramaticaParser.py 
	@echo "from labels import *" >> gci/gramaticaParser.py

all: gerar_asem gerar_gci
	@python3 ./Asem/asem.py ./codigos/in.txt
	@python3 ./gci/gci.py ./codigos/in.txt
