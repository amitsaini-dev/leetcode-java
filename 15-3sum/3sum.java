class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            Set<Integer> map = new HashSet<>();

            for (int j = i + 1; j < nums.length; j++) {
                int target = -(nums[i] + nums[j]);
                if (map.contains(target)) {

                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(target);
                    Collections.sort(temp);
                    set.add(temp);
                }
                map.add(nums[j]);
            }
        }
        ans.addAll(set);
        return (ans);
    }
}