import jdk.swing.interop.SwingInterOpUtils;
import java.sql.SQLOutput;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int number;
        double decimals;
        boolean istail;

        Random random = new Random();

        number = random.nextInt(3,6);
        System.out.println(number);

        decimals = random.nextDouble(2,5);
        System.out.println(decimals);

        istail = random.nextBoolean();
        System.out.println(istail);

        if(istail){
            System.out.println("it is tails");
        }
        else{
            System.out.println("it is heads");
        }



    }
}