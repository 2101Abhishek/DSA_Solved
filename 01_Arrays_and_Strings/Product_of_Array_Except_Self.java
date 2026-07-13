/*
    Problem Name: Product of Array Except Self
    Link: https://leetcode.com/problems/product-of-array-except-self/
    Pattern: Arrays
    Time Complexity : O(n)
    Space Complexity : O(n)
 */
public class Product_of_Array_Except_Self 
{
    public int[] productExceptSelf(int[] nums) 
    {
        int leftArray [] = new int[nums.length];
        leftArray[0] = 1;

        for( int i =1;i<nums.length;i++)
        {
            leftArray[i]= leftArray[i-1]*nums[i-1];
        }

        int rightArray [] = new int[nums.length];

        rightArray[nums.length-1]=1;

        for(int i =nums.length-2;i>=0;i--)
        {
            rightArray[i]= rightArray[i+1]*nums[i+1];
        }

        int answer [] = new int[nums.length];
        for(int i =0;i<nums.length;i++)
        {
            answer[i]=leftArray[i]*rightArray[i];
        }
        return answer;
    }
}