class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character,Integer> mp = new HashMap<>(); // declaration
        for(int i=0;i<s.length();i++)
        {
            if(mp.containsKey(s.charAt(i)))
            {
                return s.charAt(i); // if exists then return char
            }
            else
            {
                mp.put(s.charAt(i),1); // if not then add to HashMap.
            }
        }
        return '*';
    }
}