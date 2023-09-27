package week1_codingTasks;

public class DivideWithoutDivisionOperatorAli {

    public static void main(String[] args) {
        int x = 23;
        int y = 7;

         divide(x,y);
    }

    public static void divide(int dividend, int divisor) {

        if (divisor == 0) {
            System.err.println(("No number can be divisible by zero")); // Denominator cannot be zero
            return;
        }

        int quotient = 0;

        while (dividend >= divisor) { // Subtract the divisor from the dividend until dividend gets less than divisor
            dividend = dividend - divisor;
            quotient++;
        }

        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + dividend);
    }

}

/*
Write a method that can divide two numbers without using division operator
 */
