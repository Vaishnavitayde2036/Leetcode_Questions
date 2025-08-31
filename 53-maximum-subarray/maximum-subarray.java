class Solution {
    // What the driver expects:
    public int maxSubArray(int[] nums) {
        int best = nums[0];
        int curr = 0;
        for (int x : nums) {
            curr = Math.max(x, curr + x); // Kadane's step
            best = Math.max(best, curr);
        }
        return best;
    }

    // Optional: for local testing only (ignored by judges)
    public static void main(String[] args){
        int[] nums = {1};
        System.out.println(new Solution().maxSubArray(nums));
    }
}
