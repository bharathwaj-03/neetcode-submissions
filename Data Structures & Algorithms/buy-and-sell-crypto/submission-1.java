class Solution {
    public int maxProfit(int[] prices) {
        int base=prices[0];
        int max=0;
        for(int i=1;i<prices.length;i++){
           if(base>prices[i]){
            base=prices[i];
           }
           max=Math.max(max,prices[i]-base);
        }
        return max;
        
    }
}
