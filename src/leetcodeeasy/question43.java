package leetcodeeasy;

public class question43 {
  class ListNode {
             int val;
             ListNode next;
             ListNode() {}
             ListNode(int val) { this.val = val; }
             ListNode(int val, ListNode next) { this.val = val; this.next = next; }
         }
        
    public ListNode reverseList(ListNode head) {
        
        if (head==null) {
            
            return null;
        }else{
            if(head.next.next==null){
                head.next=null;
                return new ListNode(head.next.next.val, reverseList(head));
            }

        }


        return reverseList(head.next);
        
    }
}
