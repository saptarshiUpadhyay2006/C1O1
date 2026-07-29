//Odd even LL(LC 328)
//iter

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
class p220{
    public ListNode oddEvenList(ListNode head) {
        ListNode odd=new ListNode(0);
        ListNode even=new ListNode(0);
        ListNode tempo=odd;
        ListNode tempe=even;
        ListNode temp=head;
        while(temp!=null)
        {
            tempo.next=temp;
            temp=temp.next;
            tempo=tempo.next;

            tempe.next=temp;
            if(temp==null) break;
            temp=temp.next;
            tempe=tempe.next;
        }
        odd=odd.next;
        even=even.next;
        tempo.next=even;
        return odd;
    }
}