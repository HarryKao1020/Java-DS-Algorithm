package cs61b.Inheritance;

public class ALList<Item> implements List61B<Item> {
    private Item[] items;
    private int size;

    public ALList() {
        items = (Item[]) new Object[100]; // 初始容量
        size = 0;
    }

    private void resize(int capacity) {
        Item[] newArray = (Item[]) new Object[capacity];
        System.arraycopy(items, 0, newArray, 0, size);
        items = newArray;
    }

    @Override
    public void add(Item x, int pos) {
        if (size == items.length) resize(size * 2);
        System.arraycopy(items, pos, items, pos + 1, size - pos);
        items[pos] = x;
        size++;
    }

    @Override
    public Item get(int pos) {
        return items[pos];
    }

    @Override
    public void addFirst(Item x) {
        add(x, 0);
    }

    @Override
    public void addLast(Item x) {
        if (size == items.length) resize(size * 2);
        items[size] = x;
        size++;
    }

    @Override
    public Item getFirst() {
        return items[0];
    }

    @Override
    public Item getLast() {
        return items[size - 1];
    }

    @Override
    public Item remove(int pos) {
        Item removedItem = items[pos];
        System.arraycopy(items, pos + 1, items, pos, size - pos - 1);
        size--;
        return removedItem;
    }

    @Override
    public Item removeLast() {
        return remove(size - 1);
    }

    @Override
    public int size() {
        return size;
    }
}
