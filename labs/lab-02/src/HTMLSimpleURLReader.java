import cs1.SimpleURLReader;
/** 
 * The program that gets the page content of the URL.  
 * @author Esad Tök
 * @version 04.03.2020 
 */
public class HTMLSimpleURLReader extends MySimpleURLReader 
{ 
   // Properties
   
   // Constructor
   public HTMLSimpleURLReader(String url) 
   { 
      super(url); 
   } 
   
   // Methods
   /**
    * Gets the page content
    * @return page content
    */
   public String getPageContents(String url) 
   { 
      return super.getPageContents(); 
   } 
}