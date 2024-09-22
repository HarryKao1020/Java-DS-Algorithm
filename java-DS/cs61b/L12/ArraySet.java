package cs61b.L12;


import java.util.Iterator;

public class ArraySet<T> implements Iterable<T>{

    private  T[] items;
    private int size;
    public ArraySet(){
        items = (T[]) new Object[100];
        size = 0;
    }

    public boolean contains(T x){
        for(int i = 0 ; i< size ;i++){
            if(items[i]==x){
                return true;
            }
        }
        return false;
    }
    public void add(T x){
        if( x == null){
            throw new IllegalArgumentException("You can't add null to an ArraySet.");
        }
        if(!contains(x)){
            items[size] = x ;
            size+=1;
        }
    }

    public int getSize(){
        return size;
    }

    public T getIndex(int x){
        return items[x];
    }

    // ===== Iterator ===========
    public Iterator<T> iterator(){
        return new ArraySetIterator();
    }
    private class ArraySetIterator implements Iterator<T>{
        private int wizPos;

        public ArraySetIterator(){
            wizPos=0;
        }

        public boolean hasNext(){
            return wizPos < size;
        }

        public T next(){
            T returnItem = items[wizPos];
            wizPos+=1;
            return  returnItem;
        }
    }
}
