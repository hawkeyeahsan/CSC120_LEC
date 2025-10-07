import java.util.Scanner;
//=================================================================================================
public class StringMethod {
    //-------------------------------------------------------------------------------------------------
    private static final Scanner keyboard = new Scanner(System.in);
    //-------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        String myPrompt = "What is your name : ";
        String response;


        // A copy of the reference to the string object is passed as the argument, and a reference is returned.
        response = readUserData(myPrompt);
        System.out.println("The user's response is \"" + response + "\"");
    }
    //-------------------------------------------------------------------------------------------------
    private static String readUserData(String prompt) {

        String userInput;

        System.out.print(prompt);
        userInput = keyboard.nextLine();

        return(userInput);
    }
//-------------------------------------------------------------------------------------------------
}
//=================================================================================================
