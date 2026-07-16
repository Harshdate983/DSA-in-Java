/*
Problem: Check if Array Is Sorted and Rotated

Platform: LeetCode

Difficulty: Easy

Approach:
Count the number of inversion points (where the current element is greater than the next element).
Use modulo (%) to compare the last element with the first.
If the number of inversion points is at most one, the array is sorted and rotated.

Time Complexity:
O(n)

Space Complexity:
O(1)

Status:
Solved Independently
*/

class Solution {
    public boolean check(int[] nums) {
        int count=0;
        int n=nums.length;
     for(int i=0;i<n;i++){
        if(nums[i]>nums[(i+1) % n]){
            count++;
        }
        
    } 
    if(count<=1){
        return true;
    }  
    else{
        return false;
    }
    }
}
