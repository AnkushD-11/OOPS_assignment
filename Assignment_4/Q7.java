class Q7 {
    private int value;
    public Q7(int value) {
        this.value = value;
    }

    public Q7 setValue(int value) {
        this.value = value;
        return this;
    }
    public void displayValue() {
        System.out.println("The value is: " + this.value);
    }

    public static void main(String[] args) {
        Q7 obj = new Q7(10);
        obj.setValue(20).displayValue();
    }
}
