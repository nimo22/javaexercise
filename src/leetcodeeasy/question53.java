package leetcodeeasy;
/*
 * ccepted
nimo22
nimo22
submitted at Jan 11, 2024 09:26
Runtime
1ms
Beats77.15%of users with Java
Memory
40.97MB
Beats13.14%of users with Java
 */
public class question53 {
    public static boolean isPowerOfTwo(int n) {
        double res=0;
        int i=0;
        if (n==0) {
            return false;
        }
        while (n!=0) {

           res=Math.pow(2, i);
           System.out.println(res);
           if (res>n) {
            return false;
           }else if((int)res==n){
            return true;
           }else{
            i++;
           }
            
        }
        

        return false;
    }
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));
    }
    
}
