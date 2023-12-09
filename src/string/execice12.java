package string;

public class execice12 {

    public static void main(String[] args) {
        //26. Write a Java program to check whether a given string starts with another string. 
        String str="Red is favorite color. starts with Red?";
      //  System.out.println(str.startsWith("Red"));
        //27. Write a Java program to get a substring of a given string at two specified positions. 
        str="The quick brown fox jumps over the lazy dog.";
        //System.out.println(str.substring(10,25));

        char [] x=str.toCharArray();
       for (char c : x) {
         //System.out.print(c);
       }


    }
    
}
