import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PalindromeNumber {


    public static void  main(String[] args) {
        Solution s1 = new Solution();
        System.out.println(s1.isPalindrome(2147483647));
    }
}
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        long targetNum=0;
        long temp = x;
        while (temp > 0){
            int digit = (int)temp%10;
            targetNum=targetNum*10+digit;
            temp/=10;
        }
        return (targetNum==x);



    }
}
