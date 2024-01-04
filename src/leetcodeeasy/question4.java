package leetcodeeasy;
import java.util.*;
//https://leetcode.com/problems/roman-to-integer/
public class question4 {
    public static int romanToInt(String s) {
        HashMap<Character ,Integer> roman= new HashMap<Character,Integer>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        char[]romanToChar= s.toCharArray();
        int total=0;

        for(int i=0;i<romanToChar.length;i++){
            if(romanToChar[i]=='I'){
                if (i!=romanToChar.length-1) {
                    if(romanToChar[i+1]=='V' || romanToChar[i+1]=='X' ){
                        total=total-2;
                    }
                }

            }else if(romanToChar[i]=='X'){
                if (i!=romanToChar.length-1) {
                    if(romanToChar[i+1]=='L' || romanToChar[i+1]=='C' ){
                        System.out.println("OK1");
                        total=total-20;
                    }
                }

            }else if(romanToChar[i]=='C'){
            if (i!=romanToChar.length-1) {
                 if (i!=romanToChar.length-1) {
                    if(romanToChar[i+1]=='D' || romanToChar[i+1]=='M' ){
                        System.out.println("OK2");
                        total=total-200;
                    }
            }
            }
                 }

            total= total+roman.get(romanToChar[i]);

            
        }



        return total;
        
    }

    public static void main(String[] args) {
        
        System.out.println(romanToInt("LVIII"));
    }
}
