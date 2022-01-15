class 
{
	    static int minSteps(int D){
       int target = Math.abs(D), sum = 0, step = 0;
       
       while(sum < target || (sum-target)%2 != 0)
       {
           step++;
           sum += step;
       }
       return step;
   
    }

}