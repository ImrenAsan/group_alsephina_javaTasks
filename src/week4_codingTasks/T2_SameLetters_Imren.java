package week4_codingTasks;

import java.util.Arrays;

public class T2_SameLetters_Imren {


    public static void main(String[] args) {

        System.out.println(sameChars("abc", "cba"));

        System.out.println(sameChars("minus", "sinus"));

    }


    public static boolean sameChars(String firstString, String secondString){
        char[] first = firstString.toCharArray();
        char[] second = secondString.toCharArray();

        Arrays.sort(first);
        Arrays.sort(second);

        return Arrays.equals(first, second);

    }
}


/*
String
Same letters
Write a return method that check if a string is build out of the
same letters as another string.
Ex:
same(" abc ",","cab"); --> true
same("
abc abb "); -->
 */
