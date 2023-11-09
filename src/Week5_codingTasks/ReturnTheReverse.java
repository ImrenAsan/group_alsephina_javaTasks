package Week5_codingTasks;

public class ReturnTheReverse {
    public static void main(String[] args) {
        String word = Reverse("ABCD");
        System.out.println(word);

    }
    public static String Reverse (String str){


        String str2 = "";
        for (int i = str.length()-1; i >=0 ; i--) {

            str2+=str.charAt(i);

        }
return str2;
    }



}
