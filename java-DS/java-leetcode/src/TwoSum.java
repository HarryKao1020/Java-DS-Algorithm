import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0;i<nums.length;i++){
            int complement = target-nums[i];
            if(map.containsKey(nums[i])){
                return new int[] {map.get(nums[i]),i};
            }
            map.put(complement,i);
        }
        throw new RuntimeException("No two sum solution");
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,16};
        int target = 23;
        int [] result = twoSum(nums,target);
        System.out.println("Index1:"+result[0]+",Index2:"+result[1]);
    }
}
