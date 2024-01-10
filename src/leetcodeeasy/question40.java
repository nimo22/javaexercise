package leetcodeeasy;
/*
 * Accepted
nimo22
nimo22
submitted at Jan 10, 2024 14:42
Runtime
2ms
Beats21.06%of users with Java
Memory
41.16MB
Beats7.44%of users with Java
 */
public class question40 {
    public static boolean isHappy(int n) {
        if(n==1){
            return true;
        }
        int count=30;
        while (count!=0) {
            count--;
            String number=String.valueOf(n);
            int value=0;
            for(int i=0;i<number.length();i++){
               
                value=value+(int)Math.pow(number.charAt(i)-'0',2);

            }
            
            if (value==1) {
                return true;
            }else{
                n=value;
            }

        }
        


        return false;
    }

    public static void main(String[] args) {
        System.out.println(Math.pow(1, 2));
        System.out.println(isHappy(100));
    }
}
