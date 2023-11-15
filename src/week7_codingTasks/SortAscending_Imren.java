package week7_codingTasks;

import java.sql.Array;
import java.util.Arrays;

public class SortAscending_Imren {


    public static void main(String[] args) {
        int[] myArray = {4,7,2,1,3,9,0,5};
        System.out.println(Arrays.toString(sortAscending(myArray)));

    }

    public static int[] sortAscending(int[] arr){


        for(int i=0; i< arr.length; i++){ // outer for loop
            System.out.println(arr[i]);

            for (int j=0; j < arr.length - 1 ;  j++ ){
                if (arr[j] > arr[j +1]){
                    int temp = arr[j]; // temporary variable --> for to use the arr[j]
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }


        return arr;
    }



}


/*
Question2: Array - Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */