import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        int failedRules = 0;
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpace = false;

        if (password.length() < 8) {
            failedRules++;
        }

        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);

            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            }

            if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            }

            if (Character.isDigit(ch)) {
                hasDigit = true;
            }

            if (ch == ' ') {
                hasSpace = true;
            }
        }

        if (!hasUppercase) {
            failedRules++;
        }

        if (!hasLowercase) {
            failedRules++;
        }

        if (!hasDigit) {
            failedRules++;
        }

        if (hasSpace) {
            failedRules++;
        }

        if (failedRules == 0) {
            System.out.println("Strong Password");
        }
        else if (failedRules == 1) {
            System.out.println("Medium Password");
        }
        else {
            System.out.println("Weak Password");
        }

        scanner.close();

    }
}
//






















































