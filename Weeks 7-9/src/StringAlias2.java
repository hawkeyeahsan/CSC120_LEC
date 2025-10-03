//=================================================================================================
public class StringAlias2 {
    //-------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        String myName;
        String anotherOfMyName;
        String aNewName;
        String alsoANewName;

        myName = "Geoff";
        anotherOfMyName = "Geoff"; // anotherOfMyName will point to the same string object as above
        aNewName = new String("Geoff"); // This will create a brand new object
        alsoANewName = aNewName; // alsoANewName will start pointing to the same object as aNewName

        System.out.println("Which ones == which ones?");
    }
//-------------------------------------------------------------------------------------------------
}
//=================================================================================================
