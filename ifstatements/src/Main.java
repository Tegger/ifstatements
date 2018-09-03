import java.util.Scanner;
public class Main {


    public static void main(String[] args) {

        Scanner user_input = new Scanner( System.in ); // create a scanner so we can read the command-line input
        System.out.println("What's the temperature man?"); //request user input
        double temp = user_input.nextDouble(); //accept decimals for temperature


        if (temp < 97.5){
            System.out.println( temp + " degrees!? That's chilly yo!");

        }else if (temp >= 97.5){
            if (temp <= 99.5){
                System.out.println( temp + " degrees!? That's normal yo!");
            }else if (temp > 99.5){
                System.out.println( temp + " degrees!? That's warm yo!");
            }
        }



    }
}



