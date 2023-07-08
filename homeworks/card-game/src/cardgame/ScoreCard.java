package cardgame;

// ScoreCard - Maintains one integer score per player, for any number of players
//             Caution: invalid playernumbers result in run-time exception!
// author: Esad Tök
// date: 05.03.2020
public class ScoreCard
{
   // properties
   int[] scores;
   
   // constructors
   public ScoreCard( int noOfPlayers)
   {
      scores = new int[noOfPlayers];
      
      // init all scores to zero
      for ( int i = 0; i < scores.length; i++)
         scores[i] = 0;
   }
   
   // methods
   public int getScore( int playerNo)
   {
      return scores[ playerNo];
   }
   
   public void update( int playerNo, int amount)
   {
      scores[playerNo] += amount;
   }
   
   public String toString()
   {
      String s;
      s = "\n"
         + "_____________\n"
         + "\nPlayer\tScore\n"
         + "_____________\n";
      
      for ( int playerNo = 0; playerNo < scores.length; playerNo++)
      {
         s = s + playerNo + "\t" + scores[playerNo] + "\n";
      }
      
      s += "_____________\n";
      return s;
   }
   
   public int[] getWinners()
   {
      int[] winners; 
      winners = new int[scores.length]; 
      int lastIndex = 0; 
      
      // Declaring elements to -1
      for( int i = 0; i < winners.length; i++) 
      { 
         winners[i] = -1; 
      } 
      
      int maximum;
      maximum = scores[0]; 
      
      //finding the maximum 
      for( int i = 1; i < scores.length; i++) 
      { 
         if( scores[i] > maximum) 
         { 
            maximum = scores[i]; 
         } 
      } 
      
      for( int i = 0; i < scores.length; i++) 
      { 
         if( scores[i] == maximum) 
         { 
            winners[lastIndex] = i; 
            lastIndex++; 
         } 
      } 
      
      return winners;
   }
   
} // end class ScoreCard
