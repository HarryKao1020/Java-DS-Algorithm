package cs61b.L4L5L6L8;

/*
    Single Linked List :
    一開始設計只有一個sentinel ,addLast(),getLast的速度較慢,BigO(n)
    解決方法是: 多新增一個tail node的pointer,去記錄最後一個,這樣就變成BigO(1)

    Dobluy Linked List:
    -  解決SSList的removeLast(),remove(Node)速率慢的問題
    -  訪問節點跟

*/

public class SLListSentinel {
    private static class IntNode{
        public int item;
        public IntNode next;
        public IntNode(int x, IntNode nextNode){
            item =x;
            next = nextNode;
        }
    }

    // 改善addLast, getLast 時間太久的問題
    // 多加一個tail node記錄最後一個
    private IntNode tail;
    private IntNode sentinel;
    private int size;


    //constructor
    public SLListSentinel(){
        // 0可以換成任何數字 因為不重要
        sentinel = new IntNode(0,null);
        tail = new IntNode(88,null);
        size =0;

    }


    // addFirst , sentinel is not first that is sentinel.next
    public void addFirst(int x){
        if(sentinel.next == null){
            sentinel.next = new IntNode(x,null);
            tail.next = new IntNode(x,null);
        }else{
            sentinel.next = new IntNode(x,sentinel.next);
        }

        size = size+1;
    }
    public int getFirst(){
        return sentinel.next.item;
    }

//  addLast 的 BigO 是 n
    public void addLast(int num){

        // 舊方法 效率低
//        size+=1;
//        IntNode p = sentinel;
//
//        //遍歷所有item
//        while (p.next != null){
//            p= p.next;
//        }
//        IntNode lastNode = new IntNode(num,null);
//        p.next = lastNode;

        // 新方法效率高

        IntNode lastNode = new IntNode(num,null);
        if(sentinel.next ==null){
            sentinel.next = lastNode;
            tail.next = lastNode;
        }else{
            tail.next = lastNode;
        }
        size++;



    }

    public int getLast(){
        // 舊的方法 效率低
//        IntNode p = sentinel;
//        while(p.next != null){
//            p = p.next;
//        }
//        return p.item;

        //新方法變成BigO(1)

        return tail.next.item;
    }
    public int size(){
        return size;
    }





    public static void main(String[] args) {
        SLListSentinel L1 = new SLListSentinel();
        L1.addFirst(5);
        L1.addFirst(10);
        L1.addFirst(15);
        L1.addLast(20);
        L1.addLast(30);
        L1.addLast(40);
        System.out.println(L1.getFirst());
        System.out.println(L1.getLast());
        System.out.println(L1.size());
    }


}
