import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = "";
        int age;


        while(name.isEmpty()){
            System.out.print("Enetr your name: ");
            name = scanner.nextLine();
        }

        System.out.println("Hello " + name);

        System.out.println("Enetr your age: ");
        age = scanner.nextInt();

        while((age < 0 || age > 18)){
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

        while(1 == 1){
            System.out.println("1");
        }



    }
}





















