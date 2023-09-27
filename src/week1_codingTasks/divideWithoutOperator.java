package week1_codingTasks;

public class divideWithoutOperator {
    public static void main(String[] args) {

        int a = 75;
        int b = 13;

        int count = 0;

        while (a >= b){
            count++;
            a = a-b;
        }

        System.out.println(count);


    }
}
/*
Number - Divide without / operator
    Write method that can divide two numbers without using division operator
 */

