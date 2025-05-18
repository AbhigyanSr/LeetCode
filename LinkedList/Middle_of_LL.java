//return the middle of the LL
public class Middle_of_LL {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public static ListNode middleNode(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode curr = head;
        int count = 0;
        while (curr != null) {
            count++;
            curr = curr.next;
        }
        if(count==1) return head;
        ListNode temp=head;
        for (int i=0;i<count/2;i++){
            temp=temp.next;
        }
        return temp.next;
    }

    public static ListNode createNode(int val, ListNode mover) {
        ListNode temp = new ListNode(val);
        mover.next = temp;
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        ListNode head = new ListNode(arr[0]);
        ListNode mover = head;
        for (int i = 1; i < arr.length; i++) {
            mover = createNode(arr[i], mover);
        }
        System.out.println(middleNode(head));
    }
}
