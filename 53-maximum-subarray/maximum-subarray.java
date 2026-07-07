class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        int currSum=0;

        //To print subarray

        // int start=-1;
        // int ansStart=-1;
        // int ansEnd=-1;

        for(int i=0;i<nums.length;i++){
            // if(currSum==0) start=i;
            currSum+=nums[i];
            if(currSum>maxSum){
                maxSum=currSum;
                // ansStart=start;
                // ansEnd=i;
            }
            if(currSum<0){
                currSum=0;
            }   
        }
        return maxSum;
    }
}