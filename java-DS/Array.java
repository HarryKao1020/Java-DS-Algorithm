import java.util.*;

public class Array {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println("Max value :" + findMax(array));

        System.out.println("Min value :" + findMin(array));

        reverseArray(array);
        System.out.println("Reverse Array:"+Arrays.toString(array));

        String[] message = {"hello","world","leetcode"};
        HashMap<String , Integer> banned = new HashMap<>();
        banned.put("a",1);

        List<String> bannedWords = new LinkedList<>();
        bannedWords.add("Leetcode");
        System.out.print(bannedWords.contains("Leetcode"));

    }

    private static int findMax(int[] array) {
        int max = array[0];
        for(int value: array){
            if (value>max){
                max=value;
            }
        }
        return max;
    }

    private static int findMin(int[] array){
        int min = array[0];
        for(int value : array){
            if (value < min){
                min =value;
            }
        }
        return min;
    }

    private static void reverseArray(int[] array){
        int left =0 ,right = array.length -1;
        while(left < right){
            int temp = array[left];
            array[left] = array[right];
            array[right] = temp;
            left++;
            right--;
        }
    }
}
