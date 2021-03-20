package sorting;

import java.util.Scanner;

/**
 *index of left child=2*i+1 and right=2*i+2 where i is index of parent node
 *index of Parent node when we know the index of child(i)=(i-1)/2
 *range of index of leaf node in array-[n/2+1 to n] where n is index of last element
 * @author sakshi
 */
public class Heapsort {
    
    void heapSort(int[] arr){
        int n=arr.length;
        //we will take the index of left sub tree i=size/2-1
        for(int i=n/2-1;i>=0;i--){
            maxHeapify(arr, n, i);
        }
        //move first root(biggest no) to end and next time we'll not count this no
        for(int i=n-1;i>=0;i--){
            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;
            
            maxHeapify(arr, i, 0);
        }
    }
    
    void maxHeapify(int arr[],int size,int index){
        int largest=index;
        int left=2*index+1;
        int right=2*index+2;
        
        while(left<size&&arr[left]>arr[largest]){
            largest=left;
        }
        while(right<size&&arr[right]>arr[largest]){
            largest=right;
        }
        if(largest!=index){
            int temp=arr[index];
            arr[index]=arr[largest];
            arr[largest]=temp;
            maxHeapify(arr, size, largest);
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
        Heapsort h=new Heapsort();
        h.heapSort(a);
        System.out.println("Sorted array");
        h.printArray(a);
    }
}
