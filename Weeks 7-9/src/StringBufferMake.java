import java.util.Scanner;
//=================================================================================================
public class StringBufferMake {
    //-------------------------------------------------------------------------------------------------
    private static final Scanner keyboard = new Scanner(System.in);
    //-------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        String myWord;
        StringBuffer mySentence;
        int index;

        mySentence = new StringBuffer("");

        do {
            System.out.print("Enter a word : ");
            myWord = keyboard.nextLine();
            mySentence.append(myWord + " ");
        } while (!myWord.endsWith("."));

        System.out.println("The base sentence is " + mySentence);

        index = mySentence.indexOf("great");
        if (index >= 0) {
            mySentence.insert(index,"really ");
        }
        System.out.println("The emphasized sentence is " + mySentence);
    }
//-------------------------------------------------------------------------------------------------
}
//=================================================================================================
