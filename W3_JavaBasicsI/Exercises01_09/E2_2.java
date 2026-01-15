
package W3_JavaBasicsI.Exercises01_09;
import java.util.Scanner;

public class E2_2 {
    public static void main(String[] args) 
    {
        // Creat a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);

        // Prompt the user to input the first number
        System.out.print("Input the first number: ");

        // Read and store the first nmmber
        int num1 = input.nextInt();

        // Prompt the user to input the second number
        System.out.print("Input the second number: ");

        // Read and store the second number
        int num2 = input.nextInt();

        // Calculate the sum of the two numbers
        int sum = num1 +num2;

        // Display a blank line for separation
        System.out.println();

        // Display the sum of the two numbers
        System.out.println("Sum: " + sum);

        input.close();
    }
}
