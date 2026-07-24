
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head1 = l1;
        ListNode head2 = l2;
        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;
        int carry = 0;
        while(head1 != null || head2!= null){
            int x = 0;
            if (head1 != null){
              x = head1.val; 
             head1 = head1.next; 
            } 
            int y = 0;
            if (head2 != null) {  
                y = head2.val;
               head2 = head2.next;
             
            }
            int sum = x+y+carry;
            if(sum>9){
                t.next = new ListNode(sum%10);
                carry = 1;  
            }else{
                t.next = new ListNode(sum);
                carry = 0;
            }
            t = t.next;
        }
        if(carry == 1){
            t.next = new ListNode(1);
        }
        return (dummy.next);
     
    }
    // public ListNode reverse(ListNode head){
    //     ListNode c = head;
    //     ListNode f = head;
    //     ListNode t = null;
    //     while(c != null){
    //         f = c.next;
    //         c.next = t;
    //         t  = c;
    //         c = f;
    //     }
    //     return t;
    }
