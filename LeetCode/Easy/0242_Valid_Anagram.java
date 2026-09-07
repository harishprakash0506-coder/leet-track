/*
 * Problem: 0242 - Valid Anagram
 * Difficulty: Easy
 * URL: https://leetcode.com/problems/valid-anagram/
 * 
 * Description:
 * Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * 
 *  
 * Example 1:
 * 
 * 
 * Input: s = "anagram", t = "nagaram"
 * 
 * Output: true
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: s = "rat", t = "car"
 * 
 * Output: false
 * 
 * 
 *  
 * Constraints:
 * 
 * 
 * 	1 <= s.length, t.length <= 5 * 104
 * 	s and t consist of lowercase English letters.
 * 
 * 
 *  
 * Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?
 * 
 * Sample Test Case:
 *   "anagram"
 *   "nagaram"
 */

class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        if(Arrays.equals(ch1,ch2))
        {
        return true;
        }
        return false;

        
    }
}