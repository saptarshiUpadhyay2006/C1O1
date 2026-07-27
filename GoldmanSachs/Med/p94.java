//Reverse a Linked List(LC 206)
//Using a recursive approach

package GoldmanSachs.Med;

class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class p94{
    public ListNode reverseList(ListNode head) {
        if(head==null||head.next==null)
        return head;
        ListNode nxt=head.next;
        ListNode rh=reverseList(head.next);
        head.next=null;
        nxt.next=head;
        return rh;
    }
}