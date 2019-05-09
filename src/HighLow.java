import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        int userGuess;
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to my game.");
        System.out.println("pick a number between 1 to 10");
        System.out.println("guess correctly win a prize");
        System.out.println("pick a number >>>>>");
        userGuess = input.nextInt();
        int random = (int) (Math.random() * 10 + 1);
        if (userGuess == random) {
            System.out.println("guessed correctly!!! connor has your prize out back");

        } else if (userGuess > random) {
            System.out.println("wrong number it was to high ");
        }
        System.out.println("wrong number it was to high ");

    }


}



