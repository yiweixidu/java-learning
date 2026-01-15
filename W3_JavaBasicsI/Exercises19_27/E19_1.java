package W3_JavaBasicsI.Exercises19_27;

import java.util.Scanner;

public class E19_1 {
    public static void main(String args[]){
        // Declare variables to store decimal number, quotient, and an array for binary digits
        int dec_num, quot, i = 1, j; // 数组索引从1开始（索引0未使用）
        int bin_num[] = new int[100]; // 创建一个可以存储100个整数的数组

        // Create a Scanner object to read input from the user
        Scanner scan = new Scanner(System.in);

        // Prompt the user to input a decimal number
        System.out.print("Input a Decimal Number: ");
        dec_num = scan.nextInt();

        // Initialize the quotient with the decimal number
        quot = dec_num;

        // Convert the decimal number to binary and store binary digits
        while (quot != 0) {
            bin_num[i++] = quot % 2; // 存储余数（0或1），然后i自增
            quot = quot / 2;         // 更新商
        }

        // Display the binary representation of the decimal number, 逆序输出
        System.out.print("Binary number is: ");
        for (j = i - 1; j > 0; j--) {
            System.out.print(bin_num[j]);
        }

        System.out.print("\n");
        scan.close();
    }
}
