// Armstrong Number

public class q7 {
    public static void main(String[] args) {
        int numberToCheck = 153; 

        if (isArmstrongNumber(numberToCheck)) {
            System.out.println(numberToCheck + " is an Armstrong number.");
        } else {
            System.out.println(numberToCheck + " is not an Armstrong number.");
        }
    }

    private static boolean isArmstrongNumber(int num) {
        int originalNumber = num;
        int numberOfDigits = String.valueOf(num).length();
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, numberOfDigits);
            num /= 10;
        }

        return originalNumber == sum;
    }
}

