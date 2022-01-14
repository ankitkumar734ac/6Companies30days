public class RunLengthEncoding_Q4{
	static String encode(String str){
          String res="";
          int count=1;
          int n=str.length();
          if(n==0)
           return res;
          for(int i=1;i<str.length();i++){
              if(str.charAt(i-1)==str.charAt(i)){
                  count++;
              }else{
                  String s=Character.toString(str.charAt(i-1));
                  res=res+s+count;
                  count=1;
              }
          }
          String s=Character.toString(str.charAt(n-1));
          res=res+s+count;
         
          return res;
	}

	public static void main(String[] args) {
		String str="wwwwaaadexxxxxx";
		System.out.println(encode(str));
	}
}