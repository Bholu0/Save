import jdk.swing.interop.SwingInterOpUtils;
import java.util.Scanner;


public class Main {

    public static void main (String[] args){

        //Game of thrones

        String name ;
        String where;
        String who;
        String Wins;
        String she ;
        String he;
        String smart;
        String nobelMan;
        String kingdoms;
        String MostPowerful;

        Scanner scanner = new Scanner (System.in);

        System.out.print("where is this place : ");
        where = scanner.nextLine();

        System.out.print("what is the name of series : ");
        name = scanner.nextLine();

        System.out.print(" who is the main charactor : " );
        who = scanner.nextLine();

        System.out.println("you think " + name + "is bad");
        System.out.println("And this is world created by GG martin and this series is mainly based on " + where);
        System.out.println("main charactors are " + who);




        scanner.close();



    }
}