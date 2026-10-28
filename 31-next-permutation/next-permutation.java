class Solution {
    public void nextPermutation(int[] nums) {
        int target = -1;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                target = i;
                break;
            }
        }
        if (target == -1) {
            Arrays.sort(nums);
            return;
        }
        int j = nums.length - 1;
        while (target < j) {
            if (nums[j] > nums[target]) {
                int temp = nums[target];
                nums[target] = nums[j];
                nums[j] = temp;
                break;
            }
            j--;
        }
        j = nums.length - 1;
        target++;
        while (target < j) {
            int temp = nums[target];
            nums[target] = nums[j];
            nums[j] = temp;
            j--;
            target++;
        }

        return;

    }
}