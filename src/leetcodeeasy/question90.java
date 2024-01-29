package leetcodeeasy;

import java.util.Arrays;
/*
 * Runtime
572ms
Beats5.04%of users with Java
Memory
45.61MB
Beats11.18%of users with Java
 */
//https://leetcode.com/problems/assign-cookies/
public class question90 {
    public static int findContentChildren(int[] g, int[] s) {
        if (s.length ==0 || g.length==0) {
            return 0;
        }
        int happyCounter=0;
        Arrays.sort(g);// small to big
        Arrays.sort(s);// small to big 
        
        for(int i=g.length-1;i>=0;i--){// big to small
           
             if(s[s.length-1]==-1){
                    break;
                }
                if(s[s.length-1]>=g[i]){
                    
                    s[s.length-1]=-1;
                    happyCounter++;
                    Arrays.sort(s);
                    
                }
               
                

            
        }


        
        return happyCounter;
    }

    public static void main(String[] args) {
        int g[]={10,9,8,7};
        int s[]={5,6,7,8};
        System.out.println(findContentChildren(g,s));
    }
}

