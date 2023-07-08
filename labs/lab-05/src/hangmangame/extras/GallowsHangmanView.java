package hangmangame.extras;

import java.util.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.border.*;
import java.text.DecimalFormat;
import cs102.hangman.*;

/**
 * Paints the hangman to this panel
 * @author Esad Tök
 * @version 11.04.2020
 */
public class GallowsHangmanView extends JPanel implements IHangmanView
{
   
   // Properties
   private ImageIcon winIcon;
   private ImageIcon loseIcon;
   private ImageIcon loseIconBig;
   private HangmanModel model;
   private int count;
   protected static javax.swing.Timer t;
   protected static long startTime;
   protected static int minute;
   protected static int second;
   protected static boolean flag;
   
   // Constructor
   public GallowsHangmanView()
   {
      count = 0;
      flag = false;
      winIcon = new ImageIcon( "/Users/esattok/desktop/cs102/labs/lab05/images/Homer-Simpson-04-Happy-icon-2.png" );
      loseIcon = new ImageIcon( "/Users/esattok/desktop/cs102/labs/lab05/images/Messaging-Sad-icon-3.png" );
      loseIconBig = new ImageIcon( "/Users/esattok/desktop/cs102/labs/lab05/images/Sad-Tux-icon.png" );
      this.setBackground( Color.cyan );
      
      // Implementing timer
      second = 0;
      minute = 0;
      startTime = System.currentTimeMillis();
      t = new javax.swing.Timer( 1000, new TimerListener() );
      t.start();
   }
   
   // Methods
   
   /**
    * Draws the gallows and counts the time
    * @param g graphics
    */
   @Override
   public void paintComponent( Graphics g )
   {
      
      super.paintComponent( g );
      
      // Painting the gallows
      g.fillRect( 30, 200, 150, 20 );
      g.fillRect( 50, 50, 7, 150 );
      g.fillRect( 57, 50, 70, 10 );
      g.fillRect( 123, 60, 4, 30 );
      
      if ( count == 1 )
      { 
         g.drawOval( 110, 90, 30, 30 );
      }
      
      if ( count == 2 )
      {
         g.drawOval( 110, 90, 30, 30 );
         g.fillRect( 124, 120, 1, 28 );
      }
      
      if ( count == 3 )
      {
         g.drawOval( 110, 90, 30, 30 );
         g.fillRect( 124, 120, 1, 28 );
         g.drawLine( 124, 148, 104, 170 );
      }
      
      if ( count == 4 )
      {
         g.drawOval( 110, 90, 30, 30 );
         g.fillRect( 124, 120, 1, 28 );
         g.drawLine( 124, 148, 104, 170 );
         g.drawLine( 124, 148, 144, 170 );
      }
      
      if ( count == 5 )
      {
         g.drawOval( 110, 90, 30, 30 );
         g.fillRect( 124, 120, 1, 28 );
         g.drawLine( 124, 148, 104, 170 );
         g.drawLine( 124, 148, 144, 170 );
         g.drawLine( 124, 125, 109, 140 );
      }
      
      if ( count == 6 )
      {
         g.drawOval( 110, 90, 30, 30 );
         g.fillRect( 124, 120, 1, 28 );
         g.drawLine( 124, 148, 104, 170 );
         g.drawLine( 124, 148, 144, 170 );
         g.drawLine( 124, 125, 109, 140 );
         g.drawLine( 124, 125, 139, 140 ); 
         loseIcon.paintIcon( this, g, 109, 90 ); // painting sad face at the end if loose
      }
      
      // In case of win paint happy face and say "Good Job"
      if ( flag  )
      {
         g.setColor( Color.gray );
         g.setFont( new Font( Font.DIALOG, Font.ITALIC, 37 ) );
         
         winIcon.paintIcon( this, g, 250, 80 );
         g.drawString( "Good Job !!!", 95, 320 );
      }
      
      // In case of loose paint sad face and say "Unlucky"
      else if ( !flag && count >= 6 )
      {
         g.setColor( Color.gray );
         g.setFont( new Font( Font.DIALOG, Font.ITALIC, 40 ) );
         
         loseIconBig.paintIcon( this, g, 250, 80 );
         g.drawString( "Unlucky", 136, 320 );
      }
      
      // Counting the time
      DecimalFormat df;
      df = new DecimalFormat( "00" );
      
      g.setFont( new Font( Font.SERIF, Font.BOLD, 17 ) );
      g.setColor( Color.red );
      g.drawString( ( "Elapsed Time  " + df.format(minute) + " : " + df.format(second)), 205, 30 ); 
   }
   
   
   /**
    * Updates the GUI view of the hangman game
    * @param hm hangmen instance
    */
   @Override
   public void updateView( Hangman hm)
   {
      model = ( HangmanModel )hm;
      count = hm.getNumOfIncorrectTries();
      
      if ( hm.isGameOver() && !hm.hasLost() )
      {
         flag = true;
      }
      
      else if (  hm.isGameOver() && hm.hasLost()  )
      {
         flag = false;
      }
      
      repaint();
   }
   
   /**
    * Extra: Named inner class for timer's action listener 
    */
   public class TimerListener implements ActionListener
   {
      
      /**
       * Kills the program if time is up
       * @param evt an action event
       */
      @Override
      public void actionPerformed( ActionEvent evt )
      {
         // Variable
         int selection;
         
         // Program Code
         if ( (System.currentTimeMillis() - startTime) >= 60000 )
         {
            selection = JOptionPane.showConfirmDialog( null, "Time Is Up", "Information", -1 );
            
            if ( selection == 0 )
            {
               System.exit(0);
            }
         }
         
         if ( second == 60 )
         {
            second = 0;
            minute++;
         }
         second++;
         
         
         repaint();
      }
   }
}