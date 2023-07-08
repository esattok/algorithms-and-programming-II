import java.util.*;
public class Hangman{ 
   
  //properties 
  StringBuffer secretWord; 
  StringBuffer allLetters; 
  StringBuffer usedLetters; 
  StringBuffer knownSoFar; 
  StringBuffer enteredLetter; 
  int numberOfIncorrectTries; 
  int maxAllowedIncorrectTries;  
   
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
 
 
/** 
 * a method that reads set of Strings and forms a String in it. 
 * @return a random String from the ArrayList 
 */ 
private static String chooseSecretWord() { 
   Scanner scan = new Scanner(System.in);
  ArrayList<String> words; 
  String input; 
   
  words = new ArrayList<String>(); 
   
  input = scan.nextLine(); 
  words.add(input); 
   
  //using sentinel while loop  
  while (!input.equals("STOP")) { 
    input = scan.nextLine(); 
    words.add(input); 
  } 
   
  return words.get((int)(Math.random() * words.size() - 1)); //to avoid getting last element("STOP")       
}
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
 
   
  /* 
   * This is a method that return all letters 
   * @return allLetters 
   *  
   */ 
  public StringBuffer getAllLetters(){ 
    return allLetters; 
  } 
  /* 
   * This is a method that return all used letters 
   * @return usedletters 
   *  
   */ 
  public StringBuffer getUsedLetters(){ 
    return usedLetters; 
  } 
   
  /* 
   * This is a method that return number of ˝ncorrect tries 
   * @return numberOfIncorrectTries 
   *  
   */ 
  public int getNumOfIncorrectTries(){ 
    return numberOfIncorrectTries; 
  } 
   
  /* 
   * This is a method that return max allowed ˝ncorrect tries 
   * @return maxAllowedIncorrectTries 
   *  
   */ 
  public int getMaxAllowedIncorrectTries(){ 
    return maxAllowedIncorrectTries; 
  } 
  /* 
   * This is a method that return letters known so far 
   * @return knownSoFar 
   *  
   */ 
  public StringBuffer getKnownSoFar(StringBuffer secretWord, StringBuffer enteredLetter){ 
    for(int i = 0; i < secretWord.length()-1; i++){ 
      if(secretWord.charAt(i) == enteredLetter.charAt(0)){ 
        return knownSoFar; 
      } 
    } 
    return knownSoFar; 
  } 
  /* 
   *  
   * @return 
   *  
   */ 
  public int tryThis(){ 
    return 0; 
  }   
   
  /* 
   * This is a method that return false if game is over 
   * @return false 
   *  
   */ 
  public boolean isGameOver(){ 
    if(numberOfIncorrectTries == maxAllowedIncorrectTries && knownSoFar == secretWord){ 
      chooseSecretWord(); 
    } 
    return false; 
  } 
   
  /* 
   * This is a method that return false if game is lost 
   * @return false 
   *  
   */ 
  public boolean hasLost(){ 
    return numberOfIncorrectTries == maxAllowedIncorrectTries; 
     
  } 
   
  /* 
   * @return secretWord 
   *  
   */ 
  
  public static void  main(String[] args) {
   
   //constants
   
   
   // variables
   
   Hangman hangman = new Hangman();
   boolean testGameOver;
   String letter;
   
   //program code
   
   testGameOver = hangman.isGameOver();  // CHECKS IF THE GAME IS OVER, SUPPOSED THAT isGameOver() METHOD 
                                         // GIVES THE RESULT "FALSE" INITIALLY SINCE THE GAME IS NOT OVER, YET EVEN STARTED :)
   
   
   System.out.println( hangman.getAllLetters());  //  SHOWS THE USER ALL POSSIBLE LETTERS IN THE ALPHABET, SUPPOSED THAT getAllLeters() METHOD
                                                  //  RETURNS THE STRING OF ENGLISH ALPHABET
   
   System.out.print( "Hello there! ");
   
   
   while ( !testGameOver)
   {
      System.out.println( "Please use unusued letter from the English Alphabet.\n Used letters are: " + hangman.getUsedLetters());
      letter = scan.next();
      
      returnedInteger = hangman.tryThis(letter);
      
      if ( returnedInteger == 0) {  //  IF tryThis() METHOD RETURNS 0, THEN IT MEANS THERE IS NO LETTER IN THE WORD MATCHES WITH THE LETTER USER ENTERED
         
         System.out.println( "The letter " + letter + " is not in this word.");
         System.out.println( hangman.getKnownSoFar());  
      }
      
      else if ( returnedInteger == -1 ) {  //  IF tryThis() METHOD RETURNS -1, THEN IT MEANS USER ENTERED AN INVALID LETTER
         System.out.println( "Error, you have entered an invalid letter.");
      }
      
      else if ( returnedInteger == -2 ){   //  IF tryThis() METHOD RETURNS -2, THEN IT MEANS USER ENTERED A LETTER THAT HAS ALREADY BEEN ENTERED
         System.out.println( "Error, you have already tried this letter.");
      } 
      
      else if ( returnedInteger == -3 ){   //  IF tryThis() METHOD RETURNS -3, THEN IT MEANS GAME IS OVER
         System.out.println( "The game is over!");
      }
      
      else {
         System.out.println( hangman.getKnownSoFar());  
      }  
      
      testGameOver = hangman.isGameOver();  //  WE ASSUME THAT THE BOOLEAN RETURN VALUE OF isGameOver() CHANGES WHEN USER ENTERS DIFFERENT LETTERS
      //  IF ALL THE LETTERS ARE REVEALED OR MAX INCORRECT TRIES GOT REACHED, THE METHOD WILL RETURN TRUE.
      //  THE LINE CHECKS AT THE END OF EACH LOOP WHETHER GAME ENDED OR NOT.
   }
   
   if ( hangman.hasLost())
      System.out.println( "You lose!" );
   else
      System.out.println( "You win!" );
   
} 
} 