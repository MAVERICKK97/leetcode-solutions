class Solution {
    public void nextPermutation(int[] nums) {

        int i = nums.length - 2;

        // Find first smaller number from the end
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // If found, swap with next greater number
        if (i >= 0) {
            int j = nums.length - 1;

            while (nums[j] <= nums[i]) {
                j--;
            }

            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

        // Reverse the remaining part
        int left = i + 1;
        int right = nums.length - 1;

        while (left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;

            left++;
            right--;
        }
    }
}