import java.util.Scanner;

public class ArraySwap {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        s.close();
        int n = s.nextInt();
        int[] a = new int[n];
        int i;
        for (i = 0; i < n; i++)
            a[i] = s.nextInt();
        int k = s.nextInt();
        k = k % n;
        int[] b = new int[50];
        int m = 0;
        for (i = n - k; i < n; i++)
            b[m++] = a[i];
        for (i = 0; i <= k; i++)
            b[m++] = a[i];
        for (i = 0; i < m; i++)
            System.out.println(b[i]);
    }
}
// Swap array value
