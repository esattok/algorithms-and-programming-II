package hangmangame.extras;

import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.*;
import cs102.hangman.*;

/**
 * The class that represents the restart button in the hangman game
 * @author Esad Tök
 * @version 11.04.2020
 */
public class NewGameButtonControl extends JButton implements IHangmanView
{
   
   // Properties
   HangmanModel model;
   
   
   // Constructor
   public NewGameButtonControl( HangmanModel hm)
   {
      this.model = hm;
      
      // JButton implementation
      this.setText( "New Game" );
      this.setEnabled( false );
      this.addActionListener( new ButtonListener() );
   }
   
   // Methods
   
   /**
    * When the game is over enables the restart button
    * @param hm instance of hangman class
    */
   @Override
   public void updateView( Hangman hm )
   {
      if ( hm.isGameOver() )
      {
         setEnabled( true );
         GallowsHangmanView.second = 0;
         GallowsHangmanView.minute = 0;
         GallowsHangmanView.startTime = System.currentTimeMillis();
         GallowsHangmanView.t.stop();
      }
         
   }
   
   /**
    * Named inner class that implements ActionLstener and overrides the actionPerformed method for the JButton 
    */
   public class ButtonListener implements ActionListener
   {
      
      /**
       * Starts a new game
       * @param evt action event
       */
      @Override
      public void actionPerformed( ActionEvent evt )
      {
         model.initNewGame(); 
         setEnabled( false );
         GallowsHangmanView.t.restart();
         GallowsHangmanView.flag = false;
      }
   }
}