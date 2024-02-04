//Write a java program to implement of constructor overloading.

public class Q2 {
    private double length;
    private double width;

    public Q2(){
        length =0;
        width = 0;
    }

    public Q2(double l, double w){
        length = l;
        width = w;
    }

    public Q2(int side){
        length = side;
        width = side;
    }

    public double calculateArea() {
        return length * width;
    }
    public static void main(String[] args) {
        Q2 square = new Q2(5);
        Q2 rectangle = new Q2(4.0,5.0);
        Q2 defaultShape = new Q2();

        System.out.println("Area of square: " + square.calculateArea());
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
        System.out.println("Area of default shape: " + defaultShape.calculateArea());
    }
}

    

