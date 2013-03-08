package org.whole.crossexamples.lwc13.examples;

import org.whole.crossexamples.lwc13.ui.swt.AbstractQuestionnaire;
import org.whole.crossexamples.lwc13.ui.swt.BooleanControl;
import org.whole.crossexamples.lwc13.ui.swt.ColorConstants;
import org.whole.crossexamples.lwc13.ui.swt.ConditionalControl;
import org.whole.crossexamples.lwc13.ui.swt.DateControl;
import org.whole.crossexamples.lwc13.ui.swt.ExpressionControl;
import org.whole.crossexamples.lwc13.ui.swt.FontStyle;
import org.whole.crossexamples.lwc13.ui.swt.MoneyControl;
import org.whole.crossexamples.lwc13.ui.swt.QuestionType;
import org.whole.crossexamples.lwc13.ui.swt.SWTUtils;
import org.whole.crossexamples.lwc13.ui.swt.SectionControl;
import org.whole.crossexamples.lwc13.ui.swt.StringControl;

public class QLStyledExampleSWTPrototype extends AbstractQuestionnaire {
	protected SectionControl section1;
	protected StringControl firstName;
	protected StringControl lastName;
	protected DateControl birthDate;
	protected SectionControl section2;
	protected BooleanControl hasSoldHouse;
	protected BooleanControl hasBoughtHouse;
	protected BooleanControl hasMaintLoan;
	protected ConditionalControl conditional1;
	protected MoneyControl sellingPrice;
	protected MoneyControl privateDebt;
	protected ExpressionControl valueResidue;

	public QLStyledExampleSWTPrototype() {
		super("Box1HouseOwning");
		show(new Notifier());
	}

	protected class Notifier implements Runnable {
		@Override
		public void run() {
			conditional1.setVisible(hasSoldHouse.getValue()||hasMaintLoan.getValue());
			valueResidue.update(sellingPrice.getValue()-privateDebt.getValue());
		}
	};

	protected void createControls() {
		section1 = new SectionControl(peekComposite(), "General information", defineStyle("H1", FontStyle.ITALIC, 18, ColorConstants.BLUE));
		pushComposite(section1.getComposite());
		firstName = new StringControl(peekComposite(), "First name:", getNotifier());
		firstName.setStyle(defineStyle("greeny", null, null, ColorConstants.GREEN));
		lastName = new StringControl(peekComposite(), "Last name:", getNotifier());
		lastName.setStyle(getStyle("greeny"));
		birthDate = new DateControl(peekComposite(), "Birth date:", getNotifier());
		popComposite();
		section2 = new SectionControl(peekComposite(), "Main questionnaire", getStyle("H1"));
		pushComposite(section2.getComposite());
		hasSoldHouse = new BooleanControl(peekComposite(), "Did you sell a house in 2010?", getNotifier());
		hasBoughtHouse = new BooleanControl(peekComposite(), "Did you buy a house in 2010?", getNotifier());
		hasMaintLoan = new BooleanControl(peekComposite(), "Did you enter a loan for maintenance/reconstruction?", getNotifier());
		conditional1 = new ConditionalControl(peekComposite());
		pushComposite(conditional1.getComposite());
		sellingPrice = new MoneyControl(peekComposite(), "Price the house was sold for:", getNotifier());
		privateDebt =  new MoneyControl(peekComposite(), "Private debts for sold house:", getNotifier());
		valueResidue = new ExpressionControl(peekComposite(), "Value Residue:", QuestionType.MONEY);
		popComposite();
		popComposite();
	}

	public static void main(String[] args) {
		SWTUtils.runApplication(new Runnable() {
			@Override
			public void run() {
				new QLStyledExampleSWTPrototype();
			}
		});
	}
}
