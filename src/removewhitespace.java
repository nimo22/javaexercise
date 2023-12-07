/**
 * removewhitespace
 */
public class removewhitespace {

    public String whitespace(String phrase){
        String newPhrase="";

        if (phrase.length()==0) {
            return newPhrase;
        }else{
            for(int i=0;i<phrase.length();i++){
                if(phrase.charAt(i)!=' '){
                    newPhrase=newPhrase+phrase.charAt(i);
                }
            }
        return newPhrase;
        }
    }
}