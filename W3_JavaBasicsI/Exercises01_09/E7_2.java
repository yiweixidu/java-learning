package W3_JavaBasicsI.Exercises01_09;

import java.util.Scanner;

public class E7_2 {
    public static void main(String[] args) {
        // Creat a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);

        // Prompt the user to input a number
        System.out.print("Input a number: ");

        // Read and sotre the input number
        int n = in.nextInt();

        // Use a loop to generate and print hte multiplication table for the input number
        for (int i = 1; i <= 10; i++) {
            // Calculate and print the result of n multiplied by i
            System.out.println(n + " x " + i + " = " + (n * i));
        } 
        in.close();
    }
}
