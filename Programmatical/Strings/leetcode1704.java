class Solution {
    public static boolean vow(char c)
    {
        if(c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' || c =='U' || c == 'u') return true;
        else return false;
    }
    public boolean halvesAreAlike(String s) {
        int k = s.length();
        String fh = s.substring(0,k/2);
        String sh = s.substring(k/2,k);
        int cnt1 = 0, cnt2 = 0;
        for(int i = 0; i < fh.length(); i++)
        {
            if(vow(fh.charAt(i))) cnt1++;
        }
        for(int i = 0; i < sh.length(); i++)
        {
            if(vow(sh.charAt(i))) cnt2++;
        }
        return cnt1 == cnt2;
    }
}