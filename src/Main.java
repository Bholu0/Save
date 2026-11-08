public class Main {
    public static void main(String[] args) {

        //Methods are a block of reusable codes that is exacuted whem called ()

        int age = 30;



        kingRobert(30, "Ned Stark");
        age(30);
        square(2);
        System.out.println(twice(3));

        if(ageCheck(10)){
            System.out.println("You may sign up");
        }
        else{
            System.out.println("Age should be 18+ yeras old");
        }




    }
    static void kingRobert(int age, String name){
        System.out.println("Robert was a king");
        System.out.println("His friend and Brother is " + name);
        System.out.println("He is " + age + " yers old");
        System.out.println("He is failed king");
    }
    static void age(int age){
        if(age == 30){
            System.out.println("Robert was 30 years old");
            System.out.println("He was a failed king");
        }
        else{
            System.out.println("dsyvcuu");
        }
    }
    static void square(double number){
        double result = number * number;
        System.out.println(result);
    }
    static double twice(double num){
        return num * num;
    }
    static boolean ageCheck(int year){
        if(year >= 18){
            return true;
        }
        else{
            return false;
        }
    }
}






















































