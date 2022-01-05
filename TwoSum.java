class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum=0;
        int ar[]=new int[2];
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                sum=nums[i]+nums[j];
                if(sum==target)
                {
                    ar[0]=i;
                    ar[1]=j;
                }
            }
        }
        return ar;
    }
}
