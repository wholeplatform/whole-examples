package org.whole.crossexamples.lwc13.ui.swt;

import org.eclipse.swt.widgets.Composite;
import org.whole.lang.model.IEntity;

public abstract class AbstractValued<V> extends AbstractLabeled implements Styled {
	private V value;
	private Runnable notifier;

	public AbstractValued(Composite parent, String label, V value, Runnable notifier, Style style) {
		super(label);
		this.value = value;
		this.notifier = notifier;
	}

	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	@SuppressWarnings("unchecked")
	public void setValue(IEntity value) {
		setValue((V) value.wGetValue());
	}
	protected void notifyChanged() {
		notifier.run();
	}
}
