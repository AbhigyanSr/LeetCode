public class Palindrome_LL_234 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        ListNode curr = head;
        int count = 0;

        while (curr != null) {
            count++;
            curr = curr.next;
        }

        int[] stack = new int[count / 2];
        int top = -1;

        curr = head;

        for (int i = 0; i < count / 2; i++) {
            stack[++top] = curr.val;
            curr = curr.next;
        }

        if (count % 2 != 0) {
            curr = curr.next;
        }

        while (curr != null) {
            if (stack[top--] != curr.val) return false;
            curr = curr.next;
        }

        return true;
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
        System.out.println(isPalindrome(head));
    }
}
