package CodingBat.Warmup_1;

public class Q13backAround {

    //Solution of the Problem.
    public static String backAround(String str) {
        String lastChar = str.substring(str.length()-1);
        return lastChar + str + lastChar;
    }

    //Displaying the results for given test cases.
    public static void main(String[] args) {
        System.out.println("backAround(\"cat\") -> " + backAround("cat"));
        System.out.println("backAround(\"Hello\") -> " + backAround("Hello"));
        System.out.println("backAround(\"a\") -> " + backAround("a"));
    }

}
