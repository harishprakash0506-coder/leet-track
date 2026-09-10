/*
 * Problem: 4248 - Count Commas in Range II
 * Difficulty: Medium
 * URL: https://leetcode.com/problems/count-commas-in-range-ii/
 * 
 * Description:
 * You are given an integer n.
 * 
 * Return the total number of commas used when writing all integers from [1, n] (inclusive) in standard number formatting.
 * 
 * In standard formatting:
 * 
 * 
 * 	A comma is inserted after every three digits from the right.
 * 	Numbers with fewer than 4 digits contain no commas.
 * 
 * 
 *  
 * Example 1:
 * 
 * 
 * Input: n = 1002
 * 
 * Output: 3
 * 
 * Explanation:
 * 
 * The numbers "1,000", "1,001", and "1,002" each contain one comma, giving a total of 3.
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: n = 998
 * 
 * Output: 0
 * 
 * Explanation:
 * 
 * ​​​​​​​All numbers from 1 to 998 have fewer than four digits. Therefore, no commas are used.
 * 
 * 
 *  
 * Constraints:
 * 
 * 
 * 	1 <= n <= 1015
 * 
 * Sample Test Case:
 *   1002
 */

class Solution {
    public long countCommas(long n) {

        long count = 0;

        for (long i = 1000; i <= n; i *= 1000) {
            count += n - i + 1;
        }

        return count;
    }
}