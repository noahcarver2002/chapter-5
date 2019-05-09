import java.util.Scanner;

public class Triangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int choice = 0;
        System.out.println("Which triangle are you solving for right, iso, or equalateral?");
        System.out.println("1) For Right Triangle");
        System.out.println("1) For Isoceles");
        System.out.println("1) For Right Triangle");

        if(choice == 1){
            displayRightTriangle();
        }
        else if(choice == 2);
        displayisocelesTriangle();



    }
    public static void displayRightTriangle(){
        Scanner input = new Scanner(System.in);
        String choice;
        double sideA;
        double sideB;
        double sideC;
        System.out.println("What side are you trying to solve for A, B, or C? ");
        choice = input.next();

        if(choice.equals("C")) {
            System.out.print("Please enter side A >>>");
            sideA = input.nextInt();
            System.out.print("Please enter side B >>>");
            sideB = input.nextInt();
            calcSideA_B(sideA, sideB, choice);
        }
        else if (choice.equals("B")){
            System.out.print("Please enter side A >>>");
            sideA = input.nextInt();
            System.out.print("Please enter side C >>>");
            sideC = input.nextInt();
            calcSideA_B(sideA, sideC, choice);
        }
        else if (choice.equals("A")){
            System.out.print("Please enter side B >>>");
            sideB = input.nextInt();
            System.out.print("Please enter side C >>>");
            sideC = input.nextInt();
            calcSideA_B(sideB, sideC, choice);
        }

    } 
       
    public static void displayisocelesTriangle(){
        
        }
        

    public static void calcSideA_B(double side1, double side2, String choice){
        Double side3 = Math.sqrt(side2*side2 - side1*side1);
        System.out.println("Answer is " + side3 + " for side " + choice);
    }
    public static void calcSideC(double side1, double side2, String choice){
        Double side3 = Math.sqrt(side2*side2 - side1*side1);
        System.out.println("Answer is " + side3 + " for side " + choice);
        }
    public static void calcSideB_A(double side1, double side2, String choice){
        Double side3 = Math.sqrt(side2*side2 - side1*side1);
        System.out.println("Answer is " + side3 + " for side " + choice);
    }
//    public static void display
}
