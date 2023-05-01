class Solution {
    public String reverseWords(String s) {
        String words [] = s.split(" ");
        String ans = "";
        for(int i = 0; i < words.length; i++)
        {
            // string class is immutable in java.
            // here we are converting each string(word) in the given sentence to the StringBuffer class.
            StringBuffer sb = new StringBuffer(words[i]);
            if(i != words.length-1) ans += sb.reverse() + " ";
            else ans += sb.reverse();
        }
        return ans;     
    }
}
