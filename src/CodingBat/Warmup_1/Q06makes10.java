package CodingBat.Warmup_1;

public class Q06makes10 {

    //Solving method
    public static boolean makes10(int a, int b) {

        // Defining the if-else statement to check the sum of the two numbers.
        if (a + b == 10 || (a == 10 || b == 10)) {
            return true;
        } else {
            return false;
        }
    }

    //Displaying method
    public static void main(String[] args) {
        System.out.println("makes10(9, 10) -> " + makes10(9, 10));
        System.out.println("makes10(9, 9) -> " + makes10(9, 9));
        System.out.println("makes10(1, 9) -> " + makes10(1, 9));
    }
}