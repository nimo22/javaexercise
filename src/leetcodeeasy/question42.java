package leetcodeeasy;

public class question42 {
    public  static boolean isIsomorphic(String s, String t) {
        if(s.length() !=t.length()){
            return false;
        }else{
            for(int i=0;i<t.length();i++){
                
                char replace=t.charAt(i);
                
                for(int r=0;r<s.length();r++){
                    String word="";
                    for(int p=0;p<s.length();p++){
                        char moveit=s.charAt(r);
                        if (moveit==s.charAt(p)) {
                            word=word+replace;
                        }else{
                            word=word+s.charAt(p);
                        }

                    }
                    System.out.println(word);
                    if (word==t) {
                        return true;
                    }
                    


                }
            }
            
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isIsomorphic("egg" ,"add"));
    }
}
