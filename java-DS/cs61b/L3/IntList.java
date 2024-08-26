package cs61b.L3;

import java.util.ArrayList;
import java.util.List;

public class IntList {
    public int first;
    public IntList rest;

    // constructor
    public IntList(int f,IntList r){
        first=f;
        rest = r;
    }

    public int size(){
        if(rest ==null){
            return 1;
        }
        return 1+ this.rest.size();
    }

    public int iterativeSize(){
        IntList p = this;
        int totalSize = 0;
        while (p != null) {
            totalSize += 1;
            p = p.rest;
        }
        return totalSize;
    }
    public int get(int i){
        if(i==0){
            return first;
        }else if(i > this.size()-1){
            return 0;
        }
        return rest.get(i-1);

    }
    public static void main(String[] args) {
        IntList L = new IntList(5,null);
        L.rest = new IntList(10,null);
        L.rest.rest = new IntList(15,null);
        L.rest.rest.rest = new IntList(20,null);
        System.out.println(L.size());
        List<Integer> a = new ArrayList<>();
        a.add(1);
        System.out.println(L.get(3));

    }
}
