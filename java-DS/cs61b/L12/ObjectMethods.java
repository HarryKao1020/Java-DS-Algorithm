package cs61b.L12;

import java.util.HashSet;
import java.util.Set;

public class ObjectMethods {
    public static void main(String[] args) {
        ArraySet<Integer> javaset = new ArraySet<>();
        javaset.add(0);
        javaset.add(1);
        javaset.add(2);
        javaset.add(4);
        System.out.println(javaset);

        // override toString()
        javaset.toString();

        ArraySet<Integer> javaset2 = new ArraySet<>();
        javaset2.add(0);
        javaset2.add(1);
        javaset2.add(2);
        javaset2.add(4);

        ArraySet<Integer> javaset3 = new ArraySet<>();
        javaset3=null;
        // override equals
        System.out.println(javaset.equals(javaset3));

        Set<Integer> set1 = Set.of(5,23,42);
        Set<Integer> set2 = Set.of(5,23,42);
        System.out.println(set1==set2);
        System.out.println(set1.equals(set2));


        // equals v.s ==
        String a = new String("Hello");
        String b = new String("Hello");
        System.out.println("a equals b :" + a.equals(b));
        System.out.println(a==b);

        int c = 123;
        int d = 123;
        System.out.println(c == d);


        //
        ArraySet<String> asetOfStrings = ArraySet.of("hi","I'm","here");
        System.out.println(asetOfStrings);

    }
}
