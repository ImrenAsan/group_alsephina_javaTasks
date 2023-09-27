package week1_codingTasks;

public class TASK1_Imren {

    public static void main(String[] args) {

        System.out.println(identifyNumber(7));

        System.out.println(identifyNumber(4));

        System.out.println(identifyNumber(0));

        System.out.println(identifyNumber(-55));

        System.out.println(identifyNumber(-128));

    }

    public static String identifyNumber(int number){

        String result = "";
        boolean isEven = number / 2 == 0;

        if (number % 2 == 0){
            result = "Even";
        }else {
            result = "Odd";
        }

        return result;
    }
}

/*
Numbers -- odd & even
Write a method which can identifies given number is even or odd.
EX:

        identify(5) -> "Odd"
        identify(6) -> "Even"
 */
