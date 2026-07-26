// class Solution {
//     public ListNode removeZeroSumSublists(ListNode head) {

//         ListNode temp = head;
//         int count = 0;
//         while (temp != null) {
//             temp = temp.next;
//             count++;
//         }
//         temp = head;
//         int[] ans = new int[count];
//         for (int i = 0; i < count; i++) {
//             ans[i] = temp.val;
//             temp = temp.next;
//         }
//         for (int i = 0; i < ans.length; i++) {
//             int sum = 0;
//             for (int j = i; j < ans.length; j++) {
//               sum += ans[j];
//              if (sum == 0) {
//                     int size = ans.length - (j - i + 1);
//                     int[] newArr = new int[size];
//                     int k = 0;
//                     for (int x = 0; x < ans.length; x++) {
//                         if (x >= i && x <= j) {
//                             continue;
//                         }
//                         newArr[k++] = ans[x];
//                     }
//                     ans = newArr;
//                     i = -1;
//                     break;
//                 }
//             }
//         }

//         ListNode dummy = new ListNode(-1);
//         ListNode t = dummy;
//         for (int i = 0; i < ans.length; i++) {
//             t.next = new ListNode(ans[i]);
//             t = t.next;
//         }

//         return dummy.next;
//     }
// }
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
class Solution {
    public ListNode removeZeroSumSublists(ListNode head) {
        // find size
        ListNode temp = head;
        int size = 0;
        while(temp != null){
            temp = temp.next;
            size++;
        }

        // Linked List to array
        temp = head;
        int arr[] = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = temp.val;
            temp = temp.next;
        }

        // find sub array with sum equal to 0.
        for(int i=0; i<size; i++){
            int val = arr[i];
            for(int j=i+1; j<size; j++){
                val += arr[j];
                // if sum = 0 then make arr[i] to arr[j] zero.
                if(val == 0){
                    int k=i;
                    while(k <= j) arr[k++] = 0;
                    i = k-1;
                }
            }
        }

        // array to linked list.
        ListNode Head = new ListNode(0);
        temp = Head;
        for(int i=0; i<size; i++){
            if(arr[i] == 0) continue;
            ListNode node = new ListNode(arr[i]);
            temp.next = node;
            temp = temp.next;
        }

        return Head.next;
    }
}