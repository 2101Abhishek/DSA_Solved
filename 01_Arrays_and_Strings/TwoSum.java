import java.util.HashMap;
import java.util.Map;

/**
 * Problem Name: Two Sum
 * Link: https://leetcode.com/problems/two-sum/
 * Pattern: HashMap / Arrays
 * Time Complexity: O(N)
 * Space Complexity: O(N)
 */

public class TwoSum 
{
    public int[] twoSum(int[] nums, int target) 
    {
        Map<Integer,Integer> map = new HashMap<>();

        for(int i=0; i<nums.length;i++)
        {
            if(map.containsKey(target-nums[i]))
            {
                return new int[]{ map.get(target-nums[i]),i};
            }
            else
            {
                map.put(nums[i],i);
            }
        }
        return new int[]{};
    }
}