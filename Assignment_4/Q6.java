class Q6 {
    private int value;

    // Default constructor
    public Q6(){
        this(0);
    }
    public Q6(int value) {

        this.value = value;
    }
    public void displayValue() {
        System.out.println("The value is: " + this.value);
    }

    public static void main(String[] args) {
        Q6 obj1 = new Q6(); 
        obj1.displayValue();

        Q6 obj2 = new Q6(5); 
        obj2.displayValue();
    }
}

