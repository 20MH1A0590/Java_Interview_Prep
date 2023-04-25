class Solution {
    public int mostWordsFound(String[] sentences) {
        int mx = -1;
        for(int i = 0; i < sentences.length; i++)
        {
            String words[] = sentences[i].split(" ");
            if(mx < words.length) mx = words.length;
        }
        return mx;
    }
}