package week9_codingTasks;

import java.util.Arrays;

public class Task1_ConcatTwoArrays {

    //Write a return method that can concate two arrays

    public static int[] concateTwoArray(int[] arr1, int[] arr2){

        int[] result = new int[arr1.length+arr2.length];

        int k = 0; // for third array's index number

        for (int i = 0; i < arr1.length; i++,k++) {
            result[k] = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++,k++) {
            result[k] = arr2[i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4};
        int[] array2 = {7,8,9};

        System.out.println(Arrays.toString(concateTwoArray(array1,array2)));
    }
}
