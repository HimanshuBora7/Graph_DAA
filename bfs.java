
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//here we are doing traversal of graph using bfs which is breadth first search or level wise search 
//here we go on traversing the nodes , level by level 
//and we assume that graph is represented using adjacency matrix
//the logic is simple we take  a queue which follows FIFO rule that is First In First Out
// in queue we feed the current node ,it is initialized with starting node which will be given to us
//and we have a visted array also whose maximum size is maximum node value +1 
//it is used to mark visited node as visited node are marked as 1 and non visited as zero
//we take out our element from queue and store its neighbour in it by analysing adjanceny matrix 
//n we repeat this step till we get all node visited  



public class bfs {
    public static void main (String []args ){

    }
    
    
}

class solution{
    public ArrayList<Integer> bfsofGraph(int V,ArrayList<ArrayList<Integer>> adj){
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean vis [] = new boolean[V];
        Queue < Integer > q = new LinkedList<>();

        q.add(0);
        vis[0] =true;

        while(!q.isEmpty()){
            Integer node = q.poll();
            bfs.add(node);

            for(Integer it : adj.get(node)){
                if(vis[it] == false){
                    vis[it] = true;
                    q.add(it);
                }
            }
        }
        return bfs;
    }
}
