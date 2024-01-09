package leetcodeeasy;
/*
 * Accepted
Runtime
Details
1ms
Beats 27.83%of users with Java
Memory
Details
44.14MB
Beats 36.00%of users with Java
 */
public class question33 {
    


  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
 }
 
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode slow;
        ListNode fast;
         if(head!=null){
             slow = head.next;
        }else{
            return false;
        }
        if(head.next!=null){
             fast=head.next.next;
        }else{
            return false;
        }
       while(slow.next!=null && fast.next!=null&& fast.next.next!=null){
           if(slow.val==fast.val){
               return true;
           }else{
               slow=slow.next;
               fast=fast.next.next;
           }
       }
       return false;
        
    }
}
}
