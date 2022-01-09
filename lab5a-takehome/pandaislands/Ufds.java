public class Ufds {
    int[] rank;
    int[] parent;
    int numNodes; 
    // UFDS Constructor
    public Ufds(int x) {
        this.numNodes = x;
        this.rank = new int[numNodes + 1];
        this.parent = new int[numNodes + 1];
        for (int i = 1; i <= numNodes; i++) {
            parent[i] = i;
        }
    }
    public int findSet(int x) {
        if (parent[x] == x) return x;
        parent[x] = findSet(parent[x]);
        return parent[x];
    }
    
    public boolean isSameSet(int x, int y) { return findSet(x) == findSet(y); }
    
    public void unionSet(int x, int y) {
        if (!isSameSet(x, y)) {
            int i = findSet(x);
            int j = findSet(y);
            if (rank[i] > rank[j]) {
                parent[j] = i;
            } else {
                parent[i] = j;
                if (rank[i] == rank[j]) {
                    rank[j]++;
                }
            }
    
        }
    }
}