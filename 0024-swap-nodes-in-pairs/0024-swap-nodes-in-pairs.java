class Solution {
    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode oddHead = odd;
        ListNode evenHead = even;

      
        while (even != null && even.next != null) {

            odd.next = odd.next.next;
            odd = odd.next;

            even.next = even.next.next;
            even = even.next;
        }

        odd.next = null;

       
        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;

        odd = oddHead;
        even = evenHead;

        while (even != null && odd != null) {

            t.next = even;
            even = even.next;
            t = t.next;

            t.next = odd;
            odd = odd.next;
            t = t.next;
        }

        if (odd != null) {
            t.next = odd;
        }

        return dummy.next;
    }
}