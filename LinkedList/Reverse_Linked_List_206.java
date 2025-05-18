public class Reverse_Linked_List_206 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode fwd = curr.next; // Save the next node
            curr.next = prev;         // Reverse the link
            prev = curr;              // Move prev forward
            curr = fwd;               // Move curr forward
        }

        return prev; // prev is the new head after reversal
    }
}
