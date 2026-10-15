import jdk.swing.interop.SwingInterOpUtils;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int balance = 5000;
        int withdraw;
        int remainingBalance;

        System.out.println("Enter the amount of withdraw");
        withdraw = scanner.nextInt();

        if(withdraw <= 0){
            System.out.println("invailed amount");
        }
        else if(withdraw > balance) {

            System.out.println("insufficiant balance");
        }
        else{
            remainingBalance = balance - withdraw;

            System.out.println((remainingBalance));
        }




    }

        }


//



