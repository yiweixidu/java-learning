package W3_JavaBasicsI.Exercises01_09;

import java.util.Scanner;

public class E3_2 {
    public static void main(String[] args)
    {
        // Creat a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to input the first number
        System.out.print("Input the first number: ");

        // Read and stor the firs tnumber
        int a = input.nextInt();

        // Prompt the user to input the second number
        System.out.print("Input the second number: ");

        // Read and store the second number
        int b = input.nextInt();

        // Calculate the division of a and b
        int d = (a / b);

        // Display a blan line for separation
        System.out.println();

        // Display the result of the division
        System.out.println("The division of a and b is: " + d);

        input.close();
    }
}
