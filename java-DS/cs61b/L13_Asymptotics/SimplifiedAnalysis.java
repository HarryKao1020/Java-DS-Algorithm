package cs61b.L13_Asymptotics;

public class SimplifiedAnalysis {
    /*
        Question : 如何判斷一個『已排序』的整數數列,是否存在重複整數的問題
        List : [-6,-3,0,1,2,2,6,8]
    */

    //解法1:遍歷陣列中所有整數,找出當前與所有後續整數的所有組合,判斷陣列是否存在重複的整數
    public static boolean dup1(int[] A){
        for(int i =0;i< A.length ;i++){
            for(int j = i+1 ; j<A.length; j++){
                if(A[i] == A[j]) return true;
            }
        }
        return false;
    }

    //解法2:因為陣列已經先排序過了,由小到大,所以只需要判斷當前數跟他下一個數是否相同即可
    public static boolean dup2(int[] A){
        for(int i=0;i<A.length-1;i++){
            if(A[i]==A[i+1]){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,8,9,10,11,12,13,15,16,18,19,20,21,22,23,24,25,26,27,28,29,30};

        long startTime = System.nanoTime();

        // 執行想要測量的 method

        //System.out.println(dup1(a)); // 104667 nanoseconds
        System.out.println(dup2(a)); // 96291 nanoseconds
        long endTime = System.nanoTime();
        long runtime = endTime - startTime;

        System.out.println("Method runtime: " + runtime + " nanoseconds");

    }
}
