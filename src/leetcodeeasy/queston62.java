package leetcodeeasy;
/*
 * Accepted
nimo22
nimo22
submitted at Jan 12, 2024 04:02
Runtime
381ms
Beats5.01%of users with Java
Memory
45.96MB
Beats30.56%of users with Java
 */
public class queston62 {
    public void moveZeroes(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            for(int r=i+1;r<nums.length;r++){
                if(nums[i]==0 && nums[r]!=0){
                    nums[i]=nums[r];
                    nums[r]=0;

                }
            }
        }
    }
}
