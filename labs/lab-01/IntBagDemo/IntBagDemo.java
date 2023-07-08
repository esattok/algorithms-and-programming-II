import java.util.*;
/**
 * Demonstration program for IntBag class
 * @author Esad Tök
 * @version 15.02.2020
 */
public class IntBagDemo
{
   public static void main( String[] args )
   {
      Scanner scan = new Scanner(System.in);
      
      // Constants
      
      // Variables
      IntBag bag;
      int input;
      int number;
      int testValue;
      int size;
      
      // Program Codes
      bag = null;
      testValue = -1;
      size = 0;
      
      do 
      {
         // The menü
         System.out.println( "1) Create a new list\n2) Read set of values\n3) Print the collection\n4) Add value to a location" );
         System.out.println( "5) Remove value\n6) Read a single test value\n7) Compute the locations of the test value\n8) Print tle locations of the test value\n9) Quit" );
         System.out.print( "Select an option: " );
         input = scan.nextInt();
         
         // Generating new list 
         if ( input == 1 )
         {
            System.out.println( "Enter the maximum capacity: " );
            size = scan.nextInt();
            bag = new IntBag(size);
         }
         // Adding values into the list
         else if ( input == 2 )
         {
            System.out.println( "Enter the values into the collection " );
            number = scan.nextInt();
            while ( number >= 0 && bag.size() < size  )
            {
               bag.add(number);
               number = scan.nextInt();
            }
         }
         // Printing the list
         else if ( input == 3 )
         {
            if (bag.size() == 0)
            {
               System.out.println( "Collection is empty" );
            }
            else 
            {
               System.out.println( bag );
            }
         }
         // Adding a value to a specific index
         else if ( input == 4 )
         {
            System.out.print( "Enter the value and index respectively: " );
            bag.add(scan.nextInt(), scan.nextInt());
         }
         // Removing a value from a specific index
         else if ( input == 5 )
         {
            System.out.print( "Enter the index to remove the value: " );
            bag.remove(scan.nextInt());
         }
         // Reading a test value
         else if ( input == 6 )
         {
            System.out.print( "Enter the test value: " );
            testValue = scan.nextInt();
         }
         // Computing the indexes of the test value
         else if ( input == 7 )
         {
            bag.findAll(testValue);
         }
         // Printing the indexes of the test value
         else if ( input == 8 )
         {
            System.out.println(bag.findAll(testValue));
         }
         // if the input is not one of the options print an error message
         else 
         {
            if ( input != 9 )
            {
               System.out.println( "Invalid option !!!" );
            }
         }
         System.out.println();
      } while( input != 9 );
      System.out.println( "GoodBye" );
   }
}