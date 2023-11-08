package week6_codingTasks;

public class Task3_SumOfDigits_Imren {

    public static void main(String[] args) {

        System.out.println("sumOfDigits(\"45hfbgn7sn6kxmh5\") = " + sumOfDigits("45hfbgn7sn6kxmh5"));

    }



    public static int sumOfDigits(String str){

        int sum=0;
        str = str.trim();

        for (int i=0; i < str.length(); i++){

            if (Character.isDigit(str.charAt(i))){
                int digit = Integer.parseInt(String.valueOf(str.charAt(i)));
                sum += digit;

            }
        }

        return sum;
    }
}
