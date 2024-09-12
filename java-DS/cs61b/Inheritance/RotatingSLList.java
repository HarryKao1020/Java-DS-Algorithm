package cs61b.Inheritance;

public class RotatingSLList<Item> extends SLList<Item>{

    public void rotateRight(){
        Item x= removeLast();
        addFirst(x);
    }

    public static void main(String[] args) {
        RotatingSLList<Integer> rL1 = new RotatingSLList<Integer>();
        rL1.addFirst(3);
        rL1.addFirst(2);
        rL1.addFirst(1);
        rL1.rotateRight();
        System.out.println(rL1.get(0));

    }
}
