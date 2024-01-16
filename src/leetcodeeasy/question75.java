package leetcodeeasy;

import java.util.ArrayList;
import java.util.List;

//https://leetcode.com/problems/intersection-of-two-arrays-ii/
/*
 * Accepted
nimo22
nimo22
submitted at Jan 16, 2024 12:57
Runtime
3ms
Beats89.82%of users with Java
Memory
43.22MB
Beats49.55%of users with Java
 */
public class question75 {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer>li = new ArrayList<>();
        for(int i=0;i<nums1.length;i++){
            for(int r=0;r<nums2.length;r++){
                if(nums1[i]==nums2[r]){

                    li.add(nums1[i]);
                    nums1[i]=-1;
                    nums2[r]=-1;
                    break;
                }

            }
        }
        int[]ret = new int[li.size()];
        for(int i=0;i<li.size();i++){
            ret[i]=li.get(i);
        }
        return ret;
    }
    
}
