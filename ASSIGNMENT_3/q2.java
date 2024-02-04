//Write a java program to take input from keyboard using Scanner class.
import java.util.*;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.next();
        System.out.println("Hello! " + name); 
        sc.close();
    }
}
