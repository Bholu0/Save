import jdk.swing.interop.SwingInterOpUtils;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       Scanner scanner = new Scanner(System.in);

       String username;
       String passward;

        System.out.println("Enter your username: ");
        username = scanner.nextLine();
        System.out.println("Enter your passward");
        passward = scanner.nextLine();

       if(username.equalsIgnoreCase("bholu")){
           if(passward.equalsIgnoreCase("java123")){
               System.out.println("Login is successfull");}
           else{
                   System.out.println("passward incorrect");

           }


           }
       else{
               System.out.println("incorrect username");
        }




        }
    }

//



