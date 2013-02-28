package org.whole.crossexamples.lwc13.ui.swt;

public abstract class AbstractLabeled {
	private String label;

	public AbstractLabeled(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}
}
