class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>ans=new ArrayList<>();
        int c1=0;
        int v1=0;
        int c2=0;
        int v2=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i]==c1){
                v1++;
            }else if(nums[i]==c2){
                v2++;
            }else if(v1==0){
                c1=nums[i];
                v1=1;
            }else if(v2==0){
                c2=nums[i];
                v2=1;
            }else{
                v1--;
                v2--;
            }
        }
        v1=0;v2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==c1){
                v1++;
            }else if(nums[i]==c2){
                v2++;
            }
        }

        if(v1>nums.length/3) ans.add(c1);
        if(v2>nums.length/3) ans.add(c2);
        return ans;
    }
}