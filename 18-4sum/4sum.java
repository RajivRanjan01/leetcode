class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();

        int n = nums.length;

        if (n < 4) {
            return result;
        }

        Arrays.sort(nums);

        for (int a = 0; a < n - 3; a++) {
            if (a > 0 && nums[a] == nums[a-1]) {
                continue;
            }

            if ((long)nums[a] + nums[a+1] + nums[a+2] + nums[a+3] > target) {
                break;
            }
            if ((long)nums[a] + nums[n-1] + nums[n-2] + nums[n-3] < target) {
                continue;
            }

            for (int b = a + 1; b < n - 2; b++) {
                if (b > a + 1 && nums[b] == nums[b-1]) {
                    continue;
                }

                if ((long)nums[a] + nums[b] + nums[b+1] + nums[b+2] > target) {
                    break;
                }
                if ((long)nums[a] + nums[b] + nums[n-1] + nums[n-2] < target) {
                    continue;
                }

                long targetSumForTwoPointers = (long)target - nums[a] - nums[b];

                int left_pointer = b + 1;
                int right_pointer = n - 1;

                while (left_pointer < right_pointer) {
                    long currentSumOfTwo = (long)nums[left_pointer] + nums[right_pointer];

                    if (currentSumOfTwo == targetSumForTwoPointers) {
                        result.add(Arrays.asList(nums[a], nums[b], nums[left_pointer], nums[right_pointer]));

                        while (left_pointer < right_pointer && nums[left_pointer] == nums[left_pointer + 1]) {
                            left_pointer++;
                        }

                        while (left_pointer < right_pointer && nums[right_pointer] == nums[right_pointer - 1]) {
                            right_pointer--;
                        }

                        left_pointer++;
                        right_pointer--;

                    } else if (currentSumOfTwo < targetSumForTwoPointers) {
                        left_pointer++;
                    } else {
                        right_pointer--;
                    }
                }
            }
        }
        return result;
    }
}
