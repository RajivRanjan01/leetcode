class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int current = 0;

        while (current <= high) {
            if (nums[current] == 0) {
                int temp = nums[current];
                nums[current] = nums[low];
                nums[low] = temp;
                low++;
                current++;
            } else if (nums[current] == 2) {
                int temp = nums[current];
                nums[current] = nums[high];
                nums[high] = temp;
                high--;
            } else {
                current++;
            }
        }
    }
}
