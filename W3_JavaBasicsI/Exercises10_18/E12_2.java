package W3_JavaBasicsI.Exercises10_18;

import java.util.Scanner;

public class E12_2 {
    public static void main(String[] args) {
        // Initialize variables for sum and counting
        double num = 0;
        double x =1;

        // Create a Scanner object to read input form the user
        Scanner in = new Scanner(System.in);

        // Prompt the user to input the number (n) for which to calculate hte average
        System.out.print("Input the number(n) you want to calculate the average: ");
        int n = in.nextInt();

        // Use a loop to collect n numbers and calculate their sum
        while (x <= n) {
            System.out.print("Input number(" + (int)x + "):");
            num += in.nextInt();
            x += 1;
        }

        // Calculate the average of the collected numbers
        double avgn = (num / n);

        // Display the calculated average
        System.out.println("Average: " + avgn);

        in.close();
    }
}
