class Solution {
    public int trap(int[] height) {
        int total=0;
        int n=height.length;
        int lmax=0,rmax=0,l=0,r=n-1;

        while(l<r){
            if(height[l]<=height[r]){
                if(lmax>height[l]){
                    total+=lmax-height[l];
                    l++;
                }else{
                    lmax=height[l];
                    l++;
                }
            } else{
                if(rmax>height[r]){
                    total+=rmax-height[r];
                    r--;
                } else{
                    rmax=height[r];
                    r--;
                }
            }
        }
        return total;
    }
}
