class Solution {
    public int maxSubArray(int[] nums) {
         int min=0;
            int  max=nums[0];
            for(int i=0;i<nums.length;i++)
            {
                    min+=nums[i];
                    if(min>max)
                    {
                            max=min;
                    }
                    if(min<0)
                    {
                            min=0;
                    }
                    
            }
            return max;
    }
}
