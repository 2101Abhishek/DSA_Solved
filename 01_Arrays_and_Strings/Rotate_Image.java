/* 
    Problem Name: Rotate Image
    Link: https://leetcode.com/problems/rotate-image/
    Pattern: Arrays
    Time Complexity : O(n^2)
    Space Complexity : O(1)
 */

public class Rotate_Image 
{
    public void rotate(int[][] matrix) 
    {
        for(int i=0;i<matrix.length;i++)
        {
            for(int j =i;j<matrix[0].length;j++)
            {
                if(i!=j)
                {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
        for(int i =0;i<matrix.length;i++)
        {
            int left = 0;
            int right = matrix.length-1;

            while(left<right)
            {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }

       
    }
}
