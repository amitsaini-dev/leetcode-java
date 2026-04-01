class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>>result=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int low=i+1;
            int high=nums.length-1;
            while(low<high){
                int sum=nums[i]+nums[low]+nums[high];
                if(sum==0){
                    result.add(Arrays.asList(nums[i],nums[low],nums[high]));
                    low++;
                }
                else if(sum<0){
                    low++;
                }else{
                    high--;
                }
            }
        }
        return new ArrayList<>(result);
    }
}