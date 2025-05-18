public class MergeSortedLL21 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null) return list2;
        if(list2==null) return list1;
        ListNode dummy = new ListNode(-1);
        ListNode current = dummy;
        while(list1!= null && list2!= null){
            if (list1.val<= list2.val) {
                ListNode temp= new ListNode(list1.val);
                current.next=temp;
                list1=list1.next;
            }
            else{
                ListNode temp= new ListNode(list2.val);
                current.next=temp;

                list2=list2.next;
            }
            current=current.next;

        }
        current.next = (list1 != null) ? list1 : list2;
        return dummy.next;
    }
    }
