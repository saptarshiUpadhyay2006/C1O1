//Reverse Nodes in k-Group
//picking up groups and then reverse using a helper fn.

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
class p117{
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode s=head,f=head;
        ListNode newhead=null,prevtail=null;
        while(f!=null)
        {
            f=s;
            for(int i=1;i<k && f!=null;i++)
            {
                f=f.next;
            }
            if(f==null)
            break;

            ListNode nextnode=f.next;
            f.next=null;
            ListNode x=rev(s);
            if(s==head)
            {
                newhead=x;
            }
            else
            {
                prevtail.next=x;
            }
            prevtail=s;
            s.next=nextnode;
            s=nextnode;
        }
        return newhead;
    }

    private ListNode rev(ListNode head)
    {
        if(head==null||head.next==null)
        return head;

        ListNode t=head,prev=null;
        while(t!=null)
        {
            ListNode t1=t.next;
            t.next=prev;
            prev=t;
            t=t1;
        }
        return prev;
    }
}