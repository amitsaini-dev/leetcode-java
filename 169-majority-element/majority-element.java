class Solution {
    public int majorityElement(int[] nums) {
        int candidate=nums[0];
        int vote=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==candidate){
                vote++;
            }else if(nums[i]!=candidate && vote>0){
                vote--;
            }else{
                candidate=nums[i];
                vote=1;
            }
        }
        return candidate;
    }
}