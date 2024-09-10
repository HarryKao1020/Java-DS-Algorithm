package cs61b.Inheritance;

public interface List61B<ItemType> {
    public void add(ItemType x,int position);
    public void addFirst(ItemType x);
    public void addLast(ItemType x);
    public ItemType getFirst();
    public ItemType getLast();
    public ItemType removeLast();
    public ItemType remove(int pos);
    public ItemType get(int pos);
    public int size();

    default public void printAll(){
        for(int i =0;i< size();i++){
            System.out.printf(get(i) + " ");
        }
        System.out.println();
    }
}
