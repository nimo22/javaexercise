package leetcodeeasy;
//https://leetcode.com/problems/reverse-vowels-of-a-string/description/

/*
 * Accepted
nimo22
nimo22
submitted at Jan 15, 2024 18:43
Runtime
1ms
Beats100.00%of users with Java
Memory
45.02MB
Beats25.22%of users with Java
 */

public class question72 {
    public  static String reverseVowels(String s) {

       
            boolean[] vowels = new boolean[128];
            for (char vowel : "aeiouAEIOU".toCharArray()) {
                vowels[vowel] = true;
            }
    
            char[] letters = s.toCharArray();
            int i = 0;
            int k = letters.length - 1;
            while (i <= k) {
                if (vowels[letters[i]] && vowels[letters[k]]) {
                    char temp = letters[k];
                    letters[k] = letters[i];
                    letters[i] = temp;
                    k--;
                    i++;
                    continue;
                }
    
                if (!vowels[letters[i]]) {
                    i++;
                }
    
                if (!vowels[letters[k]]) {
                    k--;
                }
            }
            return new String(letters);
        }


        
    
    public static void main(String[] args) {
        String s="Marge, let's \\\"went.\\\" I await news telegram.";
        char []p=s.toCharArray();
        System.out.println(reverseVowels(s));
    }
}

