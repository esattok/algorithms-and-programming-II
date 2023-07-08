import cs102.ds.List;

/**
 * Runner class that tests the List class
 * @author Esad İsmail Tök
 * @version 08.05.2020
 */
public class Lab07 
{
   public static void main(String[] args) 
   { 
      
      // Constants
      
      
      // Variables
      List list;
      
      // Propgram Codes
      list = new List();
      
      // Creating the initial list
      list.addToTail("c");
      list.addToTail("d");
      list.addToTail("e");
      list.addToTail("f");
      
      // The initial list
      System.out.println( "The initial list is: " + list );
      System.out.println( "-----------------------------------------------------------" );
      System.out.println();
      
      // Testing addToHead() method
      list.addToHead("b");
      list.addToHead("a");
      
      System.out.println( "List after adding \"b\" and \"a\" to the head is: " + list );
      System.out.println( "-----------------------------------------------------------" );
      System.out.println();
      
      // Testing addToTail() method
      list.addToTail("g");
      list.addToTail("h");
      
      System.out.println( "List after adding \"g\" and \"h\" to the tail is: " + list );
      System.out.println( "-----------------------------------------------------------" );
      System.out.println();
      
      // Removing item from the head of the list
      System.out.println("The removed item is: " + list.removeFromHead());
      System.out.println("The list after removing the item is: " + list);
      System.out.println( "-----------------------------------------------------------" );
      System.out.println();
      
      // Checking whether the list is empty or not
      if ( list.isEmpty() )
      {         
         System.out.println( "The list is empty" );
         System.out.println( "-----------------------------------------------------------" );
      }
      
      else
      {        
         System.out.println( "The list is NOT empty" );
         System.out.println( "-----------------------------------------------------------" );
      }
      System.out.println();
      
      // Getting the data of an index
      int index;
      index = 4;
      
      System.out.println( "The data of the index " + index + " is " + list.getData(index) );
      System.out.println( "-----------------------------------------------------------" );
      System.out.println();
      
      // Testing the print() method
      
      System.out.println("The forward order of the list");
      list.print();      
      System.out.println();
      System.out.println( "-----------------------------------------------------------" );
      System.out.println();
      
      // Testing the printReverse() method
      
      System.out.println("The reverse order of the list");
      list.printReverse();      
      System.out.println();
      System.out.println( "-----------------------------------------------------------" );
      System.out.println();
      
      // Testing whether the list contains a specific item or not
      String item;
      item = "d";
      
      if ( list.contains(item) )
      {        
         System.out.println( "The list contains the item " + item );
         System.out.println( "-----------------------------------------------------------" );
      }
      
      else
      {      
         System.out.println( "The list does NOT contain the item " + item );
         System.out.println( "-----------------------------------------------------------" );
      }
      System.out.println();
      
      // Checking whether the list is ordered or not
      if ( list.isOrdered() )
      {  
         System.out.println( "The list is ordered lexicographically" );
         System.out.println( "-----------------------------------------------------------" );
      }
      
      else
      {         
         System.out.println( "The list is NOT ordered lexicographically" );
         System.out.println( "-----------------------------------------------------------" );
      }
      System.out.println();
      
      // Testing the create from methods
      String[] stringList;
      stringList = new String[3];
      
      stringList[0] = "programming";
      stringList[1] = "is";
      stringList[2] = "fun";
      
      System.out.println( "The list creatied from the array is:\n" + createFrom(stringList) );
      System.out.println( "-----------------------------------------------------------" );
      System.out.println();
      
      String str;
      str = "cs102";
      
      System.out.println( "The list creatied from the String is:\n" + createFrom(str) );
      System.out.println( "-----------------------------------------------------------" );
      System.out.println();
      
      // Generatinng the first list to merge
      List first;
      first = new List();
      
      first.addToTail("A");
      first.addToTail("D");
      first.addToTail("C");
      
      // Generatinng the second list to merge
      List second;
      second = new List();
      
      second.addToTail("K");
      second.addToTail("B");
      second.addToTail("A");
      second.addToTail("C");
      second.addToTail("R");
      
      // Merge the lists
      System.out.println( "The first list: " + first );
      System.out.println( "The second list: " + second );
      System.out.println( "The merged list is: " + List.merger(first, second) );
      System.out.println( "-----------------------------------------------------------" );
      System.out.println();
      
      
      // Testing some methods by JUnit
      
//      list.testContains();
//      list.testIsEmpty();
      
   }
   
   
   // Methods
   
   /**
    * Creates a new list initialised from the given array of Strings
    * @param strings list of strings
    * @return a list
    */
   public static List createFrom(String[] strings) 
   {
      List list = new List();
      
      for (int i = 0; i < strings.length; i++) 
      {
         list.addToTail(strings[i]);
      }
      
      return list;
   }
   
   /**
    * Creates a List from a single String
    * @param string single string
    * @return a list
    */
   public static List createFrom(String string) 
   {
      List list = new List();
      
      for (int i = 0; i < string.length(); i++) 
      {
         list.addToTail(string.substring(i,i+1));
      }
      
      return list;
   }
}