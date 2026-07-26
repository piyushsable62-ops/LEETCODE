
class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode temp = list1;
        int count = 1;
        while(count<a){
            temp = temp.next;
            count++;
        }
        ListNode head1 = temp;
         temp = list1;
        count = 0;
        while(count<b+1){
            temp = temp.next;
            count++;
        }
    
       ListNode temp1 = list2;
        while(temp1.next != null){
            temp1 = temp1.next;
        }
        head1.next = list2;
        temp1.next = temp;
        return list1;
      
        
    }
}