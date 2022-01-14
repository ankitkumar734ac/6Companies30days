class Q14_BurningTree{
	/*class Node {
    	int data;
    	Node left;
    	Node right;
    
    	Node(int data) {
    		this.data = data;
    		left = null;
    		right = null;
    	}
    }*/
    static int timer;
    public static int minTime(Node root, int target) {
        ArrayList<Node> path=new ArrayList<>();
        timer=0;
        int burntime=0;
        rootPath(root,target,path);
        for(int i=0;i<path.size();i++){
            Node node=path.get(i);
            Node block=i>0?path.get(i-1):null;
            BurnTree(node,block,burntime);
            burntime++;
        }
        return timer;
        
    }
    public static void BurnTree(Node node , Node block , int btime){
        
        if(node == null) return;
        
        timer= Math.max(timer , btime);
        
        if(node.left != block) BurnTree(node.left , block , btime + 1);
        if(node.right != block) BurnTree(node.right , block , btime + 1);
        
    }
    public static boolean rootPath(Node node , int target , ArrayList<Node> path){
        
        if(node == null) return false;
        
        if(node.data == target){
            path.add(node);
            return true;
        }
        
        boolean L = rootPath(node.left , target , path);
        boolean R = rootPath(node.right , target , path);
        
        if( L|| R){
            path.add(node);
            return true;
        }
        
        return false;
    }
}