class Solution {
    public int trap(int[] height) {
        int leftMaxB[]=new int[height.length];
        int rightMaxB[]=new int[height.length];
        leftMaxB[0]=height[0];
        rightMaxB[height.length-1]=height[height.length-1];

        for(int i=1;i<height.length;i++){
            leftMaxB[i]=Math.max(leftMaxB[i-1],height[i]);
        }
        for(int i=height.length-2;i>=0;i--){
            rightMaxB[i]=Math.max(rightMaxB[i+1],height[i]);
        }
        int totalTrappedWater=0;
        for(int i=0;i<height.length;i++){
            int waterLevel=Math.min(leftMaxB[i],rightMaxB[i]);
            totalTrappedWater+=waterLevel-height[i];
        }
        return totalTrappedWater;
    }
}