import java.util.Scanner;
//=================================================================================================
/**
 * Compute the cost of pizza per square inch
 * @author Geoff Sutcliffe
 */
public class PizzaCost {
//-------------------------------------------------------------------------------------------------
    /**
     * Global Scanner object to use keyboard
     */
    private static final Scanner keyboard = new Scanner(System.in);
    /**
     * Pi is 3.14159265
     */
    private static final double PI = 3.14159265;
//-------------------------------------------------------------------------------------------------
    /**
     * The main method
     * @param args Passed in from the command line
     */
    public static void main(String[] args) {

//----Variables to hold cost, unit cost, diameter
        double cost;
        double diameter;
        double unitCost;

//----Get data
        System.out.print("What size pizza   : ");
        diameter = keyboard.nextDouble();
        System.out.print("What does it cost : ");
        cost = keyboard.nextDouble();

//----Perform computation
        unitCost = computeUnitCost(diameter,cost);

//----Display the diameter, the total cost, and the unit cost
        System.out.println("Diameter is   " + diameter);
        System.out.println("Total cost is " + cost);
        System.out.println("Unit cost is  " + unitCost);
    }
//-------------------------------------------------------------------------------------------------
    /**
     * Compute the cost per square inch of a pizza
     * @param diameter Diameter of a circular pizza in inches from Papa Johns
     * @param cost Price in dollars
     * @return Cost per sqaure inch in dollars and cents
     */
    private static double computeUnitCost(double diameter,double cost) {

        double radius;
        double area;
        double unitCost;

//----Area is 3.14 times radius squared
        radius = diameter / 2;
        area = PI * radius * radius;
//----Unit cost is total cost divided by area
        unitCost = cost/area;

        return(unitCost);
    }
//-------------------------------------------------------------------------------------------------
}
//=================================================================================================
