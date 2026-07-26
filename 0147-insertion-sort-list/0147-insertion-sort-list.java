class Solution {
    public ListNode insertionSortList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        ListNode dummy = new ListNode(-1);
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            ListNode prev = dummy;
            ListNode temp = dummy.next;
            while (temp != null && temp.val < curr.val) {
                prev = temp;
                temp = temp.next;
            }
            curr.next = temp;
            prev.next = curr;
            curr = next;
        }
        return dummy.next;
    }
}