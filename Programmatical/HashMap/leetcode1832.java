class Solution {
    public boolean checkIfPangram(String sentence) {
        // we can also this problem by using HashSet in Java.
        HashMap<Character,Integer> Freq = new HashMap<>();
        for(int i = 0; i < sentence.length(); i++)
        {
            if(Freq.containsKey(sentence.charAt(i))) Freq.put(sentence.charAt(i), Freq.get(sentence.charAt(i) + 1));
            else Freq.put(sentence.charAt(i),1);
        }
        return Freq.size() == 26;
    }
}
