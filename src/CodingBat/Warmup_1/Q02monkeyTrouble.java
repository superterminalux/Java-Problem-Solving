package CodingBat.Warmup_1;

import java.util.Scanner;

public class Q02monkeyTrouble {

    // Solution of the Problem
    // Defining the method. Also I added "static" to use this method again later
    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return (aSmile == bSmile);
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //Taking input for the first monkey's smile status.
        System.out.print("Is the first monkey smiling? (Enter the answer with only (true or false)): ");
        boolean aSmile = keyboard.nextBoolean();

        //Taking input for the second monkey's smile status.
        System.out.print("Is the second monkey smiling? (Enter the answer with only (true or false)): ");
        boolean bSmile = keyboard.nextBoolean();

        //Calling the method and displaying the result.
        boolean inTrouble = monkeyTrouble(aSmile, bSmile);
        System.out.println("monkeyTrouble(" + aSmile + ", " + bSmile + ") -> " + inTrouble);

        keyboard.close();
    }
}