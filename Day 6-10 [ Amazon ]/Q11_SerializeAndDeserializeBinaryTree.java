/*Complete the given function
Node is as follows:
class Tree{
	int data;
	Tree left,right;
	Tree(int d){
		data=d;
		left=right=null;
	}
}*/

class Q11_SerializeAndDeserializeBinaryTree{
    //Function to serialize a tree and return a list containing nodes of tree.
	public void serialize(Node root, ArrayList<Integer> arr) 
	{
	    if(root==null){
	        arr.add(-1);
	        return;
	    }
	    arr.add(root.data);
	    serialize(root.left,arr);
	    serialize(root.right,arr);
	}
	int index=0;
	//Function to deserialize a list and construct the tree.
    public Node deSerialize(ArrayList<Integer> arr)
    {
        if(index==arr.size())
            return null;
        int val=arr.get(index);
        index++;
        if(val==-1){
            return null;
        }
        Node root=new Node(val);
        root.left=deSerialize(arr);
        root.right=deSerialize(arr);
        return root;
    }
}