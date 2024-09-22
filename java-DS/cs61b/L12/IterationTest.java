package cs61b.L12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class IterationTest {
    public static void main(String[] args) {
        Set<Integer> javaset = new HashSet<>();
        javaset.add(5);
        javaset.add(15);
        javaset.add(30);

        for(int i : javaset){
            System.out.println(i);
        }

        // Iterator 用法
        Iterator<Integer> seer = javaset.iterator();
        while (seer.hasNext()){
            int i = seer.next();
            System.out.println(i);
        }



        ArraySet<Integer> aset = new ArraySet<>();
        aset.add(5);
        aset.add(23);
        aset.add(31);
        // 幫Array 新增iterator
        Iterator<Integer> aseer = aset.iterator();
        while(aseer.hasNext()){
            int i = aseer.next();
            System.out.println(i);
        }

        for(int i : aset){
            System.out.println(i);
        }

    }
}
