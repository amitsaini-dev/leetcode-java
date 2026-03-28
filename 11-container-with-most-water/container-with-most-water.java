class Solution {
    public int maxArea(int[] height) {
        int low=0 , high=height.length-1;
        int maxWater=0;
        while(low<high){
            int width=high-low;
            int minHeight=Math.min(height[low],height[high]);
            int currWater=minHeight*width;
            maxWater=Math.max(maxWater,currWater);
            
            if(height[low]<height[high]){
                low++;
            }
            else{
                high--;
            }
        }   
        return maxWater;
    }
}