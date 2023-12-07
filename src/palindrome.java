/**
 * palindrome
 */
public class palindrome {

    public boolean palen(String word){
        boolean res=false;
        String newWord="";
        int size= word.length();
        for(int i=size-1 ;i>=0; i--){
            newWord=newWord+word.charAt(i);
        }
        if(word.equals(newWord)){
            res=true;
        }
        return res;
    }
}