package sorting;

import java.util.Scanner;

/**
 *
 * @author sakshi
 */
public class QuickSort {
 
    void quickSort(int arr[],int low,int high){
        int pivot=arr[low];
        int i=low,j=high;
        while(i<=j){
            while(arr[i]<pivot)
                i++;
            while(arr[j]>pivot)
                j--;
            if(i<=j){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        if(low<j){
            quickSort(arr, low, j);
        }
        if(high>i){
            quickSort(arr, i, high);
        }
    }
    
    void printArray(int arr[]){
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
      QuickSort q=new QuickSort();
      q.quickSort(a, 0, n-1);
        System.out.println("Sorted array");
        q.printArray(a);
    }
}
