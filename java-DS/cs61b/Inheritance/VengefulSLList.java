package cs61b.Inheritance;

public class VengefulSLList<Item> extends SLList<Item>{
    private SLList<Item> deletedItems;
    public VengefulSLList(){
        deletedItems = new SLList<Item>();
    }

    // 改寫removeLast 因為我們removeLast要把remove的東西存在一個新的List紀錄
    @Override
    public Item removeLast(){
        Item oldBack = super.removeLast();
        deletedItems.addLast(oldBack);
        return oldBack;
    }

    public void  printLostItems(){
        deletedItems.printAll();
    }

    public static void main(String[] args) {
        VengefulSLList<Integer> vs1 = new VengefulSLList<>();
        vs1.addLast(1);
        vs1.addLast(5);
        vs1.addLast(10);
        vs1.addLast(30);
        vs1.addLast(35);

        vs1.removeLast();
        vs1.removeLast();
        for (int i =0 ;i<vs1.size();i++){
            System.out.println(vs1.get(i));
        }

        vs1.printLostItems();
    }
}
