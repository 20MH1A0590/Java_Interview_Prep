class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> Freq = new HashMap<>();
        int k = nums.length;
        for(int i = 0; i < k; i++)
        {
            if(Freq.containsKey(nums[i])) Freq.put(nums[i],Freq.get(nums[i])+1);
            else Freq.put(nums[i],1);
        }
        for(Integer K : Freq.keySet())
        {
            if(Freq.get(K) > k/2) return K;
        }
        return -1;
    }
}