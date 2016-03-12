package hw1302swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MDMenu extends JMenuBar
{

	public MDMenu()
	{
		JMenu menuM = new JMenu("File");
		add(menuM);
		JMenuItem op = new JMenuItem("Open");
		JMenuItem ex = new JMenuItem("Close");
		menuM.add(op);
		
		menuM.add(ex);
		
		op.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				JFileChooser ff = new JFileChooser();
				ff.showOpenDialog(null);
				
			}
		});
	}

}
