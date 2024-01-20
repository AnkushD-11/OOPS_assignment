package Assignment_2;

import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        int i,j,m,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
    
    }
    System.out.println("Elements of the array are: ");
    for(i = 0; i < n; i++) {
        for(j = 0; j < m; j++) {
            System.out.print(arr[i][j] + " ");
        }
        System.out.println();
    }
}
}
