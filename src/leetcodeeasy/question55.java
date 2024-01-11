package leetcodeeasy;
//https://leetcode.com/problems/palindrome-linked-list/submissions/1143453801/
import java.util.ArrayList;
/*
 * Accepted
nimo22
nimo22
submitted at Jan 11, 2024 11:25
Runtime
8ms
Beats31.40%of users with Java
Memory
55.86MB
Beats94.11%of users with Java
 */

public class question55 {
  
  public class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
 public boolean isPalindrome(ListNode head) {
         ArrayList<Integer>o=new ArrayList<>();
        while (head!=null) {
            o.add(head.val);
            head=head.next;  
        }
        
        

       
            
             for(int i=0;i<o.size()/2;i++){//0-1 2
                if (o.get(i)!=o.get(o.size()-1-i)) {
                    return false;
                
            }
            
        }
        
        

        return true;
    }
    }
