import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int userChoice;
        System.out.println("Welcome to Rock Paper Scissors. Press the following options");
        System.out.println("1) Rock");
        System.out.println("2) paper");
        System.out.println("3) scissors");


        userChoice = input.nextInt();
        //1 rock 2 paper 3 scissors
        Random rand = new Random();
        int r = (int)(Math.random()* 3 + 1);

        if(userChoice == 1){
            if(r == 1){
                System.out.println("Tie");}
            else if(r == 2)            {
                System.out.println("You lose to paper");
            }
            else if(r == 3){
                System.out.println("You win");}
        }
        else if(userChoice == 2) {
            if (r == 1) {
                System.out.println("you win");
            } else if (r == 2)
                System.out.println("Tie");
            else if (r == 3)
                System.out.println("You lose to scissors");
        }
        else if(userChoice == 3) {
            if (r == 1) {
                System.out.println("you lose to rock");
            }
            else if (r == 2)
                System.out.println("you win");
            else if (r == 3)
                System.out.println("You tie");

            }

    }
}
