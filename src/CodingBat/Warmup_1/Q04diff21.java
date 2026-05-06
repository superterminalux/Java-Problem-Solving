package CodingBat.Warmup_1;

public class Q04diff21 {

    //Defining the method which is takes an input and returns the absolute difference between n and 21, except return double the absolute difference if n's value is bigger than 21.
    public static int diff21(int n) {

        //Defining the if-else statement to check the value of n.
        if (n <= 21) {
            return 21 - n;
        } else {
            return (n - 21) * 2;
        }
    }

    //Giving the test cases to program.
    public static void main(String[] args) {
        System.out.println("diff21(19) -> " + diff21(19));//Case 1
        System.out.println("diff21(10) -> " + diff21(10));//Case 2
        System.out.println("diff21(21) -> " + diff21(21));//Case 3
    }
}