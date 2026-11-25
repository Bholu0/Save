import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size;
        String[] foods;

        System.out.print("Enter # of food do you want: ");
        size = scanner.nextInt();
        scanner.nextLine();


        foods = new String[size];


        for(int i = 0; i < foods.length; i++){

            System.out.print("Enter your food: ");
            foods[i] = scanner.nextLine();

        }

        for(String food : foods){
            System.out.println(food);
        }

           }
        }



























































