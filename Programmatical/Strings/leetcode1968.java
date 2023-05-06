class Solution {
    public int numOfStrings(String[] patterns, String word) {
        // contains func used to check the string that is present as a substring in a word.
       int cnt = 0;
       for(int i = 0; i < patterns.length; i++)
       {
           if(word.contains(patterns[i])) cnt++;
       } 
       return cnt;
    }
}
Console
