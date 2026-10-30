class Solution {
    public int trap(int[] height) {
        int LMB[]=new int[height.length];
        int RMB[]=new int[height.length];

        RMB[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            RMB[i]=Math.max(RMB[i+1],height[i]);
        }

        LMB[0]=height[0];
        for(int i=1;i<height.length;i++){
            LMB[i]=Math.max(LMB[i-1],height[i]);
        }

        int trapWater=0;

        for(int i=0;i<height.length;i++){
            int boundary=Math.min(LMB[i],RMB[i]);
            trapWater+=boundary-height[i];
        }
        return trapWater;
    }
}