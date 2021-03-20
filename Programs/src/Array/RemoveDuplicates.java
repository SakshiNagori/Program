package Array;

import java.util.Arrays;

public class RemoveDuplicates {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 5};
        BubbleSort(arr);
        /* Arrays.sort(arr);
    int j=0,len=arr.length;
    for(int i=0;i<(len-1);i++)
    {
        if(arr[i]!=arr[i+1])
        {
            arr[j++]=arr[i];
            
        }
        arr[j++]=arr[len-1];
        for(int k=0;k<j;k++)
        {
            System.out.println(arr[k]+"");
        }
    }*/
    }

    public static void BubbleSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                int temp;
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}
