class Q4{
    private int value;

    public Q4() {
        this(0);
    }
    public Q4(int value) {
        this.value = value;
    }

    public void displayValue() {
        System.out.println("The value is: " + this.value);
    }

    public static void main(String[] args) {
        Q4 obj1 = new Q4(); 
        obj1.displayValue();

        Q4 obj2 = new Q4(5); 
        obj2.displayValue();
    }
}
