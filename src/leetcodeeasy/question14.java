package leetcodeeasy;
//https://leetcode.com/problems/add-binary/
/*
 * Runtime
Details
3ms
Beats 33.91%of users with Java
Memory
Details
45.44MB
Beats 5.07%of users with Java
 */
public class question14 {
    public  static String addBinary(String a, String b) {
        String response="";   
        int bigger=0;
        if (a.length()>b.length()) {
            bigger=a.length()-b.length();
            for(int i=0;i<bigger;i++){
                b="0".concat(b);

            }
        }else{
            bigger=b.length()-a.length();
            for(int i=0;i<bigger;i++){
                a="0".concat(a);

            }
        }
        //01
        //11
        // case 1 : 1 1 sous case there is 1 to add or not 
        //case 2 :1 0 || 0 1  sous case there is one to add
        boolean addOne=false;
        for(int i=a.length()-1;i>-1;i--){
            if(a.charAt(i)=='1' && b.charAt(i)=='1'){
                if (!addOne) {
                    addOne=true;
                    response="0".concat(response);
                    
                }else{
                    addOne=true;
                    response="1".concat(response);
                }
            }else if(a.charAt(i)=='1' || b.charAt(i)=='1'){
                if(addOne){
                    addOne=true;
                    response="0".concat(response);
                }else{
                    response="1".concat(response);
                }
            }else{
               if(addOne){
                addOne=false;
                response="1".concat(response);

               }else{
                response="0".concat(response);
               } 
            }
   
        }

        if (addOne) {
            response="1".concat(response);
            
        }           
        return response;
        
    }


    public static void main(String[] args) {
        
        
        
    }
}
