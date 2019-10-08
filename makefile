compilar:
	sudo apt install antlr4
	sudo apt install python3-pip
	pip3 install setuptools
	pip3 install wheel
	pip3 install antlr4-python3-runtime

RUN_AL_1:
	python3 ./gramatics/AL.py ./gramatics/codigos/codigo_1.ccc

RUN_AL_2:
	python3 ./gramatics/AL.py ./gramatics/codigos/codigo_2.ccc

RUN_AL_3:
	python3 ./gramatics/AL.py ./gramatics/codigos/codigo_3.ccc

RUN_AS_1:
	python3 ./gramatics/AS.py ./gramatics/codigos/codigo_1.ccc

RUN_AS_2:
	python3 ./gramatics/AS.py ./gramatics/codigos/codigo_2.ccc

RUN_AS_3:
	python3 ./gramatics/AS.py ./gramatics/codigos/codigo_3.ccc