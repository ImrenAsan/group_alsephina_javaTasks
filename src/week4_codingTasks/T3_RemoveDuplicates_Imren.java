package week4_codingTasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class T3_RemoveDuplicates_Imren {


    public static void main(String[] args) {

        System.out.println(removeDuplicates("Bananaforyou"));

    }

    public static String removeDuplicates(String str){


        char[] arr= str.toCharArray();

        Set<Character> unique = new HashSet<>();

        for (char each : arr){
            unique.add(each);
        }

        char[] uniqueArr = new char[unique.size()];
        int index = 0;

        for (char each : unique){
            uniqueArr[index++] = each;

        }

        return Arrays.toString(uniqueArr);

    }

}

/*
String
Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex:
removeDup (" AAABBBCCC")==> ABC
 */
