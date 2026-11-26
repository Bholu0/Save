import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // 2D Arras = A array where each element is an array
        //            used to store matrix of data



        String[][] foods = {{"apple", "mango", "orange"},
                            {"tamato" , "patato", "onion"},
                            {"beaf", "motton", "chicken"}
        };

        foods[2][0] = "fish";

        System.out.println(foods);

        for(String[] food : foods){
            for(String display : food){
                System.out.println(display);
            }
        }

        /*
         String[] fruits = {"apple", "mango", "orange"};
        String[] vegetables = {"tamato" , "patato", "onion"};
        String[] meat = {"beaf", "motton", "chicken"};

        String[][] foods = {fruits, vegetables, meat};

        System.out.println(foods);

        for(String[] food : foods){
            for(String display : food){
                System.out.println(display);
            }
        }
         */


    }
        }
//

























































