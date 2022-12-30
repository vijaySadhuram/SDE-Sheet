class Solution {
    public int lengthOfLongestSubstring(String s) {
        // we begin by breaking the string into char array to process it faster
        char[] charSet = s.toCharArray();
        int n = charSet.length,i;
        if (n == 0) return 0; // exception case for faster performance
        int length = 1; // current length
        int longest = 1; // longest length so far
        int left = 0; // left index of our sliding window
        int tmp = 0; // index of the duplicate
        for (int right = 1; right < n; right++) {  // we start by moving our right side of the window from 1 to the end
            tmp = charEqualsToCharAtThisIndex(charSet[right], charSet, left, right); 
			// if the char itself has existed in our sliding window, 
			// we will slide the left side of the window to the next position of the duplicate 
            if (tmp == -1) {
                length++;
                longest = longest > length ? longest : length;
            } else {
                length = right - tmp;
                left = tmp + 1;
            }
        }
        return longest;
    }
    
    private int charEqualsToCharAtThisIndex(char c, char[] seq, int firstIndex, int lastIndex) {
        for (int i = firstIndex; i < lastIndex; i++) {
            if (c == seq[i]) 
                return i;
        }
        return -1;
    }
}