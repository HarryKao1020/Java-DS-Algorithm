package unitTest;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0 ; i<nums.length;i++){
            int complement =  target-nums[i];
            if(map.containsKey(nums[i])){
                return new int[] {map.get(nums[i]),i};
            }
            map.put(complement,i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {1,3,2,5,6};
        int target = 8;

        TwoSum test = new TwoSum();
        int[] result = test.twoSum(nums,target);
        System.out.println(Arrays.toString(result));
    }
}


// int[] nums = {1,3,2,5,6} , target= 9;
// int complement = target - nums[i]
// 9-1 = 8 , map.put(key: 1 , value : i )  --> map:{1,0}
// 9-3 = 6 , map.put(key: 3, value: i ) --> map:{3,1}
// ....
// 9-6 = 3 , if(map.containsKey(6)) return (map.value,i)