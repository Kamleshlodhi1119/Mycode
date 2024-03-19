import java.util.*;

class GFg12 {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 2 };
        Arrays.sort(a);
        ArrayList<Integer> kam = new ArrayList<>();
        kam.add(14);
        kam.remove(0);
        for (int i = 0; i < a.length; i++) {
            kam.add(a[i]);
        //    System.out.println(a[i]);

        }
        for (int j = 0; j < kam.size(); j++) {
            System.out.println(kam.get(j));
        }
    }
}