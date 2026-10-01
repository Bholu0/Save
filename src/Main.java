import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        int age;
        String name;
        boolean isStudent;


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");

        age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Are you a student(true/false): ");
        isStudent = scanner.nextBoolean();


        //Group 3

        if(isStudent == true){
            System.out.println("you are a student");
        }
        else{
            System.out.println("you are not a student");
        }


        //Group 2

        /*
        name == "" this is same as
        name.isEmpty()
         */

        if (name == ""){
            System.out.println("You did not enter your name");
        }

        else{
            System.out.println("You are " + name);
        }



        //Group1

        if (age >= 18){
            System.out.println("you are a adult");
        }

        else if(age == 0){
            System.out.println("you have been born");
        }


        else if(age < 18){
            System.out.println("You are a child");
        }

        else if(age >= 50){
            System.out.println("you are a seniour");
        }

        else if(age < 0){
            System.out.println("you have not born yet");
        }


        else{
            System.out.println("You are not a adult");
        }

        scanner.close();
    }
}