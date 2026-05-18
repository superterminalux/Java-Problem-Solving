package CodingBat.Warmup_1;

public class Q10missingChar {

    //Solution of the Problem.
    public static String missingChar(String str, int n) {
        return str.substring(0, n) + str.substring(n+1);//
    }

    //Displaying the results for given test cases.
    public static void main(String[] args) {
        System.out.println("missingChar(\"kitten\", 1) -> " + missingChar("kitten", 1));
        System.out.println("missingChar(\"kitten\", 0) -> " + missingChar("kitten", 0));
        System.out.println("missingChar(\"kitten\", 4) -> " + missingChar("kitten", 4));
    }
}
