class Solution {
    public int maxSubArray(int[] nums) {
        int csum=0;
        int msum=Integer.MIN_VALUE;
    for(int i=0;i<nums.length;i++)
    {
        int temp = csum+nums[i];
        if(temp<nums[i])
        {
            csum=nums[i];
        }
        else
        {
            csum=temp;
        }
        if(msum<csum)
    {
        msum=csum;
    }
    }
    
    return msum;
    }
}