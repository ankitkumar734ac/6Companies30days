class Q9_CountNumberOfSubTreesHavingGivenSum{
	 int count;
    private int subTreeSum(Node root, int X){
        if(root==null) return 0;
        int sum = root.data + subTreeSum(root.left, X) + subTreeSum(root.right, X);
        if(sum==X) count++;
        return sum;
    }
    
    //Function to count number of subtrees having sum equal to given sum.
    int countSubtreesWithSumX(Node root, int X)
    {
	//Add your code here.
	    count = 0;
	    subTreeSum(root, X);
	    return count;
    }
}