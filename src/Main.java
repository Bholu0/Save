import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // vararg = in methods its accept varying # of arguments
        //          makes methods more flexible, no need for overloaded methods
        //          java will pack the argument in Arrays
        //          ...(ellipse)





        System.out.println(add());




    }
    static double add(double... num){

        double sum = 0;


        for(double numbers : num){

             sum += numbers;


        }
        if(sum == 0){
            return 0;
        }


        return sum;


    }
        }
//


























































