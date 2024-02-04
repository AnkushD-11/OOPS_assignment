// Write a Java program to check whether a number is prime or not.

public class q5 {
        public static void main(String[] args) {
            int numberToCheck = 22;

            if (isPrime(numberToCheck)) {
                System.out.println(numberToCheck + " is a prime number.");
            } else {
                System.out.println(numberToCheck + " is not a prime number.");
            }
        }
        private static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
    
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
    
