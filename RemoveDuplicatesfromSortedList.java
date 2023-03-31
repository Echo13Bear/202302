public class RemoveDuplicatesfromSortedList {
    //Homework3
//    Given the head of a sorted linked list,
//    delete all duplicates such that each element appears only once.
//    Return the linked list sorted as well.
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) {
            return null;
        }
        ListNode origin = head;
        ListNode nextDiff = head.next;

        while(head != null) {
            while(nextDiff != null && nextDiff.val == head.val) {
                nextDiff = nextDiff.next;
            }
            head.next = nextDiff;
            if(nextDiff == null) {
                break;
            }
            head = nextDiff;
            nextDiff = head.next;
        }
        return origin;
    }
}
