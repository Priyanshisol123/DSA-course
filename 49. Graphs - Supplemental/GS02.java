//Bridge In Graph
import java.util.*;
public class GS02 {
    static class Edge{
        int src;
        int dest;

        public Edge(int src, int dest) {
            this.src = src;
            this.dest = dest;
        }
    }
    
    public static void createGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new Edge(0, 2));
        graph[0].add(new Edge(0, 3));

        graph[1].add(new Edge(1, 0));

        graph[2].add(new Edge(2, 1));

        graph[3].add(new Edge(3, 4));
    }

    public static void dfs(ArrayList<Edge> graph[], int curr,int par,
            int dt[], int low[],boolean visited[], int time) {
        visited[curr] = true;
        dt[curr]=low[curr]=++time; 

        // neighbours
        for (int i = 0; i < graph[curr].size(); i++) {
            Edge e = graph[curr].get(i);//e.src---e.dest
            int neigh=e.dest;
            if(neigh==par){
                continue;
            }
            else if (!visited[neigh]) {
                dfs(graph,neigh,curr,dt,low, visited,time);
                low[curr]=Math.min(low[curr],low[neigh]);
                if(dt[curr]<low[neigh]){
                    System.out.println("Bridge="+curr+"----"+neigh);
                }
            }else{
                low[curr]=Math.min(low[curr],dt[neigh]);
            }
        }
    }

    public static void tarjanBridge(ArrayList<Edge> graph[], int V) {
        int dt[]=new int[V];
        int low[]=new int[V];
        int time=0;
        boolean visited[]=new boolean[V];

        for(int i=0;i<V;i++){
            if(!visited[i]){
                dfs(graph,i,-1,dt,low,visited,time);
            }
        }
    }

    public static void main(String args[]) {
        int V = 5;

        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];
        createGraph(graph);
        tarjanBridge(graph, V);

    }
}