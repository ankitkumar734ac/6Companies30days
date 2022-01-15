class Q13_BridgeEdgeInGraph{
    //Function to perform DFS on graph.
    void DFS(ArrayList<ArrayList<Integer>> adj, int v, boolean visited[]) 
    {
        //marking the current vertex as visited.
        visited[v] = true;
        
        //traversing over the adjacent vertices.
        for (int i = 0; i < adj.get(v).size(); ++i)
        
            //if any vertex is not visited, we call the function  
            //recursively for adjacent node.
            if (!visited[adj.get(v).get(i)])
                DFS(adj, adj.get(v).get(i), visited);
    }
    
    //Function to find whether graph is connected.
    boolean isConnected(ArrayList<ArrayList<Integer>> adj,int V,int one,int two)
    {
        //using boolean array to mark visited nodes and currently 
        //marking all the nodes as false.
        boolean visited[] = new boolean[V];
        
        //finding all reachable vertices from first vertex 
        //and marking them visited.
        DFS(adj, one, visited);
        
        //if second vertex is not visited, we return false else true.
        if (visited[two] == false)
            return false;
        return true;
    }
    
    //Function to find if the given edge is a bridge in graph.
    public int isBridge(int V, ArrayList<ArrayList<Integer>> adj,int c,int d) 
    {
        //if graph is not connected, we return false.
        if (!isConnected(adj, V, c, d))
            return 0;
        else
        {
            //we remove edge from undirected graph.
            adj.get(c).remove(new Integer(d));
            adj.get(d).remove(new Integer(c));
            
            //if graph is connected, we return false else true.
            if (isConnected(adj, V, c, d))
                return 0;
            else
                return 1;
        }
    }
}