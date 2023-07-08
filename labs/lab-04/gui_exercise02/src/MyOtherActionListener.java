import java.awt.event.*; 
import java.awt.*;
import javax.swing.*;
/**
 * A proper outer class
 */
class MyOtherActionListener implements ActionListener 
{ 
   public void actionPerformed(ActionEvent e) 
   { 
      // Variables
      boolean flag;
      
      // Program Codes
      if ( MyPanel.b.getText().equals("OK") )
      {
         flag = false;
      }
      else
      {
         flag = true;
      }
      
      if ( flag )
      {
        MyPanel.b.setText( "OK" ); 
      }
      else
      {
         MyPanel.b.setText( "Maybe" ); 
      }
      
      System.out.println( "Button pressed!" ); 
   }       
}