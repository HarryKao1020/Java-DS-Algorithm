package cs61b.L4L5L6L8;

public class DLList {
    public static class IntNode{
        public IntNode prevNode;
        public int val;
        public IntNode nextNode;
        public IntNode(int x,IntNode prev,IntNode next){
            val = x;
            prevNode = prev;
            nextNode = next;
        }
    }

    // declared size
    private int size;
    public int size(){
        return size;
    }
    // declared sentinel
    private IntNode sentinel;

    public void add(int x){

    }

    public static void main(String[] args) {

    }

}
