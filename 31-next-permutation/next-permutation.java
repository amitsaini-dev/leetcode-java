class Solution {
    public void nextPermutation(int[] nums) {
        //Step one to find longest subarray 
        int i = nums.length - 2;
        int j = nums.length - 1;
        int idx = -1;

        while (i >= 0) {
            if (nums[i] < nums[j]) {
                idx = i;
                break;
            }
            i--;
            j--;
        }
        if (idx == -1) {
            i = 0;
            j = nums.length - 1;
            while (i < j) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
            return;
        }
        for(i = nums.length - 1; i > idx; i--) {
            if (nums[i] > nums[idx]) {
                int temp = nums[idx];
                nums[idx] = nums[i];
                nums[i] = temp;
                break;
            }
        }

        i = idx + 1;
        j = nums.length - 1;
        while (i < j) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }
}