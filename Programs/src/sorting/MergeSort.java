package sorting;

import java.util.Scanner;

/**
 *
 * @author sakshi
 */
public class MergeSort {

    void merge(int arr[],int beg,int mid,int end){
        int i=beg;//index of left array
        int j=mid+1;//index of right array
        int k;//index of new(merged) array
        int index=beg;//temp arr
        int n=arr.length;
        int temp[]=new int[n];
        
        while(i<=mid&&j<=end)
        {
            if(arr[i]<arr[j]){
                temp[index]=arr[i];
                i++;
            }else{
                temp[index]=arr[j];
                j++;
            }
            index++;//after inserting the smaller value in temp arr increment its index
        }
        if(i>mid){//if all the values of left arr are inserted into temp arr
            while(j<=end){//then put all the values of right arr in temp arr
                temp[index]=arr[j];
                j++;
                index++;
                
            }
        }else{
            while(i<=mid){
                temp[index]=arr[i];
                i++;
                index++;
            }
        }
        k=beg;//now put all values of sorted arr(temp) in resultant arr
        while(k<index){
            arr[k]=temp[k];
            k++;
        }
        
    }
    
    void mergeSort(int arr[],int beg,int end){
        int mid;
        if(beg<end){
            mid=(beg+end)/2;
            mergeSort(arr, beg, mid);//left arr
            mergeSort(arr, mid+1, end);//right arr
            merge(arr, beg, mid, end);
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
       MergeSort m=new MergeSort();
       m.mergeSort(a, 0, n-1);
        System.out.println("Sorted array");
        m.printArray(a);
    }
}
