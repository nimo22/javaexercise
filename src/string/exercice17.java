package string;



public class exercice17 {

  public static class ListNode {
      int val;
      ListNode next;
      ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 
   
   public static ListNode add(int value, ListNode node){
    if(node==null){
        return new ListNode(value);
    }
    add(value, node.next);
    
    return node;
   }

   public static void printlist(ListNode node){
    if(node==null){
        
    }else{
        System.out.println(node.val);
        printlist(node);
    }
   }
    public static void main(String[] args) {
        ListNode ls =null;
        int [] ar ={1,2,3,4,5};
        for (int i=0;i<ar.length;i++){
            add(ar[i], ls);
        }
        printlist(ls);
        

        
}
}
