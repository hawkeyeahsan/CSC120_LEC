import java.util.Scanner;

public class Practice {

    private static final Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        int index;
        System.out.println("Debugging in progress");
        int[] myArray = new int[5];

        for (index = 0; index < myArray.length; index++) {

            System.out.println("Enter a number at slot " + index);
            myArray[index] = keyboard.nextInt();

        }

        for (index = 0; index < myArray.length; index++) {

            System.out.println("Value at slot " + index + " is " + myArray[index]);

        }

    } // end of the main method

} // end of the Practice class
