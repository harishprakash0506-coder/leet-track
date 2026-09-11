/*
 * Problem: 0958 - Sort Array By Parity II
 * Difficulty: Easy
 * URL: https://leetcode.com/problems/sort-array-by-parity-ii/
 * 
 * Description:
 * Given an array of integers nums, half of the integers in nums are odd, and the other half are even.
 * 
 * Sort the array so that whenever nums[i] is odd, i is odd, and whenever nums[i] is even, i is even.
 * 
 * Return any answer array that satisfies this condition.
 * 
 *  
 * Example 1:
 * 
 * Input: nums = [4,2,5,7]
 * Output: [4,5,2,7]
 * Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
 * 
 * 
 * Example 2:
 * 
 * Input: nums = [2,3]
 * Output: [2,3]
 * 
 * 
 *  
 * Constraints:
 * 
 * 
 * 	2 <= nums.length <= 2 * 104
 * 	nums.length is even.
 * 	Half of the integers in nums are even.
 * 	0 <= nums[i] <= 1000
 * 
 * 
 *  
 * Follow Up: Could you solve it in-place?
 * 
 * Sample Test Case:
 *   [4,2,5,7]
 */

class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        // if(nums.length==2)
        // {
        //     return nums;
        // }
        int k=0;
        int l=0;
        int m=0;
        int[] arr = new int[nums.length/2];
        int[] arr1 =  new int[nums.length/2];
        int[] arr2 = new int[nums.length];
         for(int i=0;i<nums.length;i++)
         {
            if(nums[i]%2==0)
            {
                arr[k]=nums[i];
                k++;
            }
         }
         for(int i=0;i<nums.length;i++)
         {
            if(nums[i]%2!=0)
            {
                arr1[l]=nums[i];
                l++;
            }
         }
         for(int i=0;i<nums.length/2;i++)
         {
            arr2[m]=arr[i];
            m++;
            arr2[m]=arr1[i];
            m++;
         }
         return arr2;
    }
}