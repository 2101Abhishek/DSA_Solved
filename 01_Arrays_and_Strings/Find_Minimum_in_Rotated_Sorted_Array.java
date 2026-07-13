/* 
    Problem Name: Find Minimum in Rotated Sorted Array
    Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/
    Pattern: Arrays
    Time Complexity : O(log n)
    Space Complexity : O(1)
 */

public class Find_Minimum_in_Rotated_Sorted_Array 
{
    public int findMin(int[] nums) 
    {
        int left =0;
        int right = nums.length-1;

        while(left<right)
        {
            int mid = left+(right-left)/2;
            if(nums[mid]>nums[right])
            {
                left=mid+1;
            }
            else if(nums[mid]<nums[right])
            {
                right=mid;
            }
        }
        return nums[left];
    }
}
