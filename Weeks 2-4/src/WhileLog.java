import java.util.Scanner;
//=================================================================================================
public class WhileLog {
    //-------------------------------------------------------------------------------------------------
    private static final Scanner keyboard = new Scanner(System.in);
    //-------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        long logNumber;
        int iterations = 0;

        System.out.print("What number : ");
        logNumber = keyboard.nextLong();

        while (logNumber >= 2) {
            iterations++;
            logNumber /= 2;
        }

        System.out.println("log2 is " + iterations);
    }
//-------------------------------------------------------------------------------------------------
}
//=================================================================================================
