package org.whole.crossexamples.lwc13.ui.swt;

import org.eclipse.swt.graphics.Color;

public class StyleAttribute<T> {
	private final StyleType type;
	private final T value;

	protected StyleAttribute(StyleType type, T value) {
		this.type = type;
		this.value = value;
	}

	public static StyleAttribute<FontStyle> createFontStyle(FontStyle style) {
		return new StyleAttribute<FontStyle>(StyleType.FONT_STYLE, style);
	}

	public static StyleAttribute<Integer> createFontSize(int size) {
		return new StyleAttribute<Integer>(StyleType.FONT_SIZE, size);
	}

	public static StyleAttribute<Color> createColor(Color color) {
		return new StyleAttribute<Color>(StyleType.COLOR, color);
	}

	public StyleType getType() {
		return type;
	}

	@SuppressWarnings("unchecked")
	public <V> V getValue() {
		return (V) value;
	}
}
