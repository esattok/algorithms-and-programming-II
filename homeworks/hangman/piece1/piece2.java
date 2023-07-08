/* MAIN METHOD FOR HANGMAN
 * 12.02.2020
 * Ege Ergül, Arda Tavusbay, Taha Batur Şenli, Bora Altınok, Ali Eren Günaltılı
 * SECTION 03 - PIECE 1
 */ 

public static void  main(String[] args) {
   
   //constants
   
   
   // variables
   
   Hangman hangman = new Hangman();
   boolean testGameOver;
   char letter;
   
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