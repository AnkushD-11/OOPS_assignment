public class q10 {
        public static void main(String[] args) {
            // Creating a StringBuffer
            StringBuffer stringBuffer = new StringBuffer("Hello");
    
            // append()
            stringBuffer.append(" World");
            System.out.println("append(): " + stringBuffer);
    
            // capacity()
            int capacity = stringBuffer.capacity();
            System.out.println("capacity(): " + capacity);
    
            // charAt()
            char charAtIndex = stringBuffer.charAt(1);
            System.out.println("charAt(1): " + charAtIndex);
    
            // delete()
    
            // deleteCharAt()
            stringBuffer.deleteCharAt(0);
            System.out.println("deleteCharAt(0): " + stringBuffer);
    
            // ensureCapacity()
            stringBuffer.ensureCapacity(20);
            System.out.println("ensureCapacity(20): " + stringBuffer);
    
            // getChars()
            char[] charArray = new char[stringBuffer.length()];
            stringBuffer.getChars(0, stringBuffer.length(), charArray, 0);
            System.out.print("getChars(): ");
            for (char c : charArray) {
                System.out.print(c + " ");
            }
            System.out.println();
    
            // indexOf()
            int indexOfSubstring = stringBuffer.indexOf("rld");
            System.out.println("indexOf(\"rld\"): " + indexOfSubstring);
    
            // insert()
            stringBuffer.insert(5, " beautiful");
            System.out.println("insert(5, \" beautiful\"): " + stringBuffer);
    
            // length()
            int length = stringBuffer.length();
            System.out.println("length(): " + length);
    
            // setCharAt()
            stringBuffer.setCharAt(0, 'H');
            System.out.println("setCharAt(0, 'H'): " + stringBuffer);
    
            // setLength()
            stringBuffer.setLength(5);
            System.out.println("setLength(5): " + stringBuffer);
    
            // substring()
            String substring = stringBuffer.substring(2);
            System.out.println("substring(2): " + substring);
    
            // toString()
            String toStringResult = stringBuffer.toString();
            System.out.println("toString(): " + toStringResult);
    }
}
    
