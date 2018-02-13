package org.whole.crossexamples.cg13.prototypes.java;


public class MainProgram {
	public static void runFactorialProgramInJava() {
		int n, result;
		{
			n = 4;
			result = 1;
			while (n > 0) {
				result = result * n;
				n = n -1;
			}
		}
	}
	public static Statement createFactorialProgram(AbstractFactory f) {
		return f.createBlock(
				f.createAssignment("n", f.createInt(4)),
				f.createAssignment("result", f.createInt(1)),
				f.createWhile(f.createGreaterThan(f.createVariable("n"), f.createInt(0)), f.createBlock(
						f.createAssignment("result",
								f.createMultiplication(f.createVariable("result"), f.createVariable("n"))),
						f.createAssignment("n",
								f.createSubtraction(f.createVariable("n"), f.createInt(1)))
				)));
	}

	public static void main(String[] args) {
		runFactorialProgramInJava();

		createFactorialProgram(ConcreteFactory.instance());
	}
}
