package string;
import java.util.*;
//32. Write a Java program to find the longest Palindromic Substring within a string. 
public class exercice13 {

    public static void main(String[] args) {
        
    String str="thequickwbrowndoxxofnworbekciuqeht";
    

    char[] chr=str.toCharArray();

    ArrayList<String>candidate= new ArrayList<>();

    ArrayList<String> ar =new ArrayList<>();
    for(int i=0;i<chr.length;i++){
        ar.add(String.valueOf(chr[i]));

    }
    String match="";
    for(int i=0;i<ar.size()/2;i++){
        if(ar.get(i).equals(ar.get(ar.size()-1-i))){

            match=match.concat(ar.get(i));
            if(match.length()>2){
                
                 candidate.add(match);   
                
                
            }
            
        }else{
           
            match="";
        }
    }
    
    String word="";
    for(int i=0;i<candidate.size();i++){

        if(word.length()<candidate.get(i).length()){
            word=candidate.get(i);
        }

    }
    System.out.println(word);
    char[]che=word.toCharArray();
    for(int i=che.length-1;i>=0;i--){
        word=word.concat(String.valueOf(che[i]));
    }
    System.out.println(word);
    

    }
    
}
