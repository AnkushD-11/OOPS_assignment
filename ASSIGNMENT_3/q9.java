
public class q9 {
    public static void main(String[] args) {
        // Immutable String
        String immutableString = "Hello";
        
        // Mutable String (StringBuilder)
        StringBuilder mutableString = new StringBuilder("Meow");
        
        // charAt()
        char charAtIndex = immutableString.charAt(2);
        System.out.println("charAt(2): " + charAtIndex);
        
        // compareTo()
        int compareToResult = immutableString.compareTo("Hello");
        System.out.println("compareTo(\"Hello\"): " + compareToResult);
        
        // equals()
        boolean isEqual = immutableString.equals("Hello");
        System.out.println("equals(\"Hello\"): " + isEqual);
        
        // equalsIgnoreCase()
        boolean isEqualIgnoreCase = immutableString.equalsIgnoreCase("hello");
        System.out.println("equalsIgnoreCase(\"hello\"): " + isEqualIgnoreCase);
        
        // indexOf()
        int indexOfSubstring = immutableString.indexOf("l");
        System.out.println("indexOf(\"l\"): " + indexOfSubstring);
        
        // length()
        int stringLength = immutableString.length();
        System.out.println("length(): " + stringLength);
        
        // substring()
        String substring = immutableString.substring(1, 4);
        System.out.println("substring(1, 4): " + substring);
        
        // toCharArray()
        char[] charArray = immutableString.toCharArray();
        System.out.print("toCharArray(): ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();
        
        // toLowerCase()
        String lowercaseString = immutableString.toLowerCase();
        System.out.println("toLowerCase(): " + lowercaseString);
        
        // toString()
        String toStringResult = mutableString.toString();
        System.out.println("toString(): " + toStringResult);
        
        // toUpperCase()
        String uppercaseString = immutableString.toUpperCase();
        System.out.println("toUpperCase(): " + uppercaseString);
        
        // trim()
        String stringWithWhitespace = "   Trim   ";
        String trimmedString = stringWithWhitespace.trim();
        System.out.println("trim(): " + trimmedString);
        
        // valueOf()
        int intValue = 42;
        String stringValue = String.valueOf(intValue);
        System.out.println("valueOf(42): " + stringValue);
    }
    
}
