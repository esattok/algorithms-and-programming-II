import java.util.*;
/**
 * A tester class for shape objects 
 * @author Esad Tök
 * @version 09.03.2020
 */
public class ShapeTester
{
   public static void main(String[] args)
   {
      Scanner scan = new Scanner(System.in);
      
      // Constants
      
      // Variables
      ShapeContainer list;
      int input;
      int input2;
      int radius;
      int width;
      int height;
      int side;
      int x;
      int y;
      int checkX;
      int checkY;
      
      // Program Code
      list = null;
      do
      {
         System.out.println( "\tMenu\n----------------------\n1) Add a new container\n2) Add a new shape\n3) Remove all selected shapes\n" +
                            "4) Compute the total surface area\n5) Check the first shape containing a location\n6) List the shapes\n7) Exit");
         System.out.print( "----------------------\nYour choice: " );
         input = scan.nextInt();
         
         if ( input == 1 )
         {
           list = new ShapeContainer(); 
         }
         
         else if ( list != null && input == 2 )
         {
            System.out.println( "Which shape do you want to add?\n1) Circle\n2) Rectangle\n3) Square" );
            System.out.print( "Your choice: " );
            input2 = scan.nextInt();
            if ( input2 == 1 )
            {
               System.out.print( "Enter the radius: " );
               radius = scan.nextInt();
               System.out.print( "Enter the \"x\" coordinate: " );
               x = scan.nextInt();
               System.out.print( "Enter the \"y\" coordinate: " );
               y = scan.nextInt();
               list.add( new Circle(radius, x, y) );
            }
            else if ( input2 == 2 )
            {
               System.out.print( "Enter the width: " );
               width = scan.nextInt();
               System.out.print( "Enter the height: " );
               height = scan.nextInt();
               System.out.print( "Enter the \"x\" coordinate: " );
               x = scan.nextInt();
               System.out.print( "Enter the \"y\" coordinate: " );
               y = scan.nextInt();
               list.add( new Rectangle(width, height, x, y) );
            }
            else if ( input2 == 3 )
            {
               System.out.print( "Enter the side: " );
               side = scan.nextInt();
               System.out.print( "Enter the \"x\" coordinate: " );
               x = scan.nextInt();
               System.out.print( "Enter the \"y\" coordinate: " );
               y = scan.nextInt();
               list.add( new Square(side, x, y) );
            }
         }
         
         else if ( list != null && input == 3 )
         {
            list.remove();
         }
         
         else if ( list != null && input == 4 )
         {
            System.out.println( "The total surface area of the shapes in the container is " + list.getArea() );
         }
         
         else if ( list != null && input == 5 )
         {
            System.out.println( "Enter the \"x\" coordinate to check" );
            checkX = scan.nextInt();
            System.out.println( "Enter the \"y\" coordinate to check" );
            checkY = scan.nextInt();
            
            if ( list.firstOccur(checkX, checkY) == null )
            {
               System.out.println( "There is no shape that contains the location ( " + checkX + ", " + checkY + " )" );
            }
            else
            {
               System.out.println( "The first shape that contains the location ( " + checkX + ", " + checkY + " ) is\n" + list.firstOccur(checkX, checkY).info() );
            }
         }
         
         else if ( list != null && input == 6 )
         {
            System.out.println( list );
         }
         
         else if ( input != 7 )
         {
            System.out.println( "Invalid input" );
         }
         System.out.println();
         
      } while(input != 7);
      System.out.println( "Goodbye" );
   }
}