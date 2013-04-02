package org.whole.crossexamples.lwc13.ui.swt;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.widgets.Control;


public class Style {
	private Integer size;
	private FontStyle style;
	private Color color;

	public Style(FontStyle style, Integer size, Color color) {
		this.size = size;
		this.style = style;
		this.color = color;
	}

	public void apply(Control control) {
		Font font = control.getFont();
		FontData[] fontData = font.getFontData();
		for (int i = 0; i < fontData.length; i++) {
			if (size != null)
				fontData[i].setHeight(size);
			if (style != null)
				fontData[i].setStyle(style.getValue());
		}
		control.setFont(new Font(control.getDisplay(), fontData));
		control.setForeground(color);
	}

	public Style merge(Style toMerge) {
		return new Style(toMerge.style != null ? toMerge.style : style,
				toMerge.size != null ? toMerge.size : size,
						toMerge.color != null ? toMerge.color : color);
	}
}
