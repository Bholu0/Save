import jdk.swing.interop.SwingInterOpUtils;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String name;
        boolean isTrue;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        name = scanner.nextLine();

        if(name.contains(" ")){
            System.out.println("User name is not valid");
        }
        else if(isTrue = name.length() >= 5)
        {
            System.out.println("user name is valid");

        }



            scanner.close();


        }
    }
//




