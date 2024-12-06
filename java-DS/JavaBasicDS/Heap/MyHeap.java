package JavaBasicDS.Heap;

import java.util.*;

public class MyHeap{
    int left(int i){
        return 2*1 +1;
    }

    int right(int i ){
        return 2 * i +2 ;
    }

    int parent(int i){
        return (i-1)/2;
    }

    // example , 有一顆maxHeap樹
    // [9,8,6,6,7,5,2,1,4,3,6,2]
    //            9
//            /       \
//            8        6
//           / \      /  \
//          6   7    5    2
//         / \  /\   /
//        1  4  3 6  2




}
