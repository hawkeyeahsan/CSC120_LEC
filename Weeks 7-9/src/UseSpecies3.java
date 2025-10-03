import java.util.Scanner;
//=================================================================================================
public class UseSpecies3 {
    //-------------------------------------------------------------------------------------------------
    private static final Scanner keyboard = new Scanner(System.in);
    private static final int FUTURE_YEARS = 5;
    //-------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        Species3 speciesOfTheMonth = new Species3();
        int newPopulation,futurePopulation;
        double currentGrowthRate,newGrowthRate;

        System.out.println(speciesOfTheMonth);
        System.out.println("Enter data on the Species of the Month: ");
        speciesOfTheMonth.readInput();
        System.out.println(speciesOfTheMonth);

        currentGrowthRate = speciesOfTheMonth.getGrowthRate();
        System.out.println("The current growth rate is " + currentGrowthRate);

        System.out.print("Enter the new growth rate: ");
        newGrowthRate = keyboard.nextDouble();
        speciesOfTheMonth.setGrowthRate(newGrowthRate);
        System.out.println("Confirming the new growth rate " + speciesOfTheMonth.getGrowthRate());

        do {
            System.out.print("Enter the new population: ");
            newPopulation = keyboard.nextInt();
        } while (! speciesOfTheMonth.setPopulation(newPopulation));

        futurePopulation = speciesOfTheMonth.populationIn(FUTURE_YEARS);
        System.out.println("After " + FUTURE_YEARS + " years the population will be " +
                futurePopulation);

    }
//-------------------------------------------------------------------------------------------------
}
//=================================================================================================
