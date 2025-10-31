import java.util.Scanner;
import java.io.*;
//=================================================================================================
public class FileCatUpMain {
    //-------------------------------------------------------------------------------------------------
    private static final Scanner keyboard = new Scanner(System.in);
    //-------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        String fromFileName;

        System.out.print("Enter the file name : ");
        fromFileName = keyboard.nextLine();

        try {
            catFile(fromFileName);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    //-------------------------------------------------------------------------------------------------
    private static void catFile(String fileName) throws IOException {

        FileReader fromReader;
        int aChar;

        fromReader = new FileReader(fileName);

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
