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
public class Baloons extends Circle implements Drawable
{
   
   // Properties
   private final int MAX_RADIUS = 100;
   
   // Constructor
   public Baloons()
   {
      super(25);
      
      
      
      
   }
   
   
   
   
   
   
   // Methods
   /**
    * Grows the radius until it gets 100 and then make r = 0 and circle selected
    */
   public void grow()
   {
      while( radius < MAX_RADIUS )
      {
         radius++;
      }
      
      radius = 0;
      this.setSelected( true );
   }
   
   /**
    * 
    * 
    */
   @Override
   public void draw( Graphics g )
   {
      
      
   }
   
   
   
   
   
   
   
}