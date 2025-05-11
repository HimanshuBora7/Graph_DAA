import java.util.ArrayList;

public class dfs {
    public static void main (String [] args ){
     //define the number of vertices 
     int V = 5;
     //creating adjacency list for graph 
     ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
     for(int i=0;i < V ; i++){
     adj.add(new ArrayList<>());
     }
     adj.get(0).add(1);
     adj.get(0).add(2);
     adj.get(1).add(3);
     adj.get(2).add(4);

     //calling the dfs function and printing the result
     ArrayList<Integer> dfsTraversal = dfsofgraph(V,adj);
     System.out.println("dfs Traversal " + dfsTraversal);



    }
    public static void dfsT(int node , boolean vis [],ArrayList<ArrayList<Integer>>adj,ArrayList<Integer> ls ){
        //marking visited node as visited
        vis[node] = true;
        ls.add(node);

        for(int it : adj.get(node)){
            if(vis[it] == false){
                dfsT(it,vis,adj,ls);
            }
        }
        
    }
    //function to perform dfs traversal of the graph 

    public static  ArrayList<Integer> dfsofgraph(int V, ArrayList<ArrayList<Integer>>adj){
        boolean vis [] = new boolean[V];
        ArrayList<Integer> result = new ArrayList<>();
        dfsT(0,vis,adj,result);
        return result; 
    }
}
