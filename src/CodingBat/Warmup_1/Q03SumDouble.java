package CodingBat.Warmup_1;

import java.util.Scanner;

public class Q03SumDouble {

    //Defining the method which is takes inputs and returns the sum of the two numbers or double the sum if they are equal.
    public static int sumDouble(int a, int b) {

        int result = a+b;

        if (a==b) {
            return result*2;
        } else {
            return result;
        }
    }

    //Giving the test cases to program.
    public static void main(String[] args) {
        System.out.println("sumDouble(1, 2) -> " + sumDouble(1, 2));//Case 1
        System.out.println("sumDouble(3, 2) -> " + sumDouble(3, 2));//Case 2
        System.out.println("sumDouble(2, 2) -> " + sumDouble(2, 2));//Case 3
    }
}
