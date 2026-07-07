class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Set<Integer> set = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length / 3;
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                int val = map.get(nums[i]);
                map.put(nums[i], val + 1);
            } else {
                map.put(nums[i], 1);
            }

        }

        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) > n) {
                set.add(nums[i]);
            }
        }
        return new ArrayList<>(set);
    }
}