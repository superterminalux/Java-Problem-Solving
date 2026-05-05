package CodingBat.Warmup_1;

import java.util.Scanner;

public class Q01SleepIn {

    //Solution of the Problem
    //Defining the method. Also I added "static" to use this method again later.
    public static boolean sleepIn(boolean weekday, boolean vacation) {
        return (!weekday || vacation);
    }

    //This solution can not display the result on the screen, that is why I have to add some new lines to see something on IDE.
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        //Taking input for checking is day weekday or not.
        System.out.print("Is it a weekday today:? (enter true or false): ");
        boolean isWeekday = keyboard.nextBoolean();

        //Taking input for checking is day holiday or not.
        System.out.print("Is it a vacation today?: (enter true or false): ");
        boolean isVacation = keyboard.nextBoolean();

        //Calling the method and displaying the result.
        boolean canSleepIn = sleepIn(isWeekday, isVacation);
        System.out.println("sleepIn(" + isWeekday + ", " + isVacation + ") → " + canSleepIn);

        keyboard.close();
    }
}