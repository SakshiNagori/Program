package Array;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *print sub array with sum=0
 * @author sakshi
 */
public class subarraySum {

    boolean sum(int arr[]) {

        Set<Integer> set = new HashSet<>();
        set.add(0);
        int sum = 0;
        for (int value : arr) {
            sum = sum + value;
            if (set.contains(sum)) {
                return true;
            }
            set.add(sum);
        }

        return false;
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
        subarraySum s = new subarraySum();
        if (s.sum(a)) {
            System.out.println("sub array with sum 0 exist...");
        } else {
            System.out.println("sub array with sum 0 does not exist...");
        }
    }
}
