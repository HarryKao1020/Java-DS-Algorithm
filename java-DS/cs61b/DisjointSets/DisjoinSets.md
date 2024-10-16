# DisjoinSets
1. isConnected(x, y) 判斷兩個數字是否有關聯
2. connect(x, y) 將兩個沒有關係的數字建立關聯

```java
public interface DisjoinSets {
    
	/* Connects two items p and q. */
	void connect(int p, int q);
	
	
	/* Check to see if two items are connected */
	boolean isConnected(int p ,int q);


}

public class QuickFindDS implements DisjointSets {
    private int[] id;

    public QuickFindDS(int n) {
        id = new int[n];
        for (int i = 0; i < n; i++) {
            id[i] = i;
        }
    }

    @Override
    public void connect(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) {
                id[i] = qid;
            }
        }
        id[p] = id[q];
    }

    @Override
    public boolean isConnected(int p, int q) {
        return id[p] == id[q];
    }


    public static void main(String[] args) {
        QuickFindDS ds_1 = new QuickFindDS(5);
        ds_1.connect(0, 1);
        ds_1.connect(1, 2);
        System.out.println(ds_1.isConnected(0, 2));


    }
}
```

- n : 一個Set的元素數量 , 可以是無限大
- id : 存放對應元素的id,n如果是10, id[]就是0~10
- connect : 連結兩個元素, p跟q要小於n, 比較p,q大小,把比較小的id改成大的id
- isConnected: 判斷是不是同個id

### 時間複雜度
- connect:O(n) ,因為連結兩個元素最糟情況就是遍歷所有n
- isConnected : O(1):只需訪問兩個元素的id各一次