import cs1.SimpleURLReader; 
import java.util.ArrayList; 
import java.util.Scanner; 
/** 
 * The menu program that takes URL's from user, list them, and enamble user to read them.  
 * @author Esad Tök
 * @version 04.03.2020 
 */ 
public class URLCheck 
{   
   public static void main(String [] args) 
   { 
      Scanner scan = new Scanner(System.in); 
      //Constants 
      
      //Variables 
      int input; 
      ArrayList<MySimpleURLReader> myPoem; 
      MySimpleURLReader page; 
      String urlMain; 
      int input2;  
      
      //Program Code 
      myPoem = new ArrayList <>(); 
      page = new MySimpleURLReader("http://www.cs.bilkent.edu.tr/~david/index.html"); 
      
      do 
      { 
         System.out.println("(1) Enter the url of the poem to add to collection"); 
         System.out.println("(2) List all poems in the collection"); 
         System.out.println("(3) Quit"); 
         System.out.println("Select a choice"); 
         input = scan.nextInt(); 
         
         // Adding an URL to the collection
         if (input == 1) 
         { 
            System.out.println("Enter URL you want to add"); 
            urlMain = scan.next(); 
            
            if ( urlMain.substring(urlMain.length() - 4).equals("html") || urlMain.substring(urlMain.length() - 3).equals("htm")) 
            { 
               page = new HTMLFilteredReader (urlMain); 
            } 
            else if (urlMain.substring(urlMain.length() - 3).equals("txt")) 
            { 
               page = new MySimpleURLReader (urlMain); 
            } 
            myPoem.add(page); 
         } 
         
         // Listing the poems
         else if (input == 2) 
         { 
            System.out.println("Enter the number of the poem you want to display"); 
            int i; 
            for (i = 0; i < myPoem.size(); i++) 
            { 
               System.out.println(i + " / " + myPoem.get(i).getName()); 
            } 
            
            input2 = scan.nextInt(); 
            
            if ( input2 < myPoem.size()) 
            { 
               System.out.println(" Poem Number " + i + ":"); 
               System.out.println( myPoem.get(input2).getPageContents()); 
            } 
            
            // Returning back to the main menu
            else if (input2 == myPoem.size()) 
            { 
               System.out.println("MAIN MENU"); 
            } 
         } 
      } while (input != 3); 
      
      System.out.println( "Goodbye!!!" );
   } 
}