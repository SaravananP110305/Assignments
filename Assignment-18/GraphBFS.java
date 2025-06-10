import java.util.*;

public class GraphBFS {
    public List<Integer> bfsTraversal(int V, List<List<Integer>> adj) {
        List<Integer> bfs = new ArrayList<>();
        boolean[] visited = new boolean[V];
        Queue<Integer> queue = new LinkedList<>();

        queue.add(0);
        visited[0] = true;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            bfs.add(node);

            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    queue.add(neighbor);
                    visited[neighbor] = true;
                }
            }
        }

        return bfs;
    }

    public static void main(String[] args) {
        GraphBFS graph = new GraphBFS();
        int V = 5;
        List<List<Integer>> adj = new ArrayList<>();
        adj.add(Arrays.asList(1, 2));       
        adj.add(Arrays.asList(0, 2, 3));    
        adj.add(Arrays.asList(0, 1, 4));    
        adj.add(Arrays.asList(1, 4));       
        adj.add(Arrays.asList(2, 3));       

        List<Integer> bfsResult = graph.bfsTraversal(V, adj);
        System.out.println("BFS Traversal: " + bfsResult);
    }
}
