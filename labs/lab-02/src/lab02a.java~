import cs1.SimpleURLReader; 
/** 
 * The test program that prints the corresponding outputs.  
 * @author Esad Tök
 * @version 04.03.2020 
 */
public class lab02a 
{ 
   public static void main (String [] args) 
   { 
      // Part A
      System.out.println( "The original text without any changes" );
      System.out.println( "*************************************" );
      System.out.println();
      SimpleURLReader url = new SimpleURLReader("http://www.cs.bilkent.edu.tr/~david/housman.txt"); 
      
      System.out.println(url.getPageContents()); 
      System.out.println("Line count: " + url.getLineCount()); 
      System.out.println( "*************************************" );
      System.out.println();
      
      // Part B
      System.out.println( "The text with fixed the \"null\" bug" );
      System.out.println( "************************************" );
      System.out.println();
      MySimpleURLReader reader = new MySimpleURLReader("http://www.cs.bilkent.edu.tr/~david/housman.txt"); 
      
      System.out.println(reader.getPageContents()); 
      System.out.println(reader.getURL()); 
      System.out.println(reader.getName()); 
      System.out.println( "************************************" );
      System.out.println();
      
      // Part C 
      System.out.println( "The filtered html code" );
      System.out.println( "**********************" );
      HTMLFilteredReader filter = new HTMLFilteredReader("http://www.cs.bilkent.edu.tr/%7Edavid/housman.htm"); 
      System.out.println(filter.getPageContents());
      System.out.println( "**********************" );
      System.out.println();
      
      // Part D
      System.out.println( "The percentage loss and link" );
      System.out.println( "****************************" );
      System.out.println();
      XHTMLFilteredReader filtered = new XHTMLFilteredReader("http://www.cs.bilkent.edu.tr/~david/index.html"); 
      System.out.print("Percentage loss is "); 
      System.out.print(filtered.percentage());
      System.out.println( "%" );
      System.out.println();
      System.out.println( "The Link:" );
      System.out.println(filtered.getLinks());
      System.out.println();
      System.out.println( "****************************" );
   } 
}