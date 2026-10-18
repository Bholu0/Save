import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int balance = 10000;
        int correctPin = 1234;
        int enterPin;
        int number = 0;
        int amount;

        System.out.println("Enter your pin");
        enterPin = scanner.nextInt();

        if (enterPin == correctPin) {
            System.out.println(" (1)-Withdraw");
            System.out.println(" (2)-Balance");
            System.out.println(" (3)-Deposit Moneu");
            System.out.println("Enter the option");
            number = scanner.nextInt();
            if (number == 1) {
                System.out.println("Enter the amout");
                amount = scanner.nextInt();
                if (amount <= 0) {
                    System.out.println("Invailed amount");
                } else if (amount <= balance) {
                    balance = balance - amount;
                    System.out.println(balance);
                } else {
                    System.out.println("insufficiant balance");
                }
            } else if (number == 2) {
                System.out.println(balance);
            } else if (number == 3) {
                System.out.println("Enetr the amount");
                amount = scanner.nextInt();
                if (amount <= 0) {
                    System.out.println("invailed option");
                } else {
                    balance = amount + balance;
                    System.out.println(balance);
                }
            } else {
                System.out.println("invailed choice");
            }
        }
    }
}

























