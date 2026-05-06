package CodingBat.Warmup_1;

import java.util.Scanner;

public class Q03SumDouble {

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
        System.out.println("sumDouble(1, 2) -> " + sumDouble(1, 2));
        System.out.println("sumDouble(3, 2) -> " + sumDouble(3, 2));
        System.out.println("sumDouble(3, 2) -> " + sumDouble(2, 2));
    }
}
