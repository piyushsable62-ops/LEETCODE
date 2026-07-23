class Solution {
    public ListNode mergeKLists(ListNode[] lists) {

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < lists.length; i++) {
            ListNode head = lists[i];

            while (head != null) {
                arr.add(head.val);
                head = head.next;
            }
        }

      
        Collections.sort(arr);

   
        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;

        for (int i = 0; i < arr.size(); i++) {
            t.next = new ListNode(arr.get(i));
            t = t.next;
        }

        return dummy.next;
    }
}