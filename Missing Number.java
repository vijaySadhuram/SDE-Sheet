class Solution {
    public int missingNumber(int[] nums) {
    int n=nums.length;
        int sum=0;
        for(int i=0;i<=n;i++){
        sum=sum^i;
    }
        int xor=0;
        for(int i=0;i<n;i++){
        xor=xor^nums[i];
    }
        return sum^xor;
        
        
    }
}