package hangmangame.extras;

import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.*;
import cs102.hangman.*;

/**
 * Panel class that has the text field for the game in it
 * @author Esad Tök
 * @version 11.04.2020
 */
public class TextFieldControlPanel extends JPanel
{
   
   // Properties
   private Hangman hangman;
   private JTextField tf;
   
   
   // Constructor
   public TextFieldControlPanel( Hangman hng )
   {
      this.hangman = hng;
      tf = new JTextField( 20 );
      tf.addActionListener( new TextListener() );
      this.add( tf );
   }
   
   
   // Methods
   
   /**
    * Named inner class for action listener of TextField that overrides action performed method
    */
   public class TextListener implements ActionListener
   {
    
      /**
       * Stores the text in the texfield as characters in a list and imlements them
       * @param evt action event
       */
      @Override
      public void actionPerformed( ActionEvent evt )
      {
         // Variables
         String str;
         ArrayList<Character> list;
         
         // Program Codes
         str = tf.getText();
         list = new ArrayList<>();
         
         // Adding all the characters in the texs string to character list
         for ( int i = 0; i < str.length(); i++ )
         {
            list.add( str.charAt( i ) );
         }
         
         // Passing all the characters in the list to tryThis() method of the Hangman (Model) class
         Iterator<Character> itr;
         itr = list.iterator();
         
         while ( itr.hasNext() )
         {
            hangman.tryThis( (Character)itr.next() );
         }
         
         tf.setText( "" ); // Clearing the text field
         
      }
   }
}