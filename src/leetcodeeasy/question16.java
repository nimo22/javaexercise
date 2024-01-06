package leetcodeeasy;
//https://leetcode.com/problems/climbing-stairs/

public class question16 {
//Time Limit Exceeded but the answer is valide
     public static int climbStairs(int n) {
        //f(1)=1 f(2)=2
        //fibonuci recursion f(n)=f(n-1)+f(n-2)
        if(n==1 ||n==0){
            return 1;
        }else if (n==2) {
            return 2;
        }else{
            int answer=0;
            answer=climbStairs(n-1)+climbStairs(n-2);
        return answer;
        }
        
    }
    public static void main(String[] args) {
        System.out.println(climbStairs(45));
    }
}
