import java.util.Scanner;
//=================================================================================================
public class ArrayLinearSearch {
    //-------------------------------------------------------------------------------------------------
    private static final Scanner keyboard = new Scanner(System.in);
    private static final int DATA_SIZE = 25;
    private static final int MAX_VALUE = 50;
    //-------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        int[] randomData = new int[DATA_SIZE];
        int index,searchFor;

        for (index = 0; index < randomData.length; index++) {
            randomData[index] = (int)(Math.random() * MAX_VALUE);
        }
        System.out.println("The random data values are ... ");
        for (index = 0; index < randomData.length; index++) {
            System.out.print(randomData[index] + " ");
        }
        System.out.println();

        System.out.print("What value would you like to search for? : ");
        searchFor = keyboard.nextInt();

//        index = 0;
//        while (index < randomData.length && randomData[index] != searchFor) {
//            index++;
//        }
//
//        if (index < randomData.length) {
//            System.out.println(searchFor + " found at position " + index + " in the " +
//                    DATA_SIZE + " elements");
//        } else {
//            System.out.println(searchFor + " not found after examining " + index + " elements");
//        }

        index = 0;
        boolean found = false;

        while (!found && index < randomData.length) {

            if (randomData[index] == searchFor) {
                found = true;
            }
            index++;
        }

        if (found) {
            System.out.println(searchFor + " found at position " + (index-1) + " in the " + DATA_SIZE + " elements");
        }
        else {
            System.out.println(searchFor + " not found after examining " + index + " elements");
        }

    }
//-------------------------------------------------------------------------------------------------
}
//=================================================================================================
