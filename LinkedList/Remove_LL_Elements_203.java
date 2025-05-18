public class Remove_LL_Elements_203 {
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
            this.next=null;
        }
    }
    public static ListNode createNode(int val, ListNode mover){
        ListNode temp= new ListNode(val);
        mover.next=temp;
        return temp;
    }
    public static ListNode removeElements(ListNode head, int val) {
        // Remove all matching nodes at the beginning
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode curr = head;

        // Now remove matching nodes after the head
        while (curr != null && curr.next != null) {
            if (curr.next.val == val) {
                curr.next = curr.next.next; // Skip the node with val
            } else {
                curr = curr.next; // Move forward only if we didn't delete
            }
        }

        return head;
    }

    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        ListNode head=new ListNode(arr[0]);
        ListNode mover=head;
        for (int i = 1; i < arr.length; i++) {
            mover= createNode(arr[i],mover);
        }
        ListNode temp = removeElements(head,4);
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

    }
}
