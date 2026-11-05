
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //break = break out of a loop(STOP);
        //continue = skip the current iteration of loop(Skip);


        int i = 0;

        while (i <= 10) {

            System.out.println(i++);
            System.out.println("ok");

            if (i == 3) {
                i++;
                continue;
            }

            if (i == 8) {
                break;
            }

        }
    }
}



















































