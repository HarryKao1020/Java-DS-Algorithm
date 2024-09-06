package cs61b.L4L5L6L8;

public class SLList {
    public static class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int i ,IntNode n){
            item=i;
            next= n;
        }
    }
    private IntNode first;
    private int count = 0;
    public int size;
//    public SLList(int x) {
//        first = new IntNode(x,null);
//        size = 1;
//    }
    public SLList(){
        first = null;
        size=0;
    }

    public static void main(String[] args) {
        /* Create a List of one integer */
        SLList L = new SLList();
        L.addFirst(14);
        L.addFirst(65);
        L.addLast(10);
        L.addLast(20);
        L.addLast(68);
        L.addLast(30);
        System.out.println(L.getFirst());
        System.out.println(L.getLast());
        System.out.println(L.size());
        System.out.println("count:"+L.count());
    }

    public void addFirst(int x){
        first = new IntNode(x,first);
        size +=1;
    }

    public int getFirst(){
        return first.item;
    }

    public void addLast(int x){
        size+=1;

        IntNode p = first;

        if(p ==null){

            first = new IntNode(x,null);
            return;
        }
        while (p.next != null){
            System.out.println("p:"+p.item);
            System.out.println("count:"+count);
            count++;
            p = p.next;
        }
        p.next = new IntNode(x,null);

    }

    public int getLast(){
        IntNode p = first;
        while (p.next != null){
            p=p.next;
        }
        return p.item;
    }

    public int size(){
        return size;
    }

    public int count(){
        return count;
    }
//    public static int size(IntNode p){
//        if(p.next==null){
//            return 1;
//        }
//        return 1 + size(p.next);
//    }
}
