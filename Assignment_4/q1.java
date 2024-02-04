
class Q1{
    static void area(int x){
        System.out.println("The area of the shape is " + x*x);
    }
    static void area(float x, float y){
        System.out.println("The area of the shape is " + x*y);
    }
    
    public static void main(String[] args) {
        area(3);
        area(2.5f,4.0f);
    }
}
