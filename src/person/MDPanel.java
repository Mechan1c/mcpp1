package person;

import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class MDPanel extends JPanel 
{
	
	public MDPanel()
	{
		
		setLayout(null);
		
		
		JButton c = new JButton("Create");
		JButton r =new JButton("Read");
		JButton u =new JButton("Update");		
		JButton d =new JButton("Delete");
		
		JTextField txtC = new JTextField("Value");
		JTextField txtR = new JTextField("Value"); 
		JTextField txtU = new JTextField("Value"); 
		JTextField txtD = new JTextField("Value"); 	
		
		JTable tab = new JTable(12,4);	
		
		Rectangle rec = new Rectangle(80, 30);
		
		c.setBounds(20, 10, rec.width, rec.height);
		r.setBounds(110, 10, rec.width, rec.height);
		u.setBounds(200, 10, rec.width, rec.height);
		d.setBounds(290, 10, rec.width, rec.height);
		
		txtC.setBounds(20, 50, rec.width, rec.height);
		txtR.setBounds(110, 50, rec.width, rec.height);
		txtU.setBounds(200, 50, rec.width, rec.height);
		txtD.setBounds(290, 50, rec.width, rec.height);
		
		tab.setBounds(10, 100, 360, 200);
		add(c);		add(r);		add(u); 	add(d);
		add(txtC);	add(txtR);	add(txtU);	add(txtD);	
		add(tab);
		
		c.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showConfirmDialog(null, "OK?");
			}
		});

		r.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showInputDialog("Input here");
			}
		});

		u.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				JOptionPane.showMessageDialog(null, "It's a message dialogue");
			}
		});
		d.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				JOptionPane.showMessageDialog(null, "It's a message dialogue");
			}
		});

	}
}