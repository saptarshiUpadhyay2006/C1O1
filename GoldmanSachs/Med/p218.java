//Delete middle node of a LL(LC 2095)
//slow and fast ptr.

package GoldmanSachs.Med;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class p218{
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null)
        return null;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next.next!=null && fast.next.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        slow.next=slow.next.next;
        return head;
    }
}