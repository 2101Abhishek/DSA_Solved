/* 
 * Problem Name: Plus One
 * Link: https://leetcode.com/problems/plus-one/
 * Pattern: Array
 * Time Complexity: O(N)
 * Space Complexity: O(1)
 */

public class Plus_One 
{
     public int[] plusOne(int[] digits) 
    {
        for(int i = digits.length-1;i>=0;i--)
        {
            if(digits[i]<9)
            {
                digits[i]=digits[i]+1;
                return digits;
            }
            else
            {
                digits[i]=0;
            }
        }
        int [] newArray = new int[digits.length+1];
        newArray[0]=1;
        return newArray;
    }
}
