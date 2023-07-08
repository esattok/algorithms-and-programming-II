import java.awt.*; 
import java.awt.event.*; 
import javax.swing.*;
/** 
 * Simple gui exercise program
 * @author Esad İsmail Tök
 * @version 31.03.2020
 */  
public class MyFrame extends JFrame // implements WindowListener 
{ 
   // properties 
   
   // constructors 
   public MyFrame() 
   { 
      JButton b; 
      JPanel  p; 
      
      // f.setSize( 400, 300); 
      // setBounds( 350, 250, 400, 300); 
      setLocation( 350, 250); 
      setLayout( new FlowLayout() ); 
      
      addWindowListener( new MyWindowListener() ); 
      
      p = new MyPanel(); 
//      add( new MyPanel() ); 
      // add( new MyPanel() ); 
      
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
   
   public class MyWindowListener extends WindowAdapter // MyWindowAdapter 
   { 
      @Override 
      public void windowClosing( WindowEvent e) { 
         System.out.println( "Window closing" ); 
         // dispose(); 
         System.exit( 0 ); 
      }             
   } 
   
//   public class MyWindowAdapter implements WindowListener 
//   { 
//      public void windowClosing( WindowEvent e) {} 
//      public void windowActivated( WindowEvent e) {} 
//      public void windowClosed( WindowEvent e) {}    
//      public void windowDeactivated( WindowEvent e) {} 
//      public void windowDeiconified( WindowEvent e) {} 
//      public void windowIconified( WindowEvent e) {} 
//      public void windowOpened( WindowEvent e) {}       
//   } 
   
}