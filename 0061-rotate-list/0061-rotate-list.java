class Solution {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null || head.next == null || k == 0) {
            return head;
        }

        // Find length of the list
        int n = 1;
        ListNode temp = head;

        while (temp.next != null) {
            n++;
            temp = temp.next;
        }

        k = k % n;

        while (k-- > 0) {

            ListNode secondLast = null;
            ListNode last = head;

            while (last.next != null) {
                secondLast = last;
                last = last.next;
            }

            last.next = head;
            secondLast.next = null;
            head = last;
        }

        return head;
    }
}