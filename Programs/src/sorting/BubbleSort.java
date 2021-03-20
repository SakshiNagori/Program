package sorting;

import java.util.Scanner;

/**
 *Bubble sort(Compare and swap)
 * @author Sakshi
 */
public class BubbleSort {
    
    void BubbleSort(int arr[]){
        int n=arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
            
        }
    }
    
    void printArray(int arr[]){
//        int n=arr.length;
//        for (int i = 0; i < n-1; i++) {
//            System.out.print(arr[i]+" ");
//            System.out.println();
//        
            for(int value:arr){
                System.out.print(value+" ");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of elements");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter all the elements");
        for (int i = 0; i < n; i++) {
            a[i]=sc.nextInt();
        }
        BubbleSort b=new BubbleSort();
        b.BubbleSort(a);
        System.out.println("Sorted array");
        b.printArray(a);
    }
}
