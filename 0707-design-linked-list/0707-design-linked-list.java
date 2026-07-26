class MyLinkedList {

    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    ListNode head;
    int count;

    public MyLinkedList() {
        head = null;
        count = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= count) {
            return -1;
        }

        ListNode temp = head;

        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }

        return temp.val;
    }

    public void addAtHead(int val) {
        ListNode temp = new ListNode(val);
        temp.next = head;
        head = temp;
        count++;
    }

    public void addAtTail(int val) {
        ListNode temp1 = new ListNode(val);

        if (head == null) {
            head = temp1;
            count++;
            return;
        }

        ListNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = temp1;
        count++;
    }

    public void addAtIndex(int index, int val) {

        if (index < 0 || index > count) {
            return;
        }

        if (index == 0) {
            addAtHead(val);
            return;
        }

        if (index == count) {
            addAtTail(val);
            return;
        }

        ListNode temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        ListNode temp1 = new ListNode(val);
        temp1.next = temp.next;
        temp.next = temp1;

        count++;
    }

    public void deleteAtIndex(int index) {

        if (index < 0 || index >= count) {
            return;
        }

        if (index == 0) {
            head = head.next;
            count--;
            return;
        }

        ListNode temp = head;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        temp.next = temp.next.next;

        count--;
    }
}