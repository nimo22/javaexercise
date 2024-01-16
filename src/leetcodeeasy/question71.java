package leetcodeeasy;
//https://leetcode.com/problems/reverse-string/submissions/1147293750/
/*
 * Runtime
0ms
Beats100.00%of users with Java
Memory
49.00MB
Beats77.25%of users with Java
 */
public class question71 {
    public void reverseString(char[] s) {
        
            int siz= s.length;//5
            for (int i=0;i<siz;i++){// i=2 size=3
                char o=s[siz-1];
                s[siz-1]=s[i];
                s[i]=o;
                siz--;
            }
            
        


        
    }
}
