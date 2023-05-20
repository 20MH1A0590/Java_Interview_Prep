class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int k = nums.length;
        return (nums[k-1] * nums[k-2])-(nums[0] * nums[1]);
    }
}
