package org.whole.crossexamples.lwc16.minijava.model;

import org.whole.lang.model.EnumType;
import org.whole.lang.model.EnumValueImpl;

/** 
 * @generator Whole
 */
public class InfixOperatorEnum extends EnumType<InfixOperatorEnum.Value> {
	public static final int plus_ord = 0;
	public static final int minus_ord = 1;
	public static final int times_ord = 2;
	public static final int less_ord = 3;
	public static final int and_ord = 4;
	public static final InfixOperatorEnum instance = new InfixOperatorEnum();
	public static final Value plus = instance.valueOf(plus_ord);
	public static final Value minus = instance.valueOf(minus_ord);
	public static final Value times = instance.valueOf(times_ord);
	public static final Value less = instance.valueOf(less_ord);
	public static final Value and = instance.valueOf(and_ord);

	private InfixOperatorEnum() {
		enumValue(plus_ord, "plus");
		enumValue(minus_ord, "minus");
		enumValue(times_ord, "times");
		enumValue(less_ord, "less");
		enumValue(and_ord, "and");
	}

	private static final long serialVersionUID = 1;

	protected void enumValue(int ordinal, String name) {
		if (valueOf(name) == null)
			putEnumValue(new Value(ordinal, name));
	}

	protected void enumValue(int ordinal, String name, String implName) {
		if (valueOf(name) == null)
			putEnumValue(new Value(ordinal, name, implName));
	}

	public static class Value extends EnumValueImpl {
		private static final long serialVersionUID = 1;

		public Value() {
			super();
		}

		public Value(int ordinal, String name) {
			super(ordinal, name);
		}

		public Value(int ordinal, String name, String implName) {
			super(ordinal, name, implName);
		}
	}
}
