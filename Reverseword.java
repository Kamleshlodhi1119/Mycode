import java.util.Scanner;

public class Reverseword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        // "deepak is the boy"; o/p boy the is deepak
        char a[] = s.toCharArray();
        int f = 0;
        String k = "";
        int l = s.length();// print word in reverse order
        for (int i = a.length - 1; i >= 0; i--) {

            if (a[i] == 32) {
                f = 1;
                for (int j = i + 1; j < l; j++) {
                    k += a[j];
                }
                k += " ";

            } else if (i == 0) {
                f = 1;
                for (int j = i; j < l; j++) {
                    k += a[j];
                }
                k += " ";

            }
            if (a[i] == 32 && f == 1)
                l = i;
            f = 0;

        }
        System.out.println(k);
    }
}
