 public class Kamlesh12 {
    public static void main(String[] args) {
        int arr[] = { 1,2, 3, 4,17, 5, 667, 2 };
        int s = 0;
        int arr2[] = { 1, 0, 1, 0, 1, 1, 0, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (!primeN(arr[1])) {
                s += arr[i] * arr2[i];

            }

        }
        System.out.println(s);
    }

    static boolean primeN(int n) {
        boolean f = true;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                f = false;
                break;
                }    }
            return f;
        
    }
}