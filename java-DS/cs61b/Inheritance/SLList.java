package cs61b.Inheritance;

public class SLList<Item> implements List61B<Item> {
    private class Node {
        Item item;
        Node next;

        Node(Item i, Node n) {
            item = i;
            next = n;
        }
    }

    private Node first;
    private Node last;
    private int size;

    public SLList() {
        first = null;
        last = null;
        size = 0;
    }

    @Override
    public void add(Item x, int pos) {
        if (pos == 0) {
            addFirst(x);
            return;
        }
        Node prev = first;
        for (int i = 0; i < pos - 1; i++) {
            prev = prev.next;
        }
        Node newNode = new Node(x, prev.next);
        prev.next = newNode;
        if (newNode.next == null) {
            last = newNode;
        }
        size++;
    }

    @Override
    public Item get(int pos) {
        Node current = first;
        for (int i = 0; i < pos; i++) {
            current = current.next;
        }
        return current.item;
    }

    @Override
    public void addFirst(Item x) {
        first = new Node(x, first);
        if (last == null) {
            last = first;
        }
        size++;
    }

    @Override
    public void addLast(Item x) {
        Node newNode = new Node(x, null);
        if (last == null) {
            first = last = newNode;
        } else {
            last.next = newNode;
            last = newNode;
        }
        size++;
    }

    @Override
    public Item getFirst() {
        return first.item;
    }

    @Override
    public Item getLast() {
        return last.item;
    }

    @Override
    public Item remove(int pos) {
        if (pos == 0) {
            Item removedItem = first.item;
            first = first.next;
            if (first == null) last = null;
            size--;
            return removedItem;
        }
        Node prev = first;
        for (int i = 0; i < pos - 1; i++) {
            prev = prev.next;
        }
        Item removedItem = prev.next.item;
        prev.next = prev.next.next;
        if (prev.next == null) last = prev;
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