package leetcodeeasy;
//https://leetcode.com/problems/teemo-attacking/submissions/1161867945/

/*
 * Runtime
3ms
Beats74.28%of users with Java
Memory
44.70MB
Beats90.13%of users with Java
 */
public class question99 {
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries[timeSeries.length-1]<duration){
            return duration+timeSeries[timeSeries.length-1]-1;
         }
         
         int sec=0;
         int max=0;
         int resp=0;
         for(int i=0;i<timeSeries.length;i++){//
            System.out.println(timeSeries[i]);
            System.out.println(max);
            System.out.println(timeSeries[i]+">="+max);
            
            if(timeSeries[i]>max){

                resp=resp+duration;
                max=duration+timeSeries[i]-1;
                
            }else{
                
                System.out.println("ok1");
                resp=resp+duration-Math.abs((max-timeSeries[i]+1));
                max=timeSeries[i]-1+duration;
            }
            
           
             
             }
 
         
         return resp;
    }
    public static void main(String[] args) {
        int x[]={1,2,3,4,5,6,7,8,9};
        int d=4;
        System.out.println(findPoisonedDuration(x,1));

    }
}
