package string;
//2. Write a Java program to get the character (Unicode code point) at the given index within the string. 
public class exercise2 {

    public int unicod(String x, int index){
        Character w =x.charAt(index);
        return w.charValue();
    }
    
}
