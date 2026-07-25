
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head == null || head.next == null){
            return new int[]{-1,-1};
        }
        ArrayList<Integer> ans = new ArrayList<>();
        ListNode temp = head.next;
        ListNode t = head;
        int count = 1;
        while(temp.next != null){
            if((t.val < temp.val && temp.val > temp.next.val) || (temp.val<t.val && temp.val<temp.next.val)){
                ans.add(count);
            }
            temp = temp.next;
            t= t.next;
            count++;
        }
        if(ans.size()<2){
            return new int[]{-1,-1};
        }
        int x = ans.get(ans.size()-1)-ans.get(0);
        int minDiff = Integer.MAX_VALUE;
     

        for (int i = 1; i < ans.size(); i++) {
         minDiff = Math.min(minDiff, ans.get(i) - ans.get(i - 1));
        }
        return new int[]{minDiff,x};
        
    }
}