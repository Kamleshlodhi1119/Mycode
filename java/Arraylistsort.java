import java.util.*;

public class Arraylistsort {
    public static void main(String[] args) {

        ArrayList<Integer> kam = new ArrayList<>();
        kam.add(1535);
        kam.add(12);
        kam.add(18);
        kam.add(25);
        kam.add(3);
        kam.add(6);
        kam.add(8);
        kam.add(10);
        kam.add(15);
        kam.add(13);
        kam.add(123);
        int n = 3;
    
        Collections.sort(kam);
        System.out.println(kam);
        for (int i = 0; i < n; i++) {
            int p = kam.get(kam.size() - 1);
            kam.add(0, p);
            kam.remove(kam.size() - 1);

        }
        // System.out.println(kam.size());
        System.out.println(kam);
    }
}
