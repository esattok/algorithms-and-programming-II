import java.util.Scanner; 
import java.awt.*; 
import javax.swing.*;
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
      
      // program code 
      System.out.println( "Start..."); 
      
      f = new MyFrame(); 
//      new MyFrame(); 
      // new MyFrame(); 
      
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