/** 
 * Try this method. 3rd piece of the Hangman Game.  
 * @author Yaren Durgun, Onur İlhan, Öykü Erhan, Lara Özyeğen, Berk Saltuk Yılmaz, Sarper Turan  
 * @version 12/02/2020 
 */  
 
/** 
 * simply looks for the guessed letter in the secret word 
 * @param the letter that the player guesses 
 * @return  
 */ 
public int tryThis( String letter ) 
{ 
    
   //variables 
   int pos;  
   int letterCount; //number of times the letter occurs in the secret word 
    
   //method code 
   pos = 0; 
   letterCount = 0; 
    
   if( usedLetters.indexOf( letter ) != -1 ) 
   { 
      usedLetters.insert( 0, letter ); 
      while( pos < secretWord.length() && pos != -1) 
      { 
         pos = secretWord.indexOf( letter, pos ) ; 
         if(pos != -1 )  
         { 
            knownSoFar.replace( pos, pos + 1, letter); 
            letterCount = letterCount + 1; 
            pos = pos + 1; 
         }   
      } 
      if( letterCount == 0  ) 
      { 
         if( numberOfIncorrectTries < maxAllowedIncorrectTries ) 
         { 
            numberOfIncorrectTries = numberOfIncorrectTries + 1; 
            return -1; 
         } 
         else 
         { 
            return -3; 
         } 
      } 
      else 
      { 
         return letterCount; 
      } 
   } 
   else 
   { 
      return -2; 
   } 
} 
 
