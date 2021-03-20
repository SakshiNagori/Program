package sorting;

import java.util.Scanner;

/**(pick the smallest one and put it at the starting of the array)
 *selection sort
 * @author sakshi
 */
public class SelectionSort {
    
    void selectionSort(int arr[]){
        int n=arr.length;
        for (int i = 0; i < n-1; i++) {
            int min=i;
            for (int j = i; j < n; j++) {   //to find the smallest value in arr
                if(arr[j]<arr[min])
                    min=j;
            }
            int temp=arr[i];//swap with the smallest value
            arr[i]=arr[min];
            arr[min]=temp;
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
       SelectionSort s= new SelectionSort();
       s.selectionSort(a);
        System.out.println("Sorted array");
        s.printArray(a);
    }
}
