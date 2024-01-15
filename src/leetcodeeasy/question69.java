package leetcodeeasy;
/*
 * Accepted
nimo22
nimo22
submitted at Jan 15, 2024 17:18
Runtime
9ms
Beats16.33%of users with Java
Memory
46.90MB
Beats20.12%of users with Java
 */
public class question69 {
    public static int[] countBits(int n) {
        int[] ret = new int [n+1];
        if (n==0) {
            ret[0]=0;
        }else{
            ret[0]=0;
            int add=1;
            for(int i=n;i>0;i--){
                int x=i;
                int counter=0;
                while (x!=0) {
                    int one=x%2;
                    if (one==1) {
                        counter++;
                    }
                    x=x/2; 
                }
            ret[add]=counter;
            add++;
            }
            
        }
        return ret;
    }
  public static void main(String[] args) {
    
    System.out.println(countBits(5).toString());
   
  }  
    
}
