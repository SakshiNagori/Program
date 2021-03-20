package Array;

import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author sakshi
 */
public class longestConseqSubseq {

    int sequence(int arr[]) {
        HashSet<Integer> s = new HashSet<Integer>();
        int len = 0;

        for (int i = 0; i < arr.length; ++i) {
            s.add(arr[i]);
        }

        for (int i = 0; i < arr.length; ++i) {

            if (!s.contains(arr[i] - 1)) {//if the currenyt element is the starting of the seq
                int j = arr[i];
                while (s.contains(j))//like 3,4,5 is present in set but not 6 so condition fails so outside the loop j will be 6
                {
                    j++;
                }

                if (len < j - arr[i]) {//6-3=3 so len=3
                    len = j - arr[i];
                }
            }
        }

        return len;
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
        longestConseqSubseq l = new longestConseqSubseq();
        System.out.println("lenght of the longest seq in given array is" + l.sequence(a));
    }
}
