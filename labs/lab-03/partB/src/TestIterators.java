import java.util.*;
/**
 * The test class for IntBagIterator
 * @author Esad Tök
 * @version 10.03.2020
 */
public class TestIterators
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      // Constants
      
      // Variables
      Iterator i;
      Iterator j;
      IntBag bag;
      IntBag test;
      int keep;
      
      // Program Code
      bag = new IntBag();
      
      // Filling the bag
      for ( int x = 1; x <= 10; x++ )
      {
         bag.add(x);
      }
     
      i = new IntBagIterator( bag);
      
      while ( i.hasNext() ) 
      {
         System.out.println( i.next() );
         
       //  j = new IntBagIterator( bag);
          j = bag.iterator();
         
         while ( j.hasNext() )
         {
            System.out.println( "--" + j.next() );
         }
      }
      System.out.println();
      System.out.println( "------------------------------" );
      System.out.println();
      
      // Additional
//      test = new IntBag();
//      
//      for ( int y = bag.size() - 1; y >= 0; y-- )
//      {
//         test.add(y); 
//      }
//      
//      i = new IntBagIterator(test);
//      
//      while ( i.hasNext() ) 
//      {
//         System.out.println( i.next() );
//         
//         j = new IntBagIterator( test);
//          //j = bag.iterator();
//         
//         while ( j.hasNext() )
//         {
//            System.out.println( "--" + j.next() );
//         }
//      }
      
      
      
      
      
      
   }
}