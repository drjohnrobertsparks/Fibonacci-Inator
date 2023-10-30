package johnrsparks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FibonacciCLI {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxAttempts = 2;
        int numOfAttempts = 0;

        System.out.println("*******************************************************");
        System.out.println(" ");
        System.out.println("             Welcome to the Fibonacci_Inator!, ");
        System.out.println("              where you provide us a number, ");
        System.out.println("              and we fibonacci-inate it?!?!");
        System.out.println(" ");
        System.out.println("********************************************************");
        System.out.println(" ");

        try{

            while (numOfAttempts < maxAttempts){
                System.out.print("Please enter a whole positive number (No funny stuff!): ");
                int number = scanner.nextInt();
                if (number < 0){
                    System.out.println(" ");
                    System.out.println("Hey, I said no funny stuff! Enter a positive whole number!");
                    System.out.println(" ");
                    numOfAttempts++;
                } else {
                    Fibonacci fibonacci = new Fibonacci(number);
                    fibonacci.fibonacciCalulator();
                    break;
                }
            }

            if (numOfAttempts >= maxAttempts){
                System.out.println("Let's give your brain a rest. Come back later.");
            }
        } catch (InputMismatchException e){
            System.out.println("Whole N-U-M-B-E-R my friend.");
            System.out.println("Not --> . <-- or A or c or /");
            System.out.println("Better luck to you next time!");
        }

    }

}
