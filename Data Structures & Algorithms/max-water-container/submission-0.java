class Solution {
    public int maxArea(int[] heights) {
        int n=heights.length;
        int curTotal=0,max=0;
        int l=0,r=n-1;
        int lmax=heights[l],rmax=heights[r];

        while(l<r){
          if(lmax<=rmax){
            curTotal=(r-l)*lmax;
            max=Math.max(max,curTotal);
            l++;
            lmax=heights[l];
          } else{
             curTotal=(r-l)*rmax;
            max=Math.max(max,curTotal);
            r--;
            rmax=heights[r];

          }

        }
        return max;
        
    }
}
