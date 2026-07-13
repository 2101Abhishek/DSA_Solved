/* 
    Problem Name: Trapping Rain Water
    Link: https://leetcode.com/problems/trapping-rain-water/
    Pattern: Arrays
    Time Complexity : O(n)
    Space Complexity : O(1)
 */

public class Trapping_Rain_Water 
{
     public int trap(int[] height) 
    {
       if(height.length<2)
       {
         return 0;
       }
       int left =0;
       int right = height.length-1;
       int leftmax = height[left];
       int rightmax = height[right];
       int totalWater = 0;

       while(left<=right)
       {
          if(leftmax<rightmax)
          {
            leftmax = Math.max(leftmax,height[left]);
            totalWater += leftmax - height[left];
            left++;
          }
          else 
          {
            rightmax = Math.max(rightmax,height[right]);
            totalWater += rightmax - height[right];
            right--;
          }
       }
       return totalWater;
    }
    
}
