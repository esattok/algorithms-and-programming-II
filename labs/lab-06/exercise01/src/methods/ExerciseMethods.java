package methods;

import java.util.*;

/**
 * The class that includes the methods of exercise01
 * @author Esad İsmail Tök
 * @version 27.04.2020
 */
public class ExerciseMethods {
   
   
   // Properties
   private static ArrayList<Integer> result = new ArrayList<>();
   
   
   // Methods
   
   /**
    * Prints the reverse form of the given list
    * @param list list to reverse
    * @param start first index
    * @param end last index
    */
   public static void printReverse(ArrayList<Integer> list, int start, int end ) {
      ArrayList<Integer> result = new ArrayList<>();
      
      if (end >= start)
      {
         System.out.print( list.get(end) + " " );
         printReverse(list, start, (end - 1));
      }
   }
   
   /**
    * Prints the forward form of the given list
    * @param list list to reverse
    * @param start first index
    * @param end last index
    */
   public static void printForward( ArrayList<Integer> list, int start, int end ) {
      ArrayList<Integer> result = new ArrayList<>();
      
      if (end >= start)
      {
         System.out.print( list.get(start) + " " );
         printForward(list, (start + 1), end);
      }
   }
   
   /**
    * Gets x to the power y even if y is negative
    * @param base base value
    * @param exp exponential value
    * @return the result of the power function
    */
   public static double power( double base, int exp )
   {
      
      if ( exp < 0 )
      {
         base = 1 / base;
         exp = - exp;
         return power( base, exp );
      }
      
      else if ( exp != 1 )
         return power( base, (exp - 1) ) * base;
      
      else
         return base;
      
      
   }
   
   /**
    * Finds the maximum value in the entered array checking the first n values
    * @param list list to check
    * @param n first n numbers to check
    * @return the max value
    */
   public static int findMax( int[] list, int n ) {
      
      if (n == 1)
         return list[0];
      
      return Math.max(list[n - 1], findMax(list, n - 1));
   }
   
   /**
    * Finds all the integers between a starting and ending position and adds them in a list
    * @param start starting value
    * @param end ending value
    * @return ArrayList containing those values
    */
   public static ArrayList<Integer> valuesBetween( int start, int end ) { 
      
      if (start <= end)
      {
         result.add(start);
         return valuesBetween((start + 1), end);
      }
      
      else
      {
         return result;
      }
   }
   
   /**
    * Finds the first index of the target in the array x
    * @param x array to search
    * @param start start position
    * @param target target value
    * @return the index of target
    */
   public static int firstIndex(int[] x, int start, int target) {
      
      if (start > x.length - 1)
         return -1;
      
      else if (x[start] == target)
         return start;
      
      else
         return firstIndex(x, (start + 1), target);
   }
   
   /**
    * Recursive helper method
    * Finds the first index of the target in the array x
    * @param input array to searc
    * @param value target value
    * @return the index of target
    */
   public static int firstIndex( int[] input, int value ) {
      
      return firstIndex( input, 0, value );
   }
   
   /**
    * Finds the last index of the target in the array x
    * @param x array to search
    * @param end end position
    * @param target target value
    * @return the index of target
    */
   public static int lastIndex(int[] x, int end, int target) {
      
      if (end < 0)
         return -1;
      
      else if (x[end] == target)
         return end;
      
      else
         return lastIndex(x, (end - 1), target);
   }
   
   /**
    * Recursive helper method
    * Finds the last index of the target in the array x
    * @param input list to search
    * @param value target value
    * @return the index of value
    */
   public static int lastIndex(int[] input, int value ) {
      
      return lastIndex(input, (input.length - 1), value);
   }
   
   /**
    * Finds the location of all instances of the target value in x
    * @param x the list to search
    * @param target target value
    * @param start start index
    * @return an ArrayList containing the indexes
    */
   public static ArrayList<Integer> allIndexes( int[] x, int target, int start )
   {
      ArrayList<Integer> indexes;
      
      if ( start < x.length )
      {
         indexes = allIndexes(x, target, start + 1);
         
         if ( x[start] == target )
         {
            indexes.add(start);
         }
         
         return indexes;
      }
      
      else
      {
         indexes = new ArrayList<>();
         return indexes;
      }
      
   }
   /**
    * Recursive helper method
    * Finds the location of all instances of the target value in x
    * @param input the array to search
    * @param target target value
    * @return an ArrayList containing the indexes
    */
   public static ArrayList<Integer> allIndexes(int[] input, int target)
   {
      ArrayList<Integer> values = new ArrayList<>();
      
      for ( int i = (allIndexes(input, target, 0).size() - 1); i >= 0; i--  )
      {
         values.add( allIndexes(input, target, 0).get(i) );
      }
      
      return values;
   }
}