package cs61b.L4L5L6L8;

public class Array {
    public static void main(String[] args) {
        int[] x = new int[3];
        int[] y = new int[]{1,2,3,4,5};
        int[] z = {6,7,8,9,20};
        System.out.println(x[0]); // result : 0
        System.out.println(x[1]); // result : 0
        System.out.println(x[2]); // result : 0

        Integer[] list1 = new Integer[5];
        Integer[] list2 = new Integer[5];
        for(int i = 0;i<list1.length;i++){
            list1[i] = i;
            System.out.println(list1[i]);
        }

        for(int j = 0 ; j<list2.length;j++){
            list2[j] = j*j;
        }
        int pos = 0;
        Integer[] list_result = new Integer[10];
        
    }
}
