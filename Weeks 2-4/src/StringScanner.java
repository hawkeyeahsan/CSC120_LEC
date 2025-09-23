import java.util.Scanner;
//=================================================================================================
public class StringScanner {
    //-------------------------------------------------------------------------------------------------
    private static final Scanner keyboard = new Scanner(System.in);
    //-------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        String inputFromScanner;
        int numericInputFromScanner;

//----nextLine() reads until the end of the line, including return
        System.out.print("Please enter some words   : ");
        inputFromScanner = keyboard.nextLine();
        System.out.println("The words are " + inputFromScanner + "\n");

//----next() reads a word, but the space is not used until the next read
        System.out.print("Please enter some words   : ");
        inputFromScanner = keyboard.next();
        System.out.println("The first word is " + inputFromScanner);
        inputFromScanner = keyboard.next();
        System.out.println("The next word is " + inputFromScanner);
        inputFromScanner = keyboard.nextLine();
        System.out.println("The junk is ==" + inputFromScanner + "==\n");

//----How to discard the rest of a line, including return
        System.out.print("Please enter a word       : ");
        inputFromScanner = keyboard.next();
        System.out.println("The word is " + inputFromScanner);
        System.out.println("Ignoring the rest of the line\n");
        keyboard.nextLine();

//----This is a problem to be solved
        System.out.print("Please enter an integer   : ");
        numericInputFromScanner = keyboard.nextInt();
        System.out.println("The integer is " + numericInputFromScanner);
        System.out.print("Please enter some words   : ");
        inputFromScanner = keyboard.nextLine();
        System.out.println("The words are ==" + inputFromScanner + "==\n");

//----And here's the solution
        System.out.print("Please enter an integer   : ");
        numericInputFromScanner = keyboard.nextInt();
        System.out.println("The integer is " + numericInputFromScanner);
        System.out.println("Ignoring the rest of the line\n");
        keyboard.nextLine();
        System.out.print("Please enter some words   : ");
        inputFromScanner = keyboard.nextLine();
        System.out.println("The words are " + inputFromScanner);
    }
//-------------------------------------------------------------------------------------------------
}
//=================================================================================================
