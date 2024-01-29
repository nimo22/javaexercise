package leetcodeeasy;

import java.math.BigInteger;

public class qustion89 {
    
 
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        StringBuilder rev = new StringBuilder();
        rev.append(add(l1));
        double one=Integer.valueOf(rev.reverse().toString());
        System.out.println(one);
        rev = new StringBuilder();
        rev.append(add(l2));
        double two=Integer.valueOf( rev.reverse().toString());
        rev=new StringBuilder();
        String total=String.format(".0f",one+two);
        System.out.println(total);
        rev.append(total);
        total=rev.reverse().toString();
        
    
        return addT(total);
  }


  public String add(ListNode l1){
    if(l1==null){
        return "";
    }


    return String.valueOf(l1.val).concat(add(l1.next));
  }
     public ListNode addT(String number){
        if (number=="") {
            return null;
        }else

        return new ListNode(Integer.valueOf(number.charAt(0)-'0'), addT(number.substring(1)));
    }
}
