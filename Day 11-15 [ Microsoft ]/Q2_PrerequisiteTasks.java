class Q2_PrerequisiteTasks{
	 public void make_graph(int N ,int [][] prerequisites, ArrayList<HashSet<Integer>>  graph){
        for(int i=0;i<prerequisites.length;i++){
            graph.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
    }
    boolean dfs_cycle(ArrayList<HashSet<Integer>>  graph, int node, int[] onpath, int[] visited) {
        
        if (visited[node]==1) return false;
        
        onpath[node] = 1; visited[node] = 1;
        
        for (Integer neigh : graph.get(node))
            if (onpath[neigh] == 1 || dfs_cycle(graph, neigh, onpath, visited) )
                return true;
        onpath[node] = 0;
        return false;
    }
    public boolean isPossible(int N, int[][] prerequisites)
    {
        // Your Code goes here
        ArrayList<HashSet<Integer>>  graph = new  ArrayList<HashSet<Integer>>();
        for(int i=0;i<N;i++){
            graph.add(new HashSet<Integer>());
        }
        make_graph(N,prerequisites,graph);
        int[] vis = new int[N];
        int[] onpath = new int[N];
        
        for(int i=0;i<N;i++){
            if(vis[i] == 0 && dfs_cycle(graph,i,onpath,vis)) return false;
        }
        return true;
        
    }
}