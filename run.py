from os import system

y = system("javac -d . src/main/java/cs1302/calc/Calculator.java")
if y > 0:
	print "compile error"
	quit();
x = system("java cs1032.calc.Calculator")
if x > 0:
	print "run error"
	quit();
