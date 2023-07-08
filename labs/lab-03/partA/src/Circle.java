/**
 * The class Circle that inherits from the class Shape
 * @author Esad Tök
 * @version 09.03.2020
 */
public class Circle extends Shape implements Selectable
{
    // Properties 
   private final double PI = 3.14;
   public int radius;
   private boolean selected;
   
   // Constructors
   public Circle(int radius, int x, int y)
   {
      this.radius = radius;
      setLocation(x, y);
   }
      
   // Methods
   /**
    * @Override
    * Gets the area of the circle
    * @return the area
    */
   @Override
   public double getArea()
   {
      // Variable
      double area;
      
      // Program Code
      area = (PI * Math.pow(radius, 2));
      return area;
   }
   
   /**
    * Gets whether the shape is selected or not
    * @return true if the shape is selected
    */
   public boolean getSelected()
   {
      return this.selected;
   }
   
   /**
    * Sets the selected to a new boolean
    * @param choice new boolean
    */
   public void setSelected(boolean choice)
   {
      this.selected = choice;
   }
   
   /**
    * Checkes whether the circle has the given coordinates in it
    * @param x, y the coordinates to look
    * @return true if the circle has the coordinates
    */
   public boolean contains(int x, int y) 
  {
    if ( Math.pow(getX() - x , 2) + Math.pow(getY() - y, 2) < Math.pow (radius, 2) ) 
    {
      return true;
    }
    return false;  
  }
   
   /**
    * @Override
    * Gets info of the circle object
    * @return info
    */
   @Override
   public String info()
   {
      // Variable 
      String str;
      
      // Program Code
      if ( selected )
      {
         str = "selected";
      }
      else
      {
         str = "not selected";
      }
      return "The circle with the ( " + getX() + ", " + getY() + " ) coordinate has the radius of " + this.radius + " and the area of " + this.getArea() + " and is " + str;
   }
}