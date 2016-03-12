package color;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;
import javax.swing.JPanel;

public class ColComand 
{
 ActionColor aColor = new ActionColor();
 
 JPanel pnl = null;
 
 class ActionColor implements ActionListener
 {

  @Override
  public void actionPerformed(ActionEvent e)
  {
   Color color = JColorChooser.showDialog(null, "¬ведите цвет", Color.white);
   pnl.setBackground(color);
   
  }
  
 }

}