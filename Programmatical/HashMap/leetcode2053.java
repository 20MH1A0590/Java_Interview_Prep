class Solution {
    public String kthDistinct(String[] arr, int k) {
    HashMap<String,Integer> Freq = new HashMap<>();
    int cnt = 0;
    for(int i = 0;i < arr.length; i++)
    {
        if(Freq.containsKey(arr[i]))
        {
            Freq.put(arr[i],Freq.get(arr[i]) + 1);
        }
        else
        {
            Freq.put(arr[i],1);
        }
    }
    int val;
    for(int i = 0; i < arr.length; i++)
    {
    val = Freq.get(arr[i]);
    if(val == 1)
    {
        cnt += 1;
        if(cnt == k)
        { 
            return arr[i];
        }
    }
    }
    return "";
}
}