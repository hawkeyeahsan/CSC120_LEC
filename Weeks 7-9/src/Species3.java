import java.util.Scanner;
//=================================================================================================
public class Species3 {
    //-------------------------------------------------------------------------------------------------
    private static final Scanner keyboard = new Scanner(System.in);
    //-------------------------------------------------------------------------------------------------
    private String name;
    private int population;
    private double growthRate;
    //-------------------------------------------------------------------------------------------------
    public Species3() {

        name = "";
        setPopulation(0);
        setGrowthRate(0.0);
    }
    //-------------------------------------------------------------------------------------------------
    public Species3(String newName,int newPopulation,double newGrowthRate) {

        name = newName;
        population = newPopulation;
        growthRate = newGrowthRate;
    }
    //-------------------------------------------------------------------------------------------------
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
        while (! setPopulation(keyboard.nextInt())) {
            System.out.print("Reenter population: ");
        }

        System.out.print("Enter growth rate (% increase per year): ");
        setGrowthRate(keyboard.nextDouble());
    }
    //-------------------------------------------------------------------------------------------------
    public String getName() {

        return(name);
    }
    //-------------------------------------------------------------------------------------------------
    public double getGrowthRate() {

        return(growthRate);
    }
    //-------------------------------------------------------------------------------------------------
    public boolean setPopulation(int newPopulation) {

        if (newPopulation >= 0) {
            population = newPopulation;
            return(true);
        } else {
            System.out.println("ERROR " + newPopulation + " is an invalid population");
            return(false);
        }
    }
    //-------------------------------------------------------------------------------------------------
    public void setGrowthRate(double newGrowthRate) {

        growthRate = newGrowthRate;
    }
    //-------------------------------------------------------------------------------------------------
    public int populationIn(int years) {

        double finalPopulation;

        // Using the helper function
        finalPopulation = computeFuturePopulation(years,population);

        if (finalPopulation > 0) {
            return((int)finalPopulation);
        } else {
            return(0);
        }
    }
    //-------------------------------------------------------------------------------------------------
//----This could be a very complicated population prediction model
    private double computeFuturePopulation(int years,double growingPopulation) {

        while ((years > 0) && (growingPopulation > 0)) {
            growingPopulation += (growthRate/100) * growingPopulation;
            years--;
        }

        return(growingPopulation);
    }
//-------------------------------------------------------------------------------------------------
}
//=================================================================================================
