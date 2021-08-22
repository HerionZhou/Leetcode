package Algorithm.UnionFindSet;

public class UnionFindSet {
    private int[] rank;
    private int[] nodes;

    public UnionFindSet(int n){
        rank = new int[n];
        nodes = new int[n];
        for (int i = 0; i < nodes.length; i++) {
            nodes[i] = i;
            rank[i] = 1;
        }
    }

    public int find(int x){
        if (nodes[x] == x) return x;
        return nodes[x] = find(nodes[x]);
    }

    public void union(int a, int b){
        int rootA = find(a);
        int rootB = find(b);

        if (rootA == rootB) return;
        if (rank[rootA] > rank[rootB]){
            nodes[rootB] = rootA;
        } else if (rank[rootA] < rank[rootB]){
            nodes[rootA] = rootB;
        } else {
            nodes[rootA] = rootB;
            rank[rootB]++;
        }
    }
}
