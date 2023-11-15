package week7_codingTasks;

public class ArrayFindMinimum_seren {
    //Write a method that can find the maximum number from an int Array

    public static int findMin(int[] numbers){

        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min){
                min = numbers[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] numbers = {6,2,3,4,5};
        System.out.println(findMin(numbers));

    }
}
