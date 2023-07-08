package cardgame;

import java.util.ArrayList;

// Cardgame
// author:Esad Tök
// date: 05.03.2020
public class CardGame
{
   // properties
   Cards             fullPack;
   ArrayList<Player> players;
   ScoreCard         scoreCard;
   Cards           cardsOnTable;
   int               roundNo;
   int               turnOfPlayer;
   
   // constructors
   public CardGame( Player p1, Player p2, Player p3, Player p4)
   {
      players = new ArrayList<Player>(); 
      players.add( p1); 
      players.add( p2); 
      players.add( p3); 
      players.add( p4);
   }
   
   // methods
   public boolean playTurn( Player p, Card c)
   {
      if( isGameOver() || !isTurnOf( p)) 
      { 
         return false; 
      } 
      
      cardsOnTable.addTopCard( c); 
      
      if( getTurnOfPlayerNo() < 3) 
      { 
         turnOfPlayer++; 
      } 
      else 
      { 
         updateScores(); 
         
         if( !isGameOver()) 
         { 
            roundNo++; 
            turnOfPlayer = 0; 
         } 
      } 
      return true;
   }
   
   public boolean isTurnOf( Player p)
   {
      if( getTurnOfPlayerNo() == players.indexOf( p)) 
      { 
         return true; 
      } 
      return false;
   }
   
   public boolean isGameOver()
   {
      if( roundNo >= 12) 
      { 
         return true; 
      } 
      return false;
   }
   
   public int getScore( int playerNumber)
   {
      return scoreCard.getScore( playerNumber);
   }
   
   public String getName( int playerNumber)
   {
      players.get( playerNumber).getName(); 
      return "Not yet implemented";
   }
   
   public int getRoundNo()
   {
      return roundNo;
   }
   
   public int getTurnOfPlayerNo()
   {
      return turnOfPlayer;
   }
   
   public Player[] getWinners()
   {
      Player[] winners; 
      winners = new Player[4]; 
      
      for( int i = 0; i < winners.length; i++) 
      { 
         if( scoreCard.getWinners()[i] >= 0) 
         { 
            winners[i] = players.get( scoreCard.getWinners()[i]); 
         } 
      } 
      return winners;
   }
   
   public String showScoreCard()
   {
      return scoreCard.toString();
   }
   private void updateScores() 
   { 
      int topCardIndex; 
      Card temp; 
      Card maximum; 
      
      maximum = cardsOnTable.getTopCard(); 
      topCardIndex = 0; 
      
      for( int i = 0; i < 2; i++) 
      { 
         temp = cardsOnTable.getTopCard(); 
         if( temp.compareTo( maximum) == 1) 
         { 
            maximum = temp; 
            topCardIndex++; 
         } 
      } 
      
      scoreCard.update( topCardIndex, 1); 
   } 
   
   public void initGame() 
   { 
      // creating a pack of card
      // shuffling them
      fullPack = new Cards( true); 
      
      fullPack.shuffle(); 
      
      // distributing cards 
      for( int i = 0; i < 52; i++) 
      { 
         if( i <= 12) 
         { 
            players.get(0).add(fullPack.getTopCard()); 
         } 
         else if( i <= 25 && i >= 13) 
         { 
            players.get(1).add(fullPack.getTopCard()); 
         } 
         else if( i <= 38 && i >= 26) 
         { 
            players.get(2).add(fullPack.getTopCard()); 
         } 
         else if( i <= 51 && i >= 39) 
         { 
            players.get(3).add(fullPack.getTopCard()); 
         } 
      } 
      
      scoreCard = new ScoreCard( 4); 
      
      cardsOnTable = new Cards( false); 
      
      roundNo = 1; 
      turnOfPlayer = 0; 
   }
}