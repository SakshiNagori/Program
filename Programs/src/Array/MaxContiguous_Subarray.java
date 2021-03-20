package Array;

import java.util.Scanner;

/**
 * kadane's algorithm
 *
 * @author sir
 */
public class MaxContiguous_Subarray {

    int kadane(int arr[]) {
        int current_sum = arr[0];
        int overall_sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (current_sum >= 0) {
                current_sum = current_sum + arr[i];
            } else {//if sum of the previous values are -ve then we'll start the new sub-sequence from arr[i]
                current_sum = arr[i];
            }

            if (current_sum > overall_sum) {
                overall_sum = current_sum;
            }
        }

        return overall_sum;
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
        System.out.println(" ");
        MaxContiguous_Subarray m = new MaxContiguous_Subarray();
        System.out.print(m.kadane(a));
    }

}
