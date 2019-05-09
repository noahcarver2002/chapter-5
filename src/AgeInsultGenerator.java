import java.util.Scanner;

public class AgeInsultGenerator {
    public static void main(String[] args) {

        int age;
        String result = null;
        Scanner input = new Scanner(System.in);

        System.out.println("welcome to my age insult generator. ");
        System.out.print("Please enter your age >>>>");
        age = input.nextInt();

        if (age <= 12) {
            result = "you are not a teenager, and probably needs to learn how to use deodorant.";
        } else if (age > 12 && age < 20) {
            result = "you might be a teenager";
        } else if (age >= 21 && age < 20) {
            result = "i hope you went to college and got a job!";
            System.out.print("hope you have a nice life");
        }
        else if (age >= 30 && age < 40){
            result = "you should be living the best life you could ask for";

        }
        else if (age >= 40 && age < 50){
            result = "you should be geting tired of your job and just want to stay home ";{
            }
        }
        else if (age >= 50 && age < 60) {
            result = "getting ready to go have fun by retiering";
        }
    }
    }
