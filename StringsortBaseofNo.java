import java.util.*;
public class StringsortBaseofNo {
    public static void main(String[] args) {
        ArrayList<String> s = new ArrayList<>();
        ArrayList<Character> k = new ArrayList<>();

        java.util.Scanner sc = new java.util.Scanner(System.in);
        sc.close();
        s.add("hello");
        s.add("1");
        s.add("ashish");
        k.add('d');
        s.add("34");
        
        s.add("56");
        s.add("lodhi");
        s.add("1");
        s.add("100");
        s.containsAll(s);
        // s.add(12);
        // s.add(23);
        // s.add(2331);
        // s.add(77);

        Collections.sort(s);
        System.out.println(s);
    System.out.println(k);

    }

}
