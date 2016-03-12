package color;


import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.SwingUtilities;

public class ColPanel extends JPanel 
{

	public ColPanel()
	{

		setLayout(new GridLayout(8, 4));


		JButton bu1 = new JButton("Color");


		add(bu1);	

		JMenuItem op = new JMenuItem("Color");
		

		bu1.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				Color col = JColorChooser.showDialog(null, "Choose col", Color.BLACK);
				//setBcol(col);
				setBackground(col);
			}
		});
		addMouseListener(new MouseListener()
		{

			@Override
			public void mouseReleased(MouseEvent e)
			{
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e)
			{
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e)
			{
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e)
			{
				// TODO Auto-generated method stub

			}


			@Override
			public void mouseClicked(MouseEvent e) {
				if(SwingUtilities.isRightMouseButton(e))
				{
					
					//Color color = JColorChooser.showDialog(null, "¬ведите цвет", Color.white);
					//setBackground(color);
					JPopupMenu pm = new JPopupMenu();
					pm.add(op);
					
				}

			}

		});


	}


}