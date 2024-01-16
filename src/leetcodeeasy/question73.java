package leetcodeeasy;

import java.util.ArrayList;
import java.util.Collections;

//https://leetcode.com/problems/intersection-of-two-arrays/
public class question73 {
    public  static int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> ar= new ArrayList<>();
        ArrayList<Integer> ret= new ArrayList<>();
        ArrayList<Integer> w= new ArrayList<>();
        for (int x : nums1) {
            if (!ar.contains(x)) {
                ar.add(x);
            }  
        }
        for (int x : nums2) {
        if (!ret.contains(x)) {
            ret.add(x);
            }
            
        }
        for(int i=0;i<ret.size();i++){
            
            if (ar.contains(ret.get(i))) {
                
                w.add(ret.get(i));
            }
        }
        int []p=new int[w.size()];
        
        for(int i=0;i<w.size();i++){
            System.out.println(w.get(i));
            p[i]=w.get(i);
        }
        return p;
    }

    public static void main(String[] args) {
        int []one={1,2,2,1};
        int [] two={2,2};
        ArrayList<Integer> pp= new ArrayList<>();
        
        System.out.println(intersection(one,two));
    }
    
}
        

        


