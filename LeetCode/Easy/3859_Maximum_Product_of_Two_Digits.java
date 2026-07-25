/*
 * Problem: 3859 - Maximum Product of Two Digits
 * Difficulty: Easy
 * URL: https://leetcode.com/problems/maximum-product-of-two-digits/
 * 
 * Description:
 * You are given a positive integer n.
 * 
 * Return the maximum product of any two digits in n.
 * 
 * Note: You may use the same digit twice if it appears more than once in n.
 * 
 *  
 * Example 1:
 * 
 * 
 * Input: n = 31
 * 
 * Output: 3
 * 
 * Explanation:
 * 
 * 
 * 	The digits of n are [3, 1].
 * 	The possible products of any two digits are: 3 * 1 = 3.
 * 	The maximum product is 3.
 * 
 * 
 * 
 * Example 2:
 * 
 * 
 * Input: n = 22
 * 
 * Output: 4
 * 
 * Explanation:
 * 
 * 
 * 	The digits of n are [2, 2].
 * 	The possible products of any two digits are: 2 * 2 = 4.
 * 	The maximum product is 4.
 * 
 * 
 * 
 * Example 3:
 * 
 * 
 * Input: n = 124
 * 
 * Output: 8
 * 
 * Explanation:
 * 
 * 
 * 	The digits of n are [1, 2, 4].
 * 	The possible products of any two digits are: 1 * 2 = 2, 1 * 4 = 4, 2 * 4 = 8.
 * 	The maximum product is 8.
 * 
 * 
 * 
 *  
 * Constraints:
 * 
 * 
 * 	10 <= n <= 109
 * 
 * Sample Test Case:
 *   31
 */

class Solution {
    public int maxProduct(int n) {
        int d= (int)Math.log10(n)+1;
        int[] arr = new int[d];
        int k=0;
        int num=n;
         while(num!=0)
         {
            
            arr[k]=num%10;
            k++;
            num/=10;
         }
         Arrays.sort(arr);
          int p=arr[d-1]*arr[d-2];
        return p;
    }
}