package week4_codingTasks;

import java.util.HashMap;
import java.util.Map;

public class T1_FrequencyOfCharacters_Imren {


    public static void main(String[] args) {

        frequencyOfCharacters("AAABBBBBCCDDDEE");


    }

    public static void frequencyOfCharacters(String word){

        Map<Character, Integer> counter = new HashMap<>();

        for (int i=0; i < word.length(); i++){
            char eachChar = word.charAt(i);

            if (!counter.containsKey(eachChar)){
                counter.put(eachChar, 1);
            }

            counter.put(eachChar, counter.get(eachChar) + 1);
        }

        System.out.println(counter);

    }
}


/*
String
Frequency of Characters
Write a return method that can find the frequency of
characters
Ex:
FrequencyOfChars ("AAABBCDD") ==> A3B2C1D2
 */
