package color;
import java.awt.BorderLayout;

import javax.swing.JFrame;

public class ColFrame extends JFrame 
{
	public ColFrame() 
	{
		setTitle("AppColor");
		
		
		setBounds(100, 100, 300,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setJMenuBar(new ColMenu());
		add(new ColTool(), BorderLayout.NORTH);
		ColPanel pan = new ColPanel();
		//pan.setLayout(BorderLayout.CENTER);
		
		add(pan);
		
		setVisible(true);
		
		
	
		
		
		
	}
	
}