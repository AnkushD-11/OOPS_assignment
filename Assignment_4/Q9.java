public class Q9 {
    private int myVariable;

    public void setMyVariable(int myVariable) {
        // Using "this" to distinguish between the instance variable and the local variable
        this.myVariable = myVariable;
    }

    public int getMyVariable() {
        return myVariable;
    }

    public static void main(String[] args) {
        Q9 obj = new Q9();
        obj.setMyVariable(42);
        System.out.println("MyVariable value: " + obj.getMyVariable());
    }
}

