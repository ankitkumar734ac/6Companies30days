class Q8_ConnectNodesAtSameLevel{
	public void connect(Node root)
    {
        //creating queue for level order traversal of tree.
        Queue<Node> q = new LinkedList<>(); 
        q.add(root);
        
        //prev holds the value of previous node on the particular level.
        Node prev=null;
        
        //end will hold value of last node of a level
        //and nextend will store the same for the next level.
        Node end = root;
        Node nextend = null;
        
        while(!q.isEmpty())
        {
            //storing the front element of queue in temp and popping it.
            Node temp = q.peek();
            q.poll();
            
            //storing all available nodes in queue and updating nextend.
            if(temp.left!=null) 
            {
                q.add(temp.left); 
                nextend = temp.left;
            }
            if(temp.right!=null)
            {
                q.add(temp.right); 
                nextend = temp.right; 
            }
          
            //setting nextRight of previous node of that level.
            if(prev!=null) 
            prev.nextRight = temp;
           
            //if we reach the end of a level, we set nextRight of the 
            //current node and prev to NULL.
            if(temp == end)
            {
                temp.nextRight = null;
                prev = null;
                //we also set the value of end for next level.
                end = nextend;
            }
            //else we set prev to current node temp.
            else 
            prev = temp;
        }
    }
}