class Solution {
    public boolean isAnagram(String s, String t) {
    // there are different approaches to solve this problem
    // using sorting technique also we can say wheather it is anagram or not
    char [] ss = s.toCharArray();
    char [] tt = t.toCharArray();
    Arrays.sort(ss);
    Arrays.sort(tt);
    return Arrays.equals(ss,tt);
    // HashMap<Character,Integer> Freqs = new HashMap<>();
    // HashMap<Character,Integer> Freqt = new HashMap<>();
    // for(int i = 0; i < s.length(); i++)
    // {
    //     if(Freqs.containsKey(s.charAt(i))) Freqs.put(s.charAt(i), Freqs.get(s.charAt(i) + 1));
    //     else Freqs.put(s.charAt(i),1);
    // }
    // for(int i = 0; i < t.length(); i++)
    // {
    //     if(Freqt.containsKey(t.charAt(i))) Freqt.put(t.charAt(i), Freqt.get(t.charAt(i) + 1));
    //     else Freqt.put(t.charAt(i),1);
    // }
    // // to compare two HashMaps are equal or not
    // boolean eq =  Freqs.keySet().equals(Freqt.keySet()) && Freqs.values().equals(Freqt.values());
    // return eq; 
    }
}