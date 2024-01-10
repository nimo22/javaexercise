package leetcodeeasy;

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

    while(headAcopie!=null) {
         System.out.println("NEXT");
        while (headBcopie!=null) {
          

            if (headAcopie.val==headBcopie.val) {
                 System.out.println("trrrr");
                return headAcopie;
            }
            else{
                headBcopie=headBcopie.next;
            }
            
        }
        headAcopie=headAcopie.next; 
    }



 return null;
}
    
}
