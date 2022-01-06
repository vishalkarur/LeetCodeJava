//Link : https://leetcode.com/problems/two-sum/

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.

//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Output: Because nums[0] + nums[1] == 9, we return [0, 1].
import java.util.Scanner;
class LeetCodeTwoSum1 {
    public int[] twoSum(int[] nums, int target) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[j]+nums[i] == target) {
                    return new int []{i,j} ;
                }
            }
        } return new int [] {0,0};

    }
}