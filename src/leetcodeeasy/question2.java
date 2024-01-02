package leetcodeeasy;

public class question2 {
    public int[] twoSum(int[] nums, int target) {
        

        for(int i=0;i<nums.length;i++){
            for(int r=1;r<nums.length;r++){
                if(i==r){
                    continue;
                }
                if(nums[i]+nums[r]==target){
                        int [] x= {i,r};
                        return x;
                      
                }
            }
        }
        // empty 
        int [] array= {-1};
        return array;

         

    }
    

}
// reminder
// learned int []x = new int [number ]
// int []x={!,232141}
