import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Logical operator
        // && , ! , ||
        //logical operator allow us to check more than one condotion

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        boolean isStudent;

        name = scanner.nextLine();
        age = scanner.nextInt();
        isStudent = scanner.nextBoolean();


        if (name.equalsIgnoreCase("bholu alam") && age > 0 && isStudent) {
            System.out.println("your name is " + name);
            System.out.println("you are " + age + " old and you are a student");
        }

        if (!name.equalsIgnoreCase("bholu alam") && age > 0 && !isStudent) {
            System.out.println("your name is " + name);
            System.out.println("you are " + age + " old and you are a student");
        }
        if (!name.equalsIgnoreCase("bholu alam") && age > 0 || !isStudent) {
            System.out.println("your name is " + name);
            System.out.println("you are " + age + " old and you are a student");

        }
    }
}
//


























