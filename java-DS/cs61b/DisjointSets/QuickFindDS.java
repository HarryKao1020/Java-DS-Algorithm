package cs61b.DisjointSets;

public class QuickFindDS implements DisjointSets{
    private int[] id;

    public QuickFindDS(int n){
        id = new int[n];
        for(int i = 0;i<n ;i++){
            id[i] = i;
        }
    }
    @Override
    public void connect(int p, int q){
        int pid = id[p];
        int qid = id[q];
        for(int i = 0; i<id.length;i++){
            if(id[i] == pid){
                id[i] = qid;
            }
        }
        id[p] = id[q];
    }

    @Override
    public boolean isConnected(int p , int q){
        return id[p] == id[q];
    }


    public static void main(String[] args) {
        QuickFindDS ds_1 = new QuickFindDS(5);
        ds_1.connect(0,1);
        ds_1.connect(1,2);
        System.out.println(ds_1.isConnected(0,2));
        ds_1.connect(30,20);
        System.out.println(ds_1.isConnected(0,20));

    }

}
