package leetcodeeasy;

import java.util.Arrays;
//easy
//https://leetcode.com/problems/merge-sorted-array/
/*
 * Accepted
Runtime
Details
1ms
Beats 35.35%of users with Java
Memory
Details
42.05MB
Beats 19.32%of users with Java
 */
public class quetion18 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        for(int i=m; i<nums1.length;i++){
            nums1[i]=nums2[i-m];
        }

        Arrays.sort(nums1);
    }
    
    public static void main(String[] args) {
        
        double x=2;
        String.valueOf(x);
        String h=String.format("%.0f", x);
        System.out.println(h);
    }
}

