package hangmangame.extras;

import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.*;
import cs102.hangman.*;

/**
 * A proper class to implement ActionListener interfece
 * @author Esad Tök
 * @version 11.04.2020
 */
public class HangmanLetterButtonsController implements ActionListener
{
   
   // Properties
   private HangmanModel model;
   
   // Constructor
   public HangmanLetterButtonsController( HangmanModel mdl )
   {
      this.model = mdl;
   }
   
   // Methods
   
   /**
    * Tries the letters of the buttons
    * @param evt action event
    */
   @Override
   public void actionPerformed( ActionEvent evt )
   {
      // Variables
      JButton btn;
      String str;
      char ch;
      
      // Program Codes
      btn = (JButton)evt.getSource();
      str = btn.getText();
      ch = str.charAt(0);
      
      model.tryThis( ch ); // Trying the letter to know if it is correct or not
      
      btn.setEnabled( false );
   }
}