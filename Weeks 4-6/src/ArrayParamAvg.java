import java.util.Scanner;
//=================================================================================================
public class ArrayParamAvg {
    //-------------------------------------------------------------------------------------------------
    private static final Scanner keyboard = new Scanner(System.in);
    //-------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        double[] userValues;
        int numberOfUserValues;
        int index;
        double average;

        System.out.print("How many values to store? : ");
        numberOfUserValues = keyboard.nextInt();
        userValues = new double[numberOfUserValues];

        for (index = 0; index < userValues.length; index++) {
            System.out.print("Enter value for index " + index + " : ");
            userValues[index] = keyboard.nextDouble();
        }

        // A copy of the array pointer is passed as the argument, not the array itself
        average = computeAverage(userValues);
        System.out.println("The average is " + average);

    }
    //-------------------------------------------------------------------------------------------------
    private static double computeAverage(double[] data) {

        // data is a temporary pointer to the array

        int index;
        double sum;

        sum = 0.0;
        for (index = 0; index < data.length; index++) {
            sum += data[index];
        }

        return(sum / data.length);
    }
//-------------------------------------------------------------------------------------------------
}
//=================================================================================================
