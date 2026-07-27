//Add Two numbers(LC 2)
//Using traversal by while loop and a carry variable

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
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res=new ListNode(0);
        ListNode tm=res;
        int cr=0;
        while(l1!=null||l2!=null||cr!=0)
        {
            int s=cr;
            if(l1!=null)
            {
                s+=l1.val;
                l1=l1.next;
            }
            if(l2!=null)
            {
                s+=l2.val;
                l2=l2.next;
            }
            cr=s/10;
            tm.next=new ListNode(s%10);
            tm=tm.next;
        }
        return res.next;
    }
}