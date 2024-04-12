
//code written by kamlesh lodhi cse
//package Kam;
import java.util.*;

class Kamlesh14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner((System.in));
        // int n=sc.nextInt();

        String s = sc.nextLine();
        sc.close();
        int n[] = new int[10];

        char c[] = s.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] > 47 && c[i] < 59) {
                n[i++] = c[i];
            }
        }
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i]);

        }
    }

}