package JavaBasicDS.Graph;

import java.util.List;

public interface Graph {

    // 加一條邊(帶權重)
    void addEdge(int from,int to,int weight);

    // 刪除一條邊
    void removeEdge(int from , int to);

    // 判斷兩個節點是否相鄰
    boolean hasEdge(int from , int to);

    // 返回一條邊的權重
    int weight(int from,int to);

    // 返回某個節點的所有鄰結點跟對應權重
    List<Edge> neightbors(int v);

//    // 返回節點總數
//    int size();
}
