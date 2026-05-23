package CodingBat.Warmup_1;

public class Q12front3 {

    //Solution of the Problem.
    public static String front3(String str) {
        String front = "";

        //Defining the if-else statement to check the length of the string.
        if (str.length() >= 3) {
            front = str.substring(0, 3);
        } else {
            front = str;
        }

        return front + front + front;
    }

    //Displaying the results for given test cases.
    public static void main(String[] args) {
        System.out.println("front3(\"Java\") -> " + front3("JAVA"));
        System.out.println("front3(\"Chocolate\") -> " + front3("Chocolate"));
        System.out.println("front3(\"abc\") -> " + front3("abc"));
    }

}
