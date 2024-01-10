package leetcodeeasy;
/*
 * Accepted
Runtime
Details
627ms
Beats 5.06%of users with Java
Memory
Details
47.95MB
Beats 31.68%of users with Java 
 */
public class question36 {
    
  public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
 

public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode headBcopie=headB;
    ListNode headAcopie=headA;

    while(headBcopie!=null) {
         System.out.println("NEXT");
        while (headAcopie!=null) {
          

            if (headAcopie.val==headBcopie.val) {//
                 System.out.println("trrrr");
                return headBcopie;
            }
            else{
                headAcopie=headAcopie.next;
            }
            
        }
        headBcopie=headBcopie.next; 
    }



 return null;
}
    
}
