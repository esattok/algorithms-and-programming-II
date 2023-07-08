public class Hangman{ 
 // properties  
   
 // constructors 
 public Hangman() 
 { 
   //[65,90] [97,122] 
   allLetters = new StringBuffer("abcdefghijklmnopqrstuwxyz"); 
   maxAllowedIncorrectTries = 6; 
   numberOfIncorrectTries = 0; 
   usedLetters = new StringBuffer(); 
   secretWord = new StringBuffer( chooseSecretWord() ); 
   knownSoFar = new StringBuffer( secretWord.length() ); 
   for ( int i = 0; i < secretWord.length(); i++ ){ 
     knownSoFar.setCharAt(i,'*'); 
   } 
 } 
 // methods 
}