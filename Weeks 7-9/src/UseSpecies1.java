//=================================================================================================
public class UseSpecies1 {
    //-------------------------------------------------------------------------------------------------
    private static final int FUTURE_YEARS = 5;
    //-------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        Species1 speciesOfTheMonth = new Species1();
        int futurePopulation;

        System.out.println(speciesOfTheMonth);
        System.out.println("Enter data on the Species of the Month: ");
        speciesOfTheMonth.readInput();
        System.out.println(speciesOfTheMonth);

        futurePopulation = speciesOfTheMonth.populationIn(FUTURE_YEARS);
        System.out.println("After " + FUTURE_YEARS + " years the population will be " +
                futurePopulation);

    }
//-------------------------------------------------------------------------------------------------
}
//=================================================================================================
