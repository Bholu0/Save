import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int balance = 5000;
        int pin = 1234;
        int enterPin;
        int attempt = 0;
        boolean isWork = true;
        int choice;
        int amount;
        int currentBalance;
        int numWithdraw = 0;
        int numDeposit = 0;







        while(isWork){
            System.out.print("Enter your pin: ");
            enterPin = scanner.nextInt();
            attempt++;
            while(attempt < 3){
                    if (pin == enterPin) {
                        System.out.println("1.CHECK BALANCE");
                        System.out.println("2.WITHDRAW");
                        System.out.println("3.DEPOSIT");
                        System.out.println("4.Treansection Summary");
                        System.out.println("5.EXIT");

                        System.out.println("Enter your choice");
                        choice = scanner.nextInt();

                        switch (choice) {

                            case 1 -> System.out.println(balance);
                            case 2 -> {
                                System.out.println("Enter the amount");
                                amount = scanner.nextInt();

                                if (amount <= balance) {
                                    System.out.println(currentBalance = balance - amount);
                                    numWithdraw++;
                                } else if (amount > balance) {
                                    System.out.println("you did not have enough amount");
                                } else {
                                    System.out.println("Invailed Input");
                                }
                            }
                            case 3 -> {
                                System.out.println("Enter the amount");
                                amount = scanner.nextInt();

                                if (amount > 0) {
                                    System.out.println(currentBalance = amount + balance);
                                    numDeposit++;
                                } else {
                                    System.out.println("Invailed amount");
                                }

                            }
                            case 4 -> System.out.println(numWithdraw + numDeposit);
                            case 5 -> {
                                isWork = false;
                                attempt = 4;
                            }
                        }

                    } else {
                        System.out.println("Wrong pin");
                        System.out.println("you have only 3 attempts");
                        System.out.println("Enter your pin: ");
                        enterPin = scanner.nextInt();
                        attempt++;

                    }
                }
            if(attempt >= 3){
                isWork = false;
            }
            }

        System.out.println("Thank you for using our Banking system");
        System.out.println("Have a good day");


    }

}

























































