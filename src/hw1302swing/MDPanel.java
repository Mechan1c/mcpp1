package hw1302swing;


import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JColorChooser;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MDPanel extends JPanel 
{
	
	public MDPanel()
	{
		
		setLayout(new GridLayout(8, 4));
		
		JTextField txt = new JTextField("“ута буде ал€рма TextField"); 
		JButton bu1 = new JButton("Confirm");
		JButton bu2 =new JButton("Input");
		JButton bu3 =new JButton("Message");
		
		JButton buback =new JButton("Background");
		JButton bupri =new JButton("Printer");
		
		JLabel la = new JLabel("Just a Label");
		JCheckBox che = new JCheckBox("Check");
		JRadioButton rb = new JRadioButton("Radio Ga-Ga");
		
		String [] arr = {"one", "two", "three"};
		
		JList<String> jeli = new JList<String>(arr);
		JComboBox<String> comb = new JComboBox<String>(arr);
		
		JTextArea tar = new JTextArea("10 row TextArea", 10, 1);
		JTable tab = new JTable(6, 3);
		
		
		add(txt);
		
		add(bu1);	add(bu2);	add(bu3);
		
		add(buback); add(bupri);
		
		add(la);
		add(rb);
		add(che);
		add(jeli);
		add(comb);
		add(tar);
		add(tab);
		
		
		bu1.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showConfirmDialog(null, "OK?");
			}
		});

		bu2.addActionListener(new ActionListener()
		{

			@Override
			public void actionPerformed(ActionEvent e)
			{
				JOptionPane.showInputDialog("Input here");
			}
		});

		bu3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				JOptionPane.showMessageDialog(null, "It's a message dialogue");
			}
		});
		tab.addMouseListener(new MouseListener()
		{
			
			@Override
			public void mouseReleased(MouseEvent e)
			{
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e)
			{
				
				
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
			public void mouseClicked(MouseEvent e)
			{
				System.out.println("mouseClicked");
				
			}
		});
		
buback.addActionListener(new ActionListener()
{
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		Color col = JColorChooser.showDialog(null, "Choose col", Color.BLACK);
		setBackground(col);
		
	}
});
bupri.addActionListener(new ActionListener()
{
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		PrinterJob pj = PrinterJob.getPrinterJob();
		
		    if (pj.printDialog()) {
		        try {pj.print();}
		        catch (PrinterException exc) {
		            System.out.println(exc);
		         }
		     }   
		
	}
});
	}
}