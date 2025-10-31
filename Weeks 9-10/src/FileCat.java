import java.util.Scanner;
import java.io.*;
//=================================================================================================
public class FileCat {
    //-------------------------------------------------------------------------------------------------
    private static final Scanner keyboard = new Scanner(System.in);
    //-------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        String fromFileName;
        FileReader fromReader = null;
        int aChar;

        System.out.print("Enter the file name : ");
        fromFileName = keyboard.nextLine();

        try {
            fromReader = new FileReader(fromFileName);
            aChar = fromReader.read();
            while (aChar != -1) {
                System.out.print((char)aChar);
                aChar = fromReader.read();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        } finally {
            if (fromReader != null) {
                try {
                    fromReader.close();
                } catch (IOException e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }
//-------------------------------------------------------------------------------------------------
}
//=================================================================================================
