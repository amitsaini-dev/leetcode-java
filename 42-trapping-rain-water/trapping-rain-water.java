class Solution {
    public int trap(int[] height) {
        //Need at least 3 bar to trap water 
        if(height.length<3) return 0;
        
        //Declared Auxiliary arrays to to store max height to the left and right of each bar
        int leftMax[]=new int[height.length];
        int rightMax[]=new int[height.length];
        
        //trappedWater initialized to 0
        int trappedWater=0;
        
        //Loop to compute left max boundary array
        leftMax[0]=height[0];
        for(int i=1;i<height.length;i++){
            leftMax[i]=Math.max(leftMax[i-1],height[i]);
        }

        //Loop to compute Right max boundary array
        rightMax[rightMax.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            rightMax[i]=Math.max(rightMax[i+1],height[i]);
        }

        //Main forumla to calculate traped water = Min(leftB,RightB)- barHeight 
        for(int i=0;i<height.length;i++){
            trappedWater+=((Math.min(leftMax[i],rightMax[i]))-height[i]);
        }
        return trappedWater;
    }
}