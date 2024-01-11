package leetcodeeasy;
/*
 * Accepted
nimo22
nimo22
submitted at Jan 11, 2024 06:25
Runtime
67ms
Beats9.89%of users with Java
Memory
61.01MB
Beats5.81%of users with Java
 */

import java.util.*;

//https://leetcode.com/problems/contains-duplicate-ii/description/
public class question45 {
    
    public static boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer,List<Integer>>map= new HashMap<>();

        for(int i=0;i<nums.length;i++){
           if (map.containsKey(nums[i])) {
           
            List <Integer>li= new ArrayList<>();
            li.add(i);
            li.addAll(map.get(nums[i]));
            map.replace(nums[i], li);
            
            
           }else{
            
            List <Integer>li= new ArrayList<>();
            li.add(i);
            map.put(nums[i], li);
           }

           
           
            
        }
         for (List<Integer> i :map.values() ) {
            
            if (i.size()>1) {
                Collections.sort(i);
                ArrayList<Integer>x= new ArrayList<>();
                for (int r=0;r<i.size();r++) {
                    if (r+1<i.size()) {
                        if (Math.abs(i.get(r)-i.get(r+1))<=k) {
                            return true;
                        }
                    }
                }

                
            }
            
           }
        return false;
    }
    public static void main(String[] args) {
        int x[]={1,0,1,1};
        System.out.println(containsNearbyDuplicate(x,1) );
    }
}
