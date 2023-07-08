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
    * Mainn method for the calss
    * For the testing MyDrawingPanel class
    */
   public static void main(String[] args)
   {
      // Variables
      JFrame f;
      MyDrawingPanel p;
      MyDrawingPanel p2;
      MyDrawingPanel p3;
      Dimension dim;
      
      // Program Codes
      dim = Toolkit.getDefaultToolkit().getScreenSize(); // Gets the screen size
      
      f = new JFrame( "Color Test" );
      
      // Instantiating Panel objects
      p = new MyDrawingPanel();
      p2 = new MyDrawingPanel();
      p3 = new MyDrawingPanel(100, 100);
      
      // Frame Management
      // f.setLayout( new FlowLayout() );
      // f.setLocation( 500, 350 ); // Settinng the location of the Frame in the defktop
      f.setSize( dim.width, dim.height ); // Uses the width and height of the screen size!!!
      f.setVisible(true);
      
      // Adding the plannes into the frame
      f.add( p );
      f.add( p2 );
      f.add( p3 );
      
      // Adjusting the Locations of the panels
      p.setLocation(0, 0);
      p2.setLocation(320, 0);
      p3.setLocation(0, 260);
      
      // Adjusting the colors of the planes
      p.setColor(Color.BLUE);
      p2.setColor(Color.BLACK);
      
      
      
   }
}