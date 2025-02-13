package JavaBasicDS.Graph;

import java.util.ArrayList;
import java.util.List;

public class WeightedDigraph implements Graph {


    private List<Edge>[] graph;
    public WeightedDigraph(int n){
        graph = new List[n];
        for(int i =0;i<n ;i++){
            graph[i] = new ArrayList<>();
        }
    }

    // 增
    @Override
    public void addEdge(int from, int to ,int weight){
        graph[from].add(new Edge(to,weight));
    }

    // 刪除邊,刪除一條有向的邊,複雜度O(V)
    @Override
    public void removeEdge(int from, int to) {
        for(int i =0 ; i< graph[from].size();i++){
            if(graph[from].get(i).to ==to){
                graph[from].remove(i);
                break;
            }
        }
    }

    // 查 , 判斷兩個節點是否相鄰
    @Override
    public boolean hasEdge(int from, int to) {
        for(Edge e : graph[from]){
            if(e.to == to){
                return true;
            }
        }
        return false;
    }

    @Override
    public int weight(int from, int to) {
        for(Edge e : graph[from]){
            if(e.to == to){
                return e.weight;
            }
        }
        throw new IllegalArgumentException("No such edge");
    }

    @Override
    public List<Edge> neightbors(int v) {
        return graph[v];
    }

    public static void main(String[] args) {
        WeightedDigraph graph = new WeightedDigraph(3);
        graph.addEdge(0,1,1);
        graph.addEdge(1,2,2);
        graph.addEdge(2,0,3);
        graph.addEdge(2,1,4);

        System.out.println(graph.hasEdge(0,2));
        System.out.println(graph.hasEdge(0,1));

        graph.neightbors(2).forEach(edge -> {
            System.out.println(2 + " -> " + edge.to + ", wight: " + edge.weight);
        });

        graph.removeEdge(0, 1);
        System.out.println(graph.hasEdge(0, 1)); // false
    }


}
