package cs61b.L12;

import java.util.ArrayList;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SimpleBuiltInListExample {
    public static void main(String[] args) {

        // List example
        List<Integer> L = new ArrayList<>();
        L.add(12);
        L.add(30);
        System.out.println(L);
        L.remove(0);
        System.out.println(L);


        // Set example
        Set<String> s = new HashSet<>();
        s.add("Tokyo");
        s.add("Taiwan");
        s.add("US");
        s.add("Taiwan");
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.contains("Tokyo"));

    }
}
