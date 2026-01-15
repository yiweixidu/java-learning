package W3_JavaBasicsI.Exercises01_09;

import java.util.Scanner;

public class E6_2 {
    public static void main(String[] args) {
        // Creat a Scanner object to read input from the userr
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input the first number
        System.out.print("Input the first number: ");

        //Read and store the first number
        int n1 = scanner.nextInt();

        // Prompt the user to input the wecond number
        System.out.print("Input the second number: ");
        
        // Read and store the second number
        int n2 = scanner.nextInt();

        // Claculate the sum, difference, product, division, and remainder of the two numbers
        int sum = n1 + n2;
        int minus = n1 - n2;
        int multiply = n1 * n2;
        int divide = n1 / n2;
        int mod = n1 % n2;

        // Display the results of the claculations
        System.out.printf("Sum = %d\nMinus = %d\nMultiply = %d\nDivide = %d\nRemainderOf2Numbers = %d\n ", sum, minus, multiply, divide, mod);

        scanner.close();
    }
}
