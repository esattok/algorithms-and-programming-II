// In order to use swing toolkit, we have to import that package and attach the Letter "J" before all container and component
// classes
import javax.swing.*; 
import java.awt.*; // We still have to import awt package since layaout managers are located in it
/** 
 * Simple gui exercise program
 * @author Esad İsmail Tök
 * @version 31.03.2020
 */  
public class MyFrame extends JFrame 
{ 
   // properties 
   
   // constructors 
   public MyFrame() 
   { 
      JButton b; 
      JPanel  p; // If we dont specify a layout mannager when creating a panel, it automaticcaly assigns FlowLayout manager!!
      
      // f.setSize( 400, 300); 
      // setBounds( 350, 250, 400, 300); 
      
      // If I don't use a layout manager in frame it resizes the component and an undesirable window occurs !!
      // It is possible for a container not use a layout manager at all but then window is not appears as you desire
      setLayout( new FlowLayout() ); 
      p = new MyPanel(); 
      add( new MyPanel() ); 
      add( new MyPanel() ); 
      
//      p.add( new Label( "Welcome to ZOOM") ); 
//       
//      b = new Button( "OK"); 
//      p.add( b); 
//      p.add( new Button( "Good luck with Maths! ") ); 
//       
//      p.add( new TextField( 25) ); 
      
      add( p); 
      
      pack(); 
      setVisible( true );       
   } 
   
   // methods 
   
}