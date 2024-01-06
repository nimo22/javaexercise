package leetcodeeasy;

  /*
   * Accepted
Runtime
Details
17ms
Beats 16.71%of users with Java
Memory
Details
44.53MB
Beats 7.21%of users with Java
   */
 
public class question17 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }else{
        if(head.next==null){
            return head;
        }else{
            if (head.val!=head.next.val) {
                deleteDuplicates(head.next);
 
            }else{
                if(head.next.next==null){
                    head.next=null;
                    return head;
                }else{
                    head.next=head.next.next;
                    deleteDuplicates(head); // the reason why we did it is to verifier if the next next value is the same as head

                }
            }
        }
           
    }
    return head; 
}
}
