/**
 * The interface that decides whether a shape selectable or not
 * @author Esad Tök
 * @version 09.03.2020
 */
public interface Selectable
{
   boolean getSelected();
   boolean contains( int x, int y);
   void setSelected(boolean select);
}