package W3_JavaBasicsI.Exercises10_18;

import java.util.Scanner;

public class E11_2 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner in = new Scanner(System.in);

        // Prompt the user to input the radius of the circle
        System.out.print("Input the radius of the circle: ");

        // Read and store the input radius
        double radius = in.nextDouble();

        // Calculate and print the perimeter of the circle
        System.out.println("Perimeter = " + (2 * Math.PI * radius));

        // Calculate and print the area of the circle
        System.out.println("Area = " + (Math.PI * radius * radius));

        in.close();
    }
    
}
