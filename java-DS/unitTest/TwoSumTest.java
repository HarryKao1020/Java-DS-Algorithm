//package unitTest;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class TwoSumTest {
//
//    @Test
//    void testExampleCase(){
//        TwoSum twoSum = new TwoSum();
//        int[] nums = {2, 7, 11, 15};
//        int target = 9;
//        int[] result = twoSum.twoSum(nums, target);
//
//        assertArrayEquals(new int[]{0, 1}, result, "The indices should be [0, 1]");
//    }
//
//    @Test
//    void testNegativeNumbers(){
//        TwoSum twoSum = new TwoSum();
//        int[] nums = {-3,1,3,4,90};
//        int target = 0;
//        int[] result = twoSum.twoSum(nums, target);
//
//        assertArrayEquals(new int[]{0,2},result, "The indices should be [0, 2]");
//    }
//
//    @Test
//    void testSinglePair(){
//        TwoSum twoSum = new TwoSum();
//        int[] nums = {3, 3};
//        int target = 6;
//        int[] result = twoSum.twoSum(nums, target);
//        assertArrayEquals(new int[]{0, 1}, result, "The indices should be [0, 1]");
//    }
//    @Test
//    void testLargeNumbers() {
//        TwoSum twoSum = new TwoSum();
//        int[] nums = {1000000, 3000, -1000, 7000};
//        int target = 7003;
//        int[] result = twoSum.twoSum(nums, target);
//        assertArrayEquals(new int[]{1, 3}, result, "The indices should be [1, 3]");
//    }
//
//    @Test
//    void testNoSolution() {
//        TwoSum twoSum = new TwoSum();
//        int[] nums = {1, 2, 3, 4};
//        int target = 10;
//
//        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
//            twoSum.twoSum(nums, target);
//        });
//        assertEquals("No two sum solution", exception.getMessage());
//    }
//
//
//
//}
