package hangmangame.extras;

import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.*;
import cs102.hangman.*;

/**
 * Extends the control buttons class and adds overrides the updateView method and changes the state of buttons
 * @author Esad Tök
 * @version 11.04.2020
 */
public class HangmanLetterButtonControls extends LetterButtonControls implements IHangmanView
{
   
   // Properties
   
   
   // Constructor
   public HangmanLetterButtonControls( String letters, int rows, int cols )
   {
      super( letters, rows, cols );
   }
   
   // Methods
   
   /**
    * Disables the used letters by the Text Field object as well
    * @param hm model object
    */
   @Override
   public void updateView( Hangman hm)
   {
      // Variables
      String letters;
      
      // Program Code
      letters = hm.getUsedLetters();
      setDisabled( letters );
      
      if ( hm.isGameOver() )
      {
         setEnabledAll( false );
      }
      
      else if ( hm.getUsedLetters().length() == 0 )
      {
         setEnabledAll( true );
      }
   }
}