import java.io.*;
//=================================================================================================
public class FileCopyChar {
    //-------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        try {
            copyFile(args[0],args[0] + "_COPY");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    //-------------------------------------------------------------------------------------------------
    private static void copyFile(String fromName,String toName) throws IOException {

        FileReader fromReader;
        FileWriter toWriter;
        int aChar;

        System.out.println("Copying " + fromName + " to " + toName);
        fromReader = new FileReader(fromName);
        toWriter = new FileWriter(toName);

        while ((aChar = fromReader.read()) != -1) {
            toWriter.write(aChar);
        }
//----Note the files do not get closed if an exception occurs
        System.out.println("Closing the files");
        fromReader.close();
        toWriter.close();
    }
//-------------------------------------------------------------------------------------------------
}
//=================================================================================================
