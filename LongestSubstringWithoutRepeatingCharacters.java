class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] charIndexMap = new int[256]; // For ASCII characters
        
        int left = 0;
        int maxLength = 0;
        
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            
            if (charIndexMap[currentChar] > 0 && charIndexMap[currentChar] >= left) {
                left = charIndexMap[currentChar];
            }
            
            charIndexMap[currentChar] = right + 1; // Store the current character's index
            
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}
