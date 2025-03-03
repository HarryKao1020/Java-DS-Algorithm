package JavaBasicDS.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {

    public static void bubbleSort(int[] list){
        int n = list.length;
        Boolean swapped;

        for(int i = 0 ; i < n - 1 ; i++){
            swapped = false;
            for(int j  = 0 ; j < n -i - 1 ; j++){
                if (list[j] > list[j+1]){
                    int temp  = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }

        }
    }
    public static void main(String[] args) {
        int[] list = {64,34,25,12,22,11,90};

        bubbleSort(list);
        System.out.println(Arrays.toString(list));

    }
}
