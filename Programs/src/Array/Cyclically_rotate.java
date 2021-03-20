package Array;

import java.util.Scanner;

/**
 *
 * @author sakshi
 */
public class Cyclically_rotate {

    void rotate(int arr[], int n) {
        int last = arr[n - 1], i;
        for (i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last;
        for (int value : arr) {
            System.out.print(arr[value] + " ");
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
        Cyclically_rotate c = new Cyclically_rotate();
        c.rotate(a, n - 1);
    }
}
