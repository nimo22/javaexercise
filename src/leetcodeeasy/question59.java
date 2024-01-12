package leetcodeeasy;
//https://leetcode.com/problems/ugly-number/
public class question59 {
    /*
     * Accepted
nimo22
nimo22
submitted at Jan 12, 2024 03:08
Runtime
0ms
Beats100.00%of users with Java
Memory
40.83MB
Beats16.40%of users with Java
     */
    public static boolean isUgly(int n) {
        double d=0;
        if (n==0 ||n==1) {
            return true;
        }
        d=n/2.00;
        if (d%1==0) {
            System.out.println(n);
            System.out.println(d);
            System.out.println("ok");
            if (d==1) {
                return true;
            }
            int o=n/2;
            System.out.println(o);
             return true &&isUgly(o);
        }
        d=n/3;
        if (d%1==0) {
            if (d==1) {
                return true;
            }
            int o=n/3;
            return true &&isUgly(o);
        }
        d=n/5;
        if (d%1==0) {
            if (d==1) {
                return true;
            }
            int o=n/5;
             return true &&isUgly(o);
        }


        return false;
    }

    public static void main(String[] args) {
        System.out.println(isUgly(14));
        
    }
}
