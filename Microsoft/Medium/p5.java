//Reverse LL(LC 206)
//Optimal-----Using Recursion-----T.C:O(n)------S.C:O(n)
//USING THE LC TEMPLATE

package Microsoft.Medium;

class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
    }
}

class p5{
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