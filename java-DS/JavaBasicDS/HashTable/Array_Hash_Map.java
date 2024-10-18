package JavaBasicDS.HashTable;

import java.util.ArrayList;
import java.util.List;

class Pair {
    public int key;
    public String val;

    public Pair(int key, String val){
        this.key = key;
        this.val = val;
    }
}
/* 基於陣列實現的雜湊表 */
class ArrayHashMap{
    private List<Pair> buckets;
    public ArrayHashMap(){
        buckets = new ArrayList<>();
        // 初始化陣列，包含 100 個桶,100是自己設定
        for(int i =0 ;i<100; i++){
            buckets.add(null);
        }
    }

    // 雜湊函式 , 算出key ,對應的bucket index
    private int hashFunc(int key){
        int index = key % 100;

        return index;
    }

    public String get(int key){
        int index = hashFunc(key);
        Pair pair = buckets.get(index);
        if(pair==null){
            return null;
        }
        System.out.println(pair.val);
        return pair.val;
    }

    // 新增一個pair物件
    public void put(int key,String val){
        Pair pair = new Pair(key,val);
        int index = hashFunc(key);
        buckets.set(index,pair);
    }

    public void remove(int key){
        int index = hashFunc(key);
        buckets.set(index,null);
    }

    public List<Pair> entrySet(){
        List<Pair> pairSet = new ArrayList<>();
        for(Pair pair : buckets){
            if(pair!=null){
                pairSet.add(pair);
                System.out.println(pair.key + ":" + pair.val);
            }
        }

        return pairSet;
    }

    public List<Integer> keySet(){
        List<Integer> keyList = new ArrayList<>();
        for(Pair pair : buckets){
            if(pair!=null){
                keyList.add(pair.key);
                System.out.println(pair.key);
            }
        }
        return keyList;
    }

    public List<String> values(){
        List<String> values = new ArrayList<>();
        for(Pair pair : buckets){
            if(pair!=null){
                values.add(pair.val);
                System.out.println(pair.val);
            }
        }
        return values;
    }
}


public class Array_Hash_Map {
    public static void main(String[] args) {
        ArrayHashMap hashMap1 = new ArrayHashMap();
        hashMap1.put(1,"Apple");
        hashMap1.put(2,"Banana");
        hashMap1.put(3,"Lemon");
        hashMap1.entrySet();
        hashMap1.keySet();
        hashMap1.values();

        int num = 999999;
        System.out.println(Integer.hashCode(num));

        boolean bol = true;
        System.out.println(Boolean.hashCode(bol));


    }
}
