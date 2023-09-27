package week1_codingTasks;

public class OddOrEvenAli {

    public static void main(String[] args) {

        identify(5);
        identify(6);

    }
    public static void identify(int number){

        if(number % 2 == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

    }

}

/*
Write a method which can identify given number is even or odd
Ex: identify(5)-> "Odd"
    identify(6)-> "Even"
 */
