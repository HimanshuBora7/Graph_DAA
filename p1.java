public class p1 {
    public static void main (String [] args ){
       //input will be given us in the form of n and m where n represents nodes and m represents vertices
       int n = 4;//nodes 
       int m = 5;//vertices 
       //so in first step we are using adjacency matrix so we will create a 2D matrix of n+1 x n+1 
       //coz we are assuming that 1 based indexing has has heppend there       
       int adjmat [] [] = new int[n+1][n+1];
       //now we got m lines representing edge so we have to manually enter 1 at that position 
       // and we have to do vice versa also as this is undirected graph here 
       //suppose we are give u,v so we put 1 at adjmat[u][v] and adjmat[v][u] also 
     
       //for 1 , 2
       adjmat[1][2] = 1;
       adjmat[2][1] = 1;

       adjmat[1][3] = 1;
       adjmat[3][1] = 1;

       adjmat[2][4] = 1;
       adjmat[4][2] = 1;

       adjmat[3][4] = 1;
       adjmat[4][3] = 1;

    }
}
//but this method has a limitation that it occupies O(n^2) of space 