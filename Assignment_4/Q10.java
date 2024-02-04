/* Create a general class ThreeDObject and derive the classes Box, Cube, Cylinder and Cone from it. 
The class ThreeDObject has methods wholeSurfaceArea ( ) and volume ( ). Override these two methods in each 
of the derived classes to calculate the volume and whole surface area of each type of three-dimensional objects. 
The dimensions of the objects are to be taken from the users and passed through the respective constructors of 
each derived class. Write a main method to test these classes. */

import java.util.Scanner;

class ThreeDObject {
    public double wholeSurfaceArea() {
        return 0.0;
    }

    public double volume() {
        return 0.0;
    }
}

class Box extends ThreeDObject {
    private double length, width, height;

    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double wholeSurfaceArea() {
        return 2 * (length * (width + height) + width * height);
    }

    @Override
    public double volume() {
        return length * width * height;
    }
}

class Cube extends ThreeDObject {
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    @Override
    public double wholeSurfaceArea() {
        return 6 * side * side;
    }

    @Override
    public double volume() {
        return side * side * side;
    }
}

class Cylinder extends ThreeDObject {
    private double radius, height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    public double volume() {
        return Math.PI * radius * radius * height;
    }
}

class Cone extends ThreeDObject {
    private double radius, height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double wholeSurfaceArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }

    @Override
    public double volume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }
}

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Test Box
        System.out.println("Enter dimensions for Box:");
        double boxLength = scanner.nextDouble();
        double boxWidth = scanner.nextDouble();
        double boxHeight = scanner.nextDouble();
        Box box = new Box(boxLength, boxWidth, boxHeight);
        displayResults("Box", box);
20
        // Test Cube
        System.out.println("\nEnter side length for Cube:");
        double cubeSide = scanner.nextDouble();
        Cube cube = new Cube(cubeSide);
        displayResults("Cube", cube);

        // Test Cylinder
        System.out.println("\nEnter dimensions for Cylinder:");
        double cylinderRadius = scanner.nextDouble();
        double cylinderHeight = scanner.nextDouble();
        Cylinder cylinder = new Cylinder(cylinderRadius, cylinderHeight);
        displayResults("Cylinder", cylinder);

        // Test Cone
        System.out.println("\nEnter dimensions for Cone:");
        double coneRadius = scanner.nextDouble();
        double coneHeight = scanner.nextDouble();
        Cone cone = new Cone(coneRadius, coneHeight);
        displayResults("Cone", cone);
    }

    private static void displayResults(String objectName, ThreeDObject object) {
        System.out.println(objectName + " Surface Area: " + object.wholeSurfaceArea());
        System.out.println(objectName + " Volume: " + object.volume());
        System.out.println();
    }
}
