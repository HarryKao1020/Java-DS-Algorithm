package cs61b.L12;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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


    // object methods
//    @Override
//    public String toString(){
//        String returnString = "{";
//        for(int i = 0;i<size-1;i+=1){
//            System.out.println(i);
//            returnString += items[i].toString();
//            returnString += ", ";
//        }
//        returnString += items[size-1];
//        returnString +="}";
//        return returnString;
//    }
    /*
    @Override
    public String toString(){
        StringBuilder  returnSB= new StringBuilder("{");
        for(int i =0 ; i< size-1;i+=1){
            returnSB.append(items[i].toString());
            returnSB.append(", ");
        }
        returnSB.append(items[size-1]);
        returnSB.append("}");
        return returnSB.toString();
    }

     */

    @Override
    public String toString(){
        List<String> listOfItems = new ArrayList<>();
        for(T x:this){
            listOfItems.add(x.toString());
        }
        return "{" + String.join(",",listOfItems) +"}";

    }

    public static <Glerp >ArraySet<Glerp> of(Glerp... stuff){
        ArraySet<Glerp> returnSet = new ArraySet<>();
        for(Glerp x : stuff){
            returnSet.add(x);
        }
        return returnSet;
    }
    @Override
    public boolean equals(Object other){
        if(other ==null){
            return false;
        }
        if(other.getClass() != this.getClass()){
            return false;
        }
       ArraySet<T> o =  (ArraySet<T>) other;
       if(o.getSize() != this.getSize()){
           return false;
       }
       for(T item:this){
           if(!o.contains(item)){
               return false;
           }
       }
       return true;
    }
}
