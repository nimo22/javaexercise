package leetcodeeasy;
/*
 * Runtime
107ms
Beats5.06%of users with Java
Memory
45.49MB
Beats7.65%of users with Java
 */

public class question78 {
    public boolean canConstruct(String ransomNote, String magazine) {
        char []word= ransomNote.toCharArray();
        char[]magaz=magazine.toCharArray();
        String answer=" ";
        for(int i=0;i<word.length;i++){
            for(int r=0;r<magaz.length;r++){
                if (word[i]!=' ' && word[i]==magaz[r]) {
                    word [i]=' ';
                    magaz[r]=' ';
                    
                }

            }

        }
        for (char c : magaz) {
            answer=answer+c;
        }
        if (answer.strip().isEmpty()) {
            return true;
        }


        return false;
    }
}
