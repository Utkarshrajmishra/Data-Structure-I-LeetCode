class Solution {
    public int maxProfit(int[] prices) {
                 int min=0;
        int maxprofit=0;
        int minprofit=0;
         min=prices[0];
        for(int i=0;i<prices.length;i++)
        {
            if(min>prices[i])
            {
                min=prices[i];
            }
            minprofit=prices[i]-min;
            if(minprofit>maxprofit)
            {
                maxprofit=minprofit;
            }
        }
        return maxprofit; 
    }
}
