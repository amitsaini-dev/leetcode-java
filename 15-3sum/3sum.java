class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> set = new HashSet<>();

        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                if (nums[i] + nums[left] + nums[right] == 0) {
                    List<Integer> list = new LinkedList<>();
                    list.add(nums[i]);
                    list.add(nums[left]);
                    list.add(nums[right]);
                    set.add(list);
                    left++;
                    right--;
                } else if (nums[i] + nums[left] + nums[right] > 0) {
                    right--;
                } else {
                    left++;
                }
            }

        }
        return new LinkedList(set);
    }
}