class Solution {
    public int maxProduct(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }

        int minProd = nums[0];
        int maxProd = nums[0];
        int ans = nums[0];

        for (int i = 1; i < nums.length; i++) {
             if (nums[i] == 0) {
                ans = Math.max(ans, 0);
                minProd = 0;
                maxProd = 0;
                continue;
            }
            if(nums[i]<0){
                int temp=maxProd;
                maxProd=minProd;
                minProd=temp;
            }
            maxProd=Math.max(nums[i],nums[i]*maxProd);
            minProd=Math.min(nums[i],nums[i]*minProd);
            ans=Math.max(ans,maxProd);
        }
        return ans;
    }
}
