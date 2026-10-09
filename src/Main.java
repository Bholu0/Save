import jdk.swing.interop.SwingInterOpUtils;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Compound interest rate calculator

        double principal;
        double rate;
        int compoundTime;
        int years;
        double amount;

        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter thr principal amount: ");
        principal = scanner.nextDouble();

        System.out.println("Enter the interest rate: ");
        rate = scanner.nextDouble() / 100;

        System.out.println("Enter the how many time you receive the compound per year: ");
        compoundTime = scanner.nextInt() ;

        System.out.println(" Enter the amout of years ");
        years = scanner.nextInt();

        amount = principal * (Math.pow(1 + rate / compoundTime , compoundTime * years));


        //System.out.println("your total amout is " + amount );
        System.out.printf("your total amout is %.2f" , amount);




        scanner.close();







    }
}
//