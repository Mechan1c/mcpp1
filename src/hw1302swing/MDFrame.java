package hw1302swing;
import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MDFrame extends JFrame 
{
	public MDFrame() 
	{
		setTitle("AppAllElements");
		
		
		setBounds(100, 100, 300,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setJMenuBar(new MDMenu());
		add(new MDTool(), BorderLayout.NORTH);
		add(new MDPanel(), BorderLayout.CENTER);
		
		setVisible(true);
		
		
	
		
		
		
	}
}