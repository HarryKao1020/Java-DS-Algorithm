package cs61b.L4L5L6L8;

public class ArrayList {

    int[] items;
    int size;

    public ArrayList(){
        items = new int[100];
        size = 0;
    }

    public void increSize(){
        int capacity = items.length*2;
        int[] newArray = new int[capacity];
        // arraycopy(來源array,來源的起頭位置,目標array,目標的起頭位置，要複製的長度)
        System.arraycopy(items,0,newArray,0,size);
        items = newArray;

    }
    public void addLast(int val){
//  此寫法如果超過100會出現ArrayIndexOutOfBoundsException
//        items[size] = val;
//        size = size+1;

//  採用擴充size的方式,當新增的數量等於size時,將size擴增成兩倍
        if(size == items.length){
            increSize();
        }
        items[size] = val;
        size = size+1;

    }

    // getLast
    public int getLast(){
        return items[size-1];
    }

    public int get(int pos){
        return items[pos];
    }

    public int removeLast(){
        int removeVal = items[size-1];
        size = size -1;
        return removeVal;
    }


    public int size(){
        return size;
    }
    public static void main(String[] args) {
        ArrayList aList1 = new ArrayList();
        for(int i =0;i<101;i++){
            aList1.addLast(i);
        }


        aList1.removeLast();
        System.out.println(aList1.getLast());
    }
}
