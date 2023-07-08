//import java.util.*; 
 
/* 
 * a method gives random element of an String array 
 * @param words is an example String array 
 * @return random String from input String array 
 */ 
private static String chooseSecretWord(String[] words) { 
  return  words[(int)(Math.random() * words.length)]; 
} 
 
/** 
 * a method that reads set of Strings and forms a String in it. 
 * @return a random String from the ArrayList 
 */ 
private static String chooseSecretWord() { 
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
 
