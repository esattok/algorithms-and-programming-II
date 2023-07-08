/**
 * The class Square that inherits from the class Rectangle
 * @author Esad Tök
 * @version 09.03.2020
 */
public class Square extends Rectangle implements Selectable
{
   // Properties
   private int side;
   private boolean selected;
   
   // Constructor
   public Square(int side, int x, int y)
   {
      super(side, side, x, y);
      this.side = side;
      setLocation(x, y);
   }
   
   // Methods
   /**
    * @Override
    * Gets the area of the square
    * @return the area
    */
   @Override
   public double getArea()
   {
      // Variable
      double area;
      
      // Program Code
      area = Math.pow(side, 2);
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
    * @Override
    * Gets info of the Square object
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
      return "The square with the ( " + getX() + ", " + getY() + " ) coordinate has the side of " + this.side + ", and the area of " + this.getArea() + " and is " + str;
   }
}