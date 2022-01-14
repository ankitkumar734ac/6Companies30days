class Q7_FirstNon-RepeatingCharacterInAStream{
	public String FirstNonRepeating(String A)
    {
        StringBuilder sb=new StringBuilder();
        int isRepet[]=new int[26];
        Deque<Character> queue=new ArrayDeque<>();
        for(int i=0;i<A.length();i++){
            char ch=A.charAt(i);
            if(isRepet[ch-'a']==0)
               queue.add(ch);
            
            isRepet[ch-'a']++;
            while(!queue.isEmpty() && isRepet[queue.peek()-'a']!=1)
               queue.poll();
            sb.append(queue.isEmpty() ? '#' : queue.peek());
        }
        return sb.toString();
        
    }
}