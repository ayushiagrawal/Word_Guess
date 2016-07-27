import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

/**
 * Created by agrawaay on 7/27/2016.
 */
public class WordGuess {
 public static void main(String [] args) throws FileNotFoundException {
     String fileName = "C:\\Users\\agrawaay\\Documents\\sowpods.txt";
     FileReader fread = new FileReader(fileName);
     BufferedReader bufferedReader = new BufferedReader(fread);
     String line = "";
     ArrayList<String> lineArray = new ArrayList<>();
     String myWord = "am";

     try {
         while((line = bufferedReader.readLine()) != null) {
             lineArray.add(line);
            // char [] array = line.toCharArray();
         }
     }
     catch (IOException e) {
         e.printStackTrace();
     }
     ArrayList<String > variable = new ArrayList<>();
     variable = wordsWithSizeTwo(lineArray);
    /* for(String str : variable) {
         System.out.println(str);
     }*/
     Random rand = new Random(System.currentTimeMillis());
     String randomWord = variable.get(rand.nextInt(variable.size()));
     char [] array = randomWord.toCharArray();
     System.out.println(randomWord);


 }
    public static ArrayList<String> wordsWithSizeTwo(ArrayList<String> words) {
        ArrayList<String> TwoCharacterWords = new ArrayList<>();
        for(String Character : words) {
            if (Character.length() == 2)
                TwoCharacterWords.add(Character);
        }
        return  TwoCharacterWords;

    }

}
