import java.util.*;
import static methods.ExerciseMethods.*;

public class Main {
   
   public static void main(String[] args) {
      
      // Constants
      
      
      // Variables
      ArrayList<Integer> listToReverse;
      ArrayList<Integer> listToForward;
      
      
      // Program Code
      listToReverse = new ArrayList<>();
      listToForward = new ArrayList<>();
      
      // Filling the printReverse list
      for ( int i = 1; i <= 10; i++ )
      {
         listToReverse.add(i);
      }
      
      // Filling the printForward list
      for ( int i = 1; i <= 10; i++ )
      {
         listToForward.add(i * 10);
      }
      
      
      // Print reverse method
      System.out.println("Testing the printReverse method");
      System.out.println(listToReverse.toString());
      printReverse(listToReverse, 0, listToReverse.size() - 1);
      System.out.println("\n---------------------------------------------");
      System.out.println();
      
      
      // Print forward method
      System.out.println("Testing the printForward method");
      System.out.println(listToForward.toString());
      printForward(listToForward, 0, listToReverse.size() - 1);
      System.out.println("\n---------------------------------------------");
      System.out.println();
      
      
      // Power method
      System.out.println("Testing the power method");
      System.out.println(power(3, 4));
      System.out.println("\n---------------------------------------------");
      System.out.println();
      
      
      // Finding Maximum value method
      System.out.println("Testing the findMax method");
      int[] maxValueList = {12, 23, -5, 0, 100, 2, 3456};
      System.out.println(findMax(maxValueList, 2));
      System.out.println("\n---------------------------------------------");
      System.out.println();
      
      
      // Finding all integers between given values
      System.out.println("Testing the valuesBetween method");
      System.out.println(valuesBetween(3, 14));
      System.out.println("\n---------------------------------------------");
      System.out.println();
      
      
      // Finding the first instance of a value in an array
      System.out.println("Testing the firstIndex method");
      int[] toLookFirst = {23, 4, 6, -2, 5, 12, 0, 5, 3};
      int firstValue = 5;
      System.out.println("The first occurrence of the value \"" + firstValue + "\" is in " + firstIndex(toLookFirst, firstValue) + ". index");
      System.out.println("\n---------------------------------------------");
      System.out.println();
      
      
      // Finding the last instance of a value in an array
      System.out.println("Testing the lastIndex method");
      int[] toLookLast = {23, 4, 6, -2, 5, 12, 0, 5, 3};
      int lastValue = 5;
      System.out.println("The last occurrence of the value \"" + lastValue + "\" is in " + lastIndex(toLookLast, lastValue) + ". index");
      System.out.println("\n---------------------------------------------");
      System.out.println();
      
      
      // Finding all instances of a value in an array
      System.out.println("Testing the allIndexes method");
      int[] toLookAll = {2, 5, 3, 2, 7, 7, 9, 7};
      ArrayList<Integer> resultAllInstances = allIndexes(toLookAll, 7);
      System.out.println(resultAllInstances);
      System.out.println("\n---------------------------------------------");
      System.out.println();
      
   }
}
