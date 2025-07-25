class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }

            int targetSumForTwoPointers = -nums[i];

            int left_pointer = i + 1;
            int right_pointer = nums.length - 1;

            while (left_pointer < right_pointer) {
                // FIX: Changed assignment operator '=' to addition operator '+'
                int currentSum = nums[left_pointer] + nums[right_pointer];

                if (currentSum == targetSumForTwoPointers) {
                    result.add(Arrays.asList(nums[i], nums[left_pointer], nums[right_pointer]));

                    while (left_pointer < right_pointer && nums[left_pointer] == nums[left_pointer + 1]) {
                        left_pointer++;
                    }

                    while (left_pointer < right_pointer && nums[right_pointer] == nums[right_pointer - 1]) {
                        right_pointer--;
                    }

                    left_pointer++;
                    right_pointer--;

                } else if (currentSum < targetSumForTwoPointers) {
                    left_pointer++;
                } else {
                    right_pointer--;
                }
            }
        }
        return result;
    }
}
