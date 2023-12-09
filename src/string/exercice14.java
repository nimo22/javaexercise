package string;

import java.util.ArrayList;

public class exercice14 {
    //Write a Java program to find all interleavings of given strings.
    // you can add more to the string
    //this virsion doesnt not work with repeated letter as the its diffrent probability
    /*The given strings are: WX  YZ
    The interleavings strings are: 
WYXZ
YZXW
XWZY
WZXY
ZXYW
WYZX
YXWZ
XYWZ
YXZW
ZXWY
XZWY
XYZW
XWYZ
YZWX
WXYZ
WZYX
ZYXW
YWXZ
YWZX
ZWXY
ZYWX
ZWYX
XZYW
WXZY
    ...
    */

    
    static  int  numberOfAccurance(String str, char c){
        int accurance=0;
        char []ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            if (ch[i]==c) {
                accurance=accurance+1;
            }
        }
        return accurance;
    }
    public static void main(String[] args) {
        // you can use this as a mthode with twi string but for efficiency i will use it in main methode

        String str1="Lo";
        String str2="l";
    
        
        String together= str1.concat(str2);
        int hajem= together.length();
        int fact=1;
        while (hajem>0) {
            fact=hajem*fact;
            hajem--;
        }
      //System.out.println(numberOfAccurance(together,'W'));
        char[]x=together.toCharArray();
        ArrayList<String>allPossible= new ArrayList<>();
         System.out.println(fact);
        while (fact>0) {
    //System.out.println("OK");
            String word="";

            while (word.length()!=together.length()) {
                int random=(int)(Math.random()*10);
              //  System.out.println(numberOfAccurance(together,x[random])!=numberOfAccurance(word,x[random]));
                
                if (random<=together.length()-1 &&
                numberOfAccurance(together,x[random])!=numberOfAccurance(word,x[random])) {

                                 //   System.out.println(numberOfAccurance(together,x[random])!=numberOfAccurance(word,x[random]));

                    word=word.concat(String.valueOf(x[random]));
                }
              //  System.out.println("OK");
            }
            if(!allPossible.contains(word)){
                allPossible.add(word);
                fact--;
            }
            word="";
           // System.out.println("OK");
        }
        
        allPossible.forEach(System.out::println);

    }
    


    
}
