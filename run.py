from os import system
comp = system("javac -d . src/main/java/cs1302/calc/calcButton.java");
if (comp>0):
	print "Compile Error size: ", comp;
	quit();

run = system("java calcButton");
if (run>0):
	print "Run error size: ", run
	quit()
