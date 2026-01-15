package W3_JavaBasicsI.Exercises01_09;

import java.util.Scanner;
public class E1_2 {
    public static void main(String[] args) {
        // Creat a Scanner object to read imput from the console
        Scanner input = new Scanner(System.in);
        // Prompt the user to input their first name
        System.out.print("Input your first name: ");
        String fname = input.next();
        // Prompt the user to input their last name
        System.out.print("Input your last name: ");
        String lname = input.next();
        // Out put a greeting message with the user's full name
        System.out.println();
        System.out.println("Hello \n" + fname + " " + lname);
        input.close();
}
    }
    
