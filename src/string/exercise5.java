package string;
//Write a Java program to compare two strings lexicographically, ignoring case differences. 
public class exercise5 {

    public boolean equa(String one, String two){
        
        one=one.toLowerCase();
        two=two.toLowerCase();
        boolean b=false;
        if(one.equals(two)){
             b=true;
        }

        return b;
    }
    
}
