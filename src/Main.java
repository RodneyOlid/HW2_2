/*
Name: Rodney Olid
Email: rolid1@umbc.edu
Proj: Homework 2
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        calculator();
    }

    public static void calculator() {
        int option = 1;
        int num1 = 0;
        int num2 = 0;
        int answer;
        double dblAnswer;
        Scanner input = new Scanner(System.in);

        while(option != 0) {
            System.out.println("Enter the first number: ");
            if (input.hasNextInt()) {
                num1 = input.nextInt();
            } else {
                System.out.println("That is not an integer.");
                option = 0;
                break;
            }
            System.out.println("Enter the second number: ");
            if (input.hasNextInt()) {
                num2 = input.nextInt();
            } else {
                System.out.println("That is not an integer.");
                option = 0;
                break;
            }
            System.out.println("Press 0 to Quit");
            System.out.println("Press 1 to Add");
            System.out.println("Press 2 to Subtract");
            System.out.println("Press 3 to Multiply");
            System.out.println("Press 4 to Divide");
            option = input.nextInt();
            if (option == 1) {
                answer = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + answer);
            } else if (option == 2) {
                answer = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + answer);
            } else if (option == 3) {
                answer = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + answer);
            } else if (option == 4) {
                dblAnswer = (double)num1 / (double)num2;
                System.out.println(num1 + " / " + num2 + " = " + dblAnswer);
            } else if (option == 0){
                option = 0;
            } else {
                System.out.println("That is not a valid input, enter a valid input.");
                option = input.nextInt();
            }
        }
        System.out.println("You have quit the calculator.");
    }
}