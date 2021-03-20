package Array;

import java.util.Scanner;

/**
 * YT-coding ninja
 *
 * @author sakshi
 */
public class MaxProduct_subarray {

    int max(int a, int b, int c) {
        return (a > b) ? (a > c ? a : c) : (b > c ? b : c);
    }

    int min(int a, int b, int c) {
        return (a < b) ? (a < c ? a : c) : (b < c ? b : c);
    }

    int product(int arr[]) {
        int ovarall_max = Integer.MIN_VALUE;
        int min = arr[0];
        int max = arr[0];//since first element is always be max and min when compared to itself
        int temp;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 0) {
                max = 1;
                min = 1;

            }
            temp = max;
            max = max(arr[i], max * arr[i], min * arr[i]);//we'll also comapre the min value as product of two large-ve no is big +ve no
            min = min(arr[i], temp * arr[i], min * arr[i]);

            if (ovarall_max < max) {
                ovarall_max = max;
            }
        }
        return ovarall_max;
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
        MaxProduct_subarray m = new MaxProduct_subarray();
        System.out.println(m.product(a));
    }
}
