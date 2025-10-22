import java.util.*;
//=================================================================================================
public class UseArrayList {
    //-------------------------------------------------------------------------------------------------
    private static final Scanner keyboard = new Scanner(System.in);
    //-------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        ArrayList<Integer> someIntegers = new ArrayList<>();
        int data,userIndex,index;

        do {
            System.out.println("The array list has size " + someIntegers.size());
            System.out.print("Enter positive data value : ");
            data = keyboard.nextInt();
            if (data > 0) {
                someIntegers.add(data);
            }
        } while (data > 0);

        for (index = 0; index < someIntegers.size(); index++) {
            System.out.println(index + " = " + someIntegers.get(index));
        }

        System.out.println("\nThe array list has size " + someIntegers.size());
        System.out.print("Enter add index and positive data value : ");
        userIndex = keyboard.nextInt();
        data = keyboard.nextInt();
        someIntegers.add(userIndex,data);

        for (index = 0; index < someIntegers.size(); index++) {
            System.out.println(index + " = " + someIntegers.get(index));
        }

        System.out.println("\nThe array list has size " + someIntegers.size());
        System.out.print("Enter set index and positive data value : ");
        userIndex = keyboard.nextInt();
        data = keyboard.nextInt();
        someIntegers.set(userIndex,data);

        for (index = 0; index < someIntegers.size(); index++) {
            System.out.println(index + " = " + someIntegers.get(index));
        }

        System.out.print("\nEnter an integer to find  : ");
        data = keyboard.nextInt();
        if ((index = someIntegers.indexOf(data)) >= 0) {
            System.out.println("Found at index " + index);
        } else {
            System.out.println("Not found");
        }
    }
//-------------------------------------------------------------------------------------------------
}
//=================================================================================================
