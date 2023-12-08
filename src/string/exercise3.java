package string;
//3. Write a Java program to get the character (Unicode code point) before the specified index within the string. 
public class exercise3 {

    public int bef(int index, String x) {
            int t=-1;
        try{
            if (index>0) {
                Character c= x.charAt(index-1);
                t= c.charValue();
                System.out.println("!");
                
            }else{
                
                throw new ArrayIndexOutOfBoundsException ("error! index must be positive and greater then 0");
            }
        }catch(Exception e ){
            System.out.println(e.getMessage());
        }
        return t;
    }
}
     
