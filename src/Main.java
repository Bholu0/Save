import jdk.swing.interop.SwingInterOpUtils;
import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        Scanner scanner = new Scanner (System.in);


/*
scanner.nextLine();
scanner.nextInt();
scanner.nextDouble();
scanner.nextBoolean();
 */
        System.out.print("Enter my name : ");
        String name = scanner.nextLine();

        System.out.print("Enter youur age : ");
        int age = scanner.nextInt();

        System.out.print("Enter your gpa : ");
        Double gpa = scanner.nextDouble();


        System.out.println("My name is " + name + " and my age is " + age + " and gpa is " + gpa);




        Scanner anyname = new Scanner (System.in);
        String ok = anyname.nextLine();

        //COMMON ISSUE

        System.out.print("what is your height : ");
        Double tall = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("what is your naam : ");
        String naam = scanner.nextLine();

        System.out.println("my height is " + tall + " and my naam is " + naam);

        /*
        solution
        use this method
        scanner.nextLine();
         */

        //

    }
}


































































