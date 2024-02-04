// Write a Java program to convert a Binary Number to Decimal and Decimal to Binary.
public class q6 {
    public static void main(String[] args) {
        String binaryNumber = "1101";
        int decimalResult = binaryToDecimal(binaryNumber);
        System.out.println("Binary to Decimal: " + binaryNumber + " to " + decimalResult);
        int decimalNumber = 13;
        String binaryResult = decimalToBinary(decimalNumber);
        System.out.println("Decimal to Binary: " + decimalNumber + " to " + binaryResult);
    }

    private static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);
    }

    private static String decimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }
}

