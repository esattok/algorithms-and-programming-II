package shapes;
/**
 * The interface that has several methods for shapes
 * @author Esad Tök
 * @version 09.03.2020
 */
public interface Locatable
{
   /**
    * Gets the X coordinate of a shape
    */
   int getX();
   
    /**
    * Gets the Y coordinate of a shape
    */
   int getY();
   
   /**
    * Sets the location of the shape
    */
   void setLocation(int x, int y);
}