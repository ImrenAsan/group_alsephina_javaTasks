package week7_codingTasks;

import java.util.Arrays;

public class SortDescending_Imren {


    public static void main(String[] args) {

        int[] myArray = {5, 8,0,38,674,628,4556};

        System.out.println(Arrays.toString(myArray));


    }



    public static int[] sortDescending(int[] arr){


        for (int i = 0; i < arr.length; i++) {
            System.out.println("..i= " + i);

            for (int j = 0; j < arr.length; j++) {

                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j+1 ] = temp;
                }
            }
        }

        return arr;
    }
}
