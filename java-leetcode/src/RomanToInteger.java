import java.util.HashMap;
import java.util.Map;


public class RomanToInteger {
    public static void  main(String[] args) {

        System.out.println(romanToInt("LVIII"));


    }
    public static int romanToInt(String s) {
        //      Best Solution
        Map<Character,Integer> map  = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

       int ans=0;
       for(int i =0 ; i<s.length();i++){
           if(i<s.length()-1 && map.get(s.charAt(i))<map.get(s.charAt(i+1))){
               ans-=map.get(s.charAt(i));
           }else {
               ans+=map.get(s.charAt(i));
           }
       }
       return ans;

//    自己的第一次寫法
//        HashMap<String,Integer>roman =new HashMap<>();
//        roman.put("I",1);
//        roman.put("V",5);
//        roman.put("X",10);
//        roman.put("L",50);
//        roman.put("C",100);
//        roman.put("D",500);
//        roman.put("M",1000);
//
//        String[] characters = s.split("");
//        System.out.println(characters.length);
//        int sum = 0;
//        try {
//
//            for (int i = 0; i < characters.length; i++) {
//                String currentChar = characters[i];
//                String nextChar = "";
//                if(!(i==characters.length-1)) {
//                    nextChar = characters[i + 1];
//                }
//                if(!(roman.get(nextChar)==null)){
//                    if (roman.get(nextChar) > roman.get(currentChar)) {
//                        sum += roman.get(nextChar) - roman.get(currentChar);
//                        i++;
//                    } else {
//                        sum += roman.get(currentChar);
//                        System.out.println("I:"+i);
//                        System.out.println("sum:"+sum);
//                    }
//                }else{
//                    sum += roman.get(currentChar);
//                }
//
//            }
//
//        }catch (ArrayIndexOutOfBoundsException e) {
//            // 捕獲異常並處理
//            System.out.println("Caught an ArrayIndexOutOfBoundsException.");
//            System.out.println("Invalid index accessed: " + e.getMessage());
//
//        }
//        return sum;







    }
}
