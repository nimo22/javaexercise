package leetcodeeasy;
/*https://leetcode.com/problems/power-of-three/submissions/1144220300/
 * Runtime
8ms
Beats85.81%of users with Java
Memory
44.06MB
Beats20.27%of users with Java
 */
public class question68 {
    public boolean isPowerOfThree(int n) {
        if (n<3) {
            return false;
        }
        
        while (n!=1) {
            System.out.println();
            double x=n/3.00;//15
            if(x%1!=0){
                return false;
            }else{
                n=n/3;
            }


            
        }

        return true;
    }

    public static void main(String[] args) {
        
        System.out.println(543.4%1);
    }
}
