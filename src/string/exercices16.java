package string;
//https://leetcode.com/problems/two-sum/
class Solution {
     public int[] twoSum(int[] nums, int target) {
         int [] re= new int [2];
        for(int i=0;i<nums.length;i++){
            for(int r=0;r<nums.length;r++){
                if(i==r){
                    break;
                }else{
                if(nums[i]+nums[r]==target){
                    re[0]=i;
                    re[1]=r;
                    return re;
                }
                }
            }
        }
        return re;
    }
}
