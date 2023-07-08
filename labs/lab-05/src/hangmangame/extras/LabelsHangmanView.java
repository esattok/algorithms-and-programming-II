package hangmangame.extras;

import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.*;
import cs102.hangman.*;
 

/**
 * The class that generates the labels of the hangman game
 * @author Esad Tök
 * @version 11.04.2020
 */
public class LabelsHangmanView extends JPanel implements IHangmanView
{
   
   // Properties
   private boolean hasLost;
   private boolean isGameOver;
   private JLabel numOfIncorrect, knownSoFar, usedLetters, lostOrWin ;
   
   // Constructor
   public LabelsHangmanView()
   {
      // Label Implementation
      hasLost = false;
      isGameOver = false;
      
      numOfIncorrect = new JLabel("");
      
      knownSoFar = new JLabel("");
      knownSoFar.setHorizontalAlignment( SwingConstants.CENTER );
      
      usedLetters = new JLabel("");
      usedLetters.setHorizontalAlignment( SwingConstants.CENTER );
      
      lostOrWin = new JLabel("");
      lostOrWin.setFont( new Font( Font.SANS_SERIF, 2, 24 ) );
      lostOrWin.setHorizontalAlignment( SwingConstants.CENTER );
      
      // Panel Implementation
      this.setLayout( new GridLayout( 4, 1 ) );
      this.setBackground( Color.green );
      this.add( knownSoFar );
      this.add( lostOrWin );
      this.add( numOfIncorrect );
      this.add( usedLetters );
   }
   
   // Methods
   
   /**
    * Updates the GUI view of the hangman game
    * @param hm hangmen instance
    */
   @Override
   public void updateView( Hangman hm )
   {
      numOfIncorrect.setText( "Remaining Tries: " +( hm.getMaxAllowedIncorrectTries() - hm.getNumOfIncorrectTries() ) );
      knownSoFar.setText( "" + hm.getKnownSoFar());
      usedLetters.setText( "" + hm.getUsedLetters() );
      hasLost = hm.hasLost();
      isGameOver = hm.isGameOver();
      
      if ( !hasLost && isGameOver  )
      {
         lostOrWin.setText( "You Win" );
         
      }
      else if ( hasLost && isGameOver )
      {
         lostOrWin.setText( "You Lost" );
      }
      
      else 
      {
         lostOrWin.setText( "" );
      }
   }
}