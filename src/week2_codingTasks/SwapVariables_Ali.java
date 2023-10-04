package week2_codingTasks;

public class SwapVariables_Ali {

    public static void main(String[] args) {

        int x = 4;
        int y = 6;

        x = x + y; // 4+6=10
        y = x - y; // 10-6=4
        x = x - y; // 10-4=6

        System.out.println("New x: " + x);
        System.out.println("New y: " + y);
    }
}
