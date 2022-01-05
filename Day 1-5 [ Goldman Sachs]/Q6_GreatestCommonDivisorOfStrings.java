class Q6_GreatestCommonDivisorOfStrings{
	public String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2 + str1)){
            return "";
        }
        
        else if(str1.equals(str2)){
            return str1;
        }
        
        else if(str1.length() > str2.length()){
            // remove str2 from str1
            return gcdOfStrings(str1.substring(str2.length()) , str2);
        }
        else{
            // remove str1 from str2
            return gcdOfStrings(str2.substring(str1.length()) , str1);
        }
    }
}