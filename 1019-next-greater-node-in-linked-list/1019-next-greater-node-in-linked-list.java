 
class Solution {
    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> ans = new ArrayList<>();
        ListNode temp1 = head;
        while(temp1!=null){
            ListNode temp2 = temp1.next;
            Boolean found = false;
             while(temp2 !=null){
                if(temp2.val > temp1.val){
                    ans.add(temp2.val);
                    found = true;
                    break;
                }
                temp2 = temp2.next;
             }
             if(!found){
                ans.add(0);
             }
             temp1 = temp1.next;
        }
    int[] list = new int[ans.size()];
    for(int i = 0;i<list.length;i++){
        list[i] = ans.get(i);
    }
    return list;
        
    }
}