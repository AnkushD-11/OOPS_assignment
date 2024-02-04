class Q5 {
    private int value;


    public Q5(int value) {
        this.value = value;
    }
    public void displayInstance(Q5 instance) {
        System.out.println("Displaying instance value: " + instance.value);
    }

    public void useThisAsArgument() {
        displayInstance(this);
    }

    public static void main(String[] args) {
        Q5 obj1 = new Q5(10);
        obj1.displayInstance(obj1); 

        Q5 obj2 = new Q5(20);
        obj2.useThisAsArgument(); 
    }
}
