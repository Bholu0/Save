import jdk.swing.interop.SwingInterOpUtils;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        boolean isWhite = false;
        boolean isTw09 = false;
        String gameplay = "pro";

        if(isWhite){
            if(isTw09) {
                System.out.println("your gameplay is " + gameplay);
                System.out.println("you are tw09");
            }
            else{
                System.out.println("you are the pro");
            }
        }

        else{
            if(isTw09){
            System.out.println("you play like TW09");
            }

            else{
                    System.out.println("you are not in the game");
                }
        }



    }
}
