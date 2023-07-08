package hangmangame;

import cs102.hangman.BasicSetup;
import cs102.hangman.HangmanModel;
import cs102.hangman.IHangmanSetup;
import hangmangame.extras.HangmanConsoleView;
import hangmangame.extras.HangmanGUIPanel;
import hangmangame.extras.LabelsHangmanView;
import java.awt.FlowLayout;
import javax.swing.JFrame;

/**
 * Hangman (Revised for Lab05 Spring 2018-19)
 * @author Esad Tök
 * @version 11.04.2020
 */
public class GUIHangmanDemo {
   
   public static void main(String[] args) { 
      
      // Constants
      
      // variables
      JFrame           f;
      IHangmanSetup    hmSetup;
      HangmanModel     hmModel;
      HangmanGUIPanel  hmView;
      
      
      // program code ~ set up models, views & controllers!
      f = new JFrame( "MVC GUI Hangman ~ v2");
      f.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      f.setLayout( new FlowLayout( FlowLayout.CENTER, 20, 10) );
      
      hmSetup = new BasicSetup();
      hmModel = new HangmanModel( hmSetup );
      
      // create a console (textonly) view and add it to the hmModel
      hmModel.addView( new HangmanConsoleView() );
      
      // create a GUI view, passing it the hmModel, then add to frame 
      hmView = new HangmanGUIPanel( hmModel);
      f.add( hmView );
      f.setLocation( 500, 250 );
      f.pack();
      f.setVisible(true);
   }
   
}
