package W3_JavaBasicsI.Exercises01_09;

import java.util.Scanner;

public class E7_1 {
    public static void main(String[] args) {
        // Creat a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);

        // Prompt the user to input a number
        System.out.print("Input a number: ");

        // Read and store the input number
        int num1 = in.nextInt();

        // Use a loop to calculate and print the multiplicaiton table for the input number
        for (int i = 0; i < 10; i++) 
        {
            // Calculate and print the result of num1 multiplied by (i+1)
            System.out.println(num1 + " x " + (i + 1) + " = " + (num1 * (i + 1)));
        }

        in.close();
    }
}
