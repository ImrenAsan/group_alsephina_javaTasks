package week7_codingTasks;

public class FindMinimumNumber_Imren {

    public static void main(String[] args) {

        int[] numsArray={10,6,78,334, 67,23,-6};

        System.out.println(findMinimum(numsArray));

    }


    public static int findMinimum(int[] numbersArray){

        int min = numbersArray[0];

        for (int i = 0; i < numbersArray.length; i++) {
            if(numbersArray[i] < min){
                min = numbersArray[i];
            }
        }
        return min;
    }

}

/*
Question1: Array - Find Minimum
Write a method that can find the maximum number from an int Array
 */
