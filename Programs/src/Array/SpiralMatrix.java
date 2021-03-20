package Array;

import java.util.Scanner;

/**
 *
 * @author sakshi
 */
public class SpiralMatrix {
    
    public static void main(String[] args){
        
    int i,j;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of rows::");
        int n=sc.nextInt();
        System.out.println("enter no of columns::");
        int m=sc.nextInt();
        int arr[][]=new int[n][m];
        System.out.println("enter all the elements");
        for(i=0;i<n;i++){
            for(j=0;j<m;j++){
                arr[i][j]=sc.nextInt();
            }
            System.out.println(" ");
        }
        
        int minr=0;
        int minc=0;
        int maxr=arr.length-1;
        int maxc=arr[0].length-1;
        int total_ele=m*n;
        int count=0;//to count how many elements we have printed
        System.out.println("");
        while(minr<maxr && minc<maxc && count<=total_ele){
            
            //left wall
            for(i=minr,j=minc;i<=maxr && count<total_ele;++i){
                System.out.print(arr[i][j]+" ");
                count++;
            }
            minc++;
            //bottom wall
            for(i=maxr,j=minc;j<=maxc && count<total_ele;++j){
                System.out.print(arr[i][j]+" ");
                count++;
            
            }
            maxr--;
            //right wall
            for(i=maxr,j=maxc;i>=minr && count<total_ele;--i){
                System.out.print(arr[i][j]+" ");
                count++;
            
            }
            maxc--;
            //top wall
            for(i=minr,j=maxc;j>=minc;--j){
                System.out.print(arr[i][j]+" ");
                count++;
            
            }
        }
    }
            
}
