package leetcodeeasy;
/*
 * Time Limit Exceeded
25 / 25 testcases passed
Testcases passed, but took too long.
 */
public class question77 {
    /** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */


public int guessNumber(int n) {
    int high=0;
    int low=0;
 while(guess(n)==-1){
     n=n/2;
     if(guess(n)==+1){
         low =n;
         high=n*2;
     }
 }
  while(guess(n)==1){
     n=n*2;
       if(guess(n)==-1){
         low =n/2;
         high=n;
     }
 }
 for(int i=low ;i<high ;i++){
     if(guess(i)==0){
         return i;
     }
 }
 return n;
        
    

}
}
