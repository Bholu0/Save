import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //System.out.println(Math.PI);
       //System.out.println(Math.E);

        System.out.println(Math.pow(2,3));
        System.out.println(Math.sqrt(16));
        System.out.println(Math.round(2.3));
        System.out.println(Math.ceil(2.3));
        System.out.println(Math.floor(2.3));
        System.out.println((Math.max(2,38)));
        System.out.println(Math.min(3,9));


        //Hypotonasis c = Math.sqrt(a² + b²)

        double a;
        double b;
        double c;


        Scanner scanner = new Scanner(System.in);

        System.out.println("What is the area of side a: ");
        a = scanner.nextDouble();

        System.out.println("What is the area of side b: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));

        System.out.println(c + "cm");
        //System.out.printf("%.1fcm\n" , c);

        //Area,circumference,Volume

        double radies;
        double Area;
        double circumference;
        double volume;

        System.out.println("Enter your radius: ");
        radies = scanner.nextDouble();

        Area = Math.PI * Math.pow(radies,2);
        circumference = 2 * Math.PI * Math.pow(radies,2);
        volume = 4.0/3.0 * Math.PI * Math.pow(radies , 2);






        System.out.println(Area);
        System.out.println(circumference);
        System.out.println(volume);


//ok
    }
}