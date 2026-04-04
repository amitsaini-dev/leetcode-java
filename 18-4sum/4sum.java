class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        Set<List<Integer>>result=new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++){
            for(int j=i+1;j<nums.length-2;j++){
            int low=j+1;
            int high=nums.length-1;
            while(low<high){
                long sum=(long)nums[i]+nums[j]+nums[low]+nums[high];
                if(sum==target){
                    result.add(Arrays.asList(nums[i],nums[j],nums[low],nums[high]));
                    low++;
                    high--;
                }
                else if(sum<target){
                    low++;
                }
                else{
                    high--;
                }
            }
        }
        
    }
    return new ArrayList<>(result);
}
}