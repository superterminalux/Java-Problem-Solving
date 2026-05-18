package CodingBat.Warmup_1;

public class Q09notString {

    //Solving method of the problem
    public static String notString(String str) {
        if (str.length() == 3 && str.substring(0,3).equals("not")) {
        return str;
        } else {
            return "not " + str;
        }
    }

    //Displaying the results for given test cases.
    public static void main(String[] args) {
        System.out.println("notString(\"candy\")   -> " + notString("candy"));
        System.out.println("notString(\"x\")       -> " + notString("x"));
        System.out.println("notString(\"not bad\") -> " + notString("not bad"));
    }
}
