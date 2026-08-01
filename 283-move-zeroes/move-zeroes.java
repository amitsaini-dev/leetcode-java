class Solution {
    public void moveZeroes(int[] nums) {
        int i=0;
        int j=1;
        
        while(i<nums.length-1 && j<nums.length){
            if(nums[i]==0 && nums[j]!=0){
                nums[i]=nums[j];
                nums[j]=0;
                j++;
                i++;
            }
            else if(nums[i]!=0){
                j++;
                i++;
            }else{
                j++;
            }
        }
    }
}