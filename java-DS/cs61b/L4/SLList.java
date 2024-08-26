package cs61b.L4;

public class SLList {
    private IntNode first;
    public SLList(int x) {
        first = new IntNode(x,null);
    }

    public static void main(String[] args) {
        /* Create a List of one integer */
        SLList L = new SLList(5);
        L.addFirst(14);
        L.addFirst(65);
        System.out.println(L.getFirst());
        System.out.println();
    }

    public void addFirst(int x){
        first = new IntNode(x,first);
    }

    public int getFirst(){
        return first.item;
    }


}
