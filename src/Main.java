import jdk.swing.interop.SwingInterOpUtils;
import java.util.Scanner;

public class Main {

    public static void main (String[] args){

        int width = 0;
        double height = 0;
        double area = 0;

/*
        int width;
        Double height;
        Double area;

         */

        Scanner scanner = new Scanner (System.in);

        //calculatation of area of rectangle



        System.out.print("What is width : ");
        width = scanner.nextInt();

        System.out.print("whhat is Breadth : ");
        height = scanner.nextDouble();

        area = width + height;

        System.out.println("the area is " + area + "cm^2");


    }
}


































































