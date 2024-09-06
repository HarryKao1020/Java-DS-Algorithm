package cs61b.L4L5L6L8;

public class SLListSentinel {
    public static class IntNode{
        public int item;
        public IntNode next;
        public IntNode(int x, IntNode nextNode){
            item =x;
            next = nextNode;
        }
    }
    private IntNode sentinel;
    private int size;
    public SLListSentinel(int x){
        sentinel = new IntNode(0,null);
        sentinel.next = new IntNode(x,null);
        size=1;
    }

    public SLListSentinel(){
        sentinel = new IntNode(0,null);
        size=0;
    }

    public void addLast(int num){
        size+=1;
        IntNode p = sentinel;

        while (p.next != null){
            p= p.next;
        }
        

        IntNode lastNode = new IntNode(num,null);
        p.next = lastNode;
    }

    public int size(){
        return size;
    }

    public static void main(String[] args) {
        SLListSentinel L1 = new SLListSentinel(5);
        L1.addLast(19);
        L1.addLast(30);
        System.out.println(L1);
        System.out.println(L1.size);
    }
}
