import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
/**
 * Aproper class to implement the method of the ActionListener interface
 */
public class MyOtherTFActionListener implements ActionListener
{
   /**
    * @Override
    * 
    */
   @Override
   public void actionPerformed( ActionEvent evt )
   {
      // Variables
      String str;
      
      // Program Codes
      str = MyPanel.tf.getText();
      System.out.println( "TextField enter key pressed" );
      System.out.println( str );
      MyPanel.tf.setText( "" );
      MyPanel.label.setText( str );
   }
}