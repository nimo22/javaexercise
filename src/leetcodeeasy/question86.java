package leetcodeeasy;
//https://leetcode.com/problems/add-strings/
//todo
public class question86 {
   public static void main(String[] args) {
    
    String x="584";//"9333852702227987";
    String y="18";//"85731737104263";
    String big="";
    String small="";
    String ret="";
    int plus=0;
    if(x.length()>y.length()){
        big=x;
        small=y;
    }else{
        big=y;
        small=x;
    }
    int count=1;
    int sum=0;
    for(int i=big.length()-1;i>=0;i--){
        if(small.length()-count!=-1){
        sum=Integer.valueOf(big.charAt(i)-'0')+Integer.valueOf(small.charAt(small.length()-count++)-'0');
        }else{
         sum=Integer.valueOf(big.charAt(i)-'0');
        }
        if(sum>=10){
            if (plus==1) {
                ret=String.valueOf(sum-9)+ret;
                
            }else{
                ret=String.valueOf(sum-10)+ret;
            }
            plus=1;
            


        }else{
            System.out.println(sum);
            if (plus==1) {
                plus=0;
                    if (sum==9) {
                        ret=String.valueOf(0)+ret;
                        plus=1;
                    }
                ret=String.valueOf(sum+1)+ret;
            }else{

            ret=String.valueOf(sum)+ret;
            System.out.println(ret);
            }
        }
     
      

        }
        System.out.println(ret);


   }
}
