import java.util.Scanner;
//=================================================================================================
public class StringVar2 {
    //-------------------------------------------------------------------------------------------------
    private static final Scanner keyboard = new Scanner(System.in);
    //-------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        String myFirstName = "Muhammad Ahsan";
        String myFamilyName;

        System.out.print("Hi " + myFirstName + ", what is your family name : ");
        myFamilyName = keyboard.nextLine();

        System.out.println("Hi " + myFirstName + " " + myFamilyName);
    }
//-------------------------------------------------------------------------------------------------
}
//=================================================================================================
