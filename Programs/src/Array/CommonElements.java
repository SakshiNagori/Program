package Array;

/**
 *
 * @author sakshi
 */
public class CommonElements {

    void common(int a[], int b[], int c[]) {
        int x = a.length;
        int y = b.length;
        int z = c.length;
        int i = 0, j = 0, k = 0;
        while (i < x && j < y && k < z) {
            if (a[i] == b[j] && b[j] == c[k]) {
                System.out.println(a[i] + " ");
                i++;
                j++;
                k++;
            } else if (a[i] < b[j]) { //x<y
                i++;
            } else if (b[j] < c[k]) { //y<z
                j++;
            } else {
                k++;
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {2, 4, 6, 8};
        int b[] = {4, 8, 12, 16};
        int c[] = {8, 16, 24, 32};
        CommonElements ce = new CommonElements();
        ce.common(a, b, c);
    }
}
