class Solution {
    public int reversePairs(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int count = 0;
        count = mergeSort(nums, low, high);
        return count;

    }

    public int mergeSort(int nums[], int low, int high) {
        int count = 0;
        if (low < high) {
            int mid = low + (high - low) / 2;
            count += mergeSort(nums, low, mid);
            count += mergeSort(nums, mid + 1, high);
            count += merge(nums, low, mid, high);
        }
        return count;
    }

    public int merge(int nums[], int low, int mid, int high) {

        int j = mid + 1;
        int count = 0;
        for (int i = low; i <= mid; i++) {
            while (j <= high && nums[i] > 2L * nums[j]) {
                j++;
            }

            count += j - (mid + 1);
        }

        int i = low;
     j = mid + 1;
        int temp[] = new int[high - low + 1];

        int x = 0;
        while (i <= mid && j <= high) {
            if (nums[i] > nums[j]) {
                temp[x] = nums[j];
                j++;
                x++;
            } else {
                temp[x++] = nums[i++];
            }
        }

        while (i <= mid) {
            temp[x++] = nums[i++];
        }

        while (j <= high) {
            temp[x++] = nums[j++];
        }

        int a = 0;
        for (int k = low; k <= high; k++) {
            nums[k] = temp[a++];
        }
        return count;
    }

}