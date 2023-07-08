package application;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import shapes.*;
/**
 * Panel class for the baloons game
 * @author Esat Tök
 * @version 04.04.2020
 */
public class Baloon extends Circle implements Drawable
{
   
   // Properties
   private final int MAX_RADIUS = 100;
   
   // Constructor
   public Baloon( int x, int y)
   {
      super(25);
      setLocation( x, y );
   }
   
   
   // Methods
   /**
    * Grows the radius until it gets 100 and then make r = 0 and circle selected
    */
   public void grow()
   {
      if ( radius <= MAX_RADIUS )
      {
         radius++;
      }
      else
      {
         radius = 0;
         this.setSelected( true );
      }
   }
   
   /**
    * @Override
    * Draws ovals
    */
   @Override
   public void draw( Graphics g )
   {
      g.drawOval( (getX() - radius), (getY() - radius), (radius * 2), (radius * 2) );
   }
}