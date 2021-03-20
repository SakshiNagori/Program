package Array;

import java.util.Arrays;

public class PairSum {

    public static void main(String[] args) {
        int a[] = {5, 8, 3, 2, 4, 6, 0};
        Arrays.sort(a);
        int sum = 8;
        int low = 0, high = a.length - 1;
        while (low < high) {
            if (a[low] + a[high] < sum) {
                low++;
            } else if (a[low] + a[high] > sum) {
                high--;
            } else if (a[low] + a[high] == sum) {
                System.out.println("pair(" + a[low] + "," + a[high] + ")");
                low++;
                high--;
            }

        }
    }
}
