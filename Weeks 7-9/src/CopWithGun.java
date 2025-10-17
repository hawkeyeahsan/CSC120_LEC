import java.util.Scanner;
//=================================================================================================
public class CopWithGun {
    //-------------------------------------------------------------------------------------------------
    private static final Scanner keyboard = new Scanner(System.in);
    //-------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        Gun firstGun;
        Cop vicMackey;
        Cop dannySofer;

        firstGun = new Gun("Beretta",10);
        System.out.println(firstGun);
        vicMackey = new Cop("Vic Mackey");
        System.out.println(vicMackey);
        dannySofer = new Cop("Danny Sofer");
        System.out.println(dannySofer);
        keyboard.nextLine();

        System.out.println("Give Vic the gun ...");
        vicMackey.setGun(firstGun);
        System.out.println(vicMackey);
        keyboard.nextLine();

        System.out.println("Better give Vic some bullets ...");
        vicMackey.loadGun();
        System.out.println(vicMackey);
        keyboard.nextLine();

        System.out.println("Vic goes balistic ...");
        vicMackey.fireGun();
        vicMackey.fireGun();
        vicMackey.fireGun();
        vicMackey.fireGun();
        vicMackey.fireGun();
        vicMackey.fireGun();
        vicMackey.fireGun();
        System.out.println(vicMackey);
        keyboard.nextLine();

        System.out.println("Vic gives Danny his gun ...");
        dannySofer.setGun(firstGun);
        System.out.println(vicMackey);
        System.out.println(dannySofer);
        System.out.println("Whoops, they're sharing a gun");
        keyboard.nextLine();

        System.out.println("Vic gets a new gun");
        vicMackey.setGun(new Gun("Ruger",16));
        vicMackey.loadGun();
        System.out.println(vicMackey);
    }
//-------------------------------------------------------------------------------------------------
}
//=================================================================================================
