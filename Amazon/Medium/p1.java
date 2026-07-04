//Partition List(LC 86)
//Optimal Approach---Use PQ----T.C:O(n)------S.C:O(1)
//USING THE LC TEMPLATE
package Amazon.Medium;
class ListNode {
    int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class p1{
    public ListNode partition(ListNode head, int x) {
        ListNode before_head=new ListNode(0);
        ListNode before=before_head;
        ListNode after_head=new ListNode(0);
        ListNode after=after_head;
        while(head!=null)
        {
            if(head.val<x)
            {
                before.next=head;
                before=before.next;
            }
            else{
                after.next=head;
                after=after.next;
            }
            head=head.next;
        }
        after.next=null;
        before.next=after_head.next;
        return before_head.next;
    }
}