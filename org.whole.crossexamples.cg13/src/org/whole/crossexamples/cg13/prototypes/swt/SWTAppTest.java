package org.whole.crossexamples.cg13.prototypes.swt;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;
import org.whole.crossexamples.cg13.patterns.swt.SWTUtils;

public class SWTAppTest {

    public static void main(String[] args) {
        SWTUtils.runApplication(new Runnable() {

            @Override
            public void run() {
                Display display = new Display();
                Shell shell = new Shell(display);
                shell.setText("shell title");
                RowLayout layout = new RowLayout(SWT.VERTICAL);
                layout.spacing = 5;
                shell.setLayout(layout);
                new Button(shell, SWT.ARROW | SWT.UP);
                Label label = new Label(shell, SWT.NONE);
                label.setToolTipText("toolTip text");
                label.setText("label text");
                Composite composite = new Composite(shell, SWT.NONE);
                RowLayout layout1 = new RowLayout(SWT.HORIZONTAL);
                composite.setLayout(layout1);
                Button button = new Button(composite, SWT.PUSH);
                button.setText("nested button");
                Label label1 = new Label(composite, SWT.NONE);
                label1.setText("nested text");
                Group group = new Group(shell, SWT.NONE);
                group.setText("group title");
                RowLayout layout2 = new RowLayout(SWT.VERTICAL);
                group.setLayout(layout2);
                Button button1 = new Button(group, SWT.PUSH);
                button1.setText("nested button");
                Label label2 = new Label(group, SWT.NONE);
                label2.setText("nested text");
                Button button2 = new Button(shell, SWT.PUSH);
                button2.setEnabled(false);
                button2.setText("button text");
                shell.open();
                while (!shell.isDisposed())
                    if (!display.readAndDispatch())
                        display.sleep();
                display.dispose();
            }
        });
    }
}
