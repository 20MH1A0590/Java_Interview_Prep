class Solution {
    public int[] decode(int[] encoded, int first) {
        int k = encoded.length;
        int arr [] = new int[k+1];
        arr[0] = first;
        for(int i = 0; i < k; i++)
        {
            arr[i+1] = arr[i] ^ encoded[i];
        }
        return arr;

        
    }
}
