package JavaBasicDS.HashTable;

import java.util.HashMap;
import java.util.Map;

public class Hash_Map {
    public static void main(String[] args) {

        Map<Integer ,String> studentMap = new HashMap<>();
        studentMap.put(10001,"Marry");
        studentMap.put(10002,"Jerry");
        studentMap.put(10003,"John");

        System.out.println(studentMap.get(10003));
        System.out.println(studentMap.remove(10003));
        System.out.println(studentMap.entrySet());
        // 走訪key - value
        for(Map.Entry<Integer ,String> kv : studentMap.entrySet()){
            System.out.println(kv.getKey() + " --> " + kv.getValue());
        }


        // 走訪key
        for(int key :studentMap.keySet()){
            System.out.println(key);
        }
        //  走訪value
        for(String value : studentMap.values()){
            System.out.println(value);
        }
    }
}
