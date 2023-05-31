class MyHashMap {
    HashMap<Integer, Integer > Freq = new HashMap<>();
    public MyHashMap() {
        
    }
    
    public void put(int key, int value) {
        Freq.put(key, value);
    }
    
    public int get(int key) {
        if(Freq.containsKey(key)) return Freq.get(key);
        else return -1;
    }
    
    public void remove(int key) {
        Freq.remove(key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */
