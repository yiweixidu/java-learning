package W3_JavaBasicsI.Exercises10_18;

import java.util.Scanner;

public class E15_2 {
    public static void main(String[] args) {
        // Declare interger variables for storing user input and swapping
        int x, y, z;

        // Creat a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);

        // Prompt the user to input first number, then read and store it
        System.out.print("Input first number: ");
        x = in.nextInt();

        // Prompt the user to input second number, then read and store it
        System.out.print("Input second number: ");
        y = in.nextInt();

        //Print two numbers before swapping
        System.out.println("The values before swapping are " + x + ", " + y);

        // Swap the two numbers and print out them after swapping
        z = x;
        x = y;
        y = z;
        System.out.println("The values after swapping are " + x + ", " + y);

        in.close();
    }
}
