package string;

public class exercice11 {
    static boolean checkw(String one,String two,int offset1 ,int offset2, int len){
        boolean eq=false;
        one = one.substring(offset1,offset1+len);
        two=two.substring(offset2,offset2+len);

        if(one.equals(two)){
            eq=true;
        }


        return eq;
        }

    public static void main(String[] args) {
        String str1 = "Shanghai Houston Colorado Alexandria";
        String str2 = "Alexandria Colorado Houston Shanghai";

        boolean one=str1.regionMatches(0, str2, 28, 8);
        boolean two = str1.regionMatches(9, str2, 20, 7);
        System.out.println(one);
        System.out.println(two);
        // my virsion of the offset methode 
       
        System.out.println(checkw(str1,str2,0,28,8));
       
    }
     

        
}
