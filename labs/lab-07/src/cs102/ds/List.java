package cs102.ds;

import junit.framework.TestCase;
/**
 * A class that represents a list and provides some methods to use it with that list
 * @author Esad İsmail Tök
 * @version 08.05.2020
 */
public class List extends TestCase
{
   
   // Properties
   private Node head;
   
   
   // Constructor
   public List() 
   {
      this.head = null;
   }
   
   
   // Methods
   
   /**
    * Adds item to the head
    * @param item new item to add
    */
   public void addToHead(String item)
   {
      Node addNode;
      addNode = new Node(item, null);
      
      if (head == null) 
      {
         head = addNode;
      }
      
      else 
      {
         addNode.next = head;
         head = addNode;
      }
   }
   
   /**
    * Adds item to the tail
    * @param item new item to add
    */
   public void addToTail(String item) 
   {
      if (head == null) 
      {
         Node temp;
         temp = new Node(item, null);
         head = temp;
      }
      
      else 
      {
         Node current;
         current = tail();
         
         Node tail;
         tail = new Node(item, null);
         current.next = tail;
      }
   }
   
   /**
    * Removes item from the head
    * @return data of the node
    */
   public String removeFromHead() 
   {
      Node temp;
      temp = head;
      
      if (temp == null) 
      {
         return null;
      }
      
      head = head.next;
      return temp.data;
   }
   
   /**
    * Checks whether the list is empty or not
    * @return true if it is empty, false otherwise
    */
   public boolean isEmpty() 
   {
      if (head == null) 
      {
         return true;
      }
      
      return false;
   }
   
   /**
    * Gets the data. Returns null if invalid
    * @param index the index
    * @return the data
    */
   public String getData (int index)
   {
      Node current;
      current = head;
      int count = 0;
      
      while (current != null) 
      {
         if(count == index)
         {
            return current.data;
         }
         
         else 
         {
            current = current.next;
         }
         count = count + 1;
      }
      
      return null;
   }
   
   /**
    * Printing forward iteratively
    */
   public void print() 
   {
      Node current;
      current = head;
      System.out.print("The Items In The List: ");
      
      while (current != null) 
      { 
         System.out.print(current.data + " ");
         current = current.next; 
      } 
   }
   
   /**
    * Printing reverse recursively
    */
   public void printReverse() 
   {
      Node temp;
      temp = head;
      
      if (head != null) 
      {
         printReverse(temp);
      } 
      
      else 
      {
         System.out.println("The List is Empty");
      }
   }
   
   /**
    * Recursive helper method
    * @parma node the node
    */
   private void printReverse(Node node)
   {
      if ( node == null) 
      {
         return;
      }
      
      printReverse(node.next);
      System.out.print(node.data + " ");
   }
   
   /**
    * Checks whether the list contains the target
    * @param target item to check
    * @return true if it contains, false otherwise
    */
   public boolean contains(String target) 
   {
      Node current;
      boolean isContain;
      
      current = head; 
      isContain = false; 
      
      while ((current != null) && !isContain) 
      { 
         if ((current.data).equals(target))
         {
            isContain = true;
         }
         
         current = current.next; 
      }
      
      return isContain;
   }
   
   /**
    * Check whether the list is ordered or not
    * @return true if it is ordered, false otherwise
    */
   public boolean isOrdered() 
   {
      Node current;
      current = head;
      
      if (head == null) 
      {
         return true;
      }
      
      if (head.next == null)
      {
         return true;
      }  
      
      boolean isOrdered;
      isOrdered = true; 
      
      while ((current != null) && (current.next != null) && !isOrdered) 
      { 
         if ((current.data).compareTo((current.next).data) > 0)
         {
            isOrdered = false;
         }
         current = current.next; 
      }
      
      return isOrdered;
   }
   
   /**
    * Gets a reference to n's successor or null if it doesn't have one
    * @param n node
    * @return the n'th successor
    */
   private Node next(Node n) 
   {
      if (n.next != null) 
      {
         return n.next;
      }
      
      else 
      {
         return null;
      }
   }
   
   /**
    * Gets a reference to n's predecessor or null if it doesn't have one.
    * @param n node
    * @return the n'th predecessor 
    */
   private Node previous(Node n) 
   {
      Node current;
      current = head;
      
      if (isEmpty()) 
      {
         return null;
      }
      
      while (current.next != null) 
      {
         if (((current.next).data).equals(n.data)) 
         {
            return current;
         }
         
         current = current.next;
      }
      
      return null;
   }
   
   /**
    * Gets a reference to the last Node in the list.
    * @return reference to the last node
    */
   private Node tail() 
   {
      Node current = head;
      
      while (current.next != null) 
      {
         current = current.next;
      }
      
      return current;
   }
   
   /**
    * Makes a new list combining the entered ones 
    * @param a first list
    * @param b second list
    * @return merged list
    */
   public static List merger(List a, List b) 
   {
      List list = new List();
      
      // Adding the first list's items to the result
      for (int i = 0; a.getData(i) != null; i++) 
      {
         if (!b.contains(a.getData(i))) 
         {
            list.addToTail(a.getData(i));
         }
      }
      
      // Adding the second list's items to the result
      for (int j = 0; b.getData(j) != null; j++) 
      {
         if (!a.contains(b.getData(j))) 
         {
            list.addToTail(b.getData(j));
         }
      }
      
      return list;
   }
   
   /**
    * String representation of the list
    * @return the string representation
    */
   public String toString() 
   {
      String result;
      result = "";
      
      Node current;
      current = head;
      
      while (current != null) 
      {
         result = result + current.data + " ";
         current = current.next;
      }
      
      return result;
   }
   
   /**
    * Testing method for contains method
    */
   public void testContains() 
   {
      List list = this;
      assertTrue("Does not contain the String", list.contains("e"));
   }
   
   /**
    * Testing method for isEmpty method
    */
   public void testIsEmpty() 
   {
      List list = this;
      assertEquals("List is not empty", 0, this.toString().length());
   }
   
   /**
    * Named inner class for Nodes
    */
   private class Node 
   {
      // Properties
      String data; 
      Node next; 
      
      // Constructor
      public Node( String data, Node next) 
      {
         this.data = data; 
         this.next = next; 
      } 
   }
}