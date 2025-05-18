// Problem number 83: Remove the duplicate element from the sorted LL
public class Remove_duplicate_from_sorted_LL_83 {
    public static class ListNode{
        int data;
        ListNode next;
        ListNode( int data){
            this.data =data;
            this.next=null;
        }
    }
    public ListNode deleteDuplicates(ListNode head){
        ListNode curr = head;
        while(curr!= null && curr.next!=null){
            if(curr.data==curr.next.data){
                curr.next=curr.next.next;}
            else{
                curr=curr.next;
            }
        }
        return head;
    }

}
