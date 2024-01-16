package leetcodeeasy;

import java.util.HashMap;
/*
 * Accepted
Time taken: 12 m 12 s
nimo22
nimo22
submitted at Jan 16, 2024 14:30
Runtime
23ms
Beats51.77%of users with Java
Memory
44.74MB
Beats33.87%of users with Java
 */
public class question79 {
    public static int  firstUniqChar(String s) {
        int k=1;
        HashMap<Character,Integer> map=  new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                
                map.replace(s.charAt(i),0);

            }else{
                
                map.put(s.charAt(i), k++);
            }
        }
        char o=' ';
         k=Integer.MAX_VALUE;
        for (char  x : map.keySet()) {
            if (k>map.get(x) && map.get(x)!=0) {
                o=x;
                k=map.get(x);
            }
            
        }
        System.out.println(o);
        return s.indexOf(o);

        
    }

    public static void main(String[] args) {
        System.out.println(firstUniqChar("leetcode"));

    }
    
}
