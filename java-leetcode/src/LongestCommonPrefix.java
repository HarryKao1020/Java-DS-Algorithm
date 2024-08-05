public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0)return "";
        // 要取每個字有沒有相同前綴,所以直接拿第一個字的當前綴
        String prefix = strs[0];
        String a = prefix.substring(0,prefix.length()-2);
        String ans = "";
        for(int i =1;i<strs.length;i++){
            while(strs[i]==prefix.substring(0, prefix.length()-i)){
                ans= prefix.substring(0, prefix.length()-i);
            }
            return ans;
        }
        return "";
    }

    public static String harryLongestCommonPrefix(String[] strs) {
        if(strs==null||strs.length==0)return "";
        for(int i =0;i<strs.length;i++){
            System.out.println(strs[i]);
        }
        return "Hello";
    }

    public static void main(String[] args) {
        String[] strs = {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(strs));
    }
}
