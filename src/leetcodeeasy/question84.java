package leetcodeeasy;
/*
 * Runtime
1ms
Beats99.60%of users with Java
Memory
44.79MB
Beats76.38%of users with Java
 */
import java.util.ArrayList;
import java.util.List;
//fizzzbuzzzz
//https://leetcode.com/problems/fizz-buzz/
public class question84 {
      public List<String> fizzBuzz(int n) {
        List <String> answer= new ArrayList<>();
         for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                answer.add("FizzBuzz");

            }else if(i%3==0){
                answer.add("Fizz");
            }else if(i%5==0){
                answer.add("Buzz");
            }else{
                answer.add(String .valueOf(i));
            }
         }
        
        return answer;
    }
    
}
