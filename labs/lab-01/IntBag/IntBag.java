/**
 * The class that contains a number of integers in it
 * @author Esad Tök
 * @version 15.02.2020
 */
public class IntBag
{
   // Properties
   private int[] bag;
   private int valid;
   
   // Constructures
   public IntBag()
   {
      this.bag = new int[100];
      this.valid = 0;
   }
   
   /**
    * Constructor that generates the object with entered limit
    * @param number maximum size of the list
    */
   public IntBag( int number )
   {
      this.bag = new int[number];
      this.valid = 0;
   }
   
   // Methods
   /**
    * Adds the new value to the end of the list
    * @param value the value
    */
   public void add( int value )
   {
      bag[valid] = value;
      valid++;
   }
   
   /**
    * Adds the number into the list at specific location
    * @param value new value
    * @param intes the index of the new value
    */
   public void add( int value, int index )
   {
      valid++;
      for ( int i = (valid - 1); i > index; i-- )
      {
         bag[i] = bag[i-1];
      }
      bag[index] = value;
   }
   
   /**
    * Removes a value from the list
    * @param index the index of the value to remove
    */
   public void remove( int index )
   {
      for ( int i = (index + 1); i < valid; i++ )
      {
         bag[ i - 1 ] = bag[i];
      }
      valid--;
   }
   
   /**
    * Checks the list whether it contains a specific value
    * @param value the value to check
    * @return true if the value exists in the list
    */
   public boolean contains( int value )
   {
      for (int i = 0; i < valid; i++)
      {
         if (bag[i] == value)
         {
            return true;
         }
      }
      return false;
   }
   
   /**
    * Gets the size of the list
    * @return the size of the list
    */
   public int size()
   {
      return valid;
   }
   
   /**
    * Gets the value at a specific index
    * @param index the index of the value
    * @return the value
    */
   public int getValue( int index )
   {
      return bag[index];
   }
   
   /**
    * Finds all indexes of a specific value in the list
    * @param value the test value
    * @return the indexes of the test value
    */
   public String findAll( int value )
   {
      // Variables
      String result;
      int count;
      
      // Program Codes
      result = "";
      count = 0;
      for ( int i = 0; i < valid; i++ )
      {
         if ( value == bag[i] )
         {
            if ( count > 0 )
            {
               result = result + ", ";
            }
            result = result + i;
            count++;
         }
      }
      return result;
   }
   
   /**
    * @Override 
    * String representation of the object
    * @return the string representation
    */
   public String toString()
   {
      String result;
      result = "";
      
      result = result + "[ ";
      for ( int i = 0; i < valid; i++ )
      {
         if ( i > 0 )
         {
            result = result + ", ";
         }
         result = result + bag[i];
      }
      result = result + " ]";
      return result;
   }
}