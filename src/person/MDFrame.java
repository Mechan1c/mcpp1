package person;
import java.awt.BorderLayout;

import javax.swing.JFrame;

public class MDFrame extends JFrame 
{
	public MDFrame() 
	{
		setTitle("AppPerson");
			
		setBounds(100, 100, 400,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		add(new MDPanel(), BorderLayout.CENTER);
		
		setVisible(true);
		
		
	
		
		
		
	}
}