class Solution {
    public int reverse(int x) {
      long  sum=0L;
        while(x!=0)
        {
           int r=x%10;
            sum=sum*10+r;
            x=x/10;
        }
        //123
        //sum=3; r=2,3*10+3=33
        if( sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE)
                return 0;
        if(x<0){
            return (int)(-sum);
        }
        return (int)sum;
    }
}