class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length<=1){
            return nums.length;
        }
        int prev=0;
        int next=1;

        while(next<nums.length){
            if(nums[prev]==nums[next]){
                next++;
            }else{
                prev++;
                int temp=nums[next];
                nums[next]=nums[prev];
                nums[prev]=temp;
                next++;
            }
        }
        return prev+1;
    }
}