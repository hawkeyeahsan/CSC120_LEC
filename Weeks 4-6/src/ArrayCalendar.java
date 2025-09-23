import java.util.Scanner;
//=================================================================================================
public class ArrayCalendar {
    //-------------------------------------------------------------------------------------------------
    private static final Scanner keyboard = new Scanner(System.in);
    private static final int DAYS_IN_WEEK = 7;
    private static final int WEEKS_IN_MONTH = 6;
    //-------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        int[][] calendar = new int[WEEKS_IN_MONTH][DAYS_IN_WEEK];
        int row,column;
        int daysInMonth,startColumn,dayNumber;

        System.out.print("How many days in the month        : ");
        daysInMonth = keyboard.nextInt();
        System.out.print("Which column does the month start : ");
        startColumn = keyboard.nextInt();

        for (dayNumber = 1; dayNumber <= daysInMonth; dayNumber++) {
            row = (dayNumber-1 + startColumn) / DAYS_IN_WEEK;
            column = (dayNumber-1 + startColumn) % DAYS_IN_WEEK;
            calendar[row][column] = dayNumber;
        }

        for (row = 0; row < WEEKS_IN_MONTH; row++) {
            for (column = 0; column < DAYS_IN_WEEK; column++) {
                if (calendar[row][column] == 0) {
                    System.out.print("   ");
                } else {
                    System.out.printf("%2d ",calendar[row][column]);
                }
            }
            System.out.println();
        }

    }
//-------------------------------------------------------------------------------------------------
}
//=================================================================================================
