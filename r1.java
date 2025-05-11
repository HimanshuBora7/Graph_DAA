import java.util.ArrayList;

public class r1 {
    public static void main(String[] args) {
        // Define the number of vertices
        int V = 5;

        // Create the adjacency list for the graph
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Add edges to the graph (example graph)
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(3);
        adj.get(2).add(4);

        // Call the DFS method and print the result
        ArrayList<Integer> dfsTraversal = dfsofgraph(V, adj);
        System.out.println("DFS Traversal: " + dfsTraversal);
    }

    // Utility function for DFS traversal
    public static void dfsT(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ls) {
        // Mark the current node as visited
        vis[node] = true;
        ls.add(node);

        // Traverse all adjacent nodes
        for (int neighbor : adj.get(node)) {
            if (!vis[neighbor]) {
                dfsT(neighbor, vis, adj, ls); // Recursive call for unvisited nodes
            }
        }
    }

    // Function to perform DFS traversal of the graph
    public static ArrayList<Integer> dfsofgraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V]; // Visited array to track visited nodes
        ArrayList<Integer> result = new ArrayList<>(); // List to store DFS traversal

        // Perform DFS starting from node 0
        dfsT(0, vis, adj, result);

        return result;
    }
}