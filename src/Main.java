import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        String name = "game of thrones";
        int age = 20;
        double decimals = 200002.2;
        char symbol = 'S';


        System.out.printf("Episode name is %s and my sumbol for it is %c \n" , name , symbol );
        System.out.printf("my age is %d \n" , age);
        System.out.printf("the decimal is % ,.2f \n" , decimals);

        int num1 = 22;
        int num2 = 336;
        int num3 = 3244;

        System.out.printf("%03d \n" , num1);
        System.out.printf("%23d \n" , num2);
        System.out.printf("%-23d \n" , num3);

//
    }
}