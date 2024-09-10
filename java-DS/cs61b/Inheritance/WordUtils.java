package cs61b.Inheritance;

public class WordUtils {

    public static void main(String[] args) {
        SLList<String> sl1 = new SLList<>();

        sl1.addFirst("Harry");
        sl1.addLast("John");
        sl1.add("Mary",1);
        System.out.println(sl1.size());
        sl1.printAll();
    }

}
