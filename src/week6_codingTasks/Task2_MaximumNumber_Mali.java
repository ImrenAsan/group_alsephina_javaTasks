package week6_codingTasks;

public class Task2_MaximumNumber_Mali {

    public static void main(String[] args) {

        int[] array = {20, 10, 40, 50, 30};
        System.out.println(findMaximum(array));
    }
    public static int findMaximum(int[] arr){

        int max = arr[0];

        for (int i = 1; i <arr.length ; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
        }
        return max;

    }
}
