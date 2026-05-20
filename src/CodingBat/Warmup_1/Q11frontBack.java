package CodingBat.Warmup_1;

public class Q11frontBack {

    //Solution of the Problem
    public static String frontBack(String str) {
        if (str.length() <= 1) {
            return str;
        } else {

            //Defining new combination.
            String firstString = str.substring(0, 1);
            String secondString = str.substring(str.length() - 1);
            String middleString = str.substring(1, str.length() - 1);

            //Returning the new combination.
            return firstString + middleString + secondString;
        }
    }

    //Displaying the results for given test cases.
    public static void main(String[] args) {
        System.out.println("frontBack(\"code\") -> " + frontBack("code"));
        System.out.println("frontBack(\"a\")    -> " + frontBack("a"));
        System.out.println("frontBack(\"ab\")   -> " + frontBack("ab"));
    }
}
