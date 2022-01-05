class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        if (magazine.length() < ransomNote.length()) return false;
        int [] chars = new int[26];
        for (char ch : magazine.toCharArray()) {
            chars[ch - 'a']++;
        }
        for (char ch : ransomNote.toCharArray()) {
            chars[ch - 'a']--;
            if (chars[ch - 'a'] < 0) return false;
        }
        return true;

        
    }
}
