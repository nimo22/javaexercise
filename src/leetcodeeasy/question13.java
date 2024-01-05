package leetcodeeasy;
//https://leetcode.com/problems/plus-one/
/*
 * Runtime
Details
0ms
Beats 100.00%of users with Java
Memory
Details
41.86MB
Beats 18.09%of users with Java
 */
public class question13 {
    public static int[] plusOne(int[] digits) {
        //add
        
        digits[digits.length-1]=digits[digits.length-1]+1;
        //no change
        if(digits[digits.length-1]!=10){
            return digits;
        }else{
        for(int i=digits.length-1;i>-1;i--){
            //case where digit preceding the increment 9 is not a 9 exemple 19->20
            if (digits[i]==10 && i-1!=-1 && digits[i-1]!=9) {
                digits[i]=0;
                digits[i-1]=digits[i-1]+1;
                break;
            }else if(digits[i]==10 && i-1!=-1 && digits[i-1]==9 ){
                digits[i]=0;
                digits[i-1]=10;
            }else if(digits[i]==10 && i-1==-1){
                System.out.println("here");
                digits[i]=0;
                
              
                digits = new int[digits.length+1];
                digits[0]=1;
            
                break;
            }
        }
        }
        
        return digits;

    }

    public static void main(String[] args) {
        int [] p={9,9};
        int []po=plusOne(p);
        for(int i=0;i<po.length;i++){
            System.out.println(po[i]);
        }
        
    }
}
// TOOK TO MUCH TIME FOR NOTHING