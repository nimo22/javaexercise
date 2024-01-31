package leetcodeeasy;
public class question98 {
    //https://leetcode.com/problems/max-consecutive-ones/
    /*
     * Runtime
2ms
Beats89.67%of users with Java
Memory
46.32MB
Beats8.06%of users with Java
     */
    public static int  findMaxConsecutiveOnes(int[] nums) {
        int counter=0;
        int answer=0;
        if(nums.length==0){
            return 0;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                counter++;
            } 
            if (nums[i] ==0 || i==nums.length-1){
                if(counter>answer){
                    answer=counter;
                }
                counter=0;
            }

        }
        return answer;
    }
    public static void main(String[] args) {
        int []p={1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(p));
    }
}
