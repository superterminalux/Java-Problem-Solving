package CodingBat.Warmup_1;

//Solving of the problem
public class Q05parrotTrouble {
    public static boolean parrotTrouble(boolean talking, int hour){
        return (talking && (hour < 7 || hour > 20));
    }

    //Method for displaying the result cases.
    public static void main(String[] args) {
        System.out.println("parrotTrouble(true, 6) -> " + parrotTrouble(true, 6));
        System.out.println("parrotTrouble(true, 7) -> " + parrotTrouble(true, 7));
        System.out.println("parrotTrouble(false, 6) -> " + parrotTrouble(false, 6));
    }
}