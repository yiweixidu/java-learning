package W3_JavaBasicsI.Exercises10_18;

import java.util.Scanner;

public class E12_1 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);

        // Prompt the user to imput the first number
        System.out.print("Input first number: ");

        // Read and store the first number
        int num1 = in.nextInt();
        
        // Prompt the user to input the 2nd-5th numbers and read and store them
        System.out.print("Input second number: ");
        int num2 = in.nextInt();

        System.out.print("Input third number: ");
        int num3 = in.nextInt();

        System.out.print("Input forth number: ");
        int num4 = in.nextInt();

        System.out.print("Input fifth number: ");
        int num5 = in.nextInt();

        // Calculate and print the average of the five numbers
        System.out.println("Average of five numbers is: " + ((num1 + num2 + num3 + num4 + num5) / 5));
        in.close();
    }
}
