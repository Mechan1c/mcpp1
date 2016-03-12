package hw1302swing;

import javax.swing.JButton;
import javax.swing.JToolBar;

public class MDTool extends JToolBar
{
public MDTool()
{
	
	setFloatable(true);
	setRollover(true);
	
	JButton op = new JButton("Open");
	JButton ex = new JButton("Exit");
	
	add(op);
	add(ex);
}
}
