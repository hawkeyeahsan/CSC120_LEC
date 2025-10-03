import java.util.Scanner;
import java.util.Arrays;
//=================================================================================================
public class ArraySort {
    //-------------------------------------------------------------------------------------------------
    private static final Scanner keyboard = new Scanner(System.in);
    private static final int DATA_SIZE = 5;
    private static final int MAX_VALUE = 100;
    //-------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        int[] randomData = new int[DATA_SIZE];
        int index,searchFor;

        for (index = 0; index < randomData.length; index++) {
            randomData[index] = (int)(Math.random() * MAX_VALUE);
        }
        System.out.print("The random data values are ... ");
        for (index = 0; index < randomData.length; index++) {
            System.out.print(randomData[index] + " ");
        }
        System.out.println();

        sortTheArray(randomData);

        System.out.print("The sorted data values are ... ");
        for (index = 0; index < randomData.length; index++) {
            System.out.print(randomData[index] + " ");
        }
        System.out.println();
    }
    //-------------------------------------------------------------------------------------------------
    // Selection sort
    private static void sortTheArray(int[] dataToSort) {

        int positionToFill;
        int positionToTest;
        int smallestPosition;
        int temporary;

        for (positionToFill = 0;positionToFill < dataToSort.length;positionToFill++) {
//----Assume the position to fill has smallest value, and compare to rest
            smallestPosition = positionToFill;
            for (positionToTest = positionToFill + 1;positionToTest < dataToSort.length;
                 positionToTest++) {
                if (dataToSort[positionToTest] < dataToSort[smallestPosition]) {
                    smallestPosition = positionToTest;
                }
            }
//----Swap in the smallest value
            temporary = dataToSort[positionToFill];
            dataToSort[positionToFill] = dataToSort[smallestPosition];
            dataToSort[smallestPosition] = temporary;
        }
    }
//-------------------------------------------------------------------------------------------------
}
//=================================================================================================
