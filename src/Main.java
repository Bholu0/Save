import jdk.swing.interop.SwingInterOpUtils;
import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        //mad libs game

        String who;
        String result;
        String anotherWho;
        String itTurnOut;

                Scanner scanner = new Scanner (System.in);

        System.out.print("who write it : ");
        who = scanner.nextLine();

        System.out.print("how is it :" );
                result = scanner.nextLine();

        System.out.print("its loved by : ");
        anotherWho = scanner.nextLine();

        System.out.print("how it turnout : ");
        itTurnOut = scanner.nextLine();

        System.out.print("game of thrones is written by " + who);
        System.out.print("it is " + result);
        System.out.print("and it is praised  by " + anotherWho);
        System.out.println("and it is  " + itTurnOut);




    }
}


































































