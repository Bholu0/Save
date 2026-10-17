
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Enhanced switchs = it is used as a replacement to many if statements
        //              (Java14 features)

        Scanner scanner = new Scanner(System.in);


        String day;

        System.out.print("Enter the day: ");
        day = scanner.nextLine();

        switch(day) {
            case "Monday" -> System.out.println("It is weekday ");
            case "Tuesday" -> System.out.println("It is weekday");
            case "Wednesday" -> System.out.println("It is weekday");
            case "Thrusday" -> System.out.println("It is weekday");
            case "Friday" -> System.out.println("It is weekday");
            case "Saterday" -> System.out.println("It is weekend");
            case "Sunday" -> System.out.println("It is weekend");
            default -> System.out.println(day + " it is not a day");
        }

        switch(day) {
            case "Monday" , "Tuesday" , "Wednesday" , "Thrusday" , "Friday" ->
                    System.out.println("It is weekday ");

            case "Saterday" ,"Sunday" ->
                    System.out.println("It is weekend")
           ;

            default -> System.out.println(day + " it is not a day");
        }


    }

}





