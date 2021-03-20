package Array;

import java.util.Scanner;

/**
 *consecutive +ve and -ve no
 * @author sakshi
 */
public class Rearrange {

    void rearrange(int arr[], int low, int high) {
        int pivot = 0;
        int i = low, j = high;//i-neg j-pos
        while (i < j) {
            while (arr[i] < pivot) {
                i++;
            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

        //System.out.println(i+"  "+j);
        int pos = i + 1, neg = 1;
        while (pos < high && arr[neg] < 0) {
            int temp = arr[neg];
            arr[neg] = arr[pos];
            arr[pos] = temp;
            neg += 2;
            pos++;
        }

    }

    void printArray(int arr[]) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of elements");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter all the elements");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Rearrange r = new Rearrange();
        r.rearrange(a, 0, n - 1);
        System.out.println("after rearranging..!!");
        r.printArray(a);
    }
}
