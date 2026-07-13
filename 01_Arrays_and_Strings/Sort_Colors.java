/* 
    Problem Name: Sort Colors
    Link: https://leetcode.com/problems/sort-colors/
    Pattern: Arrays
    Time Complexity : O(n)
    Space Complexity : O(1)
 */

public class Sort_Colors 
{
    public void sortColors(int[] nums) 
    {
       int low = 0;
       int high = nums.length-1;
       int mid = 0 ;

       while(mid<=high)
       {
          if(nums[mid]==0)
          {
            int temp = nums[mid];
            nums[mid] = nums[low];
            nums[low] = temp;
            low++;
            mid++;
          }
          else if(nums[mid]==1)
          {
            mid++;
          }
          else if(nums[mid]==2)
          {
            int temp = nums[mid];
            nums[mid] = nums[high];
            nums[high] = temp;
            high--;
          }
       }
    }
}
