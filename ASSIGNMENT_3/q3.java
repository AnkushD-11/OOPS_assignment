// Write a Java program to reverse a number

import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to reverse: ");
        int num = scanner.nextInt();
        int reversed = reverseNum(num);
        System.out.println("Reversed number: " + reversed);
        scanner.close();
    }

    private static int reverseNum(int num) {
        int reversedNum = 0;

        while (num != 0) {
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }

        return reversedNum;
    }
}
