package CodingBat.Warmup_1;

public class Q07nearHundred {

    //The problem solving method.
    public static boolean nearHundred(int n) {
        return ((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10));
    }

    //Displaying the results for given test cases.
    public static void main(String[] args) {
        System.out.println("nearHundred(93) -> " + nearHundred(93));
        System.out.println("nearHundred(90) -> " + nearHundred(90));
        System.out.println("nearHundred(89) -> " + nearHundred(89));
    }
}