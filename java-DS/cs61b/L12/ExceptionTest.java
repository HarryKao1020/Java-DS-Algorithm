package cs61b.L12;

import java.util.HashSet;
import java.util.Set;

public class ExceptionTest {
    public static void main(String[] args) {
        ArraySet<String> s = new ArraySet<>();
        s.add(null);
        s.add("Tokyo");
        s.add("Taiwan");
        s.add("US");
        s.add("Tokyo");
        System.out.println(s.contains("Tokyo"));
        System.out.println(s.getSize());
        System.out.println(s.getIndex(2));
    }
}
