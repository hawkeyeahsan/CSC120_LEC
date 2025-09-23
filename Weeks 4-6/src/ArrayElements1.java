import java.util.Scanner;
//=================================================================================================
public class ArrayElements1 {
    //-------------------------------------------------------------------------------------------------
    private static final Scanner keyboard = new Scanner(System.in);
    private static final int PRIMES_STORE_SIZE = 5;
    //-------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        int[] primes;
        int primeNumber;

        primes = new int[PRIMES_STORE_SIZE];
        primes[0] = 2;
        primes[1] = 3;
        primes[2] = 5;
        primes[3] = 7;
        primes[4] = 11;

        System.out.print("Which prime do you want? : ");
        primeNumber = keyboard.nextInt();
        System.out.println("Prime number " + primeNumber + " is " +
                primes[primeNumber]);

    }
//-------------------------------------------------------------------------------------------------
}
//=================================================================================================
