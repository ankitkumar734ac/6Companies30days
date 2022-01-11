class Q12_ColumnNameFromGivenColumnNumber{
	String colName (long n){
        StringBuffer sb=new StringBuffer();
        while(n>0){
            sb.append(charOf(n%26));
            n=(n-1)/26;
        }
        sb.reverse();
        return(sb.toString());
    }
    public char charOf(long val){
        if(val==0)
            return('Z');
        else
            return((char)(64+val));
            
    }
}