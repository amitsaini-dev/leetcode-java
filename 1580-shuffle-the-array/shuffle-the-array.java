class Solution {
    public int[] shuffle(int[] nums, int n) {
        int shuffled[]=new int[nums.length];
        shuffled[0]=nums[0];
        int x=1;
        for(int i=1;i<nums.length;i++){
            if(i%2==0){
                shuffled[i]=nums[x];
                x++;
            }else{
                shuffled[i]=nums[n];
                n++;
            }
            
        }
        return shuffled;
    }
}