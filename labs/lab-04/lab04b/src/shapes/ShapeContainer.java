package shapes;
import java.util.*;
/**
 * The class that stores different kinds of shapes
 * @author Esad Tök
 * @version 09.03.2020
 */
public class ShapeContainer implements Iterable
{
   // Properties
   private ArrayList<Shape> shapes;
   
   // Constructor
   public ShapeContainer()
   {
      shapes = new ArrayList<>();
   }
   
   // Methods
   
   /**
    * @Override
    * @return iterator
    */
   @Override
   public Iterator<Shape> iterator()
   {
      return this.shapes.iterator();
   }
   
   /**
    * Gets the size of the shapes list
    * @return the size 
    */
   public int size()
   {
      return shapes.size();
   }
   
   /**
    * Gets the number of shapes containing the entered "x" and "y" coordinates and makes them selected
    * @param x x coordinate
    * @param y y coordinate
    * @return 
    */
   public int selectAllAt( int x, int y)
   {
      // Variables
      int count;
      
      // Program Code
      count = 0;
      
      for ( int i = 0; i < shapes.size(); i++ )
      {
         if ( ((Selectable)shapes.get(i)).contains( x, y ) )
         {
            count++;
            ((Selectable)shapes.get(i)).setSelected( true );
         }
      }
      return count;
   }
   
   /**
    * Adds a new shape to the container
    * @param s new shape to be added
    */
   public void add(Shape s)
   {
      shapes.add(s);
   }
   
   /**
    * Gets the total surface area of the entire set of shapes
    * @return the total area
    */
   public double getArea()
   {
      // Variable
      double area;
      
      // Program Code
      area = 0;
      for ( int i = 0; i < shapes.size(); i++ )
      {
         area = area + shapes.get(i).getArea();
      }
      return area;
   }
   
   /**
    * Finds the first shape that contains the given coordinate and toggle its selected state
    * @param x, y the coordinate 
    * @return the shape object 
    */
   public Shape firstOccur( int x, int y )
   {
      for ( int i = 0; i < shapes.size(); i++ )
      {
         if ( ((Selectable)shapes.get(i)).contains(x, y) )
         {
            ((Selectable)shapes.get(i)).setSelected(true);
            return shapes.get(i);
         }
      }
      return null;
   }
   
   /**
    * Removes all selected shapes from the container
    */
   public void removeSelected()
   {
      for ( int i = 0; i < shapes.size(); i++ )
      {
         if ( ((Selectable)shapes.get(i)).getSelected() )
         {
            
            shapes.remove(i);
            i--;
         }
      }
   }
   
   /**
    * @Override
    * String representation of the object
    * @return String representation
    */
   public String toString()
   {
      // Variable
      String result;
      
      // Program Code
      if (shapes.size() == 0)
      {
         result = "The shape container is currently empty";
      }
      else
      {
         result = "";
         for ( int i = 0; i < shapes.size(); i++ )
         {
            result = result + i + ") " + shapes.get(i).info() + "\n";
         }
      }
      return result;
   }
}