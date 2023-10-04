package week2_codingTasks;

public class T2_DivisibleBy_Imren {


    public static void main(String[] args) {


        divisibleBy(60);

        divisibleBy(120);

        divisibleBy(-30);

        divisibleBy(12);

        divisibleBy(20);



    }

    public static void divisibleBy(int number){

        String result ="";

        if (number >= 1 && number <= 100){
            if ((number % 3 == 0) && (number % 5 == 0) && (number % 15 == 0)){
                result = "Divisible by 15 section: " + number;
            } else if (number % 5 == 0) {
                result = "Divisible by 5 section: " + number;
            }else if (number % 3 == 0){
                result = "Divisible by 3 section: " + number;
            }
        }else {
            result = "The number out of 1- 100 is INVALID!";
        }

        System.out.println(result);


    }


}

/*

Numbers -- Divisible by 3, 5, 15

    Write a program that can print the numbers between 1- 100 can be divisible by3, 5, and 15.

    - if the number can be divisible by 3, 5, and 15, then it should be displayed in DivisibleBy15' section
    - if the number can be divisible by 3, but can not be divisible by 15, then it should only be displayed in DivisibleBy3' section
    - if the number can be divisible by 5, but can not be divisible by 15, then it should only be displayed in DivisibleBy5' section


    ex:

    Output:

        Divisible By 15 -> 15, 30, 45, 60, 75, 90
        Divisible By 5 -> 5, 10, 15, 20, 25, 35, 40, 50, 55, 65, 70, 80, 85, 95, 100
        Divisible By 3 -> 3, 6, 9, 12, 18, 21, 24, 27, 33, 36, 39, 42, 48, 51, 54, 57, 63, 66, 69, 72, 78, 81, 84, 87, 93, 96, 99




 */
