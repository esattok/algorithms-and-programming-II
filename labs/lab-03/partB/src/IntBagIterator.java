import java.util.*;
/**
 * The class that implements the methods of the interface Iterator
 * @author Esad Tök
 * @version 10.03.2020
 */
public class IntBagIterator implements Iterator
{
   // Properties
   private IntBag aBag;
   private int index;
   private int backIndex;
   
   // Constructor
   public IntBagIterator( IntBag aBag )
   {
      this.aBag = aBag;
      index = 0;
      backIndex = aBag.size()- 1;
   }
   
   // Methods
   
   /**
       * Checks whether the bag has one more item or not
       * return true if the bag has more item, false otherwise
       */
      public boolean hasNext()
      {
         // Additional
         if ( backIndex >= 0 )
         {
            return true;
         }
         return false;
         
//         if ( index < (aBag.size() - 1) )
//         {
//            return true;
//         }
//         return false;
      }
      
      public Integer next()
      {
         // Additional
         if (hasNext())
         {
            backIndex--;
            return aBag.getValue(backIndex + 1);
         }
         return null;
//         if (hasNext())
//         {
//            index++;
//            return aBag.getValue(index - 1);
//         }
//         return null;
      }     
}