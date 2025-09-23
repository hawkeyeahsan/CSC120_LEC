import java.util.Scanner;
//=================================================================================================
public class Calories {
    //-------------------------------------------------------------------------------------------------
    private static final Scanner keyboard = new Scanner(System.in);
    private static final double WEIGHT_CONSTANT = 66.0;
    private static final double WEIGHT_RATIO = 6.23;
    private static final double HEIGHT_RATIO = 12.7;
    private static final double AGE_RATIO = 6.8;
    private static final double ACTIVITY_RATIO = 1.55;
    //-------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        int caloriesYouDoEat,caloriesYouShouldEat,excessCalories;

        caloriesYouDoEat = inputCalories();
        caloriesYouShouldEat = computeCalories();
        excessCalories = caloriesYouDoEat - caloriesYouShouldEat;

        System.out.println("You eat " + caloriesYouDoEat + " calories, and you should eat " +
                caloriesYouShouldEat + " calories");
        System.out.println("You eat an excess of " + excessCalories + " calories");

    }
    //-------------------------------------------------------------------------------------------------
    private static int inputCalories() {

        int regularCaloriesYouDoEat,munchieCalories;

        regularCaloriesYouDoEat = regularMeals();
        System.out.print("How many munchie calories do you eat   : ");
        munchieCalories = keyboard.nextInt();
        return(regularCaloriesYouDoEat + munchieCalories);
    }
    //-------------------------------------------------------------------------------------------------
    private static int regularMeals() {

        int totalCalories = 0;


        System.out.print("How many breakfast calories do you eat : ");
        totalCalories += keyboard.nextInt();
        System.out.print("How many lunch calories do you eat     : ");
        totalCalories += keyboard.nextInt();
        System.out.print("How many dinner calories do you eat    : ");
        totalCalories += keyboard.nextInt();

        return(totalCalories);
    }
    //-------------------------------------------------------------------------------------------------
    private static int computeCalories() {

        int age,heightFeet,heightInches,weight;
        int requiredCalories;

        System.out.print("Enter your weight in pounds            : ");
        weight = keyboard.nextInt();
        System.out.print("Enter your height in feet and inches   : ");
        heightFeet = keyboard.nextInt();
        heightInches = keyboard.nextInt();
        System.out.print("Enter your age in years                : ");
        age = keyboard.nextInt();

        requiredCalories = computeRequired(age,heightFeet*12 + heightInches,weight);

        return(requiredCalories);
    }
    //-------------------------------------------------------------------------------------------------
    private static int computeRequired(int age,int height,int weight) {

        double caloriesForWeight,caloriesForHeight,caloriesForAge;
        int requiredCalories;

        caloriesForWeight = (WEIGHT_CONSTANT + WEIGHT_RATIO * weight);
        caloriesForHeight = (HEIGHT_RATIO * height);
        caloriesForAge = (AGE_RATIO * age);

        requiredCalories = (int)(ACTIVITY_RATIO *
                (caloriesForWeight + caloriesForHeight - caloriesForAge));

        return(requiredCalories);
    }
//-------------------------------------------------------------------------------------------------
}
//=================================================================================================
