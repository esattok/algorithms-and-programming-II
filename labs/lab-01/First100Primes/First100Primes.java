import java.util.*;
/**
 * A program that stors the first 100 prime numbers
 * @author Esad Tök
 * @version 15.02.2020
 */
public class First100Primes
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      // Constants
      
      // Variables
      IntBag list;
      boolean flag;
      int number;
      
      // Program Codes
      list = new IntBag();
      list.add(2);
      number = 3;
      flag = true;
      
       while (list.size() < 100)
       {
          flag = true;
          for ( int i = 2; i < number; i++ )
          {
             if ((number%i) == 0)
             {
                flag = false;
             }
          }
          if (flag)
          {
             list.add(number);
          }
          number++;
       }
       
       // List of first 100 prime numbers
      System.out.println( "First 100 prime numbers:\n" + list );
   }
}