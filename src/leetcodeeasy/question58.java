package leetcodeeasy;
//https://leetcode.com/problems/add-digits/description/

/*
 * Accepted
nimo22
nimo22
submitted at Jan 12, 2024 02:28
Runtime
1ms
Beats77.41%of users with Java
Memory
41.06MB
Beats13.05%of users with Java
 */
public class question58 {
    public int addDigits(int num) {
        

        while(num>9){
            String x= String.valueOf(num);
            int nb=0;
            for(int i=0;i<x.length();i++){
               nb=nb+Integer.valueOf(x.charAt(i)-'0');
            }
            num=nb;
        }
        return num;
    
}
}