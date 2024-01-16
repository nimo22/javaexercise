package leetcodeeasy;
/*
 * Accepted
nimo22
nimo22
submitted at Jan 16, 2024 14:56
Runtime
3ms
Beats47.35%of users with Java
Memory
41.89MB
Beats23.12%of users with Java

 */
//https://leetcode.com/problems/find-the-difference/submissions/1148165382/
public class question80 {
    public char findTheDifference(String s, String t) {
        int some=0;

        for (char p  : t.toCharArray()) {
            some=some+p;
        }
      
        for (char p  : s.toCharArray()) {
            some=some-p;
        }
        char p= (char)some;

        return p;
    }
}
