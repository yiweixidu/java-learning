package W3_JavaBasicsI.Exercises19_27;

import java.util.Scanner;

public class E22_1 {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Declare variables to store binary and decimal numbers, remainder, and a multiplier
        long binaryNumber, decimalNumber = 0, j = 1, remainder; 
        /*binaryNumber：输入的二进制数; 
          decimalNumber：计算出的十进制结果; 
          remainder：当前处理的二进制位（0或1); 
          j：当前位的权重（2的幂次）
        */

        // Prompt the user to input a binary number
        System.out.print("Input a binary number: ");
        binaryNumber = scanner.nextLong();

        // Convert the binary number to decimal
        while (binaryNumber != 0) {
            remainder = binaryNumber % 10;    // 获取最低位数字
            decimalNumber += remainder * j;   // 累加当前位的值
            binaryNumber /= 10;               // 移除最低位数字
            j *= 2;                           // 更新位权重（2的幂）
        }

        // Display the decimal representation of the binary number
        System.out.println("Decimal Number: " + decimalNumber + "\n");

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
