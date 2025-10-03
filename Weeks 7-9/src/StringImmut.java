import java.util.Scanner;
//=================================================================================================
public class StringImmut {
    //-------------------------------------------------------------------------------------------------
    private static final Scanner keyboard = new Scanner(System.in);
    //-------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        String mySentence;
        String myUppercaseSentence;

        System.out.print("Enter a sentence : ");
        mySentence = keyboard.nextLine();
        System.out.println("The original is    : " + mySentence);

        myUppercaseSentence = mySentence.toUpperCase();
        System.out.println("The raised one is  : " + myUppercaseSentence);

        // Strings are immutable
        mySentence.toUpperCase();
        System.out.println("Wasted effort is   : " + mySentence);

        // Need to assign the resultant object to a reference variable to access it
        mySentence = mySentence.toUpperCase();
        System.out.println("The raised is    : " + mySentence);
    }
//-------------------------------------------------------------------------------------------------
}
//=================================================================================================
