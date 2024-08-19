package cs61b.L3;

import java.util.Arrays;

public class Lecture3_Reference_Recursion_Lists {
    public static double average(double a, double b){
        a=30;
        return (a+b)/2;
    }

    public static class Walrus{
        public int weight;
        public double tuskSize;

        public Walrus(int w,double ts){
            weight = w;
            tuskSize = ts;
        }
    }

    //IntList
    public static class IntList{
        public int first;
        public IntList rest;
    }


    public static void main(String[] args){
        System.out.println("Lecture3 - Reference,Recursion and Lists");
        double x = 35.5;
        double y = 60.3;
        // 這裡傳遞到average的x,y是x,y的副本 並非原變數
        System.out.println(average(x,y));

        System.out.println("x="+x);


//      walrus_b跟walrus_a 是相同的物件參考
        Walrus walrus_a = new Walrus(3500,13.5);
        Walrus walrus_b;
        walrus_b = walrus_a;
        walrus_b.weight=3000;
        System.out.println("walrus_a weight:"+walrus_a.weight);

        // array
        int[] a = new int[10];
    }
}
