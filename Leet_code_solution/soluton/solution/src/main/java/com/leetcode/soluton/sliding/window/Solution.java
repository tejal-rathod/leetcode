package com.leetcode.soluton.sliding.window;

import java.util.HashSet;
import java.util.Set;

class Solution {

    public static void main(String[] args) {
        lengthOfLongestSubstring("abcalmnopq");
    }
    public static int lengthOfLongestSubstring(String s) {

        Set<Character> set = new HashSet<>();

        int left = 0;
        int right = 0;
        int maxLength = 0;



        while (right < s.length()) {

            char currentChar = s.charAt(right);

            // If duplicate found, shrink the window
            while (set.contains(currentChar)) {
                set.remove(s.charAt(left));
                left++;
            }

            // Add current character
            set.add(currentChar);

            // Update maximum length
            maxLength = Math.max(maxLength, right - left + 1);

            // Expand window
            right++;
        }

        return maxLength;
    }
}