package leetcodeeasy;
/*
 * Accepted
nimo22
nimo22
submitted at Jan 16, 2024 13:17
Runtime
2ms
Beats13.64%of users with Java
Memory
40.25MB
Beats29.93%of users with Java
 */
public class question76 {
    public boolean isPerfectSquare(int num) {
        if (num==1 || num==2 || num==3) {
            return false;
        }
        int counter=2;
        
        if (counter <num) {
            int an = num/counter;//8
            System.out.println((4.0==4));
            if (counter==an) {
                    return true;
            }
            num++;
            
        }
        

        return false;
    }
    public static void main(String[] args) {
        System.out.println(4.0%1.00!=0.00);

    }
}
