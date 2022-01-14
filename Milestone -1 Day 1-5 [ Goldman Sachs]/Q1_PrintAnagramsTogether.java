public class Q1_PrintAnagramsTogether{
	public List<List<String>> Anagrams(String[] string_list) {
        List<List<String>> res=new ArrayList<>();
        HashMap<String,List<String>> hm=new HashMap<>();
        for(String s:string_list){
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String key=Arrays.toString(ch);
            if(hm.containsKey(key)){
                hm.get(key).add(s);
            }else{
                List<String> l=new ArrayList();
                l.add(s);
                hm.put(key,l);
            }
        }
        for(String s:hm.keySet()){
            res.add(hm.get(s));;
        }
        return res;
    }
    public static void main(String[] args) {
    	String[] words[] = {act,god,cat,dog,tac};
    	List<List<String>> res=Anagrams(words);
    }
}