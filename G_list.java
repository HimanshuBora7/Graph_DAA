//using adjacency list to store graph
//basic idea here is to store neighbours of every node 
//so suppouse we have n nodes so we make list of n arrays n feed every node's neighbour 

import java.util.*;



public class G_list {
public static void main (String [] args ){
  int n =3,m=3; //3 nodes with 3 edge 

  //making array list 

  ArrayList<ArrayList<Integer>>adj = new ArrayList<ArrayList<Integer>>();

  //now we make n+1 
  for(int i = 0 ; i<= n+1 ;i++){
    adj.add(new ArrayList<Integer>());
  }
  //now we have edge b/w 1, 2 

  adj.get(1).add(2);
  adj.get(2).add(1);
  //and so on 

  //printing all the edges 
   for(int i =1 ;i <=n;i++){
    for(int j = 0 ;j<adj.get(i).size();j++ ){
        System.out.print(adj.get(i).get(j) + " ");
    }
    System.out.println();
   }
}    
}
