import jdk.swing.interop.SwingInterOpUtils;
import java.util.Scanner;


public class Main {

    public static void main (String[] args){

        Scanner scanner = new Scanner (System.in);

        String buy;
        int item;
        double price;
        double total;
        char currency = '$';

        System.out.print("what are you going to buy? : ");
        buy = scanner.nextLine();

        System.out.print("how much item do you going to buy? : ");
        item = scanner.nextInt();

        System.out.print("what is the price of each? : ");
                price = scanner.nextDouble();


        total = price * item;

        System.out.println("you are buying a " + buy + " and the price of it is " + price + currency);
        System.out.println("And your total is " + total + currency);





scanner.close();


    }
}