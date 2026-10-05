import jdk.swing.interop.SwingInterOpUtils;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        // printf() = is a method used to format output

        // %[flags][width][.precision][specifier-character]




        String name = "bholu";
        int age = 20;
        double decimals = 14.34444;
        char symbol = 'S';
        boolean isok = true;

        System.out.printf("my name is %s and my symbol is this %c \n" , name , symbol);
        System.out.printf("your age is %d \n" , age);
        System.out.printf("your gpa is %f \n" , decimals);

        int num1 = 22;
        int num2 = 3333342;
        double num3 = -23.432;

        System.out.printf("number is %d %d %f \n" , num2 , num1 , num3);


// + = output a plus
// , = comma grouping separator
// ( = negative numbers are enclosed in ()
// space = display a minus if negative, space if positive


        double num4 = 2000.2;
        double num5 = 30000.333342;
        double num6 = -23000.432;

        System.out.printf(" %.1f \n" , num4);
        System.out.printf(" %.5f \n" , num5);
        System.out.printf(" %.3f \n" , num6);


// 0 = zero padding
// number = right justified padding
// negative number = left justified padding

        int num7 = 22;
        int num8 = 346;
        double num9 = 2.432;

        System.out.printf("%-4d \n" , num7);
        System.out.printf("%-4d \n" , num8);
        System.out.printf("%-4.6f \n" , num9);

//
//
    }
}