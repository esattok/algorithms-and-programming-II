package hangmangame.extras;

import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.*;
import cs102.hangman.*;

/**
 * LetterButtonControls - keyboard for MVC demo of Hangman, but general purpose.
 * @author Esad Tök
 * @version 11.04.2020
 */
public class LetterButtonControls extends JPanel 
{
   
   // Properties
   
   
   // Constructors
   public LetterButtonControls(String letters) 
   {
      this(letters, 2, 13);
   }
   
   /**
    * Second constructor
    * @param letters the list of characters to include
    * @param rows row number of the table
    * @parma cols column number of the table
    */
   public LetterButtonControls(String letters, int rows, int cols) 
   {
      setBorder(new TitledBorder("Choose a letter..."));
      setLayout(new GridLayout(rows, cols));
      
      for (int i = 0; i < letters.length(); i++) 
      {
         JButton b = new JButton("" + letters.charAt(i));
         b.setMargin(new Insets(1, 2, 1, 2));
         add(b);
      }
   }
      
   // Methods
   
   /**
    * Adds an action listener to all buttons
    * @param l ActionListener object
    */
   public void addActionListener(ActionListener l) 
   {
      Component[] buttons = getComponents();
      for (Component b : buttons) 
      {
         ((JButton) b).addActionListener(l);
      }
   }
   
   /**
    * Enables or disenables all the buttons
    * @param state true or false
    */
   public void setEnabledAll(boolean state) 
   {
      for (Component c : getComponents()) 
      {
         ((JButton) c).setEnabled(state);
      }
   }
   
   /**
    * Disables the buttons including specific letters
    * @param letters letters belonging the buttons to be disabled
    */
   public void setDisabled(String letters) 
   {
      letters = letters.toLowerCase();    // bug fix! ?think about this!
      
      for (Component c : getComponents()) 
      {
         char ch = ((JButton) c).getText().charAt(0);
         ch = Character.toLowerCase(ch);  // bug fix!
         
         if (letters.indexOf(ch) >= 0) 
         {
            ((JButton) c).setEnabled(false);
         }
      }
   }
}