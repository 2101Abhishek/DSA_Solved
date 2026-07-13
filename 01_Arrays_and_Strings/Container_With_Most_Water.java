/* 
    Problem Name: Container With Most Water
    Link: https://leetcode.com/problems/container-with-most-water/
    Pattern: Arrays
    Time Complexity : O(n)
    Space Complexity : O(1)
 */

public class Container_With_Most_Water 
{
    public int maxArea(int[] height) 
    {
       int left = 0;
       int right = height.length-1;
       int maxA = 0;
       int currentArea = 0;
       
      while(left<right)
      {
         currentArea = (right-left)*(Math.min(height[left],height[right]));
         maxA = Math.max(currentArea,maxA);

         if(height[left]<height[right])
         {
            left++;
         }
         else
         {
            right--;
         }
      }
      return maxA;
    }
}
