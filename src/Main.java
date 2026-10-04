import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;
import java.util.Random;


public class Main {

    public static void main(String[] args) {

int number1;
int number2;
int number3;

double decimals;

boolean isHead;

Random random = new Random();

number1 = random.nextInt(1 ,5);
number2 = random.nextInt(101,999);
number3 = random.nextInt(1001,9999);
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);


        decimals = random.nextDouble(1,5);
        System.out.println(decimals);


        isHead = random.nextBoolean();
        System.out.println(isHead);

        if(isHead){
            System.out.println("Heads");
        }
        else{
            System.out.println("Tails");
        }


//ok




    }
}