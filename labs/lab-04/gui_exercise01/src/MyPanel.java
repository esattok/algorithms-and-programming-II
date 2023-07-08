// In order to use swing toolkit, we have to import that package and attach the Letter "J" before all container and component
// classes
import javax.swing.*; 
import java.awt.*; // We still have to import awt package since layaout managers are located in it
/** 
 * Simple gui exercise program
 * @author Esad İsmail Tök
 * @version 31.03.2020
 */  
public class MyPanel extends JPanel 
{ 
   // properties 
   
   // constructors 
   public MyPanel() 
   { 
      JButton b; 
      // setPreferredSize( new Dimension( 100, 100) ); 
      setSize( 200, 200); 
      setLayout( new BorderLayout() ); // I use BorderLayout manager to layout my components in a panel!!
      
      add( new JLabel( "Welcome to ZOOM"), BorderLayout.NORTH ); // Have to decide the part of the panel!!
      
      b = new JButton( "OK"); 
      add( b, BorderLayout.CENTER); // Have to decide the part of the panel!!
      add( new JButton( "Good luck with Maths! "), BorderLayout.SOUTH ); // Have to decide the part of the panel!!
      
      // If we don't specify the location in border layout it automatically locates the component to the cender 
      // Also Every region in the container can only have 1 component in border layout !!!
      add( new JTextField( 25) ); 
   } 
   
   // methods 
   
}