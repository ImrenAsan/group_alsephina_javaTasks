package week1_codingTasks;

public class Instructors_Solutions {

    public static void main(String[] args) {

        //Task01- Solution

        identifyOddEven(5);
        identifyOddEven(6);


        //Task02- Solution
        divides(6,3);
        divides(4,2);
        divides(3,0);
        divides(0,2);

        //Task03- Solution

        FINRA();





    }

    //Task01- solution
    public  static  void  identifyOddEven( int  n ) {
        if(n%2==0){
            System.out.println("even");}
        else{
            System.out.println("odd");}

    }

    //Task02- Solution

    public static void divides(int num1, int num2) {
        if(num2==0) {
            System.out.println("Invalid Number");
            return;
        }
        System.out.print(num1 +" divided by "+num2 +" is: ");
        int count =0;
        while(num1 >= num2) {
            num1 -= num2;
            count++;
        }
        System.out.println(count+" and remainder is "+num1);

        /*This simulates the process of long division, where you repeatedly subtract the divisor (num2)
from the dividend (num1) until the dividend becomes less than the divisor.*/
    }

    //Task03- Solution

    public static void FINRA() {
        String result = "";
        for (int i = 1; i <= 30; i++) { //iterate from 1 to 30
            if (i % 5 == 0 && i % 3 == 0) //multiple of both 3 and 5, print "FINRA" instead of the number.
                result += "FINRA ";
            else if (i % 5 == 0) //multiple of 5, print "RA" instead of the number.
                result += "RA ";
            else if (i % 3 == 0)
                result += "FIN ";  //multiple of 3, print "FIN" instead of the number.
            else
                result += i + " ";
        }
        System.out.println(result);
    }


}
