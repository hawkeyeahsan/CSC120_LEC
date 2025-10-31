import java.util.Scanner;
import java.io.*;
//=================================================================================================
public class FileExamine {
    //-------------------------------------------------------------------------------------------------
    private static final Scanner keyboard = new Scanner(System.in);
    //-------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        String fileName;
        File oneFile;
        String[] contents;
        int index;

        System.out.print("Enter the file name : ");
        fileName = keyboard.nextLine();
        oneFile = new File(fileName);
        if (oneFile.exists()) {
            if (oneFile.isFile()) {
                System.out.println(oneFile + " is a file of length " + oneFile.length());
            } else if (oneFile.isDirectory()) {
                System.out.println(oneFile + " is a directory");
                contents = oneFile.list();
                for (index = 0; index < contents.length; index++) {
                    System.out.println("    " + contents[index]);
                }
            } else {
                System.out.println(oneFile + " is weird");
            }
        } else {
            System.out.println(oneFile + " does not exist");
        }

    }
//-------------------------------------------------------------------------------------------------
}
//=================================================================================================
