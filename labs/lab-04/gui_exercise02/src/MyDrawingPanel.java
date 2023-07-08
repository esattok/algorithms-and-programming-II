import java.util.*;
import java.awt.*;
import javax.swing.*;
/** 
 * Simple gui exercise program
 * @author Esad İsmail Tök
 * @version 31.03.2020
 */  
public class MyDrawingPanel extends JPanel
{
   // Properties
   
   
   
   // Constructor
   public MyDrawingPanel()
   {
      this.setSize( 300, 250 );
      this.setBackground( Color.YELLOW );
      this.setVisible(true);
   }
   
   /**
    * Second constructor that enables user to decide the size of the panel
    * @param width width of the panel
    * @param height height of the panel
    */
   public MyDrawingPanel(int width, int height)
   {
      this.setSize( width, height );
      this.setBackground( Color.YELLOW );
      this.setVisible(true);
   }
   
   
   // Methods
   public void setColor( Color clr )
   {
      this.setBackground( clr );
   }
   
   /**
    * @Override
    * Draws shapes when the app opens by Graphics's class methods shapes
    * @param g an object of Graphics class
    */
   @Override
   public void paintComponent( Graphics g )
   {
//      super.paintComponent(g); // Does it necessary ???
      g.setColor(Color.BLUE);
      g.fillRect( 0, 200, 300, 10 );
      g.drawRect( 0, 220 , 300, 10 );
      g.setColor( Color.cyan );
      g.fillRect( 0, 180, 200, 10 );
      
      g.drawRect( 140, 40, 120, 120 );
      g.drawRect( 150, 50, 100, 100 );
      g.drawRect( 160, 60, 80, 80 );
      g.setColor( Color.RED );
      g.fillOval( 160, 70, 80, 60 );
      g.setColor( Color.gray );
      g.drawLine( 140, 40, 260,160 );
      g.setColor( Color.black );
      g.drawString( "Hello World !", 160, 36 );
   }
   
   /**
    * Mainn method for the calss
    */
   public static void main(String[] args)
   {
      // Variables
      JFrame f;
      MyDrawingPanel p;
     // MyDrawingPanel p2;
     // MyDrawingPanel p3;
      
      // Program Codes
      f = new JFrame();
      p = new MyDrawingPanel();
    //  p2 = new MyDrawingPanel(200, 100);
    //  p3 = new MyDrawingPanel(100, 100);
    
    //  p2.setSize(  300, 250 );
      f.setLayout( new GridLayout() );
      f.setTitle( "Color Test" );
      f.setBounds( 700, 350, 350, 300);
      f.setVisible(true);
    //  f.add( p2 );
      f.add( p );
    //  p2.setColor(Color.BLACK);
      p.setColor(Color.white);
     // f.add( p3 );
     // p3.setColor(Color.white);
     // p3.setSize(  100, 100 );
     // f.pack();  
   }
}