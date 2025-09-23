import java.util.Scanner;
//=================================================================================================
public class ArrayLocalGC {
    //-------------------------------------------------------------------------------------------------
    private static final Scanner keyboard = new Scanner(System.in);
    private static final int MONTHS_OF_SALES = 5;
    //-------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        double[] salesAverages;

        salesAverages = computeSalesAverages();
        outputAverages(salesAverages);

    }
    //-------------------------------------------------------------------------------------------------
    private static double[] computeSalesAverages() {

        double[] salesAmounts = new double[MONTHS_OF_SALES];
        double[] salesAverages = new double[MONTHS_OF_SALES];
        int index;

        for (index = 0; index < salesAmounts.length; index++) {
            System.out.print("Enter sales for month " + (index+1) + " : ");
            salesAmounts[index] = keyboard.nextDouble();
        }

        salesAverages[0] = salesAmounts[0];
        for (index = 1; index < salesAverages.length; index++) {
            salesAverages[index] = (salesAmounts[index] + salesAmounts[index-1]) / 2;
        }

        // The array salesAmount is garbage collected because only the pointer salesAverages is returned
        return(salesAverages);
    }
    //-------------------------------------------------------------------------------------------------
    private static void outputAverages(double[] salesAverages) {

        int index;

        for (index = 0; index < salesAverages.length; index++) {
            System.out.println("Two month average for month " + (index+1) + " is " +
                    salesAverages[index]);
        }

    }
//-------------------------------------------------------------------------------------------------
}
//=================================================================================================
