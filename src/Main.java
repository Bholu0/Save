import jdk.swing.interop.SwingInterOpUtils;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

       //Weight Conversion Program

        Scanner scanner = new Scanner(System.in);

        int weight;
        double newWeight;
        int choice;

        System.out.println("1: want weight to lbs to kg");
        System.out.println("2: want weight to kg to lbs");

        System.out.println("Enter your choice");
        choice = scanner.nextInt();

        if(choice == 1){

            System.out.println("Enter your weight in lbs");
            weight = scanner.nextInt();
            newWeight = weight * 453592;
            System.out.println(newWeight + " kg");
        }
        else if(choice == 2){
            System.out.println("Enter your weight in kg");
            weight = scanner.nextInt();
            newWeight = weight * 2.20462;
            System.out.println(newWeight + " lbs ");
        }
        else{
            System.out.println("your choice is not valid");
        }





        }
    }
//




