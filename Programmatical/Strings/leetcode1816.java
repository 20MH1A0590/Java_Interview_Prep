class Solution {
    public String truncateSentence(String s, int k) {
      String words[] = s.split(" ");
      String res = "";
      for(int i = 0; i < k; i++)
      {
          if(i != k-1) res += words[i]+" ";
          else res += words[i];
      }
      return res;  
    }
}
