package leetcodeeasy;

public class question81 {
    /*
     * Accepted
Time taken: 10 m 30 s
nimo22
nimo22
submitted at Jan 16, 2024 15:24
Runtime
1ms
Beats91.80%of users with Java
Memory
41.73MB
Beats8.91%of users with Java
     */
//https://leetcode.com/problems/is-subsequence/submissions/1148184228/
    public static boolean isSubsequence(String s, String t) {
        
        char[] c= s.toCharArray();
        char []tt=t.toCharArray();
        int counter=0;
        boolean found=false;
        for(int i=0;i<c.length;i++){//aa
             found=false;
            
            for(int r=counter;r<tt.length;r++){//bbaaaa /5
                if(c[i]==tt[r]){
                    counter=r+1;
                    found=true;
                    System.out.println(counter);
                    break;
                }
                if(r+1==tt.length){
                    return false;
                }              

            }

        }

        return found;
    }

    public static void main(String[] args) {
        String s="aaaaaa";
        String t="bbaaaa";
        System.out.println(isSubsequence(s,t));
    }
}
