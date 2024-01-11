package leetcodeeasy;
/*
 * Accepted
nimo22
nimo22
submitted at Jan 10, 2024 15:12
Runtime
1ms
Beats93.01%of users with Java
Memory
46.81MB
Beats7.61%of users with Java
 */
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class question41 {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null){
            return null;
        }else{
            if(head.val==val && head.next!=null){
                return removeElements( head.next,  val);
            }else if(head.val==val &&head.next==null ){
                return null;
            }
        }

        return new ListNode(head.val,removeElements( head.next,  val));
    }
}
