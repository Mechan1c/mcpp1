package color;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class ColMenu extends JMenuBar
{

	public ColMenu()
	{
		JMenu menuM = new JMenu("Edit");
		add(menuM);
		JMenuItem op = new JMenuItem("Color");
		menuM.add(op);
		
		op.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				
				Color col = JColorChooser.showDialog(null, "Choose col", Color.BLACK);
				ColPanel.setBcol(col);
				 setBackground(col);
				 
			}
		});
	}

}
