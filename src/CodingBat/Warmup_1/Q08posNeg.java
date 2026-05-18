package CodingBat.Warmup_1;

public class Q08posNeg {

    //Solving method of the problem.
    public static boolean posNeg(int a, int b, boolean negative) {
        if (negative){
            return (a < 0 && b < 0);
        } else {
            return ( (a < 0 && b > 0) || (a > 0 && b < 0));
        }
    }

    //Displaying method
    public static void main(String[] args){
        System.out.println("posNeg(1, -1, false) -> " + posNeg(1, -1, false));
        System.out.println("posNeg(-1, 1, false) -> " + posNeg(-1, 1, false));
        System.out.println("posNeg(-4, -5, true) -> " + posNeg(-4, -5, true));
    }
}