class Solution {
    public int majorityElement(int[] nums) {
        int element=-1;
        int count=0;

        for(int i=0;i<nums.length;i++){
            if(count==0){
                element=nums[i];
            }
            if(element==nums[i]){
                count++;
            }
            else{
                count--;
            }
        }

        return element;

        //Question Says that You may assume that the majority element always exists in the array.
        //But if need to check if element exist or not we need to do below step but as it says it always exists than it would be element finded above

        // for(int i=0;i<nums.length;i++){
        //     int count1=0;
        //     if(nums[i]==element){
        //         count1++;
        //     }
        // }
        // if(count1>nums.length/2){
        //     return element;
        // }

    }
}