class Solution {
    public boolean canJump(int[] nums) {
        if (nums.length == 1)
            return true;
        int i = 0;
        int j = 0;
        int remaningJump = -1;
        while (i < nums.length) {
            if (nums[i] >= nums.length - i + 1) {
                return true;
            }
            if (nums[i] == 0)
                return false;
            remaningJump = nums[i];

            while (remaningJump > 0) {
                i++;
                remaningJump--;
                if (i == nums.length - 1)
                    return true;
                if (nums[i] > remaningJump) {
                    remaningJump = nums[i];
                    break;
                }
            }
        }
        return true;
    }
}