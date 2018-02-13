package org.whole.crossexamples.cg13.prototypes.java;

public class ConcreteFactory implements AbstractFactory {
// Singleton (early)
//	private static ILAbstractFactory instance = new ILConcreteFactory();
//	protected ILConcreteFactory() {}

	// Singleton (lazy)
	private static AbstractFactory instance;
	public static AbstractFactory instance() {
		if (instance == null)
			instance = new ConcreteFactory();
		return instance;
	}
	protected ConcreteFactory() {}

// Singeton (lazy, concurrency-aware)
//	private static class SingletonHolder {
//		private static final ILAbstractFactory instance = new ILConcreteFactory();
//	}
//	public static ILConcreteFactory instance() {
//		return SingletonHolder.instance;
//	}
//	protected ILConcreteFactory() {}

	
    public Statement createWhile(Expression exp, Statement stm) {
    	return new While(exp, stm);
    }
    public Statement createIf(Expression exp, Statement thenStm, Statement elseStm) {
    	If ifStm = new If();
    	ifStm.setCondition(exp);
    	ifStm.setTrueBody(thenStm);
    	ifStm.setFalseBody(elseStm);
    	return ifStm;
    }
    public Statement createEmpty() {
    	return new Empty();
    }
    public Statement createAssignment(String var, Expression exp) {
    	return new Assignment((Variable) createVariable(var), exp);
    }
    public Statement createBlock(Statement... stms) {
    	return new Block(stms);
    }
    public Literal createBoolean(boolean val) {
    	return Bool.instance(val);
    }
    public Literal createInt(int val) {
    	return new Int(val);
    }
    public Expression createVariable(String name) {
    	return new Variable(name);
    }
    public Expression createAddition(Expression exp1, Expression exp2) {
    	return new Addition(exp1, exp2);
    }
    public Expression createSubtraction(Expression exp1, Expression exp2) {
    	return new Subtraction(exp1, exp2);
    }
    public Expression createMultiplication(Expression exp1, Expression exp2) {
    	return new Multiplication(exp1, exp2);
    }
    public Expression createDivision(Expression exp1, Expression exp2) {
    	return new Division(exp1, exp2);
    }
    public Expression createAnd(Expression exp1, Expression exp2) {
    	return new And(exp1, exp2);
    }
    public Expression createOr(Expression exp1, Expression exp2) {
    	return new Or(exp1, exp2);
    }
    public Expression createNot(Expression exp) {
    	return new Not(exp);
    }
    public Expression createEquals(Expression exp1, Expression exp2) {
    	return new Equals(exp1, exp2);
    }
    public Expression createLessThan(Expression exp1, Expression exp2) {
    	return new LessThan(exp1, exp2);
    }
    public Expression createGreaterThan(Expression exp1, Expression exp2) {
    	return new GreaterThan(exp1, exp2);
    }
}
