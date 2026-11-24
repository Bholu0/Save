import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age;
        int choice = 0;
        int numTicket = 0;
        double bill= 0;
        double premiumBill;

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        while(age > 0) {
            if (age < 12) {
                System.out.println("Ticket price is 100");
                System.out.println("How many ticket to buy");
                numTicket = scanner.nextInt();

                bill = numTicket * 100;
            } else if (age < 18) {
                System.out.println("Ticket price is 150");
                System.out.println("How many ticket to buy");
                numTicket = scanner.nextInt();

                bill = numTicket * 150;
            } else if (age < 60) {
                System.out.println("Ticket price is 250");
                System.out.println("How many ticket to buy");
                numTicket = scanner.nextInt();

                bill = numTicket * 250;
            } else if (age >= 60) {
                System.out.println("Ticket price is 180");
                System.out.println("How many ticket to buy");
                numTicket = scanner.nextInt();

                bill = numTicket * 180;
            }

           if(age > 0 ) {
               System.out.println("Do you want (1.Premium) or (2.Regular) or (3.Exit) ");
               System.out.println("Enter your choice");
               choice = scanner.nextInt();
           }

           if (choice == 2){

               if(bill >= 1000){
                   bill *= 0.90;
               }

               System.out.println(bill);

           }
           else if(choice == 1){

               premiumBill = bill + 100;

               if(premiumBill >= 1000){
                   premiumBill *= 0.90;
               }

               System.out.println(premiumBill);

           }
           else if(choice == 3){
               break;
           }
           else{
               System.out.println("Invailed choice");
           }

        }




            }
    }



























































