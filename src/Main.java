import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double balance = 5000;
        int pin = 1234;
        int attempts = 0;

        int deposits = 0;
        int withdrawals = 0;

        boolean loggedIn = false;

        while (attempts < 3) {

            System.out.print("Enter your PIN: ");
            int enteredPin = scanner.nextInt();

            if (enteredPin == pin) {
                loggedIn = true;
                break;
            }
            else {
                attempts++;
                System.out.println("Incorrect PIN!");

                if (attempts == 3) {
                    System.out.println("Account locked.");
                }
            }
        }

        if (loggedIn) {

            int choice;

            do {

                System.out.println("\n===== BANK MENU =====");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Transaction Summary");
                System.out.println("5. Exit");

                System.out.print("Choose an option: ");
                choice = scanner.nextInt();

                switch (choice) {

                    case 1:
                        System.out.printf("Balance: ₹%.2f%n", balance);
                        break;

                    case 2:
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = scanner.nextDouble();

                        if (depositAmount > 0) {
                            balance += depositAmount;
                            deposits++;
                            System.out.println("Deposit successful!");
                        }
                        else {
                            System.out.println("Invalid deposit amount.");
                        }
                        break;

                    case 3:
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawalAmount = scanner.nextDouble();

                        if (withdrawalAmount > 0 && withdrawalAmount <= balance) {
                            balance -= withdrawalAmount;
                            withdrawals++;
                            System.out.println("Withdrawal successful!");
                        }
                        else {
                            System.out.println("Invalid withdrawal amount.");
                        }
                        break;

                    case 4:
                        System.out.println("Total deposits: " + deposits);
                        System.out.println("Total withdrawals: " + withdrawals);
                        break;

                    case 5:
                        System.out.println("Thank you for using our bank!");
                        break;

                    default:
                        System.out.println("Invalid option.");
                }

            } while (choice != 5);

        }

        scanner.close();
    }
}
//
























































