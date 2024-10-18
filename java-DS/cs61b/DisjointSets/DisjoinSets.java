package cs61b.DisjointSets;

public interface DisjoinSets {
    public void connect(int p, int q);

    public boolean isConnected(int p , int q);
}
