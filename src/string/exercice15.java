package string;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

//Write a Java program to find the length of the longest substring of a given string without repeating characters. 
public class exercice15 {
    public static void main(String[] args) {
      //  String input="pickoutthelongestsubstring";
      String input="Microsoft";
        // brut force solution
        char []c=input.toCharArray();
        System.out.println(Arrays.toString(c));
        String word="";
        ArrayList<String>ar= new ArrayList<>();
        for(int i=0;i<c.length;i++){
            for(int r=i;r<c.length;r++){
                if(!word.contains(String.valueOf(c[r]))){
                    word=word+String.valueOf(c[r]);
                }else{
                    ar.add(word);
                     word="";
                    break;
                }

            }
        }
        word="";
        for(int i=0;i<ar.size();i++){
            if(ar.get(i).length()>word.length()){
                word=ar.get(i);
            }
        }
        System.out.println(word);

        // smarter solution

        HashMap<Character,Integer> ma = new HashMap<>();
        
        for(int i=0;i<c.length;i++){
            if(!ma.containsKey(c[i])){
                ma.put(c[i],i);
            }
        }
    
      
       
    }   
         
    
}
