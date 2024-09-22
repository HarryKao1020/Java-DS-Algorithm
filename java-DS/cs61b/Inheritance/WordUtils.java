package cs61b.Inheritance;

import java.util.LinkedList;
import java.util.List;

public class WordUtils {

    public static void main(String[] args) {
//        SLList<String> sl1 = new SLList<>();
//
//        sl1.addFirst("Harry");
//        sl1.addLast("John");
//        sl1.add("Mary",1);
//        System.out.println(sl1.size());
//        sl1.printAll();


        LinkedList list1 = new LinkedList<>();
        list1.add(0,123);
        list1.addLast(2);
        list1.addFirst(10);

        System.out.println(list1);
    }

}
