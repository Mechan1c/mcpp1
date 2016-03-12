package color;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JToolBar;

public class ColTool extends JToolBar
{
public ColTool()
{
	
	setFloatable(true);
	setRollover(true);
	
	JButton op = new JButton("Color");
	
	
	add(op);
	op.addActionListener(new ActionListener()
	{
		
		@Override
		public void actionPerformed(ActionEvent e)
		{
			Color col = JColorChooser.showDialog(null, "Choose col", Color.BLACK);
			//setBcol(col);
			 setBackground(col);
		}
	});
}
}
