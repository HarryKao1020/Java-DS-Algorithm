package JavaBasicDS.MultiwayTrees;

import java.util.ArrayList;
import java.util.List;

public class DFSPermutation {
    public static List<String> generatePermutationsDFS(char[] arr,int length){
        List<String> result = new ArrayList<>();
        dfs(arr,length,new StringBuilder(), result);
        return result;
    }

    public static void dfs(char[] arr,int remaining,StringBuilder current,List<String> result){
        // 終止條件：已選擇足夠的元素
        if(remaining ==0){
            result.add(current.toString());
            return;
        }
        // 遍歷所有可能的選擇
        for(char c : arr){
            current.append(c); // 選擇當前元素
            dfs(arr,remaining-1,current,result);// 遞迴到下一層
            // 進到下一層如果是第三層 remain = 0 , 他會return,然後再往下那行跑,去把aaa的尾巴去掉,變成aa,這樣就可回溯到第二層,然後再跑到dfs到aab,再刪掉b回溯到aa,再往下...
            current.deleteCharAt(current.length()-1);// 撤銷選擇（回溯）
        }

    }

    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c'};
        int length = 3;

        List<String> result = generatePermutationsDFS(arr, length);

        System.out.println("DFS生成的所有排列組合:");
        for (String s : result) {
            System.out.println(s);
        }
        System.out.println("總共有 " + result.size() + " 種組合");
    }
}
