import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        boolean isFound = false;



        String[] fruits = {"apple", "orange", "mango", "banana"};

        String target = "apple";

        for(int i = 0; i < fruits.length; i++){
            if(target == fruits[i]){
                System.out.println("item found at index " + i);
                isFound = true;
                break;

            }
        }

        if(!isFound){
            System.out.println("Target does not found");
        }



           }
        }
//


























































