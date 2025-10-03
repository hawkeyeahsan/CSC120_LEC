import java.util.Scanner;
//=================================================================================================
public class Species1 {
    //-------------------------------------------------------------------------------------------------
    private static final Scanner keyboard = new Scanner(System.in);
    //-------------------------------------------------------------------------------------------------
    private String name;
    private int population;
    private double growthRate;
    //-------------------------------------------------------------------------------------------------
    public Species1() {

        name = "";
        population = 0;
        growthRate = 0.0;
    }
    //-------------------------------------------------------------------------------------------------
    public Species1(String newName,int newPopulation,double newGrowthRate) {

        name = newName;
        population = newPopulation;
        growthRate = newGrowthRate;
    }
    //-------------------------------------------------------------------------------------------------
    // This function is used for printing the object and its data
    public String toString() {

        return(
                String.format("%-12s = %s\n%-12s = %5d\n%-12s = %5.1f%%","Name",name,"Population",population,
                        "Growth rate",growthRate));
    }
    //-------------------------------------------------------------------------------------------------
    public void readInput() {

        System.out.print("What is the species name?              : ");
        name = keyboard.next();

        System.out.print("What is the population of the species? : ");
        population = keyboard.nextInt();
        while (population < 0) {
            System.out.println("Population cannot be negative.");
            System.out.print("Reenter population: ");
            population = keyboard.nextInt();
        }

        System.out.print("Enter growth rate (% increase per year): ");
        growthRate = keyboard.nextDouble();
    }
    //-------------------------------------------------------------------------------------------------
    public int populationIn(int years) {

        double populationAmount = population;

        while ((years > 0) && (populationAmount > 0)) {
            populationAmount += (growthRate/100) * populationAmount;
            years--;
        }
        if (populationAmount > 0) {
            return((int)populationAmount);
        } else {
            return(0);
        }
    }
//-------------------------------------------------------------------------------------------------
}
//=================================================================================================
