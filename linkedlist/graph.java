import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class graph {
    private int V;
    private int E;
    private LinkedList<Integer>[]adj;
    public graph(int nodes){
        this.V=nodes;
        this.E=0;
        this.adj=new LinkedList[nodes];
        for(int v=0;v<V;v++){
            adj[v]=new LinkedList<>();
        }
    }

    public static void main(String[] args) {
        graph g=new graph(5);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(2, 3);
        g.addEdge(3, 0);
        g.addEdge(2, 4);
        g.bfs(0);
        System.out.println();
        g.dfs(0);
        System.out.println();
        g.dfss();

    }
    public void dfss(){
        boolean visited[]=new boolean[V];
        for(int v=0;v<V;v++){
            if(!visited[v]){
                dfss(v,visited);
            }
        }
    }
    public void dfss(int v,boolean visited[]){
        visited[v]=true;
        System.out.print(v+" ");
        for(int w:adj[v]){
            if(!visited[w]){
                dfss(w,visited);
            }

        }
    }

    public void addEdge(int u,int v){
        adj[u].add(v);
        adj[v].add(u);
        E++;
    }


    public  void bfs(int s){
    Queue<Integer>q=new LinkedList<>();
    boolean visited[]=new boolean[V];
    visited[s]=true;
    q.offer(s);
    while(!q.isEmpty()){
        int u=q.poll();
        System.out.print(u+" ");
        for(int v:adj[u]){
            if(!visited[v]){
                visited[v]=true;
                q.offer(v);
            }
        }
    }
}
public void dfs(int s){
    Stack<Integer>st=new Stack<>();
    boolean visited[]=new boolean[V];
    st.push(s);
    while(!st.isEmpty()){
        int u=st.pop();
        if(!visited[u]){
            visited[u]=true;
            System.out.print(u+" ");
            for(int v:adj[u]){
                if(!visited[v]){
                    st.push(v);
                }
            }
        }
    }


}
}
