package Assignment_2;
import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        int i,j,m,n;
        int sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        m = sc.nextInt();
        n = sc.nextInt();
        int [][] arr= new int[m][n];
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
    }
    for (i = 0; i < arr.length; i++) {
        sum += arr[i][i];
    }

    System.out.println("Diagonal Sum: " + sum);
    
}
}
