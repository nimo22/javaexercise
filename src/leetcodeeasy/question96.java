package leetcodeeasy;
//https://leetcode.com/problems/number-complement/submissions/1161626758/
public class question96 {
    public  static int findComplement(int num) {

        String word=Integer.toBinaryString(num);
        char[]w=word.toCharArray();
        for(int i=0;i<w.length;i++){
            System.out.println(w[i]);
            if (w[i]=='1') {
                w[i]='0';
            }else{
                w[i]='1';
            }
        }

        word=String.valueOf(w);
        System.out.println(word);
        int times=1;
        int response=0;
        for(int i=word.length()-1;i>=0;i--){
            response=response+Integer.valueOf(word.charAt(i)-'0')*times;
            times=times*2;
        }
        return response;
    }

   public static void main(String[] args) {
    System.out.println(findComplement(5));
   } 
}
