//Sort List(LC 148)
//Optimal--middle node sort & merge--T.C:O(nlogn)------S.C:O(logn)
//USING THE LC TEMPLATE
package Google.Medium;
import java.util.*;

class ListNode{
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class p8{
    public ListNode sortList(ListNode head) {
        if(head==null||head.next==null)
        return head;

        ListNode m=mid(head);
        ListNode l=sortList(head);
        ListNode r=sortList(m);
        return merge(l,r);
    }
    private ListNode mid(ListNode head)
    {
        ListNode mp=null;
        while(head!=null && head.next!=null)
        {
            mp=(mp==null)?head:mp.next;
            head=head.next.next;
        }
        ListNode mid=mp.next;
        mp.next=null;
        return mid;
    }
    private ListNode merge(ListNode l1,ListNode l2)
    {
        ListNode head=new ListNode(-1);
        ListNode dummy=head;
        while(l1!=null && l2!=null)
        {
            if(l1.val<l2.val)
            {
                head.next=l1;
                l1=l1.next;
            }
            else{
                head.next=l2;
                l2=l2.next;
            }
            head=head.next;
        }
        while(l1!=null)
        {
            head.next=l1;
            l1=l1.next;
            head=head.next;
        }
        while(l2!=null)
        {
            head.next=l2;
            l2=l2.next;
            head=head.next;
        }
        return dummy.next;
    }
}