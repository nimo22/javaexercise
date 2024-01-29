package leetcodeeasy;
/*
 * Accepted
nimo22
nimo22
submitted at Jan 29, 2024 01:14
Runtime
0ms
Beats100.00%of users with Java
Memory
40.87MB
Beats66.62%of users with Java
 */
public class question91 {
    //https://leetcode.com/problems/number-of-segments-in-a-string/
    public static int countSegments(String s) {
        if(s.length()==0){
            return 0;
        }
        int counter=0;
        String []x=s.split(" ");
        for(int i=0;i<x.length;i++){
            if (!x[i].isEmpty()) {
                counter++;
            }
        }
   
        return counter;
        
    }


}
