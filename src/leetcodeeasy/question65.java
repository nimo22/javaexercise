package leetcodeeasy;

import java.util.ArrayList;
import java.util.HashMap;
/*
 * Accepted
nimo22
nimo22
submitted at Jan 12, 2024 07:28
Runtime
3ms
Beats8.35%of users with Java
Memory
41.30MB
Beats28.10%of users with Java
 */
public class question65 {
    public static boolean wordPattern(String pattern, String s) {
        if(pattern.length()==0){
            return false;
        }
        
        String []div=s.trim().split("\\s+");
        System.out.println(div.length);
        if (div.length!=pattern.length()) {
                    return false;
            }

        HashMap<String,Character> map = new HashMap<>();
        int counter=0;

        for(String st :div){
            if(map.containsKey(st) &&pattern.charAt(counter)!=map.get(st)){
                return false;
            }
            
            map.put(st, pattern.charAt(counter));
            counter++;
        }
        ArrayList<Character>cs= new ArrayList<>();
        for(String st :map.keySet()){

            if(cs.contains(map.get(st))){
                return false;
            }else{
                cs.add(map.get(st));
            }
        }
        
         
        return true;
    }
   public static void main(String[] args) {
    String s="jquery";
    String patter="jquery";
    System.out.println(wordPattern(patter,s));

   } 
}
