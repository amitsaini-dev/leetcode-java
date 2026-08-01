class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        if (k==0) return;
        int i=0;
        int j=nums.length-1;
        while(i<j){
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }

        int left=0;
        int right=k-1;
        while(left<right){
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;
            left++;
            right--;
        }
        
        int x=k;
        int y=nums.length-1;
        while(x<y){
            int temp=nums[y];
            nums[y]=nums[x];
            nums[x]=temp;
            x++;
            y--;
        }
    }
}