class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> list = new LinkedList<>();

        for (int i = 0; i < nums.length; i++) {

            if (i > 0 && nums[i - 1] == nums[i])
                continue;

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    List<Integer> l = new LinkedList<>();
                    l.add(nums[i]);
                    l.add(nums[left]);
                    l.add(nums[right]);
                    list.add(l);
                    left++;
                    right--;
                    while (left < right && nums[right] == nums[right +1])
                        right--;
                    while (left < right && nums[left] == nums[left - 1])
                        left++;

                } else if (sum > 0) {
                    right--;
                } else {
                    left++;

                }
            }
        }
        return list;
    }
}