package leetcodeeasy;
//https://leetcode.com/problems/range-sum-query-immutable/
public class question67 {
    /*
     * Accepted
nimo22
nimo22
submitted at Jan 12, 2024 07:49
Runtime
55ms
Beats12.12%of users with Java
Memory
49.66MB
Beats7.70%of users with Java
     */
    class NumArray {
    
        int []nums;

        public NumArray(int[] nums) {
        this.nums=nums;
           
        }
        
        public int sumRange(int left, int right) {
            int numb=0;
            for(int i=left;i<=right;i++){
                System.out.println();
                numb=numb+nums[i];
            }
            
            return numb;
        }
    }
}
