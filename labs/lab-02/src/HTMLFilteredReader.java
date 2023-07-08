import cs1.SimpleURLReader; 
/** 
 * The program that enables user to reach the filtered text and unfiltered text.  
 * @author Esad Tök
 * @version 04.03.2020 
 */
public class HTMLFilteredReader extends MySimpleURLReader 
{ 
   // Properties 
   String filter; 
   String unfilter; 
   
   //Constructor 
   public HTMLFilteredReader(String url) 
   { 
      super(url); 
   } 
   //Methods
   /**
    * Gets the filtered text
    * @return filtered text
    */
   
   public String getPageContents() 
   {
      filter = ""; 
      
      // The whole code 
      unfilter = super.getPageContents(); 
      for (int j = 0; j < unfilter.length(); j++) 
      { 
         if (unfilter.charAt(j) == '<') 
         { 
            while (unfilter.charAt(j) != '>') 
            { 
               // Integer still iterates outside the number on the top; 
               j++; 
            } 
         }
         else 
         { 
            filter = filter + unfilter.charAt(j); 
         } 
      } 
      int current;
      int current2;
      int current3;
      
      current = filter.indexOf("&nbsp;");
      while (current != -1)
      {
         filter = filter.substring(0, filter.indexOf("&nbsp;")) + filter.substring( filter.indexOf("&nbsp;") + 6 );
         current = filter.indexOf("&nbsp;");
      }
      
      current2 = filter.indexOf("&amp;");
      while (current2 != -1)
      {
         filter = filter.substring(0, filter.indexOf("&amp;")) + filter.substring( filter.indexOf("&amp;") + 5 );
         current2 = filter.indexOf("&amp;");
      }
      
      current3 = filter.indexOf("&quot;");
      while (current3 != -1)
      {
         filter = filter.substring(0, filter.indexOf("&quot;")) + filter.substring( filter.indexOf("&quot;") + 6 );
         current3 = filter.indexOf("&quot;");
      }
      
      return filter; 
   } 
   
   /**
    * Gets the unfiltered text
    * @return unfiltered text
    */
   public String getUnfilteredPageContents() 
   { 
      return super.getPageContents(); 
   }
}