package week2_codingTasks;



public class T1_SwapNumbers_Imren {

    public static void main(String[] args) {

        swapNumbers(34, 45);


    }

    public static void swapNumbers(int num1, int num2){

        num1 = num1 + num2;

        num2 = num1 - num2;

        num1 = num1 - num2;

        System.out.println("After swapping: " + num1 + " " + num2);

    }

}

/*

Swap two variables' values without using a third variable

 */
