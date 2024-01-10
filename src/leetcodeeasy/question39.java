package leetcodeeasy;

public class question39 {
    
    public static void main(String[] args) {
        String x= String.valueOf("00000000000000000000000000001011");
        int ret=0;
        for(int i=0;i<x.length();i++){
            if(x.charAt(i)=='1'){
                ret+=1;
            }
        }
        System.out.println(ret);
    }
}
