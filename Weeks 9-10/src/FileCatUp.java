import java.util.Scanner;
import java.io.*;
//=================================================================================================
public class FileCatUp {
    //-------------------------------------------------------------------------------------------------
    private static final Scanner keyboard = new Scanner(System.in);
    //-------------------------------------------------------------------------------------------------
    public static void main(String[] args) throws IOException {

        String fromFileName;
        FileReader fromReader;
        int aChar;

        System.out.print("Enter the file name : ");
        fromFileName = keyboard.nextLine();

        fromReader = new FileReader(fromFileName);
        while ((aChar = fromReader.read()) != -1) {
            System.out.print((char)aChar);
        }
//----Note the file does not get closed if an exception occurs
        System.out.println("Closing the file");
        fromReader.close();

    }
//-------------------------------------------------------------------------------------------------
}
//=================================================================================================
