class Q11_GenerateBinaryNumbers{
	static ArrayList<String> generate(int n)
    {
        ArrayList<String> res = new ArrayList<>(); 
        Queue<String> q = new ArrayDeque<>(); 
        q.add("1");
        int count = 0;
        
        while(q.size() > 0){
            String rem = q.remove(); 
            res.add(rem); 
            count++; 
            if(count == n) return res; 
            q.add(rem + "0"); 
            q.add(rem + "1"); 
        }
         return res; 
    }
    
}