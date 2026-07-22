class Solution {
    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode oddDummy = new ListNode(-1);
        ListNode evenDummy = new ListNode(-1);

        ListNode oddTail = oddDummy;
        ListNode evenTail = evenDummy;

        ListNode curr = head;
        int pos = 1;

        // Create odd and even lists
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = null;

            if (pos % 2 == 1) {
                oddTail.next = curr;
                oddTail = curr;
            } else {
                evenTail.next = curr;
                evenTail = curr;
            }

            curr = next;
            pos++;
        }

        // Merge: even -> odd -> even -> odd
        ListNode odd = oddDummy.next;
        ListNode even = evenDummy.next;

        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;

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