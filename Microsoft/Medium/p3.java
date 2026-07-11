//Linked List Cycle(LC 141)
//Optimal----Use slow & fast pointer-------T.C:O(n)------S.C:O(n)
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
public class p3{
    public boolean hasCycle(ListNode head) {
        ListNode slow=head,fast=head;
        while(fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
            return true;
        }
        return false;
    }
}