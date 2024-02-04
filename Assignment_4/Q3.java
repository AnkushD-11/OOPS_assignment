public class Q3 {
    private int value;

    public Q3(int value) {
        this.value = value;
    }
    
    public void displayValue() {
        System.out.println("The value is: " + this.value);
        }

    public void updateValue(int newValue) {
        this.value = newValue;
        displayValue(); 
    }
    
    public static void main(String[] args) {
        Q3 obj = new Q3(10);
        obj.displayValue();
    
        obj.updateValue(20);
    }
    }

