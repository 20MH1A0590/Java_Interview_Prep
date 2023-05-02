class Solution {
    public int arraySign(int[] nums) {
        // no need to product all the numbers
        // just count the zeros and neg numbers 
        // if you have atleast one zero then return 0;
        // if you have odd number of negative numbers in an array then you product is always -ve..
        int zeros = 0, neg = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] < 0) neg++;
            else if(nums[i] == 0) zeros++;
        }
        if(zeros >= 1) return 0;
        else if(neg % 2 == 1) return -1;
        else return 1;
    }
}