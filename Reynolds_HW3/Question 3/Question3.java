/*
Write a program that prompts the user to enter a text file name and displays the number of
numVowels and consonants in the file. Use a set to store the numVowels ’A’, ’E’, ’I’, ’O’, and ’U’
*/
import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;


public class Question3 {

    public static void main(String[] args) throws Exception{
        Scanner input=new Scanner(System.in);
        System.out.print("Enter text file name: ");
        String filename=input.nextLine();
        
        File file = new File(filename);
        
        if(file.exists()){
            Scanner read=new Scanner(file);
            int numVowels = 0;
            int consonant = 0;
            HashSet<Character> vowel = new HashSet<>(Arrays.asList(new Character[]{'A', 'E', 'I', 'O', 'U'}));
            while (read.hasNext()) {  
                String s=read.next();
                for(char c: s.toCharArray()) {
                    if (Character.isAlphabetic(c)) {
                        c = Character.toUpperCase(c);
                        if (vowel.contains(c))
                            numVowels++;
                        else
                            consonant++;
                    }
                }
            }
        

        System.out.println("Vowels count = " + numVowels);
        System.out.println("consonant count = " + consonant);

        } 
       else{
         System.out.println("File "+filename+" does not exist.");
       }
      
    }
}