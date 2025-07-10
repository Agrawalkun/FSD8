package DSA;
import java.util.*;

public class toposort {
    static class Edge{ // without object kisi ko call krna ho to static use krenge
        int src,dest;
        Edge(int s,int d){
           this.src = s;
           this.dest = d;
        }
    }

    public class TopologicalSorting{
        
    }
    public static void createGraph(ArrayList<Edge> graph[]){ // main me creategraph method ko without object call kr liya tha isiliye yha static lagaya. 
        for(int i = 0;i<graph.length;i++){
            graph[i] = new ArrayList<>();
        }
        // creation of graph;
        graph[5].add(new Edge(5,2));
        graph[5].add(new Edge(5,0));
        graph[2].add(new Edge(2,3));
        graph[3].add(new Edge(3,1));
        graph[4].add(new Edge(4,0));
        graph[4].add(new Edge(4,1));
    }
    // TOPOSORT
    public static void toposort(ArrayList<Edge> graph[]) {
        Stack<Integer> s = new Stack<>();
        boolean [] vis = new boolean[graph.length];
         for(int i =0;i<graph.length;i++){
            if(!vis[i]){
                dfs(graph,i,vis,s);
            }
         }
         while(!s.isEmpty()){
            System.out.println(s.pop());
         }

        
    }
     public static void dfs(ArrayList<Edge> graph[],int curr, boolean[]vis, Stack<Integer>s) {
        // if(vis[curr]) return;
        // System.out.println( curr+" ");
        vis[curr] = true;
        for(int i =0; i<graph[curr].size();i++){ // finding the neighbour of node
            Edge e = graph[curr].get(i);
            if(!vis[e.dest]){
                dfs(graph,e.dest,vis,s);

            }
        }
        s.push(curr);
    }
 // DFS
 public static void DFS(ArrayList<Edge> graph[],int curr, boolean[]vis) {
    if(vis[curr]) return;
    System.out.println( curr+" ");
    vis[curr] = true;
    for(int i =0; i<graph[curr].size();i++){ // finding the neighbour of node
        Edge e = graph[curr].get(i);
        DFS(graph,e.dest,vis);

    }
}
    public static void main(String[] args) {
        int v = 6 ;
        ArrayList<Edge> graph[] = new ArrayList[v];
        createGraph(graph);
        System.out.println("DFS");
        DFS(graph,5,new boolean[v]);
        System.out.println("TOPOSORT");
        toposort(graph);
    }
}
