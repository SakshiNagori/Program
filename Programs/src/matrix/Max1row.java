package matrix;

import java.util.Scanner;

/**
 *binary sorted matrix
 * @author sakshi
 */
public class Max1row {
    
    void maxRow(int arr[][],int n,int m){
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                if(arr[i][j]==1)
                {
                    System.out.println("row:"+i);
                    break;
                }
              
            }
              break;
        }
            }
    
    
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows");
        int n = sc.nextInt();
        System.out.println("enter no of columns");
        int m = sc.nextInt();
        int a[][] = new int[n][m];
        System.out.println("enter all the elements");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
            System.out.println(" ");
        }
        Max1row r=new Max1row();
        r.maxRow(a, n, m);
        
    }
}
