/*
Problem: Two Sum

Platform: LeetCode

Difficulty: Easy

Approach:
Brute Force (Nested Loops)

Time Complexity:
O(n²)

Space Complexity:
O(1)

Status:
Solved Independently

Date:
07-07-2026
*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[]= new int[2];
        for(int i=0;i<nums.length;i++){
                int needed= target-nums[i];
                ans[0]=i;
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]==needed){
                        ans[1]=j;
                        return ans;
                    }   
                }   
        }
        return new int[0]; 
    }
}
