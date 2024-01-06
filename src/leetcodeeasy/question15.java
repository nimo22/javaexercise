package leetcodeeasy;
//https://leetcode.com/problems/sqrtx/description/
// no use of sqrt in math libary
import java.lang.Math;
public class question15 {
    /*
     * Runtime
Details
1ms
Beats 96.27%of users with Java
Memory
Details
40.92MB
Beats 11.80%of users with Java
     */
    public int mySqrt(int x) {
        if(x<0) return -1;
        int low = 1; int high = x; int res = 0;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(mid<=x/mid){
                res = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return res;

      
        // easy answer//  return (int)Math.sqrt(x);   
    }
}
