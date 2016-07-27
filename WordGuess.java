import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by agrawaay on 7/27/2016.
 */
public class WordGuess {
 public static void main(String [] args) {
     String fileName = "C:\\Users\\agrawaay\\Documents\\sowpods.txt";
     FileReader fread = new FileReader(fileName);
     BufferedReader bufferedReader = new BufferedReader(fread);
     String line = "";
     ArrayList<String> lineArray = new ArrayList<>();

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
