import java.util.Scanner; 
// In order to use swing toolkit, we have to import that package and attach the Letter "J" before all container and component
// classes
import javax.swing.*; 
import java.awt.*; // We still have to import awt package since layaout managers are located in it
// import java.awt.Button; 

/** 
 * Simple gui exercise program
 * @author Esad İsmail Tök
 * @version 31.03.2020
 */  
public class GUIDemo1 
{ 
   public static void main( String[] args) 
   { 
      Scanner scan = new Scanner( System.in); 
      
      // constants 
      
      // variables 
      JFrame  f; 
      JButton b; 
      JFrame frm;
      
      // program code 
      System.out.println( "Start..."); 
      
 //     f = new MyFrame(); 
     frm = new JFrame();
     frm.setSize(500, 400);
     frm.setLayout(new FlowLayout());
     
     
     frm.setVisible(true);
//      new MyFrame(); 
//     new MyFrame(); 
      
//      // f.setSize( 400, 300); 
//      f.setBounds( 350, 250, 400, 300); 
//       
//      f.setLayout( new FlowLayout() ); 
//       
//      b = new Button( "OK"); 
//      f.add( b); 
//      f.add( new Button( "Good luck with Maths! ") ); 
//       
//      f.setVisible( true ); 
      
      System.out.println( "End."); 
   } 
   
}