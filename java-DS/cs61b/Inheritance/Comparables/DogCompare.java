package cs61b.Inheritance.Comparables;

/*
 * 為了讓所有的物件都能夠支援大於的符號，換句話說，可以比較大小，此時就需要介面（interface）的幫忙。
 * 首先將想要比較的類別繼承一個介面 OurComparable，
 * 該介面擁有一個 compareTo 的函數，令繼承該介面的子類別都需要實現比較物件的方法，
 * 並回傳一個整數為 0、1、-1，分別代表等於、大於、小於三種不同個狀況。
 *
 * */
public class DogCompare implements OurComparable{
    private String name;
    private int size;

    public void bark(){
        System.out.println(name + " says : bark!");
    }

    public DogCompare(String name, int size){
        this.name = name;
        this.size = size;
    }

    @Override
    public int compareTo(Object o) {
        DogCompare uddaDog = (DogCompare) o;
        if(this.size < uddaDog.size){
            return -1;
        }else if(this.size == uddaDog.size){
            return 0;
        }
        return 1;
    }


}
