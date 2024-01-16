package leetcodeeasy;
/*https://leetcode.com/problems/power-of-four/submissions/1147288399/
 * Accepted
nimo22
nimo22
submitted at Jan 15, 2024 17:31
Runtime
1ms
Beats63.04%of users with Java
Memory
41.48MB
Beats6.85%of users with Java
 */
public class question70 {
    public static boolean isPowerOfFour(int n) {
        if(n==1 || n==4){
            return true;
        }
        while (n!=1) {
            double x=n/4.00;
            if (x%1.00>0) {
                System.out.println(x);
                return false;
            }else {
                n=n/4;
            }
        }

        return true;
       }

       public static void main(String[] args) {
        System.out.println(isPowerOfFour(16));
       }
   
}
