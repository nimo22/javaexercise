package leetcodeeasy;

import java.util.*;;
public class question37 {
    /*
     * Runtime
6ms
Beats21.76%of users with Java
Memory
41.28MB
Beats6.07%of users with Java
     */

    public static String convertToTitle(int columnNumber) {
        List <Integer> number= new ArrayList<>();

        while (columnNumber>0) {
            int remain= (columnNumber-1) %26;
            number.add(remain);
            columnNumber=(columnNumber-1)/26;
           
            }

            
        

        
           

          
        
         String o="";
           for(int i=number.size()-1;i>=0;i--){
               int a=number.get(i)+65;
              // System.out.println(a);
               char b= (char)(a);
              // System.out.println(b);
               o=o+b;
               
           }
        return o;  
        
        
    }

    public static void main(String[] args) {
       

        char x= 65;
        System.out.println(convertToTitle(1));
        
    }
    
}
