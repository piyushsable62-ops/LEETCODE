

class Solution {
    public Node flatten(Node head) {
        if(head == null){
            return head;
        }
        Node current = head;
        while(current != null){
            if(current.child == null){
                current = current.next;
            }else{
                Node foward = current.next;
                Node childhead = flatten(current.child);
                current.child = null;
                current.next = childhead;
                childhead.prev = current;
                Node temp = head;
                while(temp.next != null){
                    temp = temp.next;
                }
                temp.next = foward;
                if(foward != null){
                    foward.prev = temp;
                }
            }
        }
        return head;
        
    }
}