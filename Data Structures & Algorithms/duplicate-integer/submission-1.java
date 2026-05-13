class Solution {
    public boolean hasDuplicate(int[] nums) {
        
         int ctr1=0;
         for(int i=0;i<nums.length-1;i++){
             int ctr=nums.length-1;
            while(ctr>=1+i){
          
                if(nums[i]==nums[ctr]){
                   ctr1++;
                }
                 ctr--;
            }
           
                
         }
         if(ctr1>0){
            return true;
         }
         else{
            return false;
         }
    }
}
