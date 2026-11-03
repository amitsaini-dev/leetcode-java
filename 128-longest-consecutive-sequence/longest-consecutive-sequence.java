class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;

        int ans = 0;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);

        }
        for (int num : set) {

            if (!set.contains(num - 1)) {
                int curr = num;
                int count = 1;

                while (set.contains(curr + 1)) {
                    count++;
                    curr++;
                }
                ans = Math.max(ans, count);
            }

        }

        return ans;
    }
}