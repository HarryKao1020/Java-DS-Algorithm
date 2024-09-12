package cs61b.Inheritance.HigherOrderFunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class HigherOrderFunctionTest {
    public static void main(String[] args) {
        String text = "hello";

        // 一般方法使用
        String upperText  = toUpperCase(text);
        System.out.println(upperText);


        // 使用lambda表達式
        String upperText2 = transform(text, s -> s.toUpperCase());
        System.out.println(upperText2);


        // 使用lambda表達式
        int num = 5;
        int squared = modifyNumber(num, n -> n*n);
        System.out.println(squared);


        // 使用高階函數 map , filter , forEach
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6);
        numbers.stream().map(n -> n *2).filter(n -> n>5).forEach(System.out::println);

        //獲取一個將數字兩倍的函數
        Function<Integer,Integer> doubleFunction = createFunction("double");
        System.out.println(doubleFunction.apply(5));
        //獲取一個將數字平方的函數
        Function<Integer,Integer> squareFunction = createFunction("square");
        System.out.println(squareFunction.apply(10));


    }

    //把字串轉成大寫的方法
    public static String toUpperCase(String inputText){
        return inputText.toUpperCase();
    }

    // 高階函數
    public static String transform(String inputTxt , Function<String,String> function){
        return function.apply(inputTxt);
    }

    // 數字的高階函數
    public static int modifyNumber(int inputNum , Function<Integer,Integer> operation){
        return operation.apply(inputNum);
    }

    public static Function<Integer,Integer> createFunction(String type){
        if(type.equals("double")){
            return n -> n*2; //返回數字加倍的函數
        }else if(type.equals("square")){
            return  n -> n * n; // 返回將數字平方的函數
        }else{
            return n -> n; // 無匹配返回原數字
        }
    }


}
