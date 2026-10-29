import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // NUMBER GUESSING GAME

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess =0;
        int randomNumber = random.nextInt(1, 10+1);
        int attempt = 0;

        System.out.println("Guess a number between ( 1 to 10)");

        do { System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempt++;

            if(guess > randomNumber){
                System.out.println("the number is high");
            }
            else if(guess < randomNumber){

                System.out.println("The number is low");

            }
            else{
                System.out.println("you have won");
                System.out.println("you have attemted " + attempt + " times.");
            }
        } while (guess != randomNumber);

        scanner.close();


    }
}
//






















