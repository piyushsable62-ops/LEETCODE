class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {

        ListNode temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        temp = head;
        int[] ans = new int[count];
        for (int i = 0; i < count; i++) {
            ans[i] = temp.val;
            temp = temp.next;
        }
        for (int i = 0; i < ans.length; i++) {
            int sum = 0;
            for (int j = i; j < ans.length; j++) {
              sum += ans[j];
             if (sum == 0) {
                    int size = ans.length - (j - i + 1);
                    int[] newArr = new int[size];
                    int k = 0;
                    for (int x = 0; x < ans.length; x++) {
                        if (x >= i && x <= j) {
                            continue;
                        }
                        newArr[k++] = ans[x];
                    }
                    ans = newArr;
                    i = -1;
                    break;
                }
            }
        }

        ListNode dummy = new ListNode(-1);
        ListNode t = dummy;
        for (int i = 0; i < ans.length; i++) {
            t.next = new ListNode(ans[i]);
            t = t.next;
        }

        return dummy.next;
    }
}