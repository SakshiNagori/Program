package searching;

//time complexity=o(logn),based on dived and conquer

import java.util.Scanner;
import static searching.Linear.LinerSearch;

public class BinarySearch 
{
     public static int BinarySearch(int arr[],int x,int first,int last){
         
         if(last>first){
             int mid=(last+first)/2;
             if(arr[mid]==x)
                 return mid;
             if(arr[mid]>x)
                 return BinarySearch(arr, x, first, mid-1);
             if(arr[mid]<x)
                 return BinarySearch(arr, x, mid+1, last);
         }
         
         return -1;
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
        System.out.println("enter element ypu want to search");
        int x=sc.nextInt();
        int result=BinarySearch(a, x, 0, n-1);
        if(result==-1)
            System.out.println("element not found");
        else
            System.out.println("element found at index"+result);
    }
    
}
