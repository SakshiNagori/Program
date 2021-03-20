package Array;

public class DelFromArray {

    public static void main(String[] args) {
        Integer a[] = {1, 2, 3, 4, 5};
        int loc = 4;
        for (int i = loc; i < a.length - 1; i++) {
            a[i] = a[i + 1];
        }
        for (int i = 0; i < a.length - 1; i++) {
            System.out.println(a[i]);
        }
    }
}
