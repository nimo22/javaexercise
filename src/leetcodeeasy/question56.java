package leetcodeeasy;

import java.util.Arrays;
/*
 * Accepted
nimo22
nimo22
submitted at Jan 12, 2024 01:11
Runtime
3ms
Beats84.02%of users with Java
Memory
44.76MB
Beats7.28%of users with Java
 */
//https://leetcode.com/problems/valid-anagram/description/
public class question56 {
    public boolean isAnagram(String s, String t) {
        char[]word=s.toCharArray();
        char[]wordTwo=t.toCharArray();
        Arrays.sort(wordTwo);
        Arrays.sort(wordTwo);
        return Arrays.equals(word, wordTwo);
        
    }
}
