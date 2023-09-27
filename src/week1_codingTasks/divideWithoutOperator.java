package week1_codingTasks;

public class divideWithoutOperator {

    public static void main(String[] args) {
        System.out.println(divideWithoutOperator(75,15));

    }
    public static int divideWithoutOperator(int a, int b) {

        int count = 0;

        while (a >= b){
            count++;
            a = a-b;
        }

        return count;



    }
}
/*
Number - Divide without / operator
    Write method that can divide two numbers without using division operator
 */

