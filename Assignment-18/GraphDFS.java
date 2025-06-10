import java.util.*;

public class GraphDFS {
    public List<Integer> dfsTraversal(int V, List<List<Integer>> adj) {
        List<Integer> dfs = new ArrayList<>();
        boolean[] visited = new boolean[V];
        dfsHelper(0, adj, visited, dfs);
        return dfs;
    }

    private void dfsHelper(int node, List<List<Integer>> adj, boolean[] visited, List<Integer> dfs) {
        visited[node] = true;
        dfs.add(node);

        for (int neighbor : adj.get(node)) {
            if (!visited[neighbor]) {
                dfsHelper(neighbor, adj, visited, dfs);
            }
        }
    }

    public static void main(String[] args) {
        GraphDFS graph = new GraphDFS();
        int V = 5;
        List<List<Integer>> adj = new ArrayList<>();
        adj.add(Arrays.asList(1, 2));       
        adj.add(Arrays.asList(0, 2));       
        adj.add(Arrays.asList(0, 1, 3, 4)); 
        adj.add(Arrays.asList(2));          
        adj.add(Arrays.asList(2));          

        List<Integer> dfsResult = graph.dfsTraversal(V, adj);
        System.out.println("DFS Traversal: " + dfsResult);
    }
}
