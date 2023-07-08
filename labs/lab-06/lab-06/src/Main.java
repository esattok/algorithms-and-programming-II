import java.util.*;

/**
 * The class that includes the solutions of the lab06
 * @author Esad İsmail Tök
 * @version 27.04.2020
 */
public class Main {
   
   
   
   public static void main(String[] args) {
      
      // Constants
      
      
      // Variables
      String str;
      int decimalNumber;
      ArrayList<String> list;
      
      
      // Program Codes
      str = "Welcome to CS-102";
      decimalNumber = 6;
      list = new ArrayList<>();
      
      
      // Looking for the number of "e" in a string
      System.out.println("Testing the numberOfE method");
      System.out.println( "The number of \"e\" in the String \"" + str + "\" is " + numberOfE(str));
      System.out.println("-------------------------------------------------");
      System.out.println();
      
      
      // Printing the binary form of the entered decimal value
      System.out.println("Testing the convertToBinary method");
      System.out.print("Binary representation of the number " + decimalNumber + " is ");
      System.out.println( convertToBinary(decimalNumber) );
      System.out.println("\n-------------------------------------------------");
      System.out.println();
      
      
      // Checking whether the list is ordered  lexicographically or not
      System.out.println("Testing the isOrdered method");
      list.add("because");
      list.add("corona");
      list.add("home");
      list.add("is");
      list.add("it");
      list.add("stay");
      list.add("time");
      
      
      
      
      if ( isOrdered(list) )
         System.out.println("The list is ordered lexicographically");
      
      else
         System.out.println("The list is NOT ordered lexicographically");
      
      System.out.println("-------------------------------------------------");
      System.out.println();
      
      
      // Printing all n-digit even numbers in which each digit of the number is greater than the previous one
      System.out.println("Testing the enumerate method");
      
      int n;
      n = 3;
      
      enumerate( n ); // Printing the numbers
      System.out.println("\n-------------------------------------------------");
      System.out.println();
      
   }
   
   // Methods
   
   /**
    * Counts the number of occurrences of the character "e" in a string
    * @param input the string to check
    * @return number of "e"
    */
   public static int numberOfE(String input) {
      int result = 0;
      
      // if the length is 0 return it
      if (input.length() == 0) {
         return result;
      }
      
      if (input.substring(0,1).equalsIgnoreCase("e")) {
         result= 1 + numberOfE(input.substring(1));
         return result;
      }
      
      //if there is no "e"
      result = numberOfE(input.substring(1));
      return result;
   }
   
   /**
    * Takes a decimal value as an  int  parameter and prints out the binary equivalent of it
    * @param decimal integer decimal number
    * @return binary representation of the number
    */
   public static String convertToBinary(int decimal) {
      String result;
      result = "";
      
      if ( decimal > 0 )
      {
         result = result + convertToBinary(decimal / 2) + decimal % 2;
         return result;
      }
      
      else 
         return result;
   }
   
   /**
    * Checks whether the entered list is ordered lexicographically or not
    * @param list entered list
    * @return true if ordered, false otherwise
    */
   public static boolean isOrdered(ArrayList<String> list) {
      
      // Copying the list to make the list arrayList reusable 
      ArrayList<String> result = new ArrayList<>();
      for ( int i = 0; i < list.size(); i++ )
      {
         result.add(list.get(i));
      }
      
      boolean ordered=false;
      
      if (result.size() == 1)
         return true;
      
      else if ( result.get(0).compareTo(result.get(1)) > 0 )
         ordered = false;
      
      else {
         result.remove(0);
         ordered = isOrdered(result);
      }
      return ordered;
   }
   
   
   /**
    * Checkes if the number is printable or not for the enumerate method
    * @param num the number to check
    */
   public static boolean enumerateFilter(int num)
   {
      int last;
      int before;
      
      if ( num < 10 )
         return true;
      
      else if ( enumerateFilter(num / 10) )
      {
         last = num % 10;
         before = (num % 100 - last) / 10;
         
         if ( last > before )
            return true;
         
         return false;
      }
      return false;
   }
   
   /**
    * Recursive helper method
    * Prints all n-digit even numbers in which each digit of the number is greater than the previous one
    * @param n the number of digits
    */
   public static void enumerate( int n )
   {
      int limitUpper;
      int limitLower;
      
      limitUpper = (int)Math.pow( 10, n );
      limitLower = (int)Math.pow( 10, n - 1 );
      
      enumerate( limitUpper, limitLower );
      
   }
   
   /**
    * Prints all n-digit even numbers in which each digit of the number is greater than the previous one
    * @param first starting
    * @param second the end
    */
   public static void enumerate( int first, int last )
   {
      if ( first != last )
      {
         enumerate( first - 1, last );
         if ( enumerateFilter(first) && first % 2 == 0 )
            System.out.print(first + " ");
      }
      
      
   }
}