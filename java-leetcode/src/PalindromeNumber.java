import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PalindromeNumber {


    public static void  main(String[] args) {
        Solution s1 = new Solution();
        System.out.println(s1.isPalindrome(2332));
    }
}
class Solution {
    public boolean isPalindrome(int x) {
        String integerString = Integer.toString(x);
        String[] parts = integerString.split("");
        int left = 0;
        int right = parts.length;

        while (left<right){
            if (parts[left] == parts[right]){
                left+=1;
                right-=1;

            }else{
                return false;
            }
            return true;
        }
        return false;
    }
}
