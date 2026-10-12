import jdk.swing.interop.SwingInterOpUtils;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


       String email;
       String domain;
       String username;

        System.out.println("Enter your email");
       email = scanner.nextLine();



       if(email.contains("@")){

           domain = email.substring(email.lastIndexOf("@"));
           username = email.substring(0, email.lastIndexOf("@"));

           System.out.println( domain );
           System.out.println(username );
       }
       else{
           System.out.println("your name does not include @");
       }



scanner.close();


        }
    }





