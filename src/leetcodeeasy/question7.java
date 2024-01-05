package leetcodeeasy;


/*
 * Runtime
Details
0ms
Beats 100.00%of users with Java
Memory
Details
42.70MB
Beats 5.47%of users with Java
 */
//https://leetcode.com/problems/merge-two-sorted-lists/
public class question7 {
    
 // Definition for singly-linked list.
 public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
  

 public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
    // boolean recurs=false;
    // if(!recurs){
    // List <Integer> li= new ArrayList<>();
    // if(list1==null){

    // }else{
    //     while (list1.next!=null) {
    //         li.add(list1.val);
    //         list1=list1.next;
            
    //     }

    // }
    // if(list2==null){

    // }else{
    //     while (list2.next!=null) {
    //         li.add(list1.val);
    //         list1=list1.next;
            
    //     }

    // }
    // li.sort(Comparator.naturalOrder());
    // }
    
    // ListNode response = new ListNode();
    
    
   // null
   if(list1==null){
    return list2;
   }else if (list2==null){
    return list1;
   }
   if(list1.val<list2.val){
    list1.next=mergeTwoLists(list1.next, list2);
    return list1;
   }else{
    list2.next=mergeTwoLists(list1, list2.next);
    return list2;
        
   }

   
    
}

}

