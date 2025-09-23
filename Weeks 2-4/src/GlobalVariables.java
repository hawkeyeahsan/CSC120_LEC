import java.util.Scanner;
//=================================================================================================
public class GlobalVariables {
    //-------------------------------------------------------------------------------------------------
    private static final Scanner keyboard = new Scanner(System.in);
    private static final int INITIAL_WARTS = 7;
    private static final int MORE_WARTS = 4;

    private static int numberOfWarts = 0;
    //-------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        getWarts();
        System.out.println("You suffer from " + numberOfWarts + " warts");
        getMoreWarts();
        System.out.println("You suffer from " + numberOfWarts + " warts");
        numberOfWarts = treatWarts(numberOfWarts);
        System.out.println("You suffer from " + numberOfWarts + " warts");
    }
    //-------------------------------------------------------------------------------------------------
    private static void getWarts() {

        numberOfWarts = INITIAL_WARTS;
    }
    //-------------------------------------------------------------------------------------------------
    private static void getMoreWarts() {

        int numberOfWarts = 0;

        numberOfWarts += MORE_WARTS;
    }
    //-------------------------------------------------------------------------------------------------
    private static int treatWarts(int numberOfWorts) {

//----Treatment removes half the warts
        numberOfWorts /= 2;
        return(numberOfWarts);
    }
//-------------------------------------------------------------------------------------------------
}
//=================================================================================================
