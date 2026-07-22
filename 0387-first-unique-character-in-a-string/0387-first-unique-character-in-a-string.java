class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
 
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (freqMap.containsKey(c)) {
                int old = freqMap.get(c);
                freqMap.put(c, old + 1);
            } else {
                freqMap.put(c, 1);   
            }
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (freqMap.get(c) == 1) {
                return i;
            }
        }

        return -1; 
    }
}