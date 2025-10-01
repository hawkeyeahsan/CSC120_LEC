import java.util.Scanner;
//=================================================================================================
public class UseManyCurrencyConverter1 {
    //-------------------------------------------------------------------------------------------------
    private static final Scanner keyboard = new Scanner(System.in);
    //-------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        double todaysRate;
        double dollars;
        double southAfricanRands,aussieDollars;
        CurrencyConverter1 randConverter,audConverter;

        randConverter = new CurrencyConverter1();
        System.out.print("What is today's Rand exchange rate? ");
        todaysRate = keyboard.nextDouble();
        randConverter.setExchangeRate(todaysRate);

        audConverter = new CurrencyConverter1();
        System.out.print("What is today's AUD exchange rate?  ");
        todaysRate = keyboard.nextDouble();
        audConverter.setExchangeRate(todaysRate);

        System.out.print("How much money do you have in $s? ");
        dollars = keyboard.nextDouble();
        southAfricanRands = randConverter.fromDollars(dollars);
        aussieDollars = audConverter.fromDollars(dollars);
        System.out.printf("That's R%.2f and AU$%.2f\n",southAfricanRands,aussieDollars);

//----Consider what happens if you comment out this line
        audConverter = new CurrencyConverter1();
        System.out.print("What is today's NZ$ exchange rate?  ");
        todaysRate = keyboard.nextDouble();
        audConverter.setExchangeRate(todaysRate);
        System.out.printf("That's NZ$%.2f\n",audConverter.fromDollars(dollars));

    }
//-------------------------------------------------------------------------------------------------
}
//=================================================================================================
