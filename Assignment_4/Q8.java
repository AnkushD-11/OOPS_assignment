public class Q8 {
        private int value; 
        public Q8(int value) {
            this.value = value;
        }
        public void setValue(int value) {
            this.value = value;
        }
    
        public void displayValue() {
            System.out.println("The value is: " + value);
        }
    
        public static void main(String[] args) {
            Q8 obj = new Q8(10);
    
            obj.displayValue(); // Display the initial value
    
            obj.setValue(20); // Set a new value using the method
    
            obj.displayValue(); // Display the updated value
        }
    }
    
