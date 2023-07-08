package application;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import shapes.*;
/**
 * Panel class for the baloons game
 * @author Esat Tök
 * @version 04.04.2020
 */
public class BalloonsGamePanel extends JPanel
{
   
   // Properties
   private int count;
   private int points;
   private long elapsedTime;
   private long startTime;
   private final int INITIAL_DELAY = 300;
   private int delay;
   private ShapeContainer balloons;
   public javax.swing.Timer t;
   private JLabel score;
   
   // Constructor
   public BalloonsGamePanel()
   {
      delay = INITIAL_DELAY;
      count = 1;
      points = 0;
      elapsedTime = 0;
      startTime = System.currentTimeMillis();
      
      this.setBackground( Color.yellow );
      
      score = new JLabel( "Points: " + this.points );
      this.add( score );
      
      balloons = new ShapeContainer();
      
      // Addinng baloons with random locations to the container
      for ( int i = 0; i < 25; i++ )
      {
         Random number = new Random();
         balloons.add( new Balloon((number.nextInt(501)), (number.nextInt(451))) );
      }
      this.addMouseListener( new BalloonListener() );
      
      t = new javax.swing.Timer( delay, new TimerListener() );
      t.start();
   }
   
   
   
   
   // Methods
   
   public void endGame()
   {
      if ( elapsedTime > 60000 )
      {
         int selection;
         selection = JOptionPane.showConfirmDialog( this, "Play Again ? ", "Game Over", JOptionPane.YES_NO_OPTION );
         
         // If user says no end program
         if ( selection == 1 )
         {
            System.exit(0);
         }
         
         // If user says yes restart program
         else
         {
            points = 0;
            score.setText( "Points: " + this.points );
            count = 1;
            startTime = System.currentTimeMillis();
            elapsedTime = 0;
            delay = INITIAL_DELAY;
            t.setDelay( delay );
            t.restart();
            
            Random random;
            random = new Random();
            
            // Making the number of ballons 25 as initial
            while ( balloons.size() < 25 )
            {
               balloons.add( new Balloon((random.nextInt(501)), (random.nextInt(451))) );
            }
            
            Iterator itr;
            itr = balloons.iterator();
            
            // Setting the radie of baloons to 25 as initial
            while ( itr.hasNext() )
            {
               ((Balloon)itr.next()).radius = 25;
            }
         }
      }
   }
   
   /**
    * @Override
    * Calls the draw method of each shape
    * @param g Graphic
    */
   @Override
   public void paintComponent( Graphics g )
   {
      super.paintComponent(g);
      
      Iterator itr;
      itr = balloons.iterator();
      
      while( itr.hasNext() )
      {  
         ((Balloon)itr.next()).draw(g);
      }
      
     g.setFont( new Font(Font.SERIF, Font.BOLD, 24) );
     g.setColor( Color.red );
     g.drawString( ("Stage " + count), 10, 25 );
   }
   
   /**
    * Named inner class for mouse listener
    */
   public class BalloonListener extends MouseAdapter
   {
      /**
       * Selects all shapes containing mose position when pressed and removes them
       * @param evt mouse event
       */
      @Override
      public void mousePressed( MouseEvent evt )
      {
         if ( balloons.selectAllAt( evt.getX(), evt.getY() ) >= 2 )
         {
            if ( count >= 4 )
            {
               points = points + ( balloons.selectAllAt( evt.getX(), evt.getY() ) * (count - 2) );
            }
            else
            {
               points = points + balloons.selectAllAt( evt.getX(), evt.getY() );
            }
            score.setText( "Points: " + points );
         }
         balloons.removeSelected();
         repaint();
      } 
   }
   
   /**
    * Named inner class for timer's action listener
    */
   public class TimerListener implements ActionListener
   {
      /**
       * Calls the grow method for each baloon element
       * @param evt Action event
       */
      @Override
      public void actionPerformed( ActionEvent evt )
      {
         elapsedTime = (System.currentTimeMillis() - startTime);
         
         Random rnd;
         Iterator itr;
         
         itr = balloons.iterator();
         rnd = new Random();
         
         while ( itr.hasNext() )
         {
            ((Balloon)itr.next()).grow();
         }
         
         // Adding random baloons if there are less than 15
         if ( balloons.size() < 15 )
         {
            balloons.add( new Balloon( (rnd.nextInt(501)), (rnd.nextInt(451))) );
         }
         
         if ( elapsedTime > (10000 * count) )
         {
            count++;
            if ( count >= 4 )
            {
               delay = (delay - 25);
            }
            else
            {
               delay = (delay - 100);
            }
            
            t.setDelay( delay );
         }
         
         endGame();
         
         repaint();
        // System.out.println( elapsedTime + "\t" + count + "\t" + delay );
         
      }
   }
   
   
   
}