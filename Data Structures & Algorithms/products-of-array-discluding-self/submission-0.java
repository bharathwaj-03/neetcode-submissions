class Solution {
    public int[] productExceptSelf(int[] nums) {
        int [] ans= new int [nums.length];
        ans[0]=1;

        int n=nums.length;
        for(int i=1;i<n;i++){
            ans[i]=nums[i-1]*ans[i-1];
        }

        int R=1;
        for(int j=n-1;j>=0;j--){
            ans[j]=ans[j]*R;
            R*=nums[j];
        }

        return ans;
        
    }
}  
