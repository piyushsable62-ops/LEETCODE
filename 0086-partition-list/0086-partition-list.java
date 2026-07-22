
class Solution {
    public ListNode partition(ListNode head, int x) {
      ListNode i = head;

      ListNode dummy1 = new ListNode(-1);
      ListNode dummy2 = new ListNode(-1);

      ListNode t1 = dummy1;
      ListNode t2 = dummy2;
      while(i!=null){
        if(i.val<x){
            t1.next = i;
            t1 = i;
        }else{
            t2.next = i;
            t2 = i;
        }
           i = i.next;
      }
     t2.next = null;
    
      t1.next = dummy2.next;
      return dummy1.next;

        
    }
}