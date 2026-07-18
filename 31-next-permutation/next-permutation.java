class Solution {
    public void nextPermutation(int[] nums) {
        int idx=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                idx=i;
                break;
            }
        }

        if(idx==-1){
            int i=0;
            int j=nums.length-1;
            while(i<j){
                int temp=nums[i];
                nums[i]=nums[j];
                nums[j]=temp;
                i++;
                j--;
            }
            return;
        }

        for(int j=nums.length-1;j>idx;j--){
            if(nums[j]>nums[idx]){
                int temp=nums[idx];
                nums[idx]=nums[j];
                nums[j]=temp;
                break;
            }
        }

        int left=idx+1;
        int right=nums.length-1;
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            right--;
            left++;
        }
    }
}