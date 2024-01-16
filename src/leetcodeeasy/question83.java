package leetcodeeasy;

import java.util.HashMap;
/*
 * Accepted
nimo22
nimo22
submitted at Jan 16, 2024 17:00
Runtime
11ms
Beats9.54%of users with Java
Memory
41.66MB
Beats38.43%of users with Java
 */
public class question83 {
    public int longestPalindrome(String s) {
        if(s.length()==0) return 0;
        if(s.length()<3) return s.length();
        String word=" ";
        HashMap<Character,Integer>map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))!=null){
                map.replace(s.charAt(i), map.get(s.charAt(i))+1);
            }else{
                map.put(s.charAt(i), 1);
            }
            
            }
            System.out.println();
            int count=0;
            int plus=0;
            for ( int x : map.values()) {
                if(x%2==0){
                    count=count+x;
                }else{
                    plus=1;
                }
            }

        

        return count+plus;

    }
    
}
