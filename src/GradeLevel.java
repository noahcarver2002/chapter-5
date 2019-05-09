import java.util.Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String year;
        String result;
        System.out.println("please enter what year you are in high school");
        year = input.next();

        switch (year) {
            case "freshman":
                result = "you are a first year student.";
                break;
            case "sophomore":
                result = "you are a second year student.";
                break;
            case "junior":
                result = "you are in you second to last year.";
                break;
            case "senior":
                result = "you are in your last year at school.";
        }
    }






}


