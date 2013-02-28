package org.whole.crossexamples.lwc13.ui.swt;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public abstract class AbstractQuestionnaire {
	private Display display;
	private Shell shell;
	private Runnable notifier;
	private Stack<Composite> compositeStack;
	private Map<String, Style> styleMap;

	public AbstractQuestionnaire(String title) {
		this.compositeStack = new Stack<Composite>();
		this.compositeStack.push(createShell(title));
		this.styleMap = new HashMap<String, Style>();
	}

	public void show(Runnable notifier) {
		this.notifier = notifier;
		createControls();
		shellEventLoop();
	}

	protected Shell createShell(String title) {
		display = new Display();
		shell = new Shell(display);
		GridLayout layout = new GridLayout(2, false);
		layout.horizontalSpacing = layout.verticalSpacing = 10;
		layout.marginWidth = layout.marginHeight = 10; 
		shell.setLayout(layout);
		shell.setText(title);
		shell.setBounds(200, 200, 600, 800);
		return shell;
	}

	protected void shellEventLoop() {
		shell.open();
		while (!shell.isDisposed())
			if (!display.readAndDispatch())
				display.sleep();
		display.dispose();
	}

	protected Composite peekComposite() {
		return compositeStack.peek();
	}
	protected Composite pushComposite(Composite composite) {
		return compositeStack.push(composite);
	}
	protected Composite popComposite() {
		return compositeStack.pop();
	}

	public Runnable getNotifier() {
		return notifier;
	}
	public void setNotifier(Runnable notifier) {
		this.notifier = notifier;
		notifier.run();
	}

	public Style defineStyle(String name, FontStyle fontStyle, Integer fontSize, Color color) {
		Style style = new Style(fontStyle, fontSize, color);
		styleMap.put(name, style);
		return style;
	}
	public Style getStyle(String name) {
		return styleMap.get(name);
	}

	protected abstract void createControls();
}
