import cs1.SimpleURLReader; 
import java.util.ArrayList;
/** 
 * The program that gets the links by using indexOf method. 
 * @author Esad Tök
 * @version 04.03.2020 
 */
public class XHTMLFilteredReader extends HTMLFilteredReader 
{ 
   // Properties
   ArrayList<String> link; 
   String hLink; 
   String unfiltered; 
   int index; 
   
   // Constructor
   public XHTMLFilteredReader(String url) 
   { 
      super(url); 
   } 
   
   // Methods
   /**
    * Generates an arraylist to add links
    * @return the arraylist
    */
   public ArrayList <String> getLinks() 
   { 
      hLink = ""; 
      link = new ArrayList<String>(); 
      
      unfiltered = super.getUnfilteredPageContents(); 
      
      // Checks all characters in the unfiltered text
      for (int i = 0; i <= unfiltered.length() - 4; i++) 
      { 
         if (unfiltered.substring(i, i + 4).equals("href")) 
         { 
            index = unfiltered.indexOf('"', i + 6);
            hLink = unfiltered.substring(i + 6, index); 
            link.add(hLink); 
         }   
      } 
      return link; 
   } 
   
   /**
    * Gets the percentage loss
    * @return percent
    */
   public double percentage() 
   { 
      // Variables
      double percent;
      
      // Program Code
      percent = (((double)getUnfilteredPageContents().length() - (double)getPageContents().length())/(double)getPageContents().length()) * 100; 
      return percent; 
   } 
}