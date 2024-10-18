package cs61b.DisjointSets;

public class QuickUnionDS implements DisjoinSets{
    private int[] parent;

    // Constructor
    public QuickUnionDS(int n){
        parent = new int[n];
        for(int i =0 ; i<n ; i++){
            parent[i] = -1; // init每個元素都是parent , 所以是-1
        }
    }

    // find 找到set的root
    public int find(int p){
        while (parent[p] >=0){
            p = parent[p];
        }
        return p;
    }

    /*
    example:
    DS = [{0,1,2,4},{3,6}]
    find:4
    int p = 4
    parent[4] = 0
    0 >= 0 true
    p = 0
    return p

     */

    @Override
    public void connect(int p, int q){
        int p_parent = find(p);
        int q_parent = find(q);
        System.out.println("p parent:"+p_parent);
        System.out.println("q parent:"+q_parent);
        parent[q_parent] = p_parent;
    }

    @Override
    public boolean isConnected(int p , int q){
        return find(p) == find(q);
    }

    public int[] getParent() {
        int i = 0;
        while(i<parent.length){
            System.out.println(parent[i]);
            i++;
        }
        return parent;
    }

    public static void main(String[] args) {
        QuickUnionDS quickUnionDS = new QuickUnionDS(7);

        quickUnionDS.connect(0,1);
        quickUnionDS.connect(1,2);
        quickUnionDS.connect(0,4);

        quickUnionDS.connect(3,6);
        quickUnionDS.connect(4,6);
        quickUnionDS.getParent();
    }
}
