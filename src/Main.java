import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = "";
        int age;
        int number;


        while (name.isEmpty()) {
            System.out.print("Enetr your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);

        System.out.println("Enetr your age: ");
        age = scanner.nextInt();

        while ((age < 0 || age > 18)) {
            System.out.println("age must be between 0 to 18");
            System.out.println("Enter your age");
            age = scanner.nextInt();
        }


        /*
        do{
            System.out.println("age must be between 0 to 18");
            System.out.println("Enter your age");
            age = scanner.nextInt();
        }
        while((age < 0 || age > 18));

         */

        System.out.println("Hello " + name + " you are " + age + " old");

        System.out.println("Enetr a number between 0 and 10: ");
        number = scanner.nextInt();

        while (number < 0 || number > 10) {
            System.out.println("number must be 0 to 10");
            System.out.println("Enetr a number between 0 and 10: ");
            number = scanner.nextInt();
        }
        System.out.println("you number is " + number);


        while (1 == 1) {
            System.out.println("1");


        }
    }
}





















