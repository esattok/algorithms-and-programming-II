import cs1.SimpleURLReader; 
/** 
 * The program that gets the name of the poem and to remove null.  
 * @author Esad Tök
 * @version 04.03.2020 
 */
public class MySimpleURLReader extends SimpleURLReader 
{ 
   // Properties
   String url; 
   
   // Constructor
   public MySimpleURLReader(String urlMain) 
   { 
      super(urlMain); 
      url = urlMain; 
   } 
   
   // Methods
   /**
    * Gets the URL
    * @return URL
    */
   public String getURL() 
   { 
      return url; 
   } 
   
   /**
    * Gets the name in the URL
    * @return the name
    */
   public String getName() 
   { 
      int start = url.lastIndexOf('/'); 
      return url.substring(start+1); 
   } 
   
   /**
    * @Override
    * The bug in getPageContents() method is edited
    * Gets the page contents
    * @retrun simple URL
    */
   @Override
   public String getPageContents() 
   { 
      // Variable
      String simpleURL;
      
      // Program Code
      simpleURL = super.getPageContents().substring(4); 
      return simpleURL; 
   } 
}