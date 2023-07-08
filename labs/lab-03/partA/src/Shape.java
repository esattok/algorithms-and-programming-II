/**
 * The class that decides the shape of a geometric figure
 * @author Esad Tök
 * @version 09.03.2020
 */
public abstract class Shape implements Locatable
{
   // Properties
   int x = 0;
   int y = 0;
   
   // Methods
   
   /**
    * Gets the X coordinate 
    * @return X coordinate
    */
   public int getX()
   {
      return x;
   }
   
   /**
    * Gets the Y coordinate 
    * @return Y coordinate
    */
   public int getY()
   {
      return y;
   }
   
   /**
    * Sets the x and y coordinates to values
    * @param x new x coordinate
    * @param y new y coordinate
    */
   public void setLocation(int x, int y)
   {
      this.x = x;
      this.y = y;
   }
   
   /**
    * An abstract methods that gets area to be overriden
    */
   public abstract double getArea();
   
   /**
    * An abstract method that gets informationn for every shape
    */
   public abstract String info();
}