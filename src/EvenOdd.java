import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args){
        int userEntry;
        String result;
        Scanner input = new Scanner (System.in);
        System.out.println("welcome to my game.\n");
        System.out.println("Its called even or odd.\n");
        System.out.println("Enter a whole number >>>.\n");
        userEntry = input.nextInt();

        if(userEntry%2 == 0){
            result = userEntry + "number is even ";
        }
        else
            result = userEntry + " number is odd";
        System.out.println(result);

    }
}

