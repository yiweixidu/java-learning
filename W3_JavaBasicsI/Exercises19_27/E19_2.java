package W3_JavaBasicsI.Exercises19_27;

import java.util.ArrayList;
import java.util.Scanner;

public class E19_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入十进制数: ");
        int decimal = scanner.nextInt();
        
        // 使用ArrayList更灵活
        ArrayList<Integer> binaryDigits = new ArrayList<>();
        
        int quotient = decimal;
        
        // 特殊情况：输入为0
        if (quotient == 0) {
            binaryDigits.add(0);
        }
        
        // 转换过程
        while (quotient > 0) {
            int remainder = quotient % 2;  // 获取余数（0或1）
            binaryDigits.add(remainder);   // 添加到列表
            quotient = quotient / 2;       // 更新商
        }
        
        // 逆序输出
        System.out.print("二进制数是: ");
        for (int i = binaryDigits.size() - 1; i >= 0; i--) {
            System.out.print(binaryDigits.get(i));
        }
        
        System.out.print("\n");
        scanner.close();
    }
}
